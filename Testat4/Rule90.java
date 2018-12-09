/******************************  Rule90.java  *********************************/

import AlgoTools.IO;

/**
 * @version 18.11.16
 *  
 * @author  hegerdes
 * @author  hlauts
 */

public class Rule90 {

  public static void main(String[] argv) {
     
     int[] werte;
     werte = IO.readInts("Bitte Werte Eingeben ");

     int schritte;
     schritte = IO.readInt("Bitte Anzahl der durchlaufr Eingaben ");

     IO.println(); 
     boolean[] werteTF;                   // Vorbereitung für Umwandlung in
     werteTF = new boolean[werte.length]; // boolean Array
     for(int i = 0; i < werte.length; i++){
       if(werte[i] <= 0){
         werteTF[i] = false;
       }
       else                              // 0<=false 1>= true
         werteTF[i] = true;
      }

      for(int j = 0; j < werteTF.length; j++){         // Ausgabe der ersten 
        if(werteTF[j] == true){                     // Zeile als @ und .
          IO.print(" @ ");
        }
        else
        IO.print(" . ");
      }
      IO.println();

      for(int k = 0; k < schritte; k++){          // Berechnung der naechsten
        boolean[] werteTFneu = new boolean[werte.length];  // Zeile
        for(int l = 0; l < werte.length; l++){      // Da lange des Array 
          if(l == 0){                            // unbekannt lauft die Schlfe
            if(werteTF[werteTF.length-1] == true ^ werteTF[l+1] == true){
              werteTFneu[l] = true;              // bis das ende erreicht ist
            }
            else                                 // Sonderfall fuer erste und
            werteTFneu[l] = false;               // letzte Spalte
          }                                    // Beispiel m.length -1 für 
          if(l == werteTF.length - 1){        // Zugriff auf letzte Zeile
            if(werteTF[l-1] == true ^ werteTF[0] == true){
              werteTFneu[l] = true;
            }
            else
            werteTFneu[l] = false;
          }
          if(l > 0 && l < werte.length - 1){  // Normal Fall 
            if(werteTF[l-1] == true ^ werteTF[l+1] == true){
              werteTFneu[l] = true;
            }
          }
        }

        for(int j = 0; j < werteTFneu.length; j++){  // Ausgabe der Tabelle
          if(werteTFneu[j] == true){
            IO.print(" @ ");
          }
          else
          IO.print(" . ");
        }
        IO.println();

        werteTF = werteTFneu;                    // Neu erstellte Zeile
                                                 // wird zur alten Zeile
      }                                          // Solange Nuter bis alle
                                                 // Durchlauufe OK sind

      IO.println();


  }
}

