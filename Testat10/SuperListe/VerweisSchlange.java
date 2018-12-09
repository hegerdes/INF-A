/******************************  VerweisSchlange.java  ************************/

import AlgoTools.IO;

/**
 * Implementation des Interface Schlange
 * Fuer die Verweise der einzelnen Elemente wird <>Eintrag> genutzt
 * Arbeitet nach first in last out
 * Kann:
 * Rueckgabe ob Schlange leer
 * Erstes Element ausgeben
 * Erstes Element loeschen
 * Neues Element hinten anfuegen
 *
 *
 * @version 13.01.17
 *  
 * @author  hegerdes
 */

public class VerweisSchlange implements Schlange {

  private Eintrag head;
  private Eintrag tail;
  private Eintrag count;
  
  /**
   * Erstellt eine neue Verweisschlange ohne Inhalt
   * @param head - setzt den Anfang auf null
   * @param tail - setzt die Anzahl der enthaltenen Elemente auf null
   */
  public VerweisSchlange(){
    
    head = null;
    tail = head;
//    count = null;
  }
  
  /**
   * Prueft ob die Schlange leer ist
   * Aktuelles Element ist immer im <>head<>
   * Wenn head = leer dann ist die Schlange leer
   * @return true - falls kein Element in head oder false - falls Element 
   */
  public boolean empty(){
    
    return head == null;
  }

  /**
   * Fuegt ein neues Element in die Schlange ein
   * dafuer wird die Schlange um ein verlaengert
   * @param neu - das neue Objekt das eingefuegt wird
   */
  public void enq(Object neu){
    
    if(empty()){          
      tail =  new Eintrag();  // neuer Eintrag mit Verweis und Platz für Inhalt
      head = tail;
      head.inhalt = neu;      // Inhalt wird eingefuegt
//      count = new Eintrag();
    }else{
      tail.next = new Eintrag();  // Schlange wird verlaengert
      tail = tail.next;
      tail.inhalt = neu;
    }
  }

  /**
   * Liefert dden Kopf der Schlange aus
   * @throws Exception - Wenn Schlange leer ist 
   * @return Das akuelle Element im <>head> der Schlange
   */
  public Object front(){
    
    if(empty()){
      throw new RuntimeException("Die Schlange ist leer! Kein Kopf da");
    }
    return head.inhalt;
  }

  /**
   * Loescht den Kopf der Schlange 
   * Der neue Kopf wird ein nach hinten gesetzt
   * @throws Exception - Wenn Schlange leer ist
   */
  public void deq(){
    
    if(empty()){
      throw new RuntimeException("Kann nichts loschen! Die Schlange ist leer");
    }
    
    head.inhalt = null;
    head = head.next;
    if(head == null){
      tail = null;
    }
  }

  public static void main(String[] argv) {
     

  }
}

