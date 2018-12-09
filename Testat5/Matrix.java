/******************************  Matrix.java  *********************************/

import AlgoTools.IO;

/**
 * @version 28.11.16
 *  
 * @author  hegerdes
 */

public class Matrix {

  public static int[][] unterMatrix(int zeilex, int spaltex, int[][] matrix){
    
    int[][] unterM=new int[matrix.length-1][matrix.length-1];
    int zeilenSchieber = 0;
    int spaltenSchieber = 0;

    for(int zeile = 0; zeile < unterM.length; zeile++){
      if(zeile==zeilex) zeilenSchieber = 1;
      spaltenSchieber = 0;
      for(int spalte = 0; spalte < unterM.length; spalte++){
        if(spalte==spaltex) spaltenSchieber = 1;
        unterM[zeile][spalte] = matrix[zeile+zeilenSchieber][spalte+spaltenSchieber];
      }
    }

    return unterM;
  }

  public static int determinante(int[][] matrix){
    
    int dimension = matrix.length;
    int index = 0;

    while(index < dimension){
      if(matrix[index].length != dimension) throw new RuntimeException("Keine quadratische Matrix eingeben");
      index++;
    }
    
    return det(matrix);
  }

  private static int det(int[][] matrix){
    
    if(matrix.length==1) return matrix[0][0];
    int determinante = 0;

    for(int spalte = 0; spalte < matrix.length; spalte++){
      int vorzeichen = (spalte%2 == 0 ? 1 : -1);

      determinante = determinante + vorzeichen * matrix[0][spalte] * det(unterMatrix(0,spalte,matrix));
    }

    return determinante;
  }

  private static void printM(int[][] matrix){
    
    for(int zeile = 0; zeile < matrix.length; zeile ++){
      IO.print("|");
      for(int spalte = 0; spalte < matrix[zeile].length; spalte++){
        IO.print(" " + matrix[zeile][spalte],5);
      }
      IO.println(" |");
    }
  }

  public static void main(String[] argv) {

    int dimension = 0;
    do{
      dimension = IO.readInt("Welche Groesse soll die Matrix haben? ");
    }
    while(dimension < 1);
    
    int[][] matrix;
    matrix = new int[dimension][dimension];
    for(int zeile = 0; zeile < dimension; zeile++){
      for(int spalte = 0; spalte < dimension; spalte++){
        matrix[zeile][spalte] = IO.readInt("A[" + (zeile+1) + "][" + (spalte+1) + "]=");
      }
    }
    printM(matrix);

    IO.println("Det = " + determinante(matrix));

     

  }
}

