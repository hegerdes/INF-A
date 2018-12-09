/************************** ZusicherungLoes.java  ***************************/
import AlgoTools.IO;

/**
 * Beweis der Korrektheit mit Hilfe der Zusicherungsmethode
 *
 * a) Berechnet das Quadrat der Eingabezahl n.
 * b) Zeigen Sie die partielle Korrektheit mit Hilfe von Zusicherungen im
 *    Programmtext.
 * c) Zeigen Sie die totale Korrektheit durch den Nachweis der Terminierung.
 * d) Geben Sie die asymptotische Laufzeit in O-Notation an.
 *
 */

public class ZusicherungLoes {

  public static void main(String[] args) {

    int i = 0, h = 1, z = 0, n;

    /* i = 0 und h = 1 und z = 0 */

    do {
      n = IO.readInt("n= ");
    } while (n < 0);

    /* n >= 0 und i = 0 und h = 1 und z = 0 */

    /* z = i * i und h = 2 * i + 1 und i <= n ist Schleifeninvariante */

    while (i < n) {

      /* z = i * i und h = 2 * i + 1 und i <= n und i < n */

      z += h;

      /* z = i * i + 2 * i + 1 = (i + 1) * (i + 1) und h = 2 * i + 1 und i < n */

      h += 2;

      /* z = (i + 1) * (i + 1) und h = 2 * i + 3 und i < n */

      i++;

      /* z = i * i und h = 2 * i + 1 und i <= n ist Schleifeninvariante */
    }

    /* z = i * i und h = 2 * i + 1 und i <= n und nicht i < n */
    /* z = i * i und i = n */
    /* z = n * n */

    IO.println(z, 6);
    /* Ausgabe: das Quadrat von n */
  }
}

/*
 * c) Bemerkung zur Terminierung: Da n >= 0 unveraendert bleibt und i zu Beginn
 *    <= n ist und i immer nur inkrementiert wird, muss irgendwann gelten:
 *    nicht i<n. Dadurch erfolgt Abbruch der while-Schleife.
 *
 * d) Bemerkung zur Laufzeit: Der Rumpf der Schleife besteht aus einer
 *    konstanten Zahl von Schritten. Die Schleife wird n mal durchlaufen
 *    (fuer i = 0, 1, 2, ..., n-1). Es ergibt sich also ein O(n) Algorithmus,
 *    wobei n der Wert der Eingabezahl ist.
 */
