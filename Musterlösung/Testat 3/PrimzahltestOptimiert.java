/******************************  PrimzahltestOptimiert.java  *************************/

import AlgoTools.IO;

/**
 * Liest eine natuerliche Zahl ein und testet, ob diese
 * eine Primzahl ist.
 */
class PrimzahltestOptimiert {
  public static void main(String[] args){
    int n;

    do {
      n = IO.readInt("Bitte eine ganze Zahl > 1: ");
    } while(n <= 1);

    boolean istPrim = true;

    // Hier die zwei schon testen, damit man danach nur
    // noch ungerade testen muss, da alle geraden
    // Zahlen vielfache von zwei sind und damit
    // keine Primzahl mehr sein koennen.
    if(n == 2){

      istPrim = true;

    } else if(n % 2 == 0){

      istPrim = false;

    } else {

      // Ganzzahlige Wurzel berechnen
      // sqrt(x) < y <=> x < y*y
      int wurzel = n;
      while(n < wurzel*wurzel){
        wurzel--;
      }

      // Es genuegt hier nur die ungeraden Zahlen zu testen (s.o.)
      // Ausserdem reicht es bis zur Wurzel zu testen, da ein Produkt
      // von Zahlen groesser der Wurzel auch groesser als die urspruengliche
      // Zahl waere.
      for(int i = 3; i <= wurzel && istPrim; i = i+2){
        if(n % i == 0){
          istPrim = false;
        }
      }
    }

    if(istPrim){
      IO.println(n + " ist eine Primzahl.");
    } else {
      IO.println(n + " ist keine Primzahl.");
    }
  }
}
