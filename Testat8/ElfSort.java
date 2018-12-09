/******************************  ElfSort.java  ********************************/

import AlgoTools.IO;

/**
 * @version 18.12.16
 *
 * @author hegerdes
 * @author hlauts
*/

public class ElfSort {

/**
 * Ueberprueft ob die im Array befindenen Zahlen
 * und die Ziffer im gueltigen Wertebereich sind.
 *
 * @throws Geschenkenummer wenn Geschenk > als 99999
 * @throws Ziffer wenn Ziffer groeßer 4 oder kleiner 0 ist
 * gibt parameter an eigentliche Methode weiter
 */

  public static int[] sort(int[] pakete, int ziffer) {

    for(int i = 0; i < pakete.length; i++) {
      if(pakete[i] > 99999) {
        throw new RuntimeException("Fehler: Geschenknummern zu gross!");
      }
    }

    if(ziffer > 4|| ziffer < 0) {
      throw new RuntimeException("Fehler: Pruefstelle gibt es nicht!");
    }
      return sortRek(pakete, ziffer);
    }
/**
 * Teilt das eingegebene Array in 10 unter-Array auf
 * @param pakete unsortiertes Array
 * @param ziffer Stelle anhand der sortiert werden soll
 * @return sortiert - Sortierte Daten werden ausgegeben
 */

  private static int[] sortRek(int[] pakete, int ziffer) {

    int[][] faecher = new int [10] [0];
    int[] sortiert = new int [pakete.length];
    int pos;
    int a = 0;

//Rek-Anker
    if(ziffer < 0) {
      return pakete;
    }

    for(int i = 0; i < pakete.length; i++) {
      pos = getPcktPos(pakete[i], ziffer);
 //     IO.println("Pos ist: " + pos);
      faecher[pos] = legeInFach(faecher[pos], pakete[i]);
    }

    for(int j = 0; j < faecher.length; j++) {

//Hier findet die eigentliche Rekursion statt - erneuter aufruf
      faecher[j] = sortRek(faecher[j], ziffer - 1);
    }

// Arrays werden wieder zusammengefuehrt
    for(int l = 0; l < faecher.length; l++) {
      for(int k = 0; k < faecher[l].length; k++) {
        sortiert[a++] = faecher[l][k];
      }
    }

    return sortiert;
  }
/**
 * Eine neue Nummer wird ins Ablagefach geschieben
 * @param ablagefach das Fach oder Stapel des jewaligen Elfen
 * @param paketnr die nummer die in das Fach soll
 * @return thp - Das Fach wird um ein verlängert und an letzte stelle wird
 * die neue Nummer geschieben
 */

  private static int[] legeInFach(int[] ablagefach, int paketnr) {

// Array verlaengern
    int tmp[] = new int [ablagefach.length + 1];
// Daten kopieren
    for(int i = 0; i < ablagefach.length; i++) {
      tmp[i] = ablagefach[i];
    }
// Nummer hinzufuegen
    tmp[ablagefach.length] = paketnr;

    return tmp;
  }

/**
 * Findet heraus in welches Paket die Geschenkenummer gehoert
 * @param a Nummer aus pakete
 * @param b ziffer
 * @return Paketefachnr (Zahl zwischen 0 und 9)
 */

  private static int getPcktPos(int a, int b) {

    b = exp(b);
//    IO.println("B nach exp ist " + b);
    a = a / b;
    a = a % 10;

    return a;
  }
/**
 * Erzeugt eine Zahl nach 10^Ziffer
 * und gibt diese zurueck
 */
   private static int exp(int a) {

     if(a == 0) {
       return 1;
     }
//     IO.println("Ziffer in exp ist: " + a);
     return 10 * exp(a-1);
  }

  public static void main(String[] argv) {
  
  int stelle;
  int[] folge;
  int[] fertig;
  folge = EingabeElfSort.input();
  IO.println();
//  do{
//    stelle = IO.readInt("Welche Stelle soll eachtet werden? ");
//  }while(stelle > 4 || stelle < 0);
//  IO.println();
  EingabeElfSort.druck(folge);
  fertig = sort(folge, 4);
  IO.println("Die Elefen haben fuer dich die Geschenke sortiert: ");
  EingabeElfSort.druck(fertig);

  }
}

