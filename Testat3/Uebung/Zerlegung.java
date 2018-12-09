/******************************  Zerlegung.java  ******************************/

import AlgoTools.IO;

/**
 * @version 10.11.16
 *  
 * @author  hegerdes
 */

public class Zerlegung {

  public static void main(String[] argv) {
     
     int zahl = IO.readInt("Zahl");

     while(zahl % 2 == 0){
       IO.print(2 + "*");
       zahl = zahl / 2
     }
     for (int teiler = 3; teiler <= zahl; teiler = teiler += 2){
       while(zahl % teiler ==0){
         IO.print(teiler + "*");
         zahl = zahl / teiler;
       }
     }

     IO.println();

  }
}

