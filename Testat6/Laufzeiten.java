/************************  Laufzeiten.java  *************************/

import AlgoTools.IO;

/**
 * Komplexitaet von Methoden in der O-Notation
 */

public class Laufzeiten {
/** Berechnet den zweier Logarithmus von n O-notation:O(log n) Also log 2 von n
*   dabei wird z hochgezaehlt
*/

 public static int a(int n) {
    int z = 0;

    while (n > 1) {
      n /= 2;
      z++;
    }
    return z;
  }
/** Berechnet auf eine seltsame Weise das Quadrat von n O-notation: O(n) */
  public static int b(int n) {
    int i = 0;
    int b = 1;

    while (++i < n) {
      b = b + 2 * i + 1;
    }
    return b;
  }
/** Berechnet die Wurzel von n Laufzeit wurzel n oder allgemeiner Klasse O(n)
 *  O(wurzel(n) oder O(n)
 */
  public static int c(int n) {
    int t = 1, z = 0;

    while (n > 0) {
      n -= t;
      t += 2;
      z++;
    }
    return z;
  }


/**
 * Angenommen die Methoden u, v, und w haben die folgenden Laufzeiten:
 *
 * u(n) berechnet n^2 in n Schritten -> O(n)
 * v(n) berechnet Wurzel(n) in Wurzel(n) Schritten -> O(Wurzel(n))
 * w(n) berechnet log_2(n) in log_2(n) Schritten -> O(log_2(n)
 *
 * Welche Lauzeiten haben in diesem Fall die folgenden Methoden?
 */

/* Berechnet die Wurzel von n und multipliziet das Ergebnis mit sich selbst
 * alst wurzel und dann n^2
 * Lauzeit ist dabei Wurzel n + n
 * Allgemein gilt O(n) -da wurzel n sch der Klasse n unterordent
*/
  public static int d(int n) {
    return u(v(n));
  }

/* Berechnet den zweier log von n
 * Von dem obrigen ergebnis wird anschließend die Wurzel berechnet
 * Also Wurzel aus log2(n)
 * Laufzeiit ist O(log_2(n)+O(wurzel(n)) -> 
 * O(wurzel(n)
 */
  public static int e(int n) {
    return v(w(n));
  }
/* Berechnet n^2 und anschlieden von dem Ergebnis die Wurzel
 * Laufzeit
 * O(n) + O(wurzel(n)
 * O(n) -> Hier muss sich wurel n unterordnen
*/
  public static int f(int n) {
    return v(u(n));
  }

/* Berechnet n Mal die Wurzel von n
 * das Ergebnis wird auf z aufadiert und anschließend return
 * Laufzeit: O(wurzel(n)) * Wurzel(n) * ... Ergibt letzlich wieder die 
 * Laufzeit a*n
 * da es a*n nicht gibt O(n)
 */
  public static int g(int n) {
    int z = 0;

    for (int i = 1; i <= v(n); i++)
      z += v(n);

    return z;
  }

/* Berechnet das gleiche wie h...
 * Gleiche begründung gleiches Ergebnis
 * O(n) -> da mehrfch wurzel n * ...
*/
  public static int h(int n) {
    int z = 0;
    int y = v(n);

    for (int i = 1; i <= y; i++)
      z += v(n);

    return z;
  }
/* Berechnet die Wurzel von n + den log_2 von n
 * Laufzit O(wurzel(n) + (log2(n))
 * O(wurzel(n)) -das log muss sich unterordenen
*/

  public static int i(int n) {
    return v(n) + w(n);
  }
/* Berechnet das Quadrat von Quadrat an 
 * Also n^2^2
 * Laufzeit 2 mal n
 O(n) - der Faktor von n ist unichtig
*/

  public static int j(int n) {
    return u(u(n));
  }



  /** Hauptprogramm */
  public static void main(String argv[]) {
    int n;

    do {
      n = IO.readInt("Eingabe von n: ");
    } while (n < 1);
/*
 * Fuer diese Ergebnise siehe oben
 * es wurde bereits fuer jede Metheode einer Erklärung gegeben
*/
    IO.print("a(" + n + ") =");
    IO.println(a(n), 8);

    IO.print("b(" + n + ") =");
    IO.println(b(n), 8);

    IO.print("c(" + n + ") =");
    IO.println(c(n), 8);
  }
}
