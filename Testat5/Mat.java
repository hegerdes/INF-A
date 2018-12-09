/******************************  Mat.java  ************************************/

import AlgoTools.IO;

/**
 * @version 28.11.16
 *  
 * @author  hegerdes
 */

public class Mat {

  public static int determ(int matrix[][]){
    if(matrix.length==1){
      return matrix[0][0];
    }
    int dim = matrix.length;
    int summe = 0;
    int grad = 0;
    for(int i = 0; i < matrix.length; i++){
      if(i % 2 == 0){
        grad = 1;
      }
      else
      grad = -1;

      summe = summe + grad * matrix[0][i] * determ(matrix[dim -1][dim - 1]);
    }
  return summe;
  }
    

  public static void ausgabeM(int[][] matrix){
    for(int zeile = 0; zeile < matrix.length; zeile++){
      for(int spalte = 0; spalte < matrix.length; spalte++){
        IO.print(" " + matrix[zeile][spalte], 3);
      }
      IO.println();
    }
  }

  public static void main(String[] argv) {
     
     int[][]matrix;
     int dim = 0;

     do{
       dim = IO.readInt("Wie groß soll die Matrix sein? ");
     }while(dim < 1);

     matrix = new int[dim][dim];
/*
 *liest die Matrix ein
 */  
     int textthemp;
     for(int i = 0; i < dim; i++){
       int[] themp;
       textthemp = i + 1;
       do{
         themp = IO.readInts("Bitte gib fuer die " + textthemp + ". Zeile " + dim + " Zahlen ein: ");
       }while(themp.length != dim);
       matrix[i] = themp;
     }
     

     ausgabeM(matrix);

     IO.println();
     IO.println("Das Ergebnis ist: " + determ(matrix));

  }
}

