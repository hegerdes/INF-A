/******************************  Determinante.java  ***************************/

import AlgoTools.IO;

/**
 * Programm berechnet Determinante einer gegebenen Matrix
 */

public class Determinante {

  /**
  * Bestimmt die Untermatrix nach Streichen von Zeile zeileX und Spalte spalteX
  * @param zeileX die zu streichende Zeile
  * @param spalteX die zu streichende Spalte
  * @param matrix die Ausgangsmatrix
  * @return die Untermatrix
  */
  private static int[][] unterMatrix(int zeileX, int spalteX, int[][] matrix) {

    int[][] unterM = new int[matrix.length - 1][matrix.length - 1];
    int zeilenSchieber = 0;
    int spaltenSchieber = 0;

    // neue Matrix füllen, ggf. Zeile/Spalte mit Schieber überspringen
    for(int zeile = 0; zeile < unterM.length; zeile++) {
      if(zeile == zeileX) {
        zeilenSchieber = 1;
      }

      spaltenSchieber = 0;
      for(int spalte = 0; spalte < unterM.length; spalte++) {

        if(spalte == spalteX) {
          spaltenSchieber = 1;
        }

        unterM[zeile][spalte] =
              matrix[zeile + zeilenSchieber][spalte + spaltenSchieber];
      }
    }

    return unterM;
  }

  /**
  * Berechnet der Determinante der übergebenen Matrix per Entwicklung
  * nach erster Zeile mit vorangegangener Fehlerbehandlung
  * @throws RuntimeException falls Matrix nicht quadratisch
  * @param matrix die Ausgangsmatrix
  * @return die Determinante
  */
  public static int determinante(int[][] matrix) {

    int dimension = matrix.length;
    int index = 0;

    // ist jede Spalte so lang wie die Zeilen?
    while(index < dimension){
      if(matrix[index].length != dimension) {
        throw new RuntimeException("Keine quadratische Matrix eingegeben!");
      }
      index++;
    }

    return det(matrix);
  }


  /**
  * Berechnet der Determinante der übergebenen Matrix per Entwicklung
  * nach erster Zeile
  * @param matrix die Ausgangsmatrix
  * @return die Determinante
  */
  private static int det(int[][] matrix) {

    // Rekursionsanker: berechne Determinante von 1x1 Matrix
    if(matrix.length == 1) {
      return matrix[0][0];
    }

    int determinante = 0;

    // in erster Zeile jede Spalte durchgehen
    for(int spalte = 0; spalte < matrix.length; spalte++) {

      int vorzeichen = (spalte % 2 == 0) ? 1 : -1;

      // rekursiv Unterdeterminante berechnen
      determinante += vorzeichen * matrix[0][spalte]
        * det(unterMatrix(0, spalte, matrix));
    }

    return determinante;
  }

  /**
  * Gibt Matrix auf Konsole aus
  * @param matrix die Ausgangsmatrix
  */
  private static void printM(int[][] matrix) {
    for(int zeile = 0; zeile < matrix.length; zeile++) {
      IO.print("|");
      for(int spalte = 0; spalte < matrix[zeile].length; spalte++) {
        IO.print(" "+matrix[zeile][spalte],5);
      }
      IO.println(" |");
    }
  }


  public static void main(String[] argv) {

    int[][] matrix;

    int dimension=0;
    do {
      dimension = IO.readInt("Welche Größe soll die Matrix haben? ");
    } while(dimension < 1);

    matrix = new int[dimension][dimension];

    // Matrixeintraege einlesen
    for(int zeile = 0; zeile < dimension; zeile++) {
      for(int spalte = 0; spalte < dimension; spalte++) {
        matrix[zeile][spalte] = IO.readInt(
          "A["+ (zeile + 1) + "][" + (spalte + 1) + "]="
        );
      }
    }

    printM(matrix);

    // Determinante berechnen und ausgeben
    IO.println("Det = " + determinante(matrix));
  }
}
