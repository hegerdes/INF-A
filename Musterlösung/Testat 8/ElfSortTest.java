/******************************  ElfSortTest.java  ****************************/

import AlgoTools.IO;

/**
 * Testet den ElfSort-Algorithmus
 */

public class ElfSortTest {

  public static void main(String[] argv) {

    int[] a;
    boolean fehler = false;

    do {
      fehler = false;

      a = IO.readInts("Bitte das Array eingeben: "); // Folge einlesen

      //Fehlerbehandlung: Prüfe ob alle Geschenke tatsächlich nur 5-stellige
      //Nummern haben.
      int i = 0;
      while(i < a.length && a[i] <= 99999 && a[i++] >= 0);

      if(i < a.length) {
        fehler = true;
        IO.println("Die Geschenke sind nicht richtig nummeriert.");
      }

    } while(fehler);

    a = ElfSort.sort(a,4); // sortieren

    IO.println("\nSortiert:");
    for (int i = 0; i < a.length; i++) {
      IO.print(a[i] + " ");
    }
    IO.println();

  }
}


