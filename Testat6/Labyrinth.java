/******************************  Labyrinth.java  ******************************/

/**
 * Liest ein Labyrinth ein und berechnet mittels einem Backtracking
 * Algorithmus einen Weg durch dieses.
 * 
 * @author Christian Heiden
 * @author Lukas Kalbertodt
 */

import AlgoTools.IO;

public class Labyrinth {

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
	 * Findet einen Weg durch das Labyrinth.
	 * Findet den Startpunkt und ruft findeZielRek mit dem Startpunkt auf.
	 * 
	 * @param lab Das Labyrinth
	 * @throws RuntimeException Wenn kein Startpunkt gefunden wurde
	 * @return Ob ein Weg gefunden wurde
	 */
	private static boolean findeZiel(char[][] lab) {
		// TODO

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
     //     IO.println("Die X-Koordiante von S ist " + x);
     //     IO.println("Die Y-Koordinate von S ist " + y);
          IO.println(lab[i][l]);
	        findeZielRek(lab,i,y);
         // if(findeZielRek == true){
            return true;
         // }
        }
      }
    }
    return false;
	}


	/**
	 * Findet rekursiv einen Weg durch das Labyrinth
	 * 
	 * @param lab Das Labyrinth
	 * @param x X-Koordinate des Punktes bei dem man steht
	 * @param y Y-Koordinate des Punktes bei dem man steht
	 * @return Ob ein Weg gefunden wurde
	 */
	private static boolean findeZielRek(char[][] lab, int x, int y) {
		// TODO
    
    if(lab[x][y] == 'Z'){
    IO.println("JAJAJAJAJAJAJAJJAJAJAJAJAJAJAJJA!!!!!!!!!!!!!!");
      return true;
    }

    IO.println("Start in Rek ist X " + x);
    IO.println("Start in Rek ist Y " + y);
//		return true;
   
    int hoehe = lab.length - y - 1;
    int breite = lab[0].length - x -1;

    for(int i = y; i < hoehe; i++){
      IO.println("I ist gleich " + i);
      for(int j = x; j < breite; j++){
        IO.print("J = " + j + " ");
        if(lab[x + i][y + j] == ' '){
          x = x + i;
          y = y + j;
     //     findeZielRek(lab,x,y);
        }
     //   else return false;
      }
  //    return false;
    }

    return false;
    
	}

	/**
	 * Zeigt das uebergebene Labyrinth auf dem Terminal an
	 * 
	 * @param lab Das anzuzeigende Labyrinth
	 */
	private static void druckeLabyrinth(char[][] lab) {
		// TODO

    int hoehe = lab.length;
    int breite = lab[0].length;

    IO.println("B ist " + breite);
    IO.println("H ist " + hoehe);
    for(int i = 0; i < hoehe; i++){
      for(int l = 0; l < breite; l++){
        IO.print(lab[i][l]);
      }
      IO.println();
    }
    IO.println();
    IO.println();
	}


	/**
	 * Liest das Labyrinth vom Terminal ein
	 * @return Das eingelesene Labyrinth
	 */
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

	/**
	 * Liest Labyrinth ein und findet einen Weg von S nach Z
	 */
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
	//		druckeLabyrinth(lab);
		} else {
			IO.println("Kein Weg zum Ziel gefunden!");
		}
	}
}
