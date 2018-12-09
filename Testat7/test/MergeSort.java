/******************************  MergeSort.java  ******************************/

import AlgoTools.IO;

/**
 * @version 09.12.16
 *  
 * @author  hegerdes
 * @author  hlauts
 */

public class MergeSort {

  private static int durchlaufe;
  
  /**
   * Methode die sich rekursiv selbst aufruft und ein Array in 2 Teile Zerlegt
   * @parameta a -> Ist das eingelesene Array aus main und wird an sortRek uebergeben
   * @ retrun -> gibt sortiertes Array aus
   */
  public static int[] sortRekursiv(int[] a){
    
    int laenge = a.length;       // Laenge des gesamten Arrays
    int[] teil1;                 // 2 Teil-Arrays
    int[] teil2;
    
    if(laenge == 1){             // Rekursionsanker
      return a;                  // Stoppt erneuten aufruft
    }                            // Hier ist jedes Array 1 lang

//    IO.println("Rek durchlaufen ");
    if(a.length % 2 != 0){       // Beachtung von grad und ungrade EIngabe
      teil1 = new int[laenge/2];
      teil2 = new int[(laenge/2) + 1];
    }else{
      teil1 = new int[laenge/2];
      teil2 = new int[laenge/2];
    }
//    IO.println("Folge 1 hat die laenge " + teil1.length);
//    IO.println("Folge 2 hat die laenge " + teil2.length);
    
    for(int i = 0; i < teil1.length; i++){
      teil1[i] = a[i];           // Kopiert die linke haelfte aus a in
    }                            // neue Teil-Array 1
//    druck(teil1);              // Kontrolle

    int startT2 = (laenge/2) ;   // Hilfsvab

    for(int k = 0; k < teil2.length; k++){
      teil2[k] = a[startT2 + k]; // Kopiert rechte haelfte aus a
    }
//    druck(teil2);
    return merge(sortRekursiv(teil1), sortRekursiv(teil2));
      // Aus erzeugtem Teilarray werden neue Teilarrays
      // die dann mit merge gemischt werden


/*  Andere Verusche das Problem zu loesen

    if(teil1.length > 1){
      sortRekursiv(teil1);
    }
    else{
    IO.println("Folge 1 ist:");
    druck(teil1);
    IO.println("Folge 2 ist:");
    druck(teil2);
    sfolge1 = merge(teil1,teil2);
    IO.println("Einmal Merge T1 aufgerufen");
    druck(sfolge1);
    }
      
    if(teil2.length > 1){
      sortRekursiv(teil2);
    }
    else{
    merge(teil1,teil2);
    IO.println("Einmal Mergei T2 aufgerufen");
    }

*/


  }

  public static int[] merge (int[]a, int[]b) {   // mischt a und b
                                                 // liefert Ergebnis zurueck

    int i=0, j=0, k=0;                           // Laufindizes
    int[] c = new int[a.length + b.length];      // Platz fuer Folge c besorgen

    while ((i<a.length) && (j<b.length)) {       // mischen, bis ein Array leer
      durchlaufe++;
      if (a[i] < b[j])                           // jeweils das kleinere Element
          c[k++] = a[i++];                       // wird nach c uebernommen
      else
          c[k++] = b[j++];
    }

    while (i<a.length){
      c[k++] = a[i++];                           // ggf.: Rest von Folge a
      durchlaufe++;
    }
    while (j<b.length){
      c[k++] = b[j++];                           // ggf.: Rest von Folge b
      durchlaufe++;
    }

    return c;                                    // Ergebnis abliefern
  }

/**
 * Gibt das uebergebene Array auf Commandpromt aus
 * @para Das uebergebene Array
 */
  public static void druck(int folge[]){

    for(int i = 0; i < folge.length; i++){
      IO.print(folge[i], 4);
    }
    IO.println();
  }


/**
 * Liest ein Array der laenge n ein
 * uebergibt dies an die Methode sortRekursiv
 * und druckt das ergebnis
 */
  public static void main(String[] argv) {
     
     int[] folge;
     int[] folgesortiert;
     
     do{                                         // sicheres Einlesen
     folge = IO.readInts("Bitte gebe eine Zahlenfolge ein: ");
     }while(folge.length < 1);

     IO.println();
     IO.println("Die eingegebene Zahlenfolge lautet: ");
     druck(folge);
     folgesortiert = sortRekursiv(folge);
     IO.println();
     IO.println("Die sortierte Zahlenfolge lautet: ");
     druck(folgesortiert);
     IO.println();
     IO.println("Es wurden " + durchlaufe + " Mischoperationen ausgefuehrt");

  }
}


