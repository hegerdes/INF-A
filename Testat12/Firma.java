/******************************  Firma.java  **********************************/

import AlgoTools.IO;

/**
 * @version 27.01.17
 *  
 * @author  hegerdes
 *
 * Implementiert das Interdace Comparable
 * Erzeugt eine Firma
 * Gibt diese als String aus
 * Vergleicht 2 Firmen mit
 * CompareTo und equals
 * Fifert den Hashwert
 */

public class Firma implements Comparable{

  private long steuer;
  private double umsatz;
  private String name;

  /**
   * Default Konstruktor
   * Falls keine Werte übergeben werden
   */
  public Firma(){

    name = "Max Mustermann AG";
    umsatz = 1000;
    steuer = 123456;
  }
  /**
   * Konstruiert eine Firma mit:
   * @param nam - Der Name der Firma
   * @param um - Umsatz der Firma
   * @param steu - Die SteuerID der Firma
   */
  public Firma(String nam, double um, long steu){

    name = nam;
    umsatz = um;
    steuer = steu;
  }
  
  /**
   * Gibt die Firma als String aus
   * Ueberscheibt die Java-Eigene toString Methode
   * @return String der die Firma mit Name, Umsatz und SteuerID beschreibt
   */
  public String toString(){

    return "Name: " + name + " | Umsatz: " + umsatz + " | Umsatzsteueridentifikationsnummer: " + steuer;
  }
  
  /**
   * Vergleicht zwei Obcekte und gibt den Unterschied als int aus
   * Vergleicht die SteuerID Nummern
   * @param f1 - Das Object mit dem verglichen werden soll
   * @return int >0 falls SteuerID von f1 kleiner  
   * @return oder "<"0 falls andere Firma kleiner
   * @return int = 0 falls beide gleich
   */
  public int compareTo(Object f1){
    
    return (int)(((Firma)f1).steuer - steuer);
  }
  
  /**
   * Vergleicht zwei Firmen miteinander
   * @param f1 Firma mit der verglichen werden soll
   * @return true falls beide SteuerID´s gleich sind - sonst false
   */
  public boolean equals(Object f1){

    long steu1 = new Long(((Firma)f1).steuer);
    long steu2 = new Long(steuer);

    if(f1 == null){
      return false;
    }
    if(steu1 == steu2){
      return true;
    }else return false;

  }
  
  /**
   * Get Methode damit andere Klassen auf dt StuerID zugreifen koennen
   * SteuerID wird hier als Hashwert genutzt
   * @return int mit SteuerID
   */
  public int hashCode(){
    
    return ((int)steuer);
  }

  public static void main(String[] argv) {
     

  }
}

