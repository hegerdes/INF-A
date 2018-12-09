/******************************  BaumTools.java  ******************************/

import AlgoTools.IO;

/**
 * @author hegerdes
 * @author hlauts
 *
 * Utility-Klasse mit einigen Algorithemn fuer Baeume
 */
public class BaumTools {
  
  /**
   * Berechnet rekursiv die Tiefe eines Baums
   * @param b - Der baum dessen Tiefe berechnet wird
   * @return - Die Anzahl der Ebenen des Baums
   */
  public static int baumTiefe(Baum b){
    
    // Rekursionsanker - hoert auf wenn Baum leer ist
    if(b.empty()){
      return 0;
    }
    
    // Rekursiver Aufruf fuer rechten und linken Teil-Baum
    int rechts = baumTiefe(b.right());
    int links = baumTiefe(b.left());
    
    // IO.println("BAUMTIEFE: Links = " + links + " || Rechts = " + rechts);
    if(rechts > links){
      return rechts + 1;
    }else return links + 1;
  }

  /**
   * Erstellt einen Baum aus einer inorder und einer postorder Folge
   * @param inorder - entaelt alle Elemente des Baums in der inorder-Folge
   * @param postorder - enthaelt alle Elemente des Baum in der postorder-Folge
   * @param wurzel - Ist die Top-Wurzel des Baums
   * @param wurzelpos - Die position an der die Wurzel in der inorder-Folge ist
   * @return VerweisBaum mit den Elementen und Rehnfolge von in - und postorder
   */
  public static VerweisBaum inorderPostorderBau(int[] inorder, int[] postorder){
  
    // Rekursionsanker
    if(inorder.length < 1 || postorder.length < 1){
      return new VerweisBaum();
    }
    // Fehlerbehantlund wenn in - und postorder unterschiedlich sind
    if(inorder.length != postorder.length){
      throw new RuntimeException("Die Zahlenfolgen haben unterschiedlich " +             "viele Elemente. Baum nicht moeglich!");
    }
    
    // Speichert die Wurzel, die in postorder ganz hinten ist
    int wurzel = postorder[postorder.length-1];
    int wurzelpos = 0;

    // Sucht die Wurzel in Inorder und merkt sich sie Position
    while(inorder[wurzelpos] != wurzel){
      wurzelpos++;
    }

    int laenge_r = inorder.length -1 - wurzelpos;
    
    // unterteilt die Bauume in rechts und links von der Wurzel
    int[] in_left = new int[wurzelpos];
    int[] in_right = new int[laenge_r];
    int[] po_left = new int[wurzelpos];
    int[] po_right = new int [laenge_r];
    
    // Einträge in neue Array kopieren fuer links
    for(int i = 0; i < wurzelpos; i++){
      in_left[i] = inorder[i];
      po_left[i] = postorder[i];
    }

    // Einträge in neue Array kopieren fuer rechts
    for(int i = 0; i < laenge_r; i++){
      in_right[i] = inorder[wurzelpos + 1 + i];
      po_right[i] = postorder[wurzelpos + i];
    }
    
    // Rekursiver Aufruf in dem der Baum konstroiert wird
    return new VerweisBaum(inorderPostorderBau(in_left, po_left), wurzel, inorderPostorderBau(in_right, po_right));
  }
  /**
   * Zaehlt die Anzahl der Knoten in meinem Baum
   * @param b - Baum dessen Wurzeln gezaehlt werden sollen
   * @return - Die Anzahl der Konoten die der Baum hat
   */
  public static int anzahlKnoten(Baum b){

    // Rekursionsanker
    if(b.empty()){
      return 0;
    }
    
    // Rekursiver Aufruf
    // Die Anzahl der rekursiven Aufrufe entspricht der Anzahl der Knoten
    // Die Anzahl der Aufrufe wird aufaddiert und returnt
    return (1 + anzahlKnoten(b.right()) + anzahlKnoten(b.left()));
  }
  
  /**
   * Prueft ob der Baum vollstaendig ist
   * @param b - Der Baum der auf Vollstaendigkeit geprueft werden soll
   * @return true falls die Anzahl der Knoten auf der Linken Seite mit der
   *         Anzahl der Knoten auf der Rechten Seite uebereinstimmt
   */
  public static boolean istVollstaendig(Baum b){
    
    // Leerer Baum ist immer vollstaendig
    if(b.empty()){
      return true;
    }

    if(anzahlKnoten(b.right()) == anzahlKnoten(b.left())){
      return true;
    }else return false;
  }

  /**
   * Druckt einen Baum auf der Konsole ebenenweise aus.
   * Nutzt baumTiefe(Baum), printEbene(Baum,int,int) und spaces(int).
   * @param b der zu druckende Baum
   */
  public static void printBaum(Baum b) {

    //Berechne die Tiefe des Baumes
    int resttiefe = baumTiefe(b);

    //Gehe die Ebenen des Baumes durch
    for(int i = 0; i < resttiefe; i++) {
      //Drucke die Ebene, beruecksichtige Anzahl der Leerzeichen
      //fuer korrekte Einrueckung
      printEbene(b, i, spaces(resttiefe - i));
      IO.println();
      IO.println();
    }

  }

  /**
   * Druckt eine Ebene eines Baumes aehnlich der Breitensuche
   * aus. 0 ist dabei die Wurzel. Vor und nach jedem Element
   * werden spaces Leerzeichen eingefuegt.
   * @param b der auszugebende Baum
   * @param ebene die gewuenschte Ebene beginnend bei 0
   * @param spaces Anzahl von Leerzeichen vor und nach jedem Element
   */
  public static void printEbene(Baum b, int ebene, int spaces) {

    //Wenn 0 erreicht, drucke Element mit Leerzeichen
    if(ebene == 0) {

      IO.print("", spaces);
      if(b != null) {
        IO.print(b.value());
      }
      else { //Wenn Nullzeiger uebergeben wurde, ein Leerzeichen drucken
        IO.print(" ");
      }
      IO.print(" ", spaces + 1);

    } else {

      //Steige rekursiv ab, betrachte Soehne als Teilbaeume und verringere
      //dabei die zu druckende Ebene. In endende Aeste wird mit dem Nullzeiger
      //gelaufen.
      if(b != null && !b.left().empty()) {
        printEbene(b.left(), ebene - 1, spaces);
      }
      else {
        printEbene(null, ebene - 1, spaces);
      }

      if(b != null && !b.right().empty()) {
        printEbene(b.right(), ebene - 1, spaces);
      }
      else {
        printEbene(null, ebene - 1, spaces);
      }

    }

  }

  /**
   * Berechnet die Anzahl an benoetigten Leerzeichen fuer
   * eine korrekte Einrueckung, also 0.5 * (2^(ebene) - 2).
   * @param ebene die Ebene, Blaetter sind Ebene 1, darueber aufsteigend
   * @return Anzahl der Leerzeichen zur Elementtrennung
   */
  private static int spaces(int ebene) {

    if(ebene == 1) {
      return 0;
    }
    else {
      //verdoppele die Leerzeichen gegenueber der Ebene darunter
      //und fuege ein weiteres Leerzeichen hinzu
      return 2 * spaces(ebene - 1) + 1;
    }

  }

}
