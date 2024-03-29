/*****************************  Collatz.java  *********************************/

import AlgoTools.IO;

/**  Berechnet Collatz-Funktion, d.h.                     
 *   Anzahl der Iterationen der Funktion g: N -> N        
 *   bis die Eingabe auf 1 transformiert ist              
 *   mit g(x) = x/2 falls x gerade, 3*x+1 sonst          
 */

public class Collatz {

  public static void main(String [] argv) {

    int x, z, y;                                   // definiere 3 Variablen
 
    x = IO.readInt("Bitte eine Zahl: ");        // lies einen Wert ein 
    z = 0;                                      // setze z auf 0
    y = x;                                      // fuer die Ausgabe wird y=x gesetzt

    while (x != 1) {                            // solange x ungleich 1 ist
        if (x % 2 == 0)                         // falls x gerade ist
            x = x / 2;                          // halbiere x 
        else                                    // andernfalls
            x = 3*x+1;                          // verdreifache x und add. 1
        z = z+1;                                // erhoehe z um eins
    }
    IO.println("Fuer die Zahl " + y + " betraegt die Anzahl der Iterationen: " + z); // gib z aus
  }
}
