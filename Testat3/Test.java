/******************************  Test.java  ***********************************/

import AlgoTools.IO;

/**
 * @version 14.11.16
 *  
 * @author  hegerdes
 */

public class Test {

  public static void main(String[] argv) {

    
    float eingabe;
    do { 
    eingabe = IO.readFloat("Bitte eine Zahl ");
    } while(eingabe <= 0);

    IO.println("Die Zahl als binaere Gleitkommazahl ist: ");
    
    float teiler = 2;                         // exponent wird hochgezählt
    int zaehler = 0;                          // bis er groeßer als eingabe ist
    while(teiler < eingabe){
      teiler = teiler * 2;
      zaehler++;
    }
    teiler = teiler / 2;                      // hier wird exponent um ein 
                                              // mindert. darf nicht groeßer
                                              // als eingabe sein
    IO.print("0 ");                           // Vorzeichen bit. hier nur +

    if (zaehler >= 128){
      IO.print("1");
      zaehler = zaehler - 128;
    }
    else
      IO.print("0");                          // exponenten bits werden gedruck

    if (zaehler >= 64){
      IO.print("1");
      zaehler = zaehler - 64;
    }
    else
      IO.print("0");

    if (zaehler >= 32){
      IO.print("1");
      zaehler = zaehler - 32;
    }
    else
      IO.print("0");

    if (zaehler >= 16){
      IO.print("1");
      zaehler = zaehler - 16;
    }
    else
      IO.print("0");

    if (zaehler >= 8){
      IO.print("1");
      zaehler = zaehler - 8;
    }
    else
      IO.print("0");

    if (zaehler >= 4){
      IO.print("1");
      zaehler = zaehler - 4;
    }
    else
      IO.print("0");

    if (zaehler >= 2){
      IO.print("1");
      zaehler = zaehler - 2;
    }
    else
      IO.print("0");

    if (zaehler >= 1){
      IO.print("1");
      zaehler = zaehler - 1;
    }
    else
      IO.print("0");
   
    IO.print(" ");

    float martisse;                           // martisse bestimmt 
    martisse = eingabe / teiler;
    
 //   if(martisse < 1 || martisse >= 2){
 //     IO.println("Es ist ein Fehler passiert");
 //   }
    
    float rmat;
    rmat = martisse - 1;

//    IO.println("Reduzierte Martisse vor Schleife ist " + rmat);

    for(int zmar = 0; zmar != 23; zmar++){   // 23 bits für martisse
      if(rmat > 1){                          // also 23 mal die schleife
        IO.print("1");
        rmat = rmat - 1;
        rmat = rmat * 2;
      }                                      // wenn redmartisse <1 dann 1
      if(rmat < 1){                          // wenn redmartisse >1 dann 0 
        IO.print("0");
        rmat = rmat * 2;
      }
    }

    IO.println();
//    IO.println("Neue eingabe war " + eingabe);
//    IO.println("Zaehler ist " + zaehler);
//    IO.println("Teiler ist " + teiler);
//    IO.println("Martisse ist " + martisse);
//    IO.println("Reduzierte Martisse ist " + rmat);

  // zur Progrmmkonttrolle erstellte ausgaben. Nun nicht mehr benötigt
  }
}

