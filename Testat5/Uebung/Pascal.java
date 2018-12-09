/******************************  Pascal.java  *********************************/

import AlgoTools.IO;

/**
 * @version 24.11.16
 *
 * @author  lukas
 */

public class Pascal {

  public static int pascal(int zeile, int spalte) {
    if (zeile < 0 || spalte < 0) {
      throw new RuntimeException(
        "Zeile und Spalte müssen positiv sein!"
      );
    }

    if (spalte > zeile) {
      throw new RuntimeException("Spalte muss <= Zeile sein!");
    }

    return pascalRek(zeile, spalte);
  }

  private static int pascalRek(int zeile, int spalte) {
    if (spalte == 0 || spalte == zeile) {
      return 1;
    }

    return pascalRek(zeile - 1, spalte - 1)
      + pascalRek(zeile - 1, spalte);
  }

  public static void main(String[] argv) {
      int zeile;
      do {
        zeile = IO.readInt("Bitte Zeilenindex: ");
      } while (zeile < 0);

      int spalte;
      do {
        spalte = IO.readInt("Bitte Spaltenindex (<= Zeile): ");
      } while (spalte < 0 || spalte > zeile);

      IO.println("Wert = " + pascal(zeile, spalte));
  }
}

