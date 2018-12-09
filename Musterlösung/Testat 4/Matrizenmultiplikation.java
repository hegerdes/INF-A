/************************  Matrizenmultiplikation.java  **********************/

import AlgoTools.IO;

/**
 * Implementation der Matrizenmultiplikation.
 */
public class Matrizenmultiplikation {
  public static void main(String[] args) {
    int l, m, n;

    // Größe der ersten Matrix einlesen
    do {
      l = IO.readInt("Bitte die Zeilenzahl l der ersten Matrix: ");
    } while(l <= 0);

    do {
      m = IO.readInt("Bitte die Spaltenzahl m der ersten Matrix: ");
    } while(m <= 0);

    // Array für die erste Matrix anlegen
    int[][] a = new int[l][m];

    // Zeileweise die erste Matrix einlesen
    for(int i = 0; i < l; i++) {
      int[] zeile;

      do {
        zeile = IO.readInts(
          "Bitte Zeile " + (i + 1) + " mit " + m + " Elementen: "
        );
      } while(zeile.length != m);

      a[i] = zeile;
    }
    IO.println();

    // Größe der zweiten Matrix einlesen.
    // Die Zeilenzahl muss nicht gelesen werden, da ohnehin nur
    // Matrizen mit m Zeilen erlaubt sind (siehe Aufgabenstellung).
    do {
      n = IO.readInt("Bitte die Spaltenzahl n der zweiten Matrix: ");
    } while(n <= 0);

    // Array für die zweite Matrix anlegen
    int[][] b = new int[m][n];

    // Zeilenweise die zweite Matrix einlesen
    for(int i = 0; i < m; i++) {
      int[] zeile;

      do {
        zeile = IO.readInts(
          "Bitte Zeile " + (i + 1) + " mit " + n + " Elementen: "
        );
      } while(zeile.length != n);

      b[i] = zeile;
    }
    IO.println();

    // Array für Ergebnismatrix anlegen
    int[][] c = new int[l][n];

    for(int i = 0; i < l; i++) {
      for(int j = 0; j < n; j++) {
        int sum = 0;

        for(int k = 0; k < m; k++) {
          sum += a[i][k] * b[k][j];
        }

        c[i][j] = sum;
      }
    }

    IO.println();
    IO.println("Das Ergebnis lautet: ");
    IO.println();
    for(int i = 0; i < c.length; i++) {
      for(int j = 0; j < c[0].length; j++) {
        IO.print(c[i][j], 6);
      }
      IO.println();
    }
  }
}
