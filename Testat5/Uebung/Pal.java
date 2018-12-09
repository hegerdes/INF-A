/******************************  Pal.java  ************************************/

import AlgoTools.IO;

/**
 * @version 27.11.16
 *  
 * @author  hegerdes
 */

public class Pal {

  public static void main(String[] argv) {
     
     char[] wort;

     wort = IO.readChars("Bitte Wort eingeen: ");

     int laenge;
     laenge = wort.length - 1;
     boolean antwort = true;
     int halbe;
     halbe = wort.length / 2;
     if(wort.length % 2 != 0){
       halbe++;
     }
     IO.println(halbe);
     IO.println(laenge);
     for(int i = 0; i < halbe || antwort == false; i++){
       if(wort[i] == wort[laenge - i]){
         antwort = true;
       }
       else
       antwort = false;
     }
     IO.println(antwort);

  }
}

