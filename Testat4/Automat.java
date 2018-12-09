/******************************  Automat.java  ********************************/

import AlgoTools.IO;

/**
 * @version 21.11.16
 *  
 * @author  hegerdes
 * @author  hlauts
 */

public class Automat {

  public static void main(String[] argv) {
     
     char eingabe;                 // 3 Variablen zum hochzaehlen
     int v, z, k, fehler;
     v = 0;
     z = 0;
     k = 0;
     fehler = 0;
     
     IO.println("Dieses Programm prueft ob Zahlen gueltig eingegeben werden.");
     IO.println("Zum beenden des Programms druecke Enter ");

     do {
       eingabe = IO.readChar("Bitte Zeichen eingeben: V; Z; K:  ");

       switch (eingabe){              // 3 Faelle koennen eingegeben werden
         case 'v': v=v + 1;
         if(z > 0 || k > 0){
           fehler = fehler + 1;
         }
         break;
         case 'z': z=z + 1;
         break;
         case 'k': k=k + 1;
           if(k == 2 || z == 0 || v > 1){
             fehler = fehler + 1;
           }
         break;
      //   case '\n': IO.print(); break;

         default: IO.println("Ungueltiges Zeichen"); break;
       }

     }
     while(eingabe != '\n');

     
     if(v == 2 || fehler > 0 || k > 1 ){   // Ungueltig wenn 1 der 3 Stimmt
       IO.println("Die Eingabe war Fehlerhaft! "); 
     }
     else
     IO.println("Die Eingabe war Gueltig! ");

  }
}

