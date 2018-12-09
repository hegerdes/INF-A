/******************************  BaumTools.java  ******************************/

import AlgoTools.IO;

/**
 * Utility-Klasse mit einigen Algorithemn fuer Baeume
 *
 */
public class BaumToolsLoesung {

  /**
   * Liefert die Anzahl der Knoten eines Baumes
   * @param b der betreffende Baum
   * @return Anzahl der Knoten
   */
  public static int anzahlKnoten(Baum b) {

    if(b.empty())
      return 0;
    else
      return 1 + anzahlKnoten(b.left()) + anzahlKnoten(b.right());

  }

  /**
   * Erzeugt aus einer gegebenen Inorder- und Postorder-Traversierung
   * einen neuen VerweisBaum. Die Traversierungen muessen korrekt sein,
   * und genau einen Baum eindeutig beschreiben. Sonst ist das Verhalten
   * nicht definiert, es wird ein fehlerhafter Baum zurueck geliefert oder
   * eine Runtime- bzw. ArrayIndexOutOfBounds-Exception wird geworfen.
   * @param inorder Das Array mit der Inorder-Traversierung
   * @param postorder Das Array mit der Postorder-Traversierung
   * @return der erzeugte VerweisBaum
   */
  public static VerweisBaum inorderPostorderBau(int[] inorder, int[] postorder) {

    //Fertig oder Fehler, gebe leeren Baum zurueck
    if(inorder.length == 0 || postorder.length == 0)
      return new VerweisBaum();

    //Besorge Wurzel aus Postorder
    int wurzel = postorder[postorder.length - 1];

    //Suche in Inorder
    int i = -1;
    while(inorder[++i] != wurzel);

    if(inorder[i] != wurzel)
      throw new RuntimeException("Fehler: Baum kann nicht erstellt werden!");

    //Teilbaeume
    int[] newInorderLinks = new int[i];
    int[] newInorderRechts = new int[inorder.length - i - 1];
    int[] newPostorderLinks = new int[i];
    int[] newPostorderRechts = new int[inorder.length - i - 1];

    //Kopiere linken Teilbaum
    for(int j = 0; j < i; j++) {
      newInorderLinks[j] = inorder[j];
      newPostorderLinks[j] = postorder[j];
    }

    //Kopiere rechten Teilbaum
    for(int j = i + 1; j < inorder.length; j++) {
      newInorderRechts[j - (i + 1)] = inorder[j];
      newPostorderRechts[j - (i + 1)] = postorder[i + (j - (i + 1))];
    }

    //Erstelle Rekursiv den Baum
    return new VerweisBaum(inorderPostorderBau(newInorderLinks,newPostorderLinks),
          wurzel,
          inorderPostorderBau(newInorderRechts, newPostorderRechts));

  }

  /**
   * Liefert die Tiefe eines Baumes (rekursiv)
   * @param b Baum, dessen Tiefe bestimmt werden soll
   * @return die Tiefe des Baumes, ein leerer Teilbaum hat die Tiefe 0
   */
  public static int baumTiefe(Baum b) {

    if(b.empty())
      return 0;
    else {
      int links = baumTiefe(b.left());
      int rechts = baumTiefe(b.right());
      //Liefere das Maximum
      if(links >= rechts) {
        return 1 + links;
      }
      else {
        return 1 + rechts;
      }
    }
  }

  /**
   * Liefert true, wenn der übergebene Baum vollständig ist.
   *
   * @param b der zu prüfende Baum
   */
  public static boolean istVollstaendig(Baum b){
    if(b.empty())
      return true;

    return (baumTiefe(b.left()) == baumTiefe(b.right())) && istVollstaendig(b.left()) && istVollstaendig(b.right());
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
