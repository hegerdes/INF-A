/**************************  Zusicherung.java  *******************************/
import AlgoTools.IO;

/**
 * Beweis der Korrektheit mit Hilfe der Zusicherungsmethode
 */

public class Zusicherung {
/* Teilaufgabe a */
/* Die Main berechnet das Quadrat von n -> n^2*/
/* Zusicherung ist im Code*/
/* Teilaufgabe c */
/* Da n > 0 ist und waehrend des Programms nicht veraendert wird
 * und i = zu beginn =0 ist und waehend des programms kontinuerlich erhoet wird
 * muss das Programm enden da i irgendwann i>= n ist. Diese bedinnung stoppt 
*/
/* Teilaufgabe d */
/* Das Programm besteht aus einer Schleife, die n mal durchlaufe wird
 * Daraus ergibt sich
 * O(n)
 */
  public static void main(String[] args) {

    int i = 0, h = 1, z = 0, n;

    do {
      n = IO.readInt("n= ");
    } while (n < 0);
    // n >= 0 --- i=0 --- h=1 ---z=0

    /* z = i * i und h = 2 * i + 1 und i <= n ist Schleifeninvariante */

    while (i < n) {

      z += h;

/* z = i * i + 2 * i +1 das ist (i+1) * (i+1)  --- h = 2* i +1 --- i<n */

      h += 2;

/* z = (i+1)^2 --- h = 2 * i * 3 --- i<n */

      i++;

/* z= i * i --- h = 2 * i +1 --- i <=n  Damit muss die Schlife irgendwann aufhören
*/
/* Z = i*i  --- I =n -irgandwann halt
/* Dabeit ist z = n * n = n^2 */

}

    IO.println(z, 6);
  }
}
