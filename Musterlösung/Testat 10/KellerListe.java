import AlgoTools.IO;

/**
 * Implementation des Interface Liste mittels zwei Kellern als
 * interne Datenstruktur.
 *
 * Die Idee besteht darin, im ersten Keller von oben nach unten alle Listenelemente zu lagern,
 * wobei das oberste immer das aktuelle Element ist. Bei allen Listenoperation werden dann die
 * geeigneten Elemente derart auf den Zweiten Keller geschoben, so dass Elemente vor  dem aktuellen
 * Element immer auf dem zweiten Keller liegen.
 */
public class KellerListe implements Liste {
  private Keller tmp1;
  private Keller tmp2;

  public KellerListe() {
    tmp1 = new VerweisKeller();
    tmp2 = new VerweisKeller();
  }

  /**
   * Siehe {@link Liste}
   */
  public boolean empty(){
    return tmp1.empty() && tmp2.empty();
  }

  /**
   * Siehe {@link Liste}
   */
  public boolean endpos(){
    return tmp1.empty();
  }

  /**
   * Siehe {@link Liste}
   */
  public void reset(){
    while(!tmp2.empty()){
      tmp1.push(tmp2.top());
      tmp2.pop();
    }
  }

  /**
   * Siehe {@link Liste}
   */
  public void advance(){
    if(endpos())
      throw new RuntimeException("Liste ist am Ende, kann nicht löschen.");

    tmp2.push(tmp1.top());
    tmp1.pop();
  }

  /**
   * Siehe {@link Liste}
   */
  public Object elem(){
    return tmp1.top();
  }

  /**
   * Siehe {@link Liste}
   */
  public void insert(Object x){
    tmp1.push(x);
  }

  /**
   * Siehe {@link Liste}
   */
  public void delete(){
    if(endpos())
      throw new RuntimeException("Liste ist am Ende, kann nicht löschen.");
    tmp1.pop();
  }


}
