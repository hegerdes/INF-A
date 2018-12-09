/***************************PancakeSort.java************************/

import AlgoTools.IO;

/**
 * @version 09.12.16
 *
 * @author hegerdes
 * @author hlauts
 */


/**
 * Dieses Programm soetiert Zahlenfolgen, indem ein eingegebenes Array von 
 * Zahlen so lange gedreht wird, bis die sortierung erreicht wurde
 * Methorde fip dreht das Array
 * Methode sort sagt wo gedreht werden muss
 * Main liest Daten ein
 */

public class PancakeSort {

  private static int schritte;        // Klassen vab fuer Anzahl der Aufrufe

    /**
     * Dreht die Reihenfolge der ersten <tt>count</tt> Element in
     * <tt>array</tt> um.
     *
     * @param array das zu sortierende Array
     * @param count Anzahl zu flippender Elemente
     *
     * @throws RuntimeException wenn <tt>count</tt> > <tt>array.length</tt>
     */
    public static void flip(int[] array, int count) {
      // TODO
      if(count < -1){
        throw new RuntimeException("Fehler bei der Eingabe!");
      }
      int[] narray;                   // themporteses Array

      narray = new int[array.length]; // mit gleicher lange
      int t = 0;                      // hilfsvab
      int lange = array.length - 1;   // weniger Schreibaufwand
                                      // und sagt letzte Arraystelle an
      if(count != -1){                // Stopp Dedinung für aufruf der Schleife
        for(int i = 0; i < array.length; i++){
         if(count - i >= 0){          // Kopiert die 'cont' Teil des arrays
           narray[i] = array[count - i]; // in ein narray in umgekehrter reinfol
         }
         else{
           narray[i] = array[i];      // Die nich geflippten teile werden
         }                            // kopiert
        }
  //      printArray(narray);

        for(int i = 0; i < narray.length - schritte; i++){
          t = schritte + i;           // gesamtes Array umdrehen
          array[i] = narray[lange - t];
        }
  //      printArray(array);
        schritte++;
  //      IO.println("Schritte " + schritte);
      }
      else{                          // Letzter finaler Flip für aufsteigende
        for(int i = 0; i < array.length; i++){ // reihnfolge
          narray[i] = array[lange - i];
        }
        array = narray;
      IO.println("Das sortierte Array sieht so aus: ");
      printArray(array);
      }
    }

    /**
     * Gibt ein Array auf dem Terminal aus.
     *
     * Beispiel: Ein Array mit den Zahlen 1, 2 und 3 als Inhalt
     * wird ausgegeben als: 1 2 3
     *
     * @param array Das auszugebene Array
     */
    public static void printArray(int[] array) {
      // TODO

      for(int i = 0; i < array.length; i++){ // Ausgabe vom Array
        IO.print(array[i], 4);
      }
      IO.println();
    }

    /**
     * Sortiert das gegebene <tt>array</tt> mit dem PancakeSort Verfahren.
     *
     * @param array zu sortierendes Array
     */
    public static void sort(int[] array) {
      // TODO
      int min = array[0];       // Belibiges min
      int stelle = 0;

      for(int i = 0; i < array.length - schritte; i++){
        if(array[i] < min){     // Sucht kleineres min und setzt es als neu min
          min = array[i];
          stelle = i;
        }
      }
  //    IO.println("Min ist: " + min);    // Gibt aus an welcher stelle
  //    IO.println("Stelle ist: " + stelle); // geflipt werden soll
      flip(array, stelle);
    }
/**
 * Main ruft die einzelnen Methoden auf und liest die Daten ein
 */
    public static void main(String[] args) {
      // TODO

      int[] folge;
      int lastflip = -1;

      folge = IO.readInts("Bitte eine Zahlenfolge eingeben: ");
      IO.println();
      IO.println("Die ungeordnetet Zahlenfolge sieht so aus: ");
      printArray(folge);
      for(int l = 0; l < folge.length - 1; l++){
        sort(folge);
      }
      flip(folge, lastflip);
    }
}
