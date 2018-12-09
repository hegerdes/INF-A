/******************************  SuperListe.java  ******************************/

import AlgoTools.IO;

/**
 * Erweitet die Klasse VerweisListe um drei nuetzliche Operationen.
 */

public class SuperListe extends VerweisListe {

  /**
   * Invertiert die Reihenfolge der Elemente in der Liste.
   */
  public void umdrehen() {

    Schlange s=new VerweisSchlange();
    reset();

    while(!empty()) {
      s.enq(elem());
      delete();
    }

    while(!s.empty()) {
      // fuegt vor dem aktuellen Element ein und
      // macht das eingefuegte Element zum aktuellen
      insert(s.front());
      s.deq();
    }
  }

  /**
   * Entfernt alle Duplikate aus der Liste.
   */
  public void unique(){

    boolean doppel=false;
    reset();
    Liste hilf=new VerweisListe();
    Object temp;

    // fuer alle Elemente in unserer Liste
    while(!endpos()){
      // merke aktuelles Element
      temp=elem();

      // gehe bisher ueberpruefte Elemente durch
      while(!hilf.endpos() && !doppel){
        doppel=temp.equals(hilf.elem());
        hilf.advance();
      }

      // jetzt ist entweder:
      // ein doppeltes Element gefunden worden
      // oder:
      // alle Elemente verglichen
      hilf.reset();

      // falls kein Duplikat gefunden:
      // zu hilf hinzufuegen
      if(!doppel)
        hilf.insert(temp);

      // falls Duplikat gefunden:
      // fuege es nicht hinzu.
      // in jedem Fall: aktuelles Element loeschen
      delete();

      doppel=false;
    }

    // hilf zurueck in die Hauptliste
    while(!hilf.endpos()){
      insert(hilf.elem());
      hilf.delete();
    }
  }

  /**
   * Liefert das Element an Stelle n.
   * @param n der Index des zu liefernden Elementes
   * @return das Element an Stelle n
   * @throws RuntimeException falls Liste weniger als n Elemente
   */
  public Object elem(int n){
    if(n <= 0)
      throw new RuntimeException("n muss > 0 sein.");

    reset();

    for(int i=1; i<n; i++){

      if(endpos())
        throw new RuntimeException("Kein Element an der Stelle n");

      advance();
    }

    return elem();
  }
}
