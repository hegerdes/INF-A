/******************************  Mat.java  *****************/

import AlgoTools.IO;

/**
 * @version 19.11.16
 *  
 * @author  hegerdes
 */

public class Mat {

  public static void main(String[] argv) {
     
     int mat1z, mat1s;             // Vab für m*n Matrix
    
     IO.println();
     IO.println("Dieses Programm multipliziert 2 Matrizen. ");

     IO.println();
     IO.println("Bitte gib die Dimension der ersten Matrix ein. "); 
     do {
     mat1z = IO.readInt("Bitte die Anzahl der Zeilen eingeben: ");
     }
     while(mat1z < 1);

     do {
     mat1s = IO.readInt("Bitte die Anzahl der Spalten eingeben: ");
     }                          // do while um ungueltige eingabe zu
     while(mat1s < 1);          // vermeiden
                                   
     IO.println();
     IO.println("Gib nun die Werte fuer Martix 1 ein. ");

     int textthemp;
     int[][] mat1 = new int[mat1z][mat1s];

     for(int l = 0; l < mat1z; l++){    // Werte fuer M1 werden eingelesen
       int[] themp ;
       textthemp = l + 1;
       do {
         themp = IO.readInts("Matrix 1: Gib " + mat1s + " Zahlen für die " + textthemp + ". Zeile deiner Matrix ein: ");
       }
       while(themp.length != mat1s);

       mat1[l] = themp;        // eingelesene Werte werden in Spalte 1 von 
     }                         // Mat1 geschieben. for wird so oft wiederholt
                               // bis genug Daten für die fuer die m*n Matrix
     int mat2z,mat2s;          // vorhanden sind
     
     mat2z = mat1s;            // Ist grundvorraussetzung zum Multiplizieren
                               // Zeilen von M1 muessen Spalten von M2 sein
     IO.println();
     IO.println("Eingabe für Matrix 1 beendet.");
     IO.println();
     IO.println("Jetzt muss die 2. Matrix eingegeben werden.");

     do {
       mat2s = IO.readInt("Bitte jetzt die Salpengroeße der 2. Matrix eingeben ");
     }
     while(mat2s < 1);

     IO.println();
     IO.println("Gib nun die Werte fuer Matrix 2 ein.");

     int [][] mat2 = new int[mat2z][mat2s]; 

     for(int l = 0; l < mat2z; l++){    // Werte fuer M2 werden eingelesen
       int[] themp ;
       textthemp = l + 1;               // Siehe Einlesen von M1
       do {
         themp = IO.readInts("Matrix 2: Gib " + mat2s + " Zahlen für die " + textthemp + ". Zeile ein: ");
       }
       while(themp.length != mat2s);

       mat2[l] = themp;
     }

     IO.println();
     IO.println("Eingabe für Matrix 2 beendet.");
     IO.println();
     IO.println();
     
     for(int l = 0; l < mat1z; l++){   // Ausgebe der eingegebenen Matrizen
       for(int k = 0; k < mat1s; k++){ // sieht einfach huebsch aus und ist
         IO.print(mat1[l][k], 3);      // fuer Nutzer besser zu lesen
       }
       IO.print("    ");
       if(l == mat1z/2){
         IO.print("*");
       }
       else 
       IO.print(" ");
       for(int k = 0; k < mat2s; k++){
         IO.print(mat2[l][k], 3);
       }
       IO.println();
     }
     for(int l = mat1z; l < mat2z; l++){
       IO.print("              ");
       for(int k = 0; k < mat2s; k++){
         IO.print(mat2[l][k], 3);
       }
       IO.println();                // Ausgabe der eingegebenen Daten beendet
     }


     int[][] matErgebnis = new int[mat1z][mat2s];  // hier ist die berechnung
     int summeZS;

     IO.println();
     IO.println("Das Ergebnis ist: ");
     IO.println();

     for(int k = 0; k < mat1z; k++){       // fure due jewalige Zeile
       for(int i = 0; i < mat2s; i++){     // fuer die jewalige Spalte
         summeZS = 0;
         for(int j = 0; j < mat1s; j++){   // fuer den jewaligen Punkt in Zeile
           summeZS += mat1[k][j] * mat2[j][i]; // k und Spalte j
         }
 //        IO.println(summeZS);
         matErgebnis[k][i] = summeZS;    // Uebergabe an Ergebnis Matrix
       }
     }
     IO.println();
     for(int l = 0; l < matErgebnis.length; l++){  // Druck der Ergebnis Matrix
       for(int k = 0; k < matErgebnis[l].length; k++){
         IO.print(matErgebnis[l][k], 5);
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

