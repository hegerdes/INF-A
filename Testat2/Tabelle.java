/******************************  Tabelle.java  ********************************/

import AlgoTools.IO;

/**
 * @version 05.11.16
 *  
 * @author  hegerdes
 */

public class Tabelle {

  public static void main(String[] argv) {

  int eingabe, striche, ziffer;     // 6 Variablen fuer folgende Aufgaben
                                    // Speichern der eingabe, Hoehe und Breite
                                    // der Tabelle. Fuer das Ergebnis
                                    // und fuer visuelle Titelleiste mit --
  IO.println();
  eingabe = IO.readInt("Bitte gib eine Zahl fure die Tabellengroeße ein: ");
  striche = 0;
  ziffer = 0;
  IO.println();
   if(eingabe > 0 && eingabe<16){   // Stellt sicher das nur die in der Aufgabe
     for(int zeile = 1; zeile <= eingabe; zeile++){
                                    // gestellten Werte funktionieren
       if(zeile ==1){               // Fuer eine Zusaetzliche Zeile
         IO.print("Spalte   | ");   // In dieser erkennt man die Tabellenbreite
         for(int titelzeile = 1; titelzeile<= eingabe; titelzeile++){
           IO.print(titelzeile,2);  // Alle zahlen sollen untereinander
           IO.print(" ");           // Deswegeb braucht jede Zahl 2 Platz
           }
         IO.println();
       }

       if(zeile == 1){             // Wie oben. Rechnung wird von Titelleiste
         IO.print("---------+");   // getrennt um das ergebnis übersichtlicher
        while(striche != eingabe){ // zu machen. Die Striche haben eine Grund-
           IO.print("---");        // laenge + variable Laenge, je nachdem wie
          striche = striche + 1;   // breit der Benutzer die Tabelle definiert
           }                       // hat. Pro zusätzliche Zahl 3 mal -
         IO.println();
         }
       
       IO.print("Zeile ");         // Zeilen wurden getrennt um zu definieren
       IO.print(zeile,2);          // das jede Zahl wieder 2 Dezimalstellen
       IO.print(" | ");            // palatz hat.

       for(int spalte = 1; spalte <= eingabe; spalte++){
         ziffer = zeile % spalte;  // Hier findet die eigentliche Rechnung stat
                                   // Aktuelle Zeile / Spalte, wobei die
         IO.print(ziffer,2);       // Spalte jeden durchlauf um 1 hochgezaelt
         IO.print(" ");            // wird


       } 
       IO.println();               // Ein Absatz am Ende, da hier das Programm
     }                         
       IO.println();               // endet   
  }
  else{
    IO.println("Ungueltige Eingabe!");
    IO.println("Bitte eine Zahl zwischen 1 und 15 eingeben.");
    IO.println();
    }
}}

