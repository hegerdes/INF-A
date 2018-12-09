/******************************  OffeneHashtabelle.java  **********************/

import AlgoTools.IO;

/**
 * Implementiert das Verfahren des offenen Hashings mit Listen.
 * Verwaltet 7 Listen zum Hashing, implementiert die Menge.
 */

public class OffeneHashtabelle implements Menge {

  //Das Array der Listen
  private Liste[] buckets;

  /**
   * Konstruktor zum Erstellen einer Hashtabelle
   */
  public OffeneHashtabelle() {
    buckets = new Liste[7];
    for(int i = 0; i < buckets.length; i++) {
      buckets[i] = new VerweisListe();
    }
  }

  /**
   * Prueft ob die Hashtabelle leer ist.
   * @return true, wenn alle Listen leer sind
   */
  public boolean empty() {

    for(int i = 0; i < buckets.length; i++) {
      if(!buckets[i].empty()) { //Sobald eine Liste nicht leer, false
        return false;
      }
    }

    return true;
  }


  /**
   * Sucht ein Element in der Hashtabelle auf Basis
   * des hashCodes()s des Elements und der equals()-Methode
   * @param x das zu findende Element
   * @return das gefundene Element oder null
   */
  public Comparable lookup(Comparable x) {

    Liste l = buckets[Math.abs(x.hashCode()) % 7];

    l.reset();
    while(!l.endpos()) {
      if(l.elem().equals(x)) {
        return (Comparable) l.elem();
      }
      l.advance();
    }

    return null;

  }

  /**
   * Fügt ein Element in die Hashtabelle ein falls es noch
   * nicht existiert (Menge).
   * @param x das einzufuegende Element
   * @return true, wenn es eingefuegt werden konnte, false sonst
   */
  public boolean insert(Comparable x) {

    if(lookup(x) == null) {
      buckets[Math.abs(x.hashCode()) % 7].insert(x);
      return true;
    }
    else {
      return false;
    }

  }

  /**
   * Loescht ein Element aus der Hashtabelle, falls es existiert.
   * @param x das zu loeschende Element
   * @return true, wenn es geloescht werden konnte, false sonst
   */
  public boolean delete(Comparable x) {

    if(lookup(x) == null) {
      return false;
    }
    else {
      Liste l = buckets[Math.abs(x.hashCode()) % 7];

      l.reset();
      while(!l.endpos()) {
        if(l.elem().equals(x)) {
          l.delete();
          return true;
        }
        l.advance();
      }
    }

    //Hierher gelangt man niemals, aber das weiß Java nicht.
    return false;

  }

}

