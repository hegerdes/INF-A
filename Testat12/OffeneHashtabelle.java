/******************************  OffenesHashtabelle.java  *********************/

import AlgoTools.IO;

/**
 * @version 28.01.17
 *  
 * @author  hegerdes
 *
 * Implementiert die das Interface Menge
 * Stellt eine Liste da, un der Comparables gespeichert werden
 * Speicherstelle ist der HashCode
 * Kann pruefen ob HashTabelle leer ist
 * Kann ein neues Comparable einfuegen
 * Kann ein bestimmtes Comparable loeschen
 * Gibt ein bestimmtes Comparable zurueck
 */

public class OffeneHashtabelle implements Menge{


  private Liste [] list;
  private int hash_int;
  
  /**
   * Instanziert eine neue HashTabelle
   * Die Hashtabelle hat 7 Plaetze
   * Die 7 Plaetze werden dargestellt aus 7 Verweislisten
   */
  public OffeneHashtabelle(){
    
    list = new VerweisListe[7];
    for(int i = 0; i < 7; i++){
      list[i] = new VerweisListe();
    }
  }
  
  /**
   * Gibt an ob die Hashtabelle leer ist
   * @return true oder false falls liste nicht leer ist
   */
  public boolean empty(){
  
    int t = 0;
    // Prueft ob jede liste leer ist
    for(int i = 0; i < 7; i++){
      if(list[i].empty()){
        t++;
      }
    }
    // Wenn alle 7 Listen leer sind ist HashTabelle auch leer
    if(t == 7){
      return true;
    }else return false;
  }
  
  /**
   * Fuegt ein neues Comparable in die Hashtabelle ein
   * Zur Bestimmung des Platzes wird die SteuerID <>HashCode<> genutzt
   * @param x - Das neu einzufuegene Comparable
   * @return true wenn Einfuegen erfolgreich - sonst false
   */
  public boolean insert(Comparable x){
    
    hash_int = (x.hashCode());
    hash_int = hash_int%7;

    // Fuegt an leerer Stelle x ein
    if(list[hash_int].empty()){
      list[hash_int].insert(x);
      return true;
    }
    
    list[hash_int].reset();
    
    // Prueft ob Element schon vorhanden ist
    while(!list[hash_int].endpos()){
      if(list[hash_int].elem().equals(x)){
        return false;
      }
      list[hash_int].advance();
    }

    // Object ist nicht vorhanden und wird eingefuegt
    list[hash_int].reset();
    list[hash_int].insert(x);
    return true;
  }
  
  /**
   * Sucht das Comparable x in der HashTabelle
   * Springt defuer an die richtige Stelle und geht die VerweisListe durch
   * @param x - Comparable das gesucht werden soll
   * @return Comparable - Das Vollstaendige Comparable und nicht nur SteuerID
   * @return Falls Comparable x nicht gefunden wird null returnt
   */
  public Comparable lookup(Comparable x){
    
    hash_int = (x.hashCode());
    hash_int = hash_int % 7;
    
    // Falls in Hashtabelle bei hash_int nichts ist
    if(list[hash_int] == null){
      return null;
    }
    
    // Geht die Verweisliste an der Stelle Hash_int durch
    // falls gefunden wird returnt
    while(!list[hash_int].endpos()){
      if(list[hash_int].elem().equals(x)){
        return ((Comparable)x);
      }else{
        list[hash_int].advance();
      }
    }
    // Wurde nicht in Verweisliste gefunden
    return null;
  }
  
  /**
   * Loescht ein Element in der HashTabelle
   * Springt an die <>hash_int<> Stelle und geht ggf die VerweisListe durch
   * @param x Das Comparable das geloescht wird
   * @return true falls loeschen erfolgreich - sonst false
   */
  public boolean delete(Comparable x){
    
    hash_int = (x.hashCode());
    hash_int = hash_int % 7;

    if(list[hash_int].empty()){
      return false;
    }
    
    list[hash_int].reset();
    
    // Geht die VereisListe durch und sucht x
    while(!list[hash_int].endpos()){
      if(list[hash_int].elem().equals(x)){
        list[hash_int].delete();
        return true;
      }else{
        list[hash_int].advance();
      }
    }
    return false;
  }
  
  public static void main(String[] argv) {
     

  }
}

