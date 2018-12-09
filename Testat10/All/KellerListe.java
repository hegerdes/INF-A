/******************************  KellerListe.java  ****************************/

import AlgoTools.IO;

/**
 * Stellt die Implementation für das Interface Liste da
 * Für die Funktionen einer Liste werden hier die Eigenschaften zweier Keller
 * genutzt
 * Keller 2 hat das aktuelle Element immer oben
 * Keller 1 hat das erste Element der Lise ganz unten
 *
 * @version 13.01.17
 *  
 * @author  hegerdes
 * @author  hlauts
 */

public class KellerListe implements Liste{
  
  public Keller hilfK1;
  public Keller hilfK2;

  public KellerListe(){
    
    hilfK1 = new VerweisKeller();
    hilfK2 = new VerweisKeller();
  }
  
  /**
   * Gibt an ob der die Liste leer ist
   * geprueft wird ob beide Keller leer sind
   * @return true || false - Wenn die Keller leer sind oder nicht
   */
  public boolean empty(){
    
    return hilfK1.empty() && hilfK2.empty();
  }
  
  /**
   * Gibt an ob man am Ende der Liste ist
   * Wenn Keller2 leer ist dann sind alle Elemente in Keller1
   * Das oberste Element ist dann das Letzte Element der Liste
   * @return true || false - Wenn Keller2 leer ist
   */
  public boolean endpos(){
    
    return hilfK2.empty();
  }
  
  /**
   * Das aktuelle Element wird zum ersten Element des Kellers2
   * Alle Elemente aus Keller1 werden in Keller2 gesteckt
   * @throws Exception - Wenn der Keller leer ist
   */
  public void reset(){

    if(empty()){
 //     throw new RuntimeException("Die Liste ist leer. Es gibt kein erstes Element.");
    }

    while(!hilfK1.empty()){
      hilfK2.push(hilfK1.top());
      hilfK1.pop();
    }
//    hilfK1.push(hilfK2.top());
//    hilfK2.pop();
  }

  /**
   * Rueckt das aktuelle Element der Liste einen weiter
   * Dafuer wird das aktuelle Element aus Keller2 rausgenommen und 
   * in Keller1 gesteckt
   * @throws Exception - Wenn der Keller leer ist
   */
  public void advance(){

    if(hilfK2.empty()){
      throw new RuntimeException("Es gibt kein naechstes Element! Liste ist am Ende.");
    }
    
    hilfK1.push(hilfK2.top());
    hilfK2.pop();
  }
  
  /**
   * Gibt das aktuelle Element der Liste aus
   * Das aktuelle Element ist das Top-Element von Keller2
   * @return - Das aktuelle Element der Liste
   * @throws Exception - Wenn der Keller leer ist
   */
  public Object elem(){

    if(hilfK2.empty()){
      throw new RuntimeException("Die Liste ist leer!");
    }

    return hilfK2.top();
  }
  
  /**
   * Fuegt ein neues Element in die Liste ein
   * Das neue Element wird immer an die aktuelle Position gepackt
   * Hier also oben auf Keller2
   * @param neu - Das neue Element das eingefuegt wird
   */
  public void insert(Object neu){

    hilfK2.push(neu);
  }
  
  /**
   * Loescht das aktuelle Element aus der Liste
   * Das Top-Element von Keller2 wird geloescht
   * @throws Exception - Wenn der Keller leer ist
   */
  public void delete(){
    
    if(hilfK1.empty()){
 //     throw new RuntimeException("Die Liste ist leer! Kein Loeschen moeglich");
    }

    hilfK2.pop();
  }

  public static void main(String[] argv) {
     

  }
}

