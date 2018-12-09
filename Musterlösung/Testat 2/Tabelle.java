/******************************  Tabelle.java  ********************************/

import AlgoTools.IO;

/**
 * Liest eine natuerliche Zahl k kleinergleich 15 ein und gibt für alle
 * Paare (x,y) aus {0,...,k-1}x{0,...,k-1} den Wert x % y aus.
 */
public class Tabelle {

   public static void main(String[] args) {

      int abstand = 4; //Groesse einer Spalte

      // Benutzereingabe mit Validierung
      int k;
      do {
         k = IO.readInt("Bitte eine Zahl zwischen 1 und 15 eingeben: ");
      } while (k <= 0 || k > 15);

      IO.println();

      // Leerzeichen in die linke obere Ecke
      IO.print("|", abstand);

      // Tabellenkopf
      for (int spalte = 1; spalte <= k; spalte++) {
         IO.print(spalte, abstand);
      }
      IO.println();

      // Trennlinie
      for (int i = 1; i < abstand; i++) {
        IO.print("-");
      }
      IO.print("+");
      for (int i = 0; i <= k * abstand; i++) {
         IO.print("-");
      }
      IO.println();


      // aeussere Schleife fuer Zeilen
      for (int zeile = 1; zeile <= k; zeile++) {

         // mit Trennstrich
         IO.print(zeile + "|", abstand);
         // innere Schleife fuer Spalten
         for (int spalte = 1; spalte <= k; spalte++) {
            //hier erfolgt die Berechnung des Zelleninhalts
            IO.print((zeile % spalte), abstand);
         }
         // Zeilenumbruch
         IO.println();
      }
   }

}
