/******************************  Primzahltest.java  ***************************/

import AlgoTools.IO;

/**
 * @version 10.11.16
 *  
 * @author  hegerdes
 */

public class Primzahltest {

  public static void main(String[] argv) {
     
     int eingabe, teiler;

     eingabe = IO.readInt("Zahl");
     teiler = 2;

     while(eingabe % teiler != 0){
       teiler = teiler + 1;
       IO.println("Teiler ist grade: " + teiler);
       }

     IO.println( eingabe + " ist eine Primzahl");

  }
}

