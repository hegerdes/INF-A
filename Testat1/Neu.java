/******************************  Neu.java  ************************************/

import AlgoTools.IO;

/**
 * @version 03.11.16
 *  
 * @author  hegerdes
 */

public class Neu {

  public static void main(String[] argv) {
     
     int x;

     x = IO.readInt("Bitte Zahl ");

      switch (x%10) {
      case 1: IO.println("a");break;
      case 2: IO.println("b");break;
      case 3: IO.println("c");break;
      case 4: IO.println("d");break;
      case 5: IO.println("e");break;
      case 6: IO.println("f");break;
      case 7: IO.println("g");break;
      case 8: IO.println("h");break;
      case 9: IO.println("i");break;

//      IO.println("Das ist x " + x);
}
  }
}

