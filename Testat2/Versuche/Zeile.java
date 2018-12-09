/******************************  Zeile  ***************************************/

import AlgoTools.IO;

/**
 * @version 03.11.16
 *  
 * @author  hegerdes
 */

public class Zeile {

  public static void main(String[] argv) {
     
   //  int zeilen = 5;
   //  int spalten = 5;

     for(int zeile = 0; zeile < 5; zeile = zeile +1){
      IO.print("Z" + zeile + " ");

      for(int spalte = 0; spalte < 5; spalte++)
       IO.print("S" + spalte + " ");
       }
    IO.println();
  }
}

