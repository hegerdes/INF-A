/*****************************  Zahlen.java  *********************************/

import AlgoTools.IO;

/**
 * Gibt die textuelle Darstellung einer Zahl aus [10,999] in englischer Sprache
 * aus.
 *
 * @author Sebastian Buescher (sbuesche@uos.de)
 * @author Nicolas Neubauer (nneubauer@uos.de)
 * @author Jana Lehnfeld (jlehnfel@uos.de)
 */
public class Zahlen {

   public static void main(String[] args) {

      // sicheres Einlesen
      int zahl;
      do {
        zahl = IO.readInt("Bitte eine Zahl aus [10,999]: ");
      } while (zahl < 10 || zahl > 999);

      //Ziffern
      int hunderter = zahl / 100;
      int zehner = (zahl % 100) / 10;
      int einer = zahl % 10;

      //Hunderter-Stelle
      switch (hunderter) {

        case 0: break; //nichts ausgeben bei 0
        case 1: IO.print("one hundred "); break;
        case 2: IO.print("two hundred "); break;
        case 3: IO.print("three hundred "); break;
        case 4: IO.print("four hundred "); break;
        case 5: IO.print("five hundred "); break;
        case 6: IO.print("six hundred ");  break;
        case 7: IO.print("seven hundred "); break;
        case 8: IO.print("eight hundred "); break;
        case 9: IO.print("nine hundred "); break;

        default:
          IO.println("Fehler: Hunderter kann nicht umgewandelt werden");
          break;
      }

      // 'and' muss nur eingefügt werden, wenn danach noch etwas 
      // kommt
      if(hunderter > 0 && (zehner > 0 || einer > 0))
        IO.print("and ");

      //Sonderfaelle (elf, zwoelf...) und Einer-Stelle
      switch (zehner) {

        case 1: //Sonderfaelle

          switch (einer) {
            case 0: IO.print("ten"); break;
            case 1: IO.print("eleven"); break;
            case 2: IO.print("twelve"); break;
            case 3: IO.print("thirteen"); break;
            case 4: IO.print("fourteen"); break;
            case 5: IO.print("fifteen"); break;
            case 6: IO.print("sixteen");  break;
            case 7: IO.print("seventeen"); break;
            case 8: IO.print("eighteen"); break;
            case 9: IO.print("nineteen"); break;
          }

          break;
        case 0: case 2: case 3: case 4: case 5:
        case 6: case 7: case 8: case 9:

          //Zehner-Stelle
          switch(zehner) {
            case 0: case 1: break; //1xer sind schon behandelt
            case 2: IO.print("twenty"); break;
            case 3: IO.print("thirty"); break;
            case 4: IO.print("forty"); break;
            case 5: IO.print("fifty"); break;
            case 6: IO.print("sixty");  break;
            case 7: IO.print("seventy"); break;
            case 8: IO.print("eighty"); break;
            case 9: IO.print("ninety"); break;

            default:
                    IO.println("Fehler: Zehner kann nicht umgewandelt werden");
                    break;
          }

          // Bindestrich einfügen, wenn Zehnerstelle nicht 0 ist
          if(zehner > 0 && einer != 0){
            IO.print("-");
          }

          switch(einer) {
            case 0: break; //nichts ausgeben
            case 1: IO.print("one"); break;
            case 2: IO.print("two"); break;
            case 3: IO.print("three"); break;
            case 4: IO.print("four"); break;
            case 5: IO.print("five"); break;
            case 6: IO.print("six");  break;
            case 7: IO.print("seven"); break;
            case 8: IO.print("eight"); break;
            case 9: IO.print("nine"); break;
            default:
              IO.println("Fehler: Einer kann nicht umgewandelt werden");
              break;
          }

          break;
        default:
          IO.println("Fehler: Einer/Sonderfall kann nicht umgewandelt" +
                     " werden");
          break;
      }

      IO.println(); //Absatz fuer die Optik
   }
}
