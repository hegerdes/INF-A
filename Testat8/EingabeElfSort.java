/******************************  ElfSort.java  ********************************/

import AlgoTools.IO;

/**
 * @version 18.12.16
 *  
 * @author  hegerdes
 + @author  hlauts
 */

public class EingabeElfSort {

public static int zahl;

  public static int[] sort(int[] pakete, int ziffer){
    
    if(ziffer < 0){
      return pakete;
    }
    int[][]faecher = new int[10][pakete.length];
    int themp = 0;
    int f1=0;int f0=0;int f2=0;int f3=0;int f4=0;int f5=0;int f6=0;int f7=0;
    int f8=0;int f9=0;
    int teiler = 0;
    switch(ziffer){
      case 4: teiler=10000; break;
      case 3: teiler=1000; break;
      case 2: teiler=100; break;
      case 1: teiler=10; break;
      case 0: teiler=1; break;
    }

    for(int i = 0; i < pakete.length; i++){
      if(pakete[i] >= teiler){
        themp = pakete[i]/(1*teiler);
        themp = themp%10;
        IO.println(themp);
        switch(themp){
          case 1: faecher[1][f1]=pakete[i];
          f1++; break;
          case 2: faecher[2][f2]=pakete[i];
          f2++;break;
          case 3: faecher[3][f3]=pakete[i];
          f3++;break;
          case 4: faecher[4][f4]=pakete[i];
          f4++;break;
          case 5: faecher[5][f5]=pakete[i];
          f5++;break;
          case 6: faecher[6][f6]=pakete[i];
          f6++;break;
          case 7: faecher[7][f7]=pakete[i];
          f7++;break;
          case 8: faecher[8][f8]=pakete[i];
          f8++;break;
          case 9: faecher[9][f9]=pakete[i];
          f9++;break;
        }
      }else{
        faecher[0][f0] = pakete[i];
        f0++;
      }
    }
    for(int l = 0; l < 10; l++){
      for(int k = 0; k < pakete.length; k++){
        IO.print(faecher[l][k],6);
      }
      IO.println();
    }
    sort(faecher[1], ziffer-1);

  return pakete;
  }
  
  public static void druck (int[] array){
    
    for(int i = 0; i < array.length; i++){
      IO.print(array[i],6);
    }
    IO.println();
  }
  
  public static int[] input(){
    
    int[] eingabe;

    eingabe = IO.readInts("Bitte unsortierte Daten eingaben: ");

    return eingabe;
  }

  public static void main(String[] argv) {
    
    int[] folge;
    folge = input();
    IO.println();
    druck(folge);
 //   sort(eingabe, 4);


  }
}

