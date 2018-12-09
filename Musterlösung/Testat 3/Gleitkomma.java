/******************************  Gleitkomma.java  *****************************/

import AlgoTools.IO;

/**
 * Liest eine Gleitkommazahl ein und gibt die binaere 32-Bit float-Darstellung
 * wieder aus.
 *
 * @author Sebastian Buescher (sbuesche@uos.de)
 * @author Nicolas Neubauer (nineubau@uos.de)
 * @author Jana Lehnfeld (jlehnfel@uos.de )
 */

public class Gleitkomma {

  public static void main(String[] args) {

    float eingabe;
    float tmp;
    double f;
    double zweihoch;
    int exponent = 0;
    int newexponent = 0;
    int expotmp = 0;

    do {
      eingabe = IO.readFloat("Bitte eine Gleitkommazahl eingeben: ");
    } while(eingabe > -1.0 && eingabe < 1.0);

    // Vorzeichenbit ausgeben und Zahl ggf. anpassen
    if (eingabe < 0) {
      IO.print("1 ");
      eingabe = -1 * eingabe;
    } else {
      IO.print("0 ");
    }

    // Exponent berechnen
    tmp = eingabe; // Eingabe zwischenspeichern
    while (eingabe >= 2) {
      eingabe /= 2;
      exponent++;
    }
    eingabe = tmp; // Eingabe wieder herstellen

    IO.print("0"); // Vorzeichenbit des Exponenten
    newexponent = exponent;

    expotmp = newexponent;

    // fuer jedes Bit
    for (int bit = 7; bit > 0; bit--) {

      // laufe bis zum Beginn der Binaerzahl
      for (int k = 1; k < bit; k++) {
        newexponent /= 2;
      }

      // und drucke aus
      if (newexponent % 2 != 0) {
        IO.print("1");
      } else {
        IO.print("0");
      }
      newexponent = expotmp;
    }

    IO.print(" ");

    zweihoch = 1;

    // zwei hoch Exponent berechnen.
    for (int i = 0; i < exponent; i++) {
      zweihoch *= 2;
    }
    f = eingabe / zweihoch - 1; // Mantisse

    // Mantisse ausgeben, Algorithmus siehe Skript S. 25.
    for (int i = 0; i < 23; i++) {
      f = f * 2.0;
      if (f >= 1.0) {
        IO.print("1");
        f = f - 1;
      } else {
        IO.print("0");
      }
    }
    IO.println();
  }
}

