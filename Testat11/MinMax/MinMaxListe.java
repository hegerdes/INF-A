/******************************* MinMaxListe.java *****************************/
import AlgoTools.IO;

/**
 * @author hegerdes
 * @author hlauts
 *
 * Erweitert die VerweisListe um die Funktionalität stets Zugriff
 * auf das größte und kleinste Element zu haben. Dabei wird davon ausgegangen,
 * dass nur Objekte eingefügt werden, die Comparable implementieren.
 */
public class MinMaxListe extends VerweisListe {
  

  private Object min;
  private Object max;
  private Object hilf;
  private Object hilf1;
  
  /**
   * Konstruktor fuer neue MinMaxListe ohne Parameter
   * ruft den Konstruktor von VerweisListe auf
   */
  public MinMaxListe(){
    super();
  }
  
  /**
   * Ueberscheibt die Insert-Methode von Verweisliste
   * Anstatt min und max spaeter suche zu muessen wird es direkt gespeichert
   * man kann unmittelbar drauf zugreifen, ohne das erst eine lineare Suche
   * mit einer Luafzeit von O(n) durchgefuert werden muss
   * @param x - Das Objekt das eingefueegt werden soll
   */
  public void insert(Object x){
    reset();
    // Wenn die Liste Leer ist gibt es kein Min oder Max
    // Daher ist x = min = max
    if(empty()){
      min = x;
      max = x;
    }

    // Vergleicht ob das eingefuegte Element groeßer ist als das aktuelle max
    // Objecte werden als Comparable gecastet
    if(((Comparable)x).compareTo(((Comparable)max)) > 0){
      max = x;
    }

    // Vergleicht ob das eingefuegte Element kleiner ist als das aktuelle min
    // Objecte werden als Comparable gecastet
    if(((Comparable)x).compareTo(((Comparable)min)) < 0){
      min = x;
    }
    
    // Ruft insert vin VerweisListe auf
    super.insert(x);
  }
  
  /**
   * Loescht das aktuelle Element
   * Wenn das aktuelle Element min oder max ist wird in der Liste ein neues
   * min oder max gesucht
   * Falls die Liste leer ist, ist min = null und max = null
   */
  public void delete(){
    // Speichert das zu loeschene Element zwischen
    hilf = elem();
    hilf1 = null;
    if(elem() == min || elem() == max){
      // loescht das aktuelle Element
      super.delete();
      // Merkt sich das neue aktuelle Element
      if(!endpos()){
        hilf1 = elem();
      }
      // Falls das geloeschte Element min war wird die Liste resettet
      // Das erste Element ist vorerst min
      if(hilf == min){
        reset();
        if(!empty()){
          min = elem();
          // Es wird so lange das naechste Element ausgewaehlt bis ListenEnde
          while(!endpos()){
            advance();
            if(!endpos()){
              // Falls ein Element kleiner ist als min, wird min ueberschieben
              // Es wird bis endpos gesucht
              if(((Comparable)min).compareTo(elem()) > 0){
                min = elem();
              }
            }
          }
        // Falls Liste leer  
        }else min = null;
      }
      // Falls das geloeschte Element max war wird die Liste resettet
      // Das erste Element ist vorerst max
      if(hilf == max){
        reset();
        if(!empty()){
          max = elem();
          // Es wird so lange das naechste Element ausgewaehlt bis ListenEnde
          while(!endpos()){
            advance();
            if(!endpos()){
              // Falls ein Element groeßer ist als max, wird max ueberschieben
              // Es wird bis endpos gesucht
              if(((Comparable)min).compareTo(elem()) < 0){
                max = elem();
              }
            }
          }
        // Falls Liste leer
        }else max = null;
      }
       reset();
       // Die aktuelle Position vor dem loeschen wird wieder hergestellt
       // Es wird so lange advance aufgerufen bis man wieder bei dem Element
       // das in hilf1 gespeichert wurde ist
       if(!empty() && hilf1 != null){
         while(elem() != hilf1 || !endpos()){
           if(!endpos()){   
             advance();
           }
         }
       }
     }else{
       // Falls das aktuelle Element nicht min oder max war wird geloescht
       super.delete();
     }
   }
  /**
   * Gibt das kleinste Element der Liste zurück
   *
   * @return Das kleinste Element
   */
  public Object getMin() {
    // TODO
    return min;
  }

  /**
   * Gibt das größte Element der Liste zurück
   *
   * @return Das größte Element
   */
  public Object getMax() {
    // TODO
    return max;
  }
}
