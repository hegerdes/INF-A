/******************************  Quersumme.java  ******************************/

import AlgoTools.IO;

/**
 * @version 02.11.16
 *  
 * @author  hegerdes
 */

public class Quersumme {

  public static void main(String[] argv) {
     
     int x, Summe;                           // x ist die Zahl vom Nutzer

    IO.println();
    IO.println("Dieses Programm addiert fuer dich Zahlen zusammen.");
    IO.println("Du kannst belibig viele Zahlen eingeben.");
    IO.println("Wenn du das Ergebnis moechtest gibt als letzte Zahl eine 0 ein");
    IO.println();                          // So wird auf kompakte weise 
                                           // immer wieder adiert bis Eingabe=0
    Summe = 0;                             // Summe wird dabei jeweils um den
    x = IO.readInt ("Gib bitte eine Zahl ein: ");
     while (x != 0){                       // Wert von Eingabe hochgezaelt
      Summe = Summe + x;
      x = IO.readInt ("Bitte noch eine Zahl: ");
      }
    IO.println();  
    IO.println("Alle Zahlen zusammen addiert ergibt: " + Summe);


  }
}

