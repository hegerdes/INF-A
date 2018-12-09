/**
 * Diese Klasse sucht Wege durch labe
 * 
 * @author Thorsten.Meinl@informatik.uni-erlangen.de
 *
 */

import AlgoTools.IO;

public class lab {

 /** Freies Feld */
  private static final char FREI  = ' ';
  /** Mauer */
  private static final char MAUER = '#';
  /** Startfeld */
  private static final char START = 'S';
  /** Zielfeld */
  private static final char ZIEL  = 'Z';
  /** Besuchtes Feld */
  private static final char PFAD  = '-';

	/**
	 * Druckt ein lab aus.
	 * @param lab ein lab als zweidimensionales char[]-Feld
	 */
	public static void druckeLabyrinth(char[][] lab) {
		for (int y = 0; y < lab.length; y++) {
			for (int x = 0; x < lab[y].length; x++) {
				IO.print(lab[y][x]);
			}
			IO.println();
		}		
	}
	
	/**
	 * Sucht den Startpunkt in einem lab
	 * @param lab ein lab als zweidimensionales char[]-Feld
	 * @return den Startpunkt als zweielementiges int[]-Feld, mit der x-Koordinate als ersten und der y-Koordinate als zweiten Wert
	 */
	 private static boolean findeZiel(char[][] lab) {

           int hoehe = lab.length;
           int breite = lab[0].length;
        //   int x, y;   // x fuer Breite || y fure Hoehe
        //   x = 0;
        //   y = 0;

         for(int i = 0; i < hoehe; i++){
           for(int l = 0; l < breite; l++){
             if(lab[i][l] == START){
               int x = l;
               int y = i;
               IO.println(lab[i][l]);
               findeZielRek(lab,i,y);
               return true;
             }
           }
         }retrun false
       }


	/**
	 * Sucht einen Weg durch das lab und markiert ihn mit 'O'
	 * @param lab ein lab als zweidimensionales char[]-Feld
	 * @param x die aktuelle x-Position im lab
	 * @param y die aktuelle y-Position im lab
	 * @return <code>true</code> wenn ein Weg gefunden wurde, sonst <code>false</code>
	 */
	public static boolean findeZielRek(char[][] lab, int x, int y) {		
		if ((x < 0) || (y < 0) || (y >= lab.length) || (x >= lab[y].length)) return false;
		
		if (lab[y][x] == 'Z') return true;
		if ((lab[y][x] == 'S') || (lab[y][x] == ' ')) {
			lab[y][x] = 'O';
			
			if (findeZielRek(lab, x - 1, y)) return true;
			if (findeZielRek(lab, x + 1, y)) return true;
			if (findeZielRek(lab, x, y - 1)) return true;
			if (findeZielRek(lab, x, y + 1)) return true;
			lab[y][x] = ' ';
		}
		return false;
	}
	

 private static char[][] leseEingabe() {
    int breite = 0, hoehe = 0;

    // Lese Breite ein
    do {
      breite = IO.readInt("Breite des Labyrinths: ");
    } while(breite <= 0);

    // Lese Hoehe ein
    do {
      hoehe = IO.readInt("Hoehe des Labyrinths: ");
    } while(hoehe <= 0);

    // Lege Array an, welches ausgegeben wird
    char[][] out = new char[hoehe][breite];

    // Fuer jede Zeile
    for(int i = 0; i < hoehe; i++) {
      char[] zeile;

      // lies Zeile mit korrekter Anzahl von Buchstaben ein
      do {
        zeile = IO.readChars("Zeile " + i + " des Labyrinths: ");
      } while(zeile.length != breite);

      out[i] = zeile;
    }
    return out;
  }



	 public static void main(String[]args){

    // Lese Labyrinth ein
    char[][] lab = leseEingabe();

    // Gebe aus
    IO.println();
    IO.println("----- Original-Labyrinth: -----");
    druckeLabyrinth(lab);
    IO.println();

    boolean gefunden = findeZiel(lab);
    if(gefunden) {
      IO.println("Startpunkt gefunden! ");
    }else
      IO.println("Keinen Startpunkt gefunden! ");

    if(gefunden) {
      // Gebe aus
      IO.println("-----   Gefundener Weg:   -----");
  //    druckeLabyrinth(lab);
    } else {
      IO.println("Kein Weg zum Ziel gefunden!");
    }
  }

}
