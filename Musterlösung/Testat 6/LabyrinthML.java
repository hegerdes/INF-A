/******************************  Labyrinth.java  ******************************/

/**
 * Liest ein Labyrinth ein und berechnet mittels einem Backtracking
 * Algorithmus einen Weg durch dieses.
 *
 * @author Christian Heiden
 * @author Lukas Kalbertodt
 */

import AlgoTools.IO;

public class LabyrinthML {

  /** Freies Feld */
  private static final char FREI  = ' ';
  /** Mauer */
  private static final char MAUER = '#';
  /** Startfeld */
  private static final char START = 'S';
  /** Zielfeld */
  private static final char ZIEL  = 'Z';
  /** Besuchtes Feld */
  private static final char PFAD  = '-';

  /**
   * Findet einen Weg durch das Labyrinth.
   * Findet den Startpunkt und ruft findeZielRek mit dem Startpunkt auf.
   *
   * @param lab Das Labyrinth
   * @throws RuntimeException Wenn kein Startpunkt gefunden wurde
   * @return Ob ein Weg gefunden wurde
   */
  private static boolean findeZiel(char[][] lab) {

    int startX = -1, startY = -1;

    for (int zeile = 0; zeile < lab.length; zeile++) {
      for (int spalte = 0; spalte < lab[zeile].length; spalte++) {
        if (lab[zeile][spalte] == START) {
          startX = zeile;
          startY = spalte;
        }
      }
    }

    if (startX == -1 || startY == -1){
      throw new RuntimeException("Kein Startpunkt vorhanden.");
    }

    // Starte rekursive Suche
    boolean erg = findeZielRek(lab, startY, startX);

    // Start zuruecksetzen, weil er ueberschrieben wurde
    lab[startX][startY] = START;
    return erg;
  }


  /**
   * Findet rekursiv einen Weg durch das Labyrinth
   *
   * @param lab Das Labyrinth
   * @param x X-Koordinate des Punktes bei dem man steht
   * @param y Y-Koordinate des Punktes bei dem man steht
   * @return Ob ein Weg gefunden wurde
   */
  private static boolean findeZielRek(char[][] lab, int x, int y) {

    // Rekursionsanker: Wenn Feld eine Mauer ist oder wir das Feld schon
    // besucht haben, ist der Weg nicht erfolgreich
    if (lab[y][x] == MAUER || lab[y][x] == PFAD) {
      return false;
    }

    // Rekursionsanker: Wenn ich auf dem Ziel stehe, war der Pfad
    // erfolgreich
    if (lab[y][x] == ZIEL) {
      return true;
    }

    // Markiere jetziges Feld als bereits betreten
    lab[y][x] = PFAD;

    // Teste Norden
    if(findeZielRek(lab, x, y-1)) {
      return true;
    }
    // Teste Osten
    if(findeZielRek(lab, x+1, y)) {
      return true;
    }
    // Teste Sueden
    if(findeZielRek(lab, x, y+1)) {
      return true;
    }
    // Teste Westen
    if(findeZielRek(lab, x-1, y)) {
      return true;
    }

    // Kein Pfad war erfolgreich: Setze Feld zurueck und gehe einen
    // Schritt zurueck
    lab[y][x] = FREI;
    return false;
  }

  /**
   * Zeigt das uebergebene Labyrinth auf dem Terminal an
   *
   * @param lab Das anzuzeigende Labyrinth
   */
  private static void druckeLabyrinth(char[][] lab) {
    for(int i = 0; i < lab.length; i++) {
      IO.println(lab[i]);
    }
  }


  /**
   * Liest das Labyrinth von dem Terminal
   * @return Das eingelesene Labyrinth
   */
  private static char[][] leseEingabe() {
    int breite = 0, hoehe = 0;

    // Lese Breite ein
    do {
      breite = IO.readInt("Breite des Labyrinths: ");
    } while(breite <= 0);

    // Lese Hoehe ein
    do {
      hoehe = IO.readInt("Hoehe des Labyrinths: ");
    } while(hoehe <= 0);

    // Lege Array an, welches ausgegeben wird
    char[][] out = new char[hoehe][];

    // Fuer jede Zeile
    for(int i = 0; i < hoehe; i++) {
      char[] zeile;

      // lies Zeile mit korrekter Anzahl von Buchstaben ein
      do {
        zeile = IO.readChars("Zeile " + i + " des Labyrinths: ");
      } while(zeile.length != breite);

      out[i] = zeile;
    }
    return out;
  }

  /**
   * Liest Labyrinth ein und findet einen Weg von S nach Z
   */
  public static void main(String[]args){

    // Lese Labyrinth ein
    char[][] lab = leseEingabe();

    // Gebe aus
    IO.println();
    IO.println("----- Original-Labyrinth: -----");
    druckeLabyrinth(lab);
    IO.println();

    boolean gefunden = findeZiel(lab);

    if(gefunden) {
      // Gebe aus
      IO.println("-----   Gefundener Weg:   -----");
      druckeLabyrinth(lab);
    } else {
      IO.println("Kein Weg zum Ziel gefunden!");
    }

  }
}
