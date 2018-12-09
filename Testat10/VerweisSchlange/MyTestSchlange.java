/***************************  VerweisSchlangeTest.java  *********************/

import AlgoTools.IO;

/**
 * Programm zum Testen der Methoden des ADT Schlange. Liest Zeichenketten und
 * reiht sie in eine Schlange ein. Bei Eingabe einer leeren Zeichenkette wird
 * die jeweils vorderste aus der Schlange ausgegeben und entfernt.
 */

public class MyTestSchlange
{

  public static void main(String argv[])
  {

    Schlange schlange = new VerweisSchlange();   // konstruiere leere Schlange

    IO.println("Bitte Schlange Fuellen durch Eingabe eines Wortes, ");

    String eingabe = IO.readString("Input 1 ");
    schlange.enq(eingabe);                   // fuege in Schlange ein
    IO.println("Top ist: " + schlange.front());

    String eingabe1 = IO.readString("Input 2 ");
    schlange.enq(eingabe1);         
    IO.println("Top ist: " + schlange.front());
    
    String eingabe2 = IO.readString("Input 3 ");
    schlange.enq(eingabe2);                   // fuege in Schlange ein
    IO.println("Top ist: " + schlange.front());

    schlange.deq();                          // entferne Frontelement
    IO.println("Top ist: " + schlange.front());
    schlange.deq();                          // entferne Frontelement
    IO.println("Top ist: " + schlange.front());

//    IO.println("Schlange ist jetzt leer.");
  }
}
