/************************  LaufzeitenLoes.java  *************************/

import AlgoTools.IO;

/**
 * Komplexitaet von Methoden in der O-Notation
 */

public class LaufzeitenLoes {

 /** Berechnet den ganzzahligen Logarithmus dualis von n. O(log_2(n)) */
 public static int a(int n) {
    int z = 0;

    while (n > 1) {
      n /= 2;
      z++;
    }
    return z;
  }
  
  /** Berechnet das Quadrat von n. Laufzeit O(n) */
  public static int b(int n) {
    int i = 0;
    int b = 1;

    while (++i < n) {
      b = b + 2 * i + 1;
    }
    return b;
  }
  
  /** Berechnet die ganzzahlige Quadratwurzel von n. O(Wurzel(n)) */
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
 * w(v) berechnet log_2(n) in log_2(n) Schritten -> O(log_2(n)
 *
 * Welche Lauzeiten haben in diesem Fall die folgenden Methoden?
 */

  private static int u(int n) {return b(n);};
  private static int v(int n) {return c(n);};
  private static int w(int n) {return a(n);};

  /** berechnet Quadrat von Wurzel n.
   *  zunaechst Wurzel, dann davon das Quadrat
   *  Wurzel(n)+Wurzel(n)=2*Wurzel(n) --> O(Wurzel(n))
   */
  public static int d(int n) {
    return u(v(n));

  }
  /** Berechnet Wurzel vom Logarithmus von n. O(log2(n))
   *  zunaechst Logarithmus, dann daraus die Wurzel
   *  log2(n)+Wurzel(log2(n))<2*log2(n) --> O(log2(n))
   */
  public static int e(int n) {
    return v(w(n));
  }

  /** berechnet Wurzel vom Quadrat von n. O(n)
   *  zunaechst Quadrat, dann daraus die Wurzel
   *  n+Wurzel(n^2)=n+n --> O(n)
   */
  public static int f(int n) {
    return v(u(n));
  }

  /** berechnet Wurzel n mal Wurzel n. O(n)
   *  Wurzel(n)*Wurzel(n)*2=2*n    --> O(n)
   */
  public static int g(int n) {
    int z = 0;

    for (int i = 1; i <= v(n); i++)
      z += v(n);

    return z;
  }

  /** berechnet Wurzel n mal Wurzel n. O(n)
   *  Wurzel(n)+Wurzel(n)*Wurzel(n)=Wurzel(n)+n<2*n --> O(n)
   */
  public static int h(int n) {
    int z = 0;
    int y = v(n);

    for (int i = 1; i <= y; i++)
      z += v(n);

    return z;
  }

  /** berechnet Wurzel von n + Logarithmus von n. O(Wurzel(n)),
   *  da Wurzel(n) + log2(n) < 2*Wurzel(n)
   */
  public static int i(int n) {
    return v(n) + w(n);
  }

  /** berechnet Quadrat von Quadrat von n. O(n^2)
   *
   *  n + n^2 < 2*n^2 --> O(n^2)
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

    IO.print("a(" + n + ") =");
    IO.println(a(n), 8);

    IO.print("b(" + n + ") =");
    IO.println(b(n), 8);

    IO.print("c(" + n + ") =");
    IO.println(c(n), 8);

    IO.print("d(" + n + ") =");
    IO.println(d(n), 8);

    IO.print("e(" + n + ") =");
    IO.println(e(n), 8);

    IO.print("f(" + n + ") =");
    IO.println(f(n), 8);

    IO.print("g(" + n + ") =");
    IO.println(g(n), 8);

    IO.print("h(" + n + ") =");
    IO.println(h(n), 8);

    IO.print("i(" + n + ") =");
    IO.println(i(n), 8);

    IO.print("j(" + n + ") =");
    IO.println(j(n), 8);
  }
}
