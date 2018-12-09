/******************************  QuickSort.java  ******************************//***************************  QuickSort.java  *********************************/

import AlgoTools.IO;

/**
 * @version 09.12.16
 *  
 * @author  hegerdes
 */

/** rekursives Sortieren mit Quicksort 
 *  Idee: partitioniere die Folge 
 *  in eine elementweise kleinere und eine elementweise groessere Haelfte 
 *  und sortiere diese nach demselben Verfahren
 */

public class QuickSort {
 
  public static void sort (int[] a) {             // oeffentliche Methode
    quicksort(a, 0, a.length-1);                  // startet private Methode
  }

  private static void quicksort (int[] a, int unten, int oben) {   
    int tmp ;                                     // Hilfsvariable
    int i = unten;                                // untere Intervallgrenze
    int j = oben;                                 // obere Intervallgrenze
    int mitte = (unten + oben) / 2;               // mittlere Position
    int x = a[mitte];                             // Pivotelement
    IO.println();  
    IO.println("Der Median ist:  " + x);  
    IO.println("Die untere Grenze des Array ist: " + unten);  
    IO.println("Die Obere Grenze des Arrays ist: " + oben);  
    do {
    IO.println();  
        while (a[i] < x) i++;                     // x fungiert als Bremse
        while (a[j] > x) j--;                     // x fungiert als Bremse
        if (i <= j)  {
        IO.println("Hier findet ein Tausch an der Stelle i=" + i + " mit der Stelle j=" + j + " statt");
        IO.println("Hier wird " + a[i] + " mit " + a[j] + " getauscht.");
        IO.println();
        
            tmp  = a[i];                          // Hilfsspeicher
            a[i] = a[j];                          // a[i] und 
            a[j] = tmp;                           // a[j] werden getauscht
            i++;                  
            j--;  
            druck(a);
        }                        
    } while (i <= j); 
                         // alle Elemente der linken Array-Haelfte sind kleiner
                         // als alle Elemente der rechten Array-Haelfte
        IO.println();
        IO.println("Schleife durchlaufen!");
        IO.println("Methode wird ggf. neu aufgerufen.");
        IO.println("Bei einem neuem Aufruf sind die neuen Grenzen:");
        IO.println("i= " + i + " und j= " + j );

    if (unten < j)  quicksort(a, unten, j);       // sortiere linke Haelfte
    if (i < oben )  quicksort(a, i, oben);        // sortiere rechte Haelfte
  }

public static void druck(int folge[]){

    for(int i = 0; i < folge.length; i++){
          IO.print(folge[i], 3);
              }
                  IO.println();
                    }

                      public static void main(String[] argv) {

                        int folgemain[] = { 7, 4, 6, 8, 9, 1, 3, 2};
                       

                            IO.println();
                              IO.println("Die unsortierte Folge sieht so aus: ");
                                IO.println();
                                  druck(folgemain);

                                                  sort(folgemain); 
                                                                                      }


}
