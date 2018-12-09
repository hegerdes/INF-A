/******************************  Array.java  **********************************/

import AlgoTools.IO;

/**
 * @version 17.11.16
 *  
 * @author  hegerdes
 */

public class Array {

  public static void main(String[] argv) {
     
     int[]c = IO.readInts("Inhalt ");
     int adim;
   //  adim = IO.readInt("Bitte Array Groeße ");

   //  c = new int[adim];
   //  c[3]=42;
     IO.println(c[3]);

     for(int i = 0;i < 4;i++){
       c[i] = 0;
       IO.print(c[i]);
     }
     IO.println();
     

     // Ausdurcken einer Matrix

  //   for(i = 0;i < m.length;i++){
  //     for(int j = 0; j < m[i].length;i++{
  //       IO.print(m[i][j],6)
  //     }
  //     io.println();
  //   }




  }
}

