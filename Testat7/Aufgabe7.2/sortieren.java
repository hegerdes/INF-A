/******************************  sortieren.java  ******************************/

import AlgoTools.IO;

/**
 * @version 07.12.16
 *  
 * @author  hegerdes
 * @author  helauts
 */

public class sortieren {

  public static void ssort(int[] folge){

    IO.println();
    IO.println("Hier wird die Folge mit SelectionSort sortiert. ");
    IO.println();

    int pos, min, i, j, text, zaehler;
    zaehler = 0;

    for(i = 0; i < folge.length-1; i++){
      pos = i;
      min = folge[i];
      text = i + 1;
      /*  IO.println("Beim " +  text + "ten durchlauf ist der erste finger                bei " + pos + " und der zweite Finger bei min = " + min);
      */
      for(j = i + 1; j < folge.length; j++){
        if(folge[j] < min){
          pos = j;
          min = folge[j];
          druck(folge);
          zaehler++;
        }
      }
      /*  IO.println("Das an Stelle " + j + " neu gefundene min wird hier                 überschrieben mit der Zahl, die in Stelle " + i + " ist");
      */
        folge[pos] = folge[i];
        folge[i] = min;
      /*/  IO.println("Hier wird das neu gefundene min (" + min + ") an                    stelle " + i + " geschoben");
      */
    }
    IO.println();
    IO.println("Sortiert mit SelectionSort sieht die Folge so aus: ");
    druck(folge);
   IO.println("Es wurden " + zaehler + " Tauschoperationen vorgenommen.");
   IO.println();
  }


  public static void bsort(int[] folge){
   
   int zaehler = 0;
   int i, themp;
   boolean tausch;

   do{
     tausch = false;
     for(i = 0; i < folge.length-1; i++){
       if (folge[i] > folge[i+1]){
         themp = folge[i];
         folge[i] = folge[i+1];
         folge[i+1] = themp;
         tausch = true;
         druck(folge);
         zaehler++;
       }
     }
   }while(tausch == true);

   IO.println();
   IO.println("Sortiert mit BoubleSort sieht die Folge so aus: ");
   druck(folge);
   IO.println("Es wurden " + zaehler + " Tauschoperationen vorgenommen.");
   IO.println();
 }




  public static void druck(int folge[]){
    
    for(int i = 0; i < folge.length; i++){
      IO.print(folge[i], 3);
    }
    IO.println();
  }

  public static void main(String[] argv) {

  int folgemain[] = { 7, 4, 6, 8, 9, 1, 3, 2};
  int eingabe;
  
  IO.println();
  IO.println("Die unsortierte Folge sieht so aus: ");
  IO.println();
  druck(folgemain);
  IO.println();


 // do{
    do{
      eingabe = IO.readInt("Bitte eine Option auswählen: ");
      IO.println();
      IO.println("1 - Fuer SelectionSort");
      IO.println("2 - Fuer BoubbleSort");
    }while(eingabe < 1 || eingabe > 4);
    switch(eingabe){
      case 1: ssort(folgemain); break;
      case 2: bsort(folgemain); break;
      case 5: IO.println("Programm beendet!");
      default: IO.println("Fehler"); 
    }
 // }while(eingabe != 5);
  }
}

