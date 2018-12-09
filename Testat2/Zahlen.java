/******************************  Zahlen.java  *********************************/

import AlgoTools.IO;

/**
 * @version 03.11.16
 *  
 * @author  hegerdes
 */

public class Zahlen {


// Dieses Programm fordert den Nutzer auf eine belibige Zahl
// von 1 bis 999 einzugeben. Diese Zahl wird dann als englisches Wort
// ausgegeben.


  public static void main(String[] argv) {
     
     int eingabe, hunderter, zehner, einer;   // 4 Variablen um die eingabe
                                              // zu speichern und die Zahl 
                                              // je nach Wert (<1<10<100
                                              // in einzelne Variblen zerlegen
                                              // zu koennen

     eingabe = IO.readInt("Bitte eine Zahl: ");
     IO.print("Ausgesprochen heißt deine Zahl: ");

      if (eingabe>=100){                      // Englische Zahlen sind logisch
        hunderter = eingabe/100;              // Man beginnt damit den hunderte
        zehner = eingabe%100;                 // Bereich zuerst zu nennen.
        zehner = zehner/10;                   // Anschließend nennt man zehner
        einer = eingabe%10;                   // und einer
                                              // Das Programm soll auch mit
                                              // dem hunderter Bereih anfangen
                                              // wenn die Zahl <100 ist

                                              // Um mir die Arbeit leichter zu
                                              // machen habe ich code geschiebe
                                              // der die Zahl 100 bis 129 aus-
                                              // sprechen kann. Diese Teil 
                                              // wurde anschließend immer
                                              // wieder kopiert
        switch (hunderter){
          case 1: IO.print("one hundred ");
            if (zehner>0){
              IO.print("and");               // Da das Wort in eine Zeile soll
              switch (zehner){               // wird print benutzt
                case 1: IO.print(" ");       // Nur nachdem der einer ausgege
                 if (einer>=0){              // ben wurde printeln fuer eine
                   switch (einer){           // neue Zeile
                     case 0: IO.println("ten");break;  
                     case 1: IO.println("eleven");break;
                     case 2: IO.println("twelve");break;
                     case 3: IO.println("thirteen");break;
                     case 4: IO.println("fourteen");break;
                     case 5: IO.println("fifteen");break;
                     case 6: IO.println("sixteen");break;
                     case 7: IO.println("seventeen");break;
                     case 8: IO.println("eighteen");break;
                     case 9: IO.println("nineteen");break;
                     }
                   }
                   break;
                case 2: IO.print(" twenty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 3: IO.print(" thirty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 4: IO.print(" tourty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 5: IO.print(" fifty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 6: IO.print(" sixty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 7: IO.print(" seventy");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 8: IO.print(" eighty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 9: IO.print(" ninety");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                }
              break;
              }
              else
                if (einer>0){
                  IO.print(" and ");
                  switch (einer){
                    case 1: IO.println("one");break;
                    case 2: IO.println("two");break;
                    case 3: IO.println("three");break;
                    case 4: IO.println("four");break;
                    case 5: IO.println("five");break;
                    case 6: IO.println("six");break;
                    case 7: IO.println("seven");break;
                    case 8: IO.println("eight");break;
                    case 9: IO.println("nine");break;
                     }
                   }  
          break;

          case 2: IO.print("two hundred");
            if (zehner>0){
              IO.print("and");
              switch (zehner){
                case 1: IO.print(" ");
                 if (einer>=0){
                   switch (einer){
                     case 0: IO.println("ten");break;  
                     case 1: IO.println("eleven");break;
                     case 2: IO.println("twelve");break;
                     case 3: IO.println("thirteen");break;
                     case 4: IO.println("fourteen");break;
                     case 5: IO.println("fifteen");break;
                     case 6: IO.println("sixteen");break;
                     case 7: IO.println("seventeen");break;
                     case 8: IO.println("eighteen");break;
                     case 9: IO.println("nineteen");break;
                     }
                   }
                   break;
                case 2: IO.print(" twenty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 3: IO.print(" thirty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 4: IO.print(" tourty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 5: IO.print(" fifty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 6: IO.print(" sixty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 7: IO.print(" seventy");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 8: IO.print(" eighty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 9: IO.print(" ninety");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                }
              break;
              }
              else
                if (einer>0){
                  IO.print(" and ");
                  switch (einer){
                    case 1: IO.println("one");break;
                    case 2: IO.println("two");break;
                    case 3: IO.println("three");break;
                    case 4: IO.println("four");break;
                    case 5: IO.println("five");break;
                    case 6: IO.println("six");break;
                    case 7: IO.println("seven");break;
                    case 8: IO.println("eight");break;
                    case 9: IO.println("nine");break;
                     }
                   }  
          break;
          case 3: IO.print("three hundred");
            if (zehner>0){
              IO.print("and");
              switch (zehner){
                case 1: IO.print(" ");
                 if (einer>=0){
                   switch (einer){
                     case 0: IO.println("ten");break;
                     case 1: IO.println("eleven");break;
                     case 2: IO.println("twelve");break;
                     case 3: IO.println("thirteen");break;
                     case 4: IO.println("fourteen");break;
                     case 5: IO.println("fifteen");break;
                     case 6: IO.println("sixteen");break;
                     case 7: IO.println("seventeen");break;
                     case 8: IO.println("eighteen");break;
                     case 9: IO.println("nineteen");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 2: IO.print(" twenty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 3: IO.print(" thirty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 4: IO.print(" tourty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 5: IO.print(" fifty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 6: IO.print(" sixty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 7: IO.print(" seventy");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 8: IO.print(" eighty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 9: IO.print(" ninety");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                }
              break;
              }
              else
                if (einer>0){
                  IO.print(" and ");
                  switch (einer){
                    case 1: IO.println("one");break;
                    case 2: IO.println("two");break;
                    case 3: IO.println("three");break;
                    case 4: IO.println("four");break;
                    case 5: IO.println("five");break;
                    case 6: IO.println("six");break;
                    case 7: IO.println("seven");break;
                    case 8: IO.println("eight");break;
                    case 9: IO.println("nine");break;
                     }
                   }  
          break;
          case 4: IO.print("four hundred ");
            if (zehner>0){
              IO.print("and");
              switch (zehner){
                case 1: IO.print(" ");
                 if (einer>=0){
                   switch (einer){
                     case 0: IO.println("ten");break;
                     case 1: IO.println("eleven");break;
                     case 2: IO.println("twelve");break;
                     case 3: IO.println("thirteen");break;
                     case 4: IO.println("fourteen");break;
                     case 5: IO.println("fifteen");break;
                     case 6: IO.println("sixteen");break;
                     case 7: IO.println("seventeen");break;
                     case 8: IO.println("eighteen");break;
                     case 9: IO.println("nineteen");break;
                     }
                   }
                   break;
                case 2: IO.print(" twenty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 3: IO.print(" thirty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 4: IO.print(" tourty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 5: IO.print(" fifty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 6: IO.print(" sixty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 7: IO.print(" seventy");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 8: IO.print(" eighty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 9: IO.print(" ninety");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                }
              break;
              }
              else
                if (einer>0){
                  IO.print(" and ");
                  switch (einer){
                    case 1: IO.println("one");break;
                    case 2: IO.println("two");break;
                    case 3: IO.println("three");break;
                    case 4: IO.println("four");break;
                    case 5: IO.println("five");break;
                    case 6: IO.println("six");break;
                    case 7: IO.println("seven");break;
                    case 8: IO.println("eight");break;
                    case 9: IO.println("nine");break;
                     }
                   }  
          break;
          case 5: IO.print("five hundred");
            if (zehner>0){
              IO.print("and");
              switch (zehner){
                case 1: IO.print(" ");
                 if (einer>=0){
                   switch (einer){
                     case 0: IO.println("ten");break;
                     case 1: IO.println("eleven");break;
                     case 2: IO.println("twelve");break;
                     case 3: IO.println("thirteen");break;
                     case 4: IO.println("fourteen");break;
                     case 5: IO.println("fifteen");break;
                     case 6: IO.println("sixteen");break;
                     case 7: IO.println("seventeen");break;
                     case 8: IO.println("eighteen");break;
                     case 9: IO.println("nineteen");break;
                     }
                   }
                   break;
                case 2: IO.print(" twenty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 3: IO.print(" thirty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 4: IO.print(" tourty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 5: IO.print(" fifty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 6: IO.print(" sixty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 7: IO.print(" seventy");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 8: IO.print(" eighty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 9: IO.print(" ninety");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                }
              break;
              }
              else
                if (einer>0){
                  IO.print(" and ");
                  switch (einer){
                    case 1: IO.println("one");break;
                    case 2: IO.println("two");break;
                    case 3: IO.println("three");break;
                    case 4: IO.println("four");break;
                    case 5: IO.println("five");break;
                    case 6: IO.println("six");break;
                    case 7: IO.println("seven");break;
                    case 8: IO.println("eight");break;
                    case 9: IO.println("nine");break;
                     }
                   }  
          break;
          case 6: IO.print("six hundred");
            if (zehner>0){
              IO.print("and");
              switch (zehner){
                case 1: IO.print(" ");
                 if (einer>=0){
                   switch (einer){
                     case 0: IO.println("ten");break;
                     case 1: IO.println("eleven");break;
                     case 2: IO.println("twelve");break;
                     case 3: IO.println("thirteen");break;
                     case 4: IO.println("fourteen");break;
                     case 5: IO.println("fifteen");break;
                     case 6: IO.println("sixteen");break;
                     case 7: IO.println("seventeen");break;
                     case 8: IO.println("eighteen");break;
                     case 9: IO.println("nineteen");break;
                     }
                   }
                   break;
                case 2: IO.print(" twenty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 3: IO.print(" thirty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 4: IO.print(" tourty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 5: IO.print(" fifty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 6: IO.print(" sixty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 7: IO.print(" seventy");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 8: IO.print(" eighty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 9: IO.print(" ninety");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                }
              break;
              }
              else
                if (einer>0){
                  IO.print(" and ");
                  switch (einer){
                    case 1: IO.println("one");break;
                    case 2: IO.println("two");break;
                    case 3: IO.println("three");break;
                    case 4: IO.println("four");break;
                    case 5: IO.println("five");break;
                    case 6: IO.println("six");break;
                    case 7: IO.println("seven");break;
                    case 8: IO.println("eight");break;
                    case 9: IO.println("nine");break;
                     }
                   }  
          break;
          case 7: IO.print("seven hundred");
            if (zehner>0){
              IO.print("and");
              switch (zehner){
                case 1: IO.print(" ");
                 if (einer>=0){
                   switch (einer){
                     case 0: IO.println("ten");break;
                     case 1: IO.println("eleven");break;
                     case 2: IO.println("twelve");break;
                     case 3: IO.println("thirteen");break;
                     case 4: IO.println("fourteen");break;
                     case 5: IO.println("fifteen");break;
                     case 6: IO.println("sixteen");break;
                     case 7: IO.println("seventeen");break;
                     case 8: IO.println("eighteen");break;
                     case 9: IO.println("nineteen");break;
                     }
                   }
                   break;
                case 2: IO.print(" twenty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 3: IO.print(" thirty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 4: IO.print(" tourty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 5: IO.print(" fifty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 6: IO.print(" sixty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 7: IO.print(" seventy");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 8: IO.print(" eighty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 9: IO.print(" ninety");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                }
              break;
              }
              else
                if (einer>0){
                  IO.print(" and ");
                  switch (einer){
                    case 1: IO.println("one");break;
                    case 2: IO.println("two");break;
                    case 3: IO.println("three");break;
                    case 4: IO.println("four");break;
                    case 5: IO.println("five");break;
                    case 6: IO.println("six");break;
                    case 7: IO.println("seven");break;
                    case 8: IO.println("eight");break;
                    case 9: IO.println("nine");break;
                     }
                   }  
          break;
          case 8: IO.print("eight hundred");
            if (zehner>0){
              IO.print("and");
              switch (zehner){
                case 1: IO.print(" ");
                 if (einer>=0){
                   switch (einer){
                     case 0: IO.println("ten");break;
                     case 1: IO.println("eleven");break;
                     case 2: IO.println("twelve");break;
                     case 3: IO.println("thirteen");break;
                     case 4: IO.println("fourteen");break;
                     case 5: IO.println("fifteen");break;
                     case 6: IO.println("sixteen");break;
                     case 7: IO.println("seventeen");break;
                     case 8: IO.println("eighteen");break;
                     case 9: IO.println("nineteen");break;
                     }
                   }
                   break;
                case 2: IO.print(" twenty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 3: IO.print(" thirty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 4: IO.print(" tourty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 5: IO.print(" fifty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 6: IO.print(" sixty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 7: IO.print(" seventy");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 8: IO.print(" eighty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 9: IO.print(" ninety");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                }
              break;
              }
              else
                if (einer>0){
                  IO.print(" and ");
                  switch (einer){
                    case 1: IO.println("one");break;
                    case 2: IO.println("two");break;
                    case 3: IO.println("three");break;
                    case 4: IO.println("four");break;
                    case 5: IO.println("five");break;
                    case 6: IO.println("six");break;
                    case 7: IO.println("seven");break;
                    case 8: IO.println("eight");break;
                    case 9: IO.println("nine");break;
                     }
                   }  
          break;
          case 9: IO.print("nine hundred");
            if (zehner>0){
              IO.print("and");
              switch (zehner){
                case 1: IO.print(" ");
                 if (einer>=0){
                   switch (einer){
                     case 0: IO.println("ten");break;
                     case 1: IO.println("eleven");break;
                     case 2: IO.println("twelve");break;
                     case 3: IO.println("thirteen");break;
                     case 4: IO.println("fourteen");break;
                     case 5: IO.println("fifteen");break;
                     case 6: IO.println("sixteen");break;
                     case 7: IO.println("seventeen");break;
                     case 8: IO.println("eighteen");break;
                     case 9: IO.println("nineteen");break;
                     }
                   }
                   break;
                case 2: IO.print(" twenty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 3: IO.print(" thirty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 4: IO.print(" tourty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 5: IO.print(" fifty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 6: IO.print(" sixty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 7: IO.print(" seventy");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 8: IO.print(" eighty");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                case 9: IO.print(" ninety");
                 if (einer>0){
                   switch (einer){
                     case 1: IO.println("-one");break;
                     case 2: IO.println("-two");break;
                     case 3: IO.println("-three");break;
                     case 4: IO.println("-four");break;
                     case 5: IO.println("-five");break;
                     case 6: IO.println("-six");break;
                     case 7: IO.println("-seven");break;
                     case 8: IO.println("-eight");break;
                     case 9: IO.println("-nine");break;
                     }
                   }
                 else
                   IO.println();
                   break;
                }
              break;
              }
              else
                if (einer>0){
                  IO.print(" and ");
                  switch (einer){
                    case 1: IO.println("one");break;
                    case 2: IO.println("two");break;
                    case 3: IO.println("three");break;
                    case 4: IO.println("four");break;
                    case 5: IO.println("five");break;
                    case 6: IO.println("six");break;
                    case 7: IO.println("seven");break;
                    case 8: IO.println("eight");break;
                    case 9: IO.println("nine");break;
                     }
                   }  
          break;
}

   //     IO.println("Variable hunderter ist: " + hunderter);
   //     IO.println("Variable zehner ist: " + zehner);
   //     IO.println("Variable einer ist: " + einer);
        
        // Die Zeilen oben wurden geschieben um zu pruefen ob die Zerlegung
        // des eingegebenen Wertes geklappt hat. Nun werden diwse nicht mehr
        // benoetigt und als Kommentar markiert
}
     else                                   // Der komplette obere Programmteil
      if (eingabe>10){                      // wird nicht ausgefürht wenn 
        zehner = eingabe/10;                // die eingabe >100 ist
        einer = eingabe%10;                 // so belbt das Programm efizient

        switch (zehner){
          case 1: IO.print("");
            if (einer>0){
              switch (einer){
                case 1: IO.println("eleven");break;
                case 2: IO.println("twelve");break;
                case 3: IO.println("thirteen");break;
                case 4: IO.println("fourteen");break;
                case 5: IO.println("fifteen");break;
                case 6: IO.println("sixteen");break;
                case 7: IO.println("seventeen");break;
                case 8: IO.println("eighteen");break;
                case 9: IO.println("nineteen");break;
                }
              }

          break;
          case 2: IO.print("twenty");
            if (einer>0){
              switch (einer){
                case 1: IO.println("-one");break;
                case 2: IO.println("-two");break;
                case 3: IO.println("-three");break;
                case 4: IO.println("-four");break;
                case 5: IO.println("-five");break;
                case 6: IO.println("-six");break;
                case 7: IO.println("-seven");break;
                case 8: IO.println("-eight");break;
                case 9: IO.println("-nine");break;
                     }
                   }
            else
              IO.println(" ");
          break;         
          case 3: IO.print("thirty");
            if (einer>0){
              switch (einer){
                case 1: IO.println("-one");break;
                case 2: IO.println("-two");break;
                case 3: IO.println("-three");break;
                case 4: IO.println("-four");break;
                case 5: IO.println("-five");break;
                case 6: IO.println("-six");break;
                case 7: IO.println("-seven");break;
                case 8: IO.println("-eight");break;
                case 9: IO.println("-nine");break;
                     }
                   }
            else
              IO.println(" ");
          break;         
          case 4: IO.print("fourty");
            if (einer>0){
              switch (einer){
                case 1: IO.println("-one");break;
                case 2: IO.println("-two");break;
                case 3: IO.println("-three");break;
                case 4: IO.println("-four");break;
                case 5: IO.println("-five");break;
                case 6: IO.println("-six");break;
                case 7: IO.println("-seven");break;
                case 8: IO.println("-eight");break;
                case 9: IO.println("-nine");break;
                     }
                   }
            else
              IO.println(" ");
          break;         
          case 5: IO.print("fifty");
            if (einer>0){
              switch (einer){
                case 1: IO.println("-one");break;
                case 2: IO.println("-two");break;
                case 3: IO.println("-three");break;
                case 4: IO.println("-four");break;
                case 5: IO.println("-five");break;
                case 6: IO.println("-six");break;
                case 7: IO.println("-seven");break;
                case 8: IO.println("-eight");break;
                case 9: IO.println("-nine");break;
                     }
                   }
            else
              IO.println(" ");
          break;         
          case 6: IO.print("sixty");
            if (einer>0){
              switch (einer){
                case 1: IO.println("-one");break;
                case 2: IO.println("-two");break;
                case 3: IO.println("-three");break;
                case 4: IO.println("-four");break;
                case 5: IO.println("-five");break;
                case 6: IO.println("-six");break;
                case 7: IO.println("-seven");break;
                case 8: IO.println("-eight");break;
                case 9: IO.println("-nine");break;
                     }
                   }
            else
              IO.println(" ");
          break;         
          case 7: IO.print("seventy");
            if (einer>0){
              switch (einer){
                case 1: IO.println("-one");break;
                case 2: IO.println("-two");break;
                case 3: IO.println("-three");break;
                case 4: IO.println("-four");break;
                case 5: IO.println("-five");break;
                case 6: IO.println("-six");break;
                case 7: IO.println("-seven");break;
                case 8: IO.println("-eight");break;
                case 9: IO.println("-nine");break;
                     }
                   }
            else
              IO.println(" ");
          break;         
          case 8: IO.print("eighty");
            if (einer>0){
              switch (einer){
                case 1: IO.println("-one");break;
                case 2: IO.println("-two");break;
                case 3: IO.println("-three");break;
                case 4: IO.println("-four");break;
                case 5: IO.println("-five");break;
                case 6: IO.println("-six");break;
                case 7: IO.println("-seven");break;
                case 8: IO.println("-eight");break;
                case 9: IO.println("-nine");break;
                     }
                   }
            else
              IO.println(" ");
          break;         
          case 9: IO.print("ninety");
            if (einer>0){
              switch (einer){
                case 1: IO.println("-one");break;
                case 2: IO.println("-two");break;
                case 3: IO.println("-three");break;
                case 4: IO.println("-four");break;
                case 5: IO.println("-five");break;
                case 6: IO.println("-six");break;
                case 7: IO.println("-seven");break;
                case 8: IO.println("-eight");break;
                case 9: IO.println("-nine");break;
                     }
                   }
            else
              IO.println(" ");
          break;         
          }
       }
       else                                          // Der ganze obere Teil
         if (eingabe<=10){                           // wird uebersprungen
           einer=eingabe;                            // wenn eingebe<10 ist
              switch (einer){
                case 1: IO.println("one");break;
                case 2: IO.println("two");break;
                case 3: IO.println("three");break;
                case 4: IO.println("four");break;
                case 5: IO.println("five");break;
                case 6: IO.println("six");break;
                case 7: IO.println("seven");break;
                case 8: IO.println("eight");break;
                case 9: IO.println("nine");break;
                case 10: IO.println("ten");break;
                default: IO.println("Ungueltige Eingabe"); break;

                     }
                 }
             else
               IO.println("Fehlerhafte eingabe");
           

     IO.println("Ausgeschieben war deine Zahl: " + eingabe);
     IO.println();

     
  }
}

