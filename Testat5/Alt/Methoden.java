/******************************  Methoden.java  *******************************/

import AlgoTools.IO;

/**
 * @version 24.11.16
 *  
 * @author  hegerdes
 */

public class Methoden {

/**
 * Kontorlle fürs sichere Einlesen der Ackermannfunktion
 * @param ueberprueft die natuerlichen zahlen die an methode ackermann
 * weitergegeben werden
 * @return eingabe = ausgabe an methode Ackermann
 * @throws wenn natuerliche zahlen nicht in gueltigen Bereich sind
*/
  
  public static int ackermannSecure(int n, int m){
    if(n < 0 || m < 0){
      throw new RuntimeException("Fehlerhafte EIngabe");
    }
  return ackermann(n, m);
  }

/**
 * Ackermann Funktion
 * @param siehe ackermannSecure
 * @return das ergebnis des algorithymus fuer die natuerlichen zahlen
 */
  
  private static int ackermann(int n, int m) {
    if(n == 0){
      return m + 1;
    }
    if(m == 0){
      return ackermann(n - 1, 1);
    }
    return ackermann(n - 1, ackermann(n, m -1));
  }

/**
 * Palindrom-Funktion
 * @param Char-Array mit eingegebenem Wort
 * @return boolean Wert ob Bedinnung wahr oder falsch
 * @throws Runtime wenn Char kleiner gleich als 1 ist
 */

  public static boolean palin(char[] wort) {
    if(wort.length <= 1){
      throw new RuntimeException("Fehlerhafte Eingabe");
    }

  int laenge;
  char[] wortkleiner;

    while(wort.length > 2){
      laenge = wort.length -2;
      wortkleiner = new char[laenge];
        if(wort[0] == wort[wort.length - 1]){
          for(int i = 0; i < laenge; i++){
            wortkleiner[i] = wort[i+1];
          }
        wort = wortkleiner;
        }
    else
    return false;
    }
    return true;
  }


/* Potenz-Funktion
 * berechnet die Potenz einer Zahl
 */
 public static double potenz(double basis, int exponent){
   
  if(basis == 0){
    if(exponent <= 0){
      throw new RuntimeException(" Diese Eingabe ist nicht gueltig! ");
    }
    else{
    return 0;
    }
  }
  
  return (exponent < 0)
    ? (1f / potenzRek(basis, -exponent))
    : potenzRek(basis, exponent);

 }
 
 private static double potenzRek(double basis, int exponent){

   if(exponent == 0){
     return 1;
   }

   return potenzRek(basis, exponent - 1) * basis;
 
 }


  public static void main(String[] argv) {
   
   IO.println();
   IO.println();
   IO.println("Wilkommen in dieser Programmsammlung!");
   IO.println();
   IO.println();
   IO.println("Du kanns Folgende Funktionen des Programms ausprobieren: ");
   IO.println();
   IO.println("Drücke 1 für die: Ackermannfunktion");
   IO.println("Drücke 2 für die Palendromprüfung");
   IO.println("Drücke 3 für die Potenzberechnung");
   IO.println();

   int eingabe;
   do{
     eingabe = IO.readInt("Bitte Waehlen Sie eine Option: ");
     switch(eingabe){
       case 1:
         IO.println();
         IO.println("***Du hast die Ackermannfunktion ausgewählt***");
         IO.println();
         int n, m;
         do{
           n = IO.readInt("Bitte eine Zahl ");
         }
         while(n < 0);

         do{
           m = IO.readInt("Bitte die zweize Zahl ");
         }
         while(m < 0);
         IO.println();
         IO.println("Das Ergebnis ist " + ackermannSecure(n, m));
         break;
         case 2:
         IO.println();
         IO.println("***Du hast die Palendrompruefung ausgewählt***");
         char[] wort;
         do{
           wort = IO.readChars("Bitte ein Wort eingeben: ");
         }
         while(wort.length <= 1);
         IO.println();
         if(palin(wort) == true){
           IO.println("Das Wort ist ein Palindrom! ");
         }
         else 
         IO.println("Das Wort ist kein Palindrom! ");
         break;
         case 3:
         IO.println("Potenz-Programm");
         double basis;
         int exponent;
         do{
           IO.println("Beachte: 0^e ist undefiniert, falls e <= 0");
           basis = IO.readDouble("Bitte eine Zahl als Basis eingeben: ");
           exponent = IO.readInt("Bitte eine ganze Zahl fuer den Exponenten");
         }
         while(basis == 0 && exponent <= 0);
         IO.println(basis + "^" + exponent + " = " + potenz(basis,exponent));
         break;
         case 4:
           IO.println("Programm beendet! ");
         break;
         default:
           IO.println("Fehler ");
       }
     }
   while(eingabe != 4);
   


   
  }
}

