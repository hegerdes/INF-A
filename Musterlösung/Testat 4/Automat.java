/******************************  Automat.java  ********************************/

import AlgoTools.IO;

/**
 * Implementation eines endlichen Automaten zur Bestimmung, ob die Eingabe
 * eine korrekte Fließkommazahl ist.
 */

public class Automat {
  public static void main(String[] argv) {
      final byte V = 0;
      final byte Z = 1;
      final byte K = 2;

      byte status = 0;

      byte[][] uebergang = new byte[][] {
        /* Eingabe: Vorzeichen, Ziffer, Komma */
        /* 0: Startzustand */{ 1, 2, 5 },
        /* 1: +/- */         { 5, 2, 5 },
        /* 2: VK */          { 5, 2, 3 },
        /* 3: K */           { 5, 4, 5 },
        /* 4: NK */          { 5, 4, 5 },
        /* 5: F */           { 5, 5, 5 }
      };

      char eingabe;

      do {
        // Eingabe solange verarbeiten bis return eingegeben wird.

        eingabe = IO.readChar(
          "Naechstes Eingabezeichen (V(orzeichen), Z(iffer), K(omma)) : "
        );

        // Case-sensitives Einlesen
        switch (eingabe) {
          case 'v':
          case 'V':
            status = uebergang[status][V];
            break;
          case 'z':
          case 'Z':
            status = uebergang[status][Z];
            break;
          case 'k':
          case 'K':
            status = uebergang[status][K];
            break;
          case '\n':
            // Wenn nur Enter gedruckt wurde, sofort ausgeben und beenden
            IO.println(
              "Die Zahl ist "
              + (status == 2 || status == 4 ? "gültig" : "ungültig")
              + "."
            );
            break;
          default:
            // Falsch eingegeben: Nochmal versuchen und NICHT den Status des
            // Automaten ändern
            IO.println("Ungültiges Zeichen, versuchen Sie es erneut");
        }

      } while (eingabe != '\n');
   }
}
