/**************************  BuchDatenLoesung.java  *************************/

import AlgoTools.IO;

/**
 * Einfacher Algorithmus zur Erfassung von Buchdaten mit Hilfe von
 * char-Arrays
 */

public class BuchDatenLoesung {

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

    if(erscheinungsjahr>2012 || erscheinungsjahr<0)
              throw new RuntimeException("Erscheinungsjahr muss zwischen 0 und 2012 liegen.");

    //Neue Buch als 2-d Array mit 3 Zeilen fuer die drei Attribute
    char[][] newBuch=new char[3][];
    newBuch[0]=new char[titel.length];
    newBuch[1]=new char[autor.length];
    newBuch[2]=new char[4];


    //Titel und Autor kopieren
    for(int i=0; i<titel.length; i++)
      newBuch[0][i]=titel[i];

    for(int i=0; i<autor.length; i++)
      newBuch[1][i]=autor[i];


    //aus int mach char[]
    newBuch[2][0]=(char)(erscheinungsjahr/1000 + '0');
    erscheinungsjahr=erscheinungsjahr%1000;
    newBuch[2][1]=(char)(erscheinungsjahr/100 + '0');
    erscheinungsjahr=erscheinungsjahr%100;
    newBuch[2][2]=(char)(erscheinungsjahr/10 + '0');
    erscheinungsjahr=erscheinungsjahr%10;
    newBuch[2][3]=(char)(erscheinungsjahr + '0');


    //neue Liste mit Buechern als 3-d Array mit einem Buch mehr
    char[][][] newListe = new char[liste.length+1][][];


    //alte Liste kopieren und neues Buch anhaengen
    for(int i=0; i<liste.length; i++)
      newListe[i]=liste[i];

    newListe[liste.length]=newBuch;


    return newListe;
  }

  /**
  * Liesst iteriert Buchendaten ein und gibt die Daten anschliessend
  * auf der Konsole aus
  */
  public static void main(String[] argv) {

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
