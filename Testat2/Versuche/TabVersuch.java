/******************************  TabVersuch.java  *****************************/

import AlgoTools.IO;

/**
 * @version 06.11.16
 *  
 * @author  hegerdes
 */

public class TabVersuch {

  public static void main(String[] argv) {
     
     int zahl;

     zahl = 0;

   for(int versuch = 1; versuch < 5; versuch++){
     zahl = versuch / 4;
     IO.println("Rest ist " + zahl);
   }
  }
}

