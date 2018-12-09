/******************************  Primzahltest.java  *************************/

import AlgoTools.IO;

/**
 * Liest eine natuerliche Zahl ein und testet, ob diese
 * eine Primzahl ist.
 */
class Primzahltest {
  public static void main(String[] args){
    int n;

    do {
      n = IO.readInt("Bitte eine ganze Zahl > 1: ");
    } while(n <= 1);

    boolean istPrim = true;

    for(int i = 2; i < n; i++){
      if(n % i == 0){
        istPrim = false;
      }
    }

    if(istPrim){
      IO.println(n + " ist eine Primzahl.");
    } else {
      IO.println(n + " ist keine Primzahl.");
    }
  }
}
