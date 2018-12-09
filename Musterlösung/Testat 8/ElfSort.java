/******************************  WeihnachtsmannSort.java  *********************/

import AlgoTools.IO;

/**
 * Sortiert ein Arrays mit Geschenkenummern.
 */

public class ElfSort {

  /**
   * Sortiert ein Array von Int-Zahlen durch betrachten einer Ziffer
   * jeder Zahl rekursiv.
   *
   * @param pakete das zu sortierende Array
   * @param ziffer die zu betrachtende Ziffer (0 für Einerstelle)
   *
   * @return das sortiere Array
   *
   * @throws ArrayIndexOutOfBoundsException bei negativen Zahlen im Array
   *
   */
  public static int[] sort(int[] pakete, int ziffer) {

    //Rekursionsverankerung
    if(pakete.length <= 1 || ziffer < 0)
      return pakete;

    //Leere Fächer anlegen
    int[][] ablagefaecher = {{},{},{},{},{},{},{},{},{},{}};

    //Alle Pakete durchlaufen
    for(int i = 0; i < pakete.length; i++) {

      int paketziffer = pakete[i];

      //Besorge die entsprechende Ziffer
      for(int j = 0; j < ziffer; j++)
        paketziffer /= 10;

      //Jetzt noch die letzte Ziffer abschneiden
      paketziffer = paketziffer % 10;

      //In das passende Fach legen
      ablagefaecher[paketziffer] = legeInFach(ablagefaecher[paketziffer],
                                              pakete[i]);

    }

    //Alle Pakete sind in die Fächer gelegt,
    //sortiere nun die einzelnen Fächer
    for(int i = 0; i < ablagefaecher.length; i++) {
      ablagefaecher[i] = sort(ablagefaecher[i], ziffer - 1);
    }

    //Alle Fächer sind sortiert, kopiere
    //die Fächer nacheinander in ein neues Array
    int[] ergebnis = new int[pakete.length];
    int index = 0;

    for(int fachnr = 0; fachnr < ablagefaecher.length; fachnr++) {
      for(int i = 0; i < ablagefaecher[fachnr].length; i++) {
        ergebnis[index++] = ablagefaecher[fachnr][i];
      }
    }

    return ergebnis;

  }

  /**
   * Fügt ein ein Int an das Ende eines gegeben Int-Arrays durch
   * kopieren der Inhalte in ein neues ein.
   *
   * @param ablagefach das Ausgangsarray
   * @param paket die einzufügende Zahl
   *
   * @return das neue, groessere Array
   *
   */
  private static int[] legeInFach(int[] ablagefach, int paket) {

    //Das Ablagefach ist zu klein, muss also um 1 erweitert werden
    int altelaenge = ablagefach.length;
    int[] neuesfach = new int[altelaenge + 1];

    for(int i = 0; i < altelaenge; i++) {
      neuesfach[i] = ablagefach[i];
    }

    neuesfach[neuesfach.length - 1] = paket;

    return neuesfach;

  }

}

