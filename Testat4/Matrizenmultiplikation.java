/******************************  Matrizenmultiplikation.java  *****************/

import AlgoTools.IO;

/**
 * @version 19.11.16
 *  
 * @author  hegerdes
 */

public class Matrizenmultiplikation {

  public static void main(String[] argv) {
     
     int mat1z, mat1s;
     IO.println("Bitte gib zuerst die Dimension der ersten Matrix ein. "); 
     do {
     mat1s = IO.readInt("Bitte die Anzahl der Zeilen eingeben ");
     }
     while(mat1s < 1);

     do {
     mat1z = IO.readInt("Bitte die Anzahl der Spalten eingeben ");
     }
     while(mat1z < 1);

     int textthemp;
     int[][] mat1 = new int[mat1z][mat1s];

     for(int l = 0; l < mat1z; l++){    // Werte fuer M1 werden eingelesen
       int[] themp ;
       textthemp = l + 1;
       do {
         themp = IO.readInts("Matrix 1: Gib " + mat1s + " Zahlen für die " + textthemp + ". Spalte deiner Matrix ein: ");
       }
       while(themp.length != mat1s);

       mat1[l] = themp;
     } 


     int mat2z,mat2s;
     
     mat2z = mat1z;
     
     IO.println("Eingabe für Matrix 1 beendet.");
     do {
       mat2s = IO.readInt("Bitte jetzt die Salpengroeße der 2. Matrix eingeben ");
     }
     while(mat2s < 1);

     int [][] mat2 = new int[mat2s][mat2s]; 

     for(int l = 0; l < mat2s; l++){    // Werte fuer M2 werden eingelesen
       int[] themp ;
       textthemp = l + 1;
       do {
         themp = IO.readInts("Matrix 2: Gib " + mat1z + " Zahlen für die " + textthemp + ". Spalte ein: ");
       }
       while(themp.length != mat2z);

       mat2[l] = themp;
     }
     
     int[][] matErgebnis = new int[mat1s][mat2s];  // hier morgen weitermachen^
     int summeZS;

     for(int k = 0; k < mat1z; k++){
       for(int i = 0; i < mat2s; i++){
         summeZS = 0;
         for(int j = 0; j < mat1s; j++){
           summeZS += mat1[k][j] * mat2[j][i];
         }
         IO.println(summeZS);
         matErgebnis[k][i] = summeZS;
       }
     }
     IO.println();
     for(int l = 0; l < matErgebnis.length; l++){
       for(int k = 0; k < matErgebnis[l].length; k++){
         IO.print(matErgebnis[l][k], 3);
       }
       IO.println();
     }

   //  for(int j = 0; j != mat1z; j++){
   //    for(int k = 0;j != mat1s; k++){
   //      IO.print(mat1[j][k-1] + " ");
   //    }
       IO.println();
   //  }

  }
}

