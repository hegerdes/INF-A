/******************************  Summe.java  **********************************/

import AlgoTools.IO;

/**
 * @version 06.11.16
 *  
 * @author  hlauts
 */

public class Summe {

  public static void main(String[] argv) {
     
    int quersumme, x;                                             //Variablen bestimmen 

        quersumme = 0;                                           //Die Variable Quersumme auf 0 setzen 
          x = IO.readInt("Bitte eine Zahl > 0  eingeben: ");     //Benutzer auffordern eine Zahl einzugeben

          while (x > 0) {                                        //Solange x > 0 wird die Schleife ausgeführt
            quersumme += x % 10;                                  //quersumme + den Rest von x / 10
            x = x / 10;                                          //x / 10 teilen um mit der nächsten Zahl weiterzumachen
          }
   
   IO.println("Die Quersumme der Zahl ist: " + quersumme);       // Die Quersumme ausgeben

  }
}

