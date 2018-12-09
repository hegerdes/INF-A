/******************************  Primzahltest.java  ***************************/

import AlgoTools.IO;

/**
 * @version 08.11.16
 *  
 * @author  hegerdes
 */

public class Primzahltest {

  public static void main(String[] argv) {
     
     int eingabe, teiler;
     
     teiler = 2;
     do {                                        // verhindert falsche eingabe
       eingabe = IO.readInt("Bitte gib eine Zahl fuer den Prim-Test ein: ");
     } while (eingabe <= 0);

     if (eingabe >= 1 && eingabe <= 2){          // Sonderfall für Zahl 2
       for(teiler = 2; eingabe % teiler != 0;teiler++){
       }
         if(teiler == eingabe){
           IO.println(eingabe + " ist eine Primzahl");
         }
     }
     else
       if (eingabe % 2 == 0){                    // Sortiert alle graden Zahlen
         IO.println(eingabe + " ist keine Primzahl"); // aus
       }
       else 
        for(teiler = 3; eingabe % teiler != 0;teiler = teiler + 2){  // Try and
        IO.println(teiler);
                                                // erro. teiler wird erhöht bis
       }                                        // eingabe/teiler = 0
         if(teiler == eingabe && eingabe != 2){
           IO.println(eingabe + " ist eine Primzahl");        // Verhindert
                                                // doppelte AUsgabe von ist
         }                                      // eine oder keine Prim
         else
           if (eingabe % 2 != 0){
           IO.println(eingabe + " ist keine Primzahl");
         }
      
     

  }
}

