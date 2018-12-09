/******************************  MergeSort.java  ******************************/

import AlgoTools.IO;

/**
 * Sortierung eines Arrays von beliebig vielen Elementen mit dem rekursiven
 * Mergesort-Algorithmus.
 */
public class MergeSortRekursiv {

  private static int schritte;

  /**
   * Methode, die den rekursiven MergeSort implementiert.
   *
   * @param a
   *          zu sortierendes Array, wird innerhalb der Methode nicht veraendert
   * @return sortiertes Array
   */
  public static int[] sortRekursiv(int[] a) {

    int l = a.length / 2;              // Laenge der beiden Teilfolgen

    if (l == 0)
      return a;                        // eine einelementige Folge ist sortiert

    int[] b = new int[l];              // die beiden Teilfolgen
    int[] c = new int[a.length - l];

    for (int i = 0; i < l; i++) {
                                       // kopiere a in die Teilfolgen
      b[i] = a[i];                     // 1. Haelfte nach b

    }

    for (int i = l; i < a.length; i++) {
        c[i - l] = a[i];                 // 2. Haelfte nach c
    }

    // zurueckgegeben werden die beiden sortierten Teilfolgen gemischt
    return merge(sortRekursiv(b), sortRekursiv(c));
  }

  /**
   * Mischt zwei sortierte Arrays mit einer Laengendifferenz
   * von 0 oder 1 zu einem sortierten Array
   *
   * @param a Array a, wird nicht veraendert
   * @param b Array b, wird nicht veraendert
   *
   * @return gemischtes, sortiertes Array
   */
  public static int[] merge (int[]a, int[]b) {   // mischt a und b
                                                 // liefert Ergebnis zurueck

    int i=0, j=0, k=0;                           // Laufindizes
    int[] c = new int[a.length + b.length];      // Platz fuer Folge c besorgen

    while ((i<a.length) && (j<b.length)) {       // mischen, bis ein Array leer

      schritte++;

      if (a[i] < b[j])                           // jeweils das kleinere Element
          c[k++] = a[i++];                       // wird nach c uebernommen
      else
          c[k++] = b[j++];
    }

    // ggf.: Rest von Folge a
    while (i<a.length){
      schritte++;
      c[k++] = a[i++];
    }

    // ggf.: Rest von Folge b
    while (j<b.length){
      schritte++;
      c[k++] = b[j++];
    }

    return c;                                    // Ergebnis abliefern
  }

  /**
   * Liest ein int-Array ein und gibt es unter Angabe der Schrittzahl
   * sortiert wieder aus.
   */
  public static void main(String argv[]) {

    schritte = 0;
    int[] a;

    //Einlesen
    do {
      a = IO.readInts("Bitte die Zahlen: ");
    } while(a.length == 0);

    //Sortieren
    a = sortRekursiv(a);

    //Ausgabe
    IO.println("Die sortierte Folge:");
    for(int i = 0; i < a.length; i++) {
      IO.print(a[i] + "  ");
    }

    //Schrittzahl
    IO.println("\nMit Anzahl Schritten: " + schritte);

  }


}
