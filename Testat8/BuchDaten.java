/******************************  BuchDaten.java  ****************************/

import AlgoTools.IO;

/**
 * Einfacher Algorithmus zur Erfassung von Buchdaten mit Hilfe von
 * char-Arrays
 *
 * @author hegerdes
 * @author hlauts 
 */

public class BuchDaten{

  public static int l;

  /**
  * Erzeugt Buchdaten-Array aus uebergebenen Attributen und
  * haengt diese der als char[][][] Array uebergebenen Liste an.
  *
  * @param titel Vorname des anzulegenden Buchdatums
  * @param autor Nachname des anzulegenden Buchdatums
  * @param erscheinungsjahr Alter des anzulegenden Buchdatums
  * @param liste Array mit bereits vorhandenen Buchdaten
  * @return Kopie der Buchdatenliste ergaenzt um das neue Datum
  * @throws RuntimeException falls erscheinungsjahr kleiner 0 oder groesser 2012
  */
  public static char[][][] addBuch(char[] titel, char[] autor,
                                   int erscheinungsjahr, char[][][] liste){
  if(erscheinungsjahr < 0 || erscheinungsjahr > 2016){
    throw new RuntimeException("Ungueltiges Erscheinungsjahr!");
  }
  
  // erstellt neues Array fuer neuen Eintrag
  char[][][] themp = new char[liste.length + 1][3][];
  
  // kopiert ds bsstehende Array
  for(int i = 0; i < liste.length; i++){
    themp[i] = liste[i];
  }
  // Zerlegt das erscheinungsjahr
  int tausender = erscheinungsjahr/1000;
  int hunderter = ((erscheinungsjahr%1000)/100);
  int zehner = ((erscheinungsjahr%100)/10);
  int einer = (erscheinungsjahr%10);
  char[] jahr = new char[4];

  // zerlegtes Erscheinungsjahr wird in Char-Array geschieben
  array(jahr, tausender);
  array(jahr, hunderter);
  array(jahr, zehner);
  array(jahr, einer);
  l=0; // Klassenvariavle wird zurueckgesetzt

/*  for(int i = 0; i < jahr.length; i++){
    IO.print(jahr[i],3);
  }      
  for(int i = 0; i < titel.length; i++){
    IO.print(titel[i],3);
  }
*/  
  // Neur Eintag wird zu Buchliste hinzugefuegt
  themp[themp.length - 1][0] = titel;
  themp[themp.length - 1][1] = autor;
  themp[themp.length - 1][2] = jahr;

  return themp;
  }
  
/**
 * Schreibt tausender/hunderter/zehner/einer in ein Char-Array
 * Umwandlung von Int in Char
 * @param jahr - Char-Array in das geschieben wird
 * @param uevergabe - einstelliger int der in char[] gescieben wird
 * @throws Wenn uebergabe im ungueltigen gereich <0 oder >9
 */
  public static void array(char[]jahr, int uebergabe){
  
  if(uebergabe < 0 || uebergabe > 9){
    throw new RuntimeException("Ungueltiger Parameter");
  }
    switch(uebergabe){
      case 1: jahr[l] = '1';break;
      case 2: jahr[l] = '2';break;
      case 3: jahr[l] = '3';break;
      case 4: jahr[l] = '4';break;
      case 5: jahr[l] = '5';break;
      case 6: jahr[l] = '6';break;
      case 7: jahr[l] = '7';break;
      case 8: jahr[l] = '8';break;
      case 9: jahr[l] = '9';break;
      case 0: jahr[l] = '0';break;
//      case defaut: IO.println("Feher");
    }
    l++;
  }

  /**
  * Liesst iteriert Buchendaten ein und gibt die Daten anschliessend
  * auf der Konsole aus.
  */
  public static void main(String[] argv) {

    // Diese Methode soll NICHT geändert werden.

    char[][][] liste = new char[0][][];

    do{

      IO.println("Bitte geben Sie Buchdaten ein.");
      char[] titel=IO.readChars("Bitte den Titel eingeben: ");
      char[] autor=IO.readChars("Bitte den Autor eingeben: ");
      int erscheinungsjahr=IO.readInt("Bitte das Erscheinungsjahr eingeben: ");

      liste=addBuch(titel,autor,erscheinungsjahr,liste);

    }while(IO.readInt("Moechten Sie weitere Buecher eingeben?"
                          +" Abbruch mit 0: ")!=0);


    for(int i=0; i<liste.length; i++){
      IO.println("Buch Nr. "+(i+1));
      IO.println("Titel: ");
      for(int j=0; j<liste[i][0].length; j++){
        IO.print(liste[i][0][j]);
      }
      IO.println();
      IO.println("Autor: ");
      for(int j=0; j<liste[i][1].length; j++){
        IO.print(liste[i][1][j]);
      }
      IO.println();
      IO.println("Erscheinungsjahr: ");
      for(int j=0; j<liste[i][2].length; j++){
        IO.print(liste[i][2][j]);
      }
      IO.println();
    }
  }
}
