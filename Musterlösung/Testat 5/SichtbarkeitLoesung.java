/******************************  SichtbarkeitLoesung.java  ********************/

import AlgoTools.IO;

/**
 * Hier geht es um die Sichtbarkeit von Variablen
 */

public class SichtbarkeitLoesung {

    static int a;

    static int i = 1;                  // Zaehler fuer Ausgabe "Stelle"

    public static void main(String argv[]) {

        /***          ***/ kopf();     // Ausgabe des Tabellenkopfs

        int a = 6;
        int [] c = {38, 12, 2, 6};

        /*** Stelle 1 ***/ write(a, c); // Ausgabe von a,c (b ist undefiniert)

        initialize();

        /*** Stelle 3 ***/ write(a, c); // Ausgabe von a,c (b ist undefiniert)

        for (int b = 0; b < 1; b++) {

            /*** Stelle 4 ***/ write(a, b, c); //Ausgabe von a,b,c
            a /= 3;
            c[b+1] -= c[b+2];
        }

        /*** Stelle 5 ***/ write(a, c); // Ausgabe von a,c (b ist undefiniert)

        int b = method1(a + c[a-2]);

        /*** Stelle 7 ***/ write(a, b, c); // Ausgabe von a, b, c 

        for (a = 3; a < 5; a += 2) {

            b = 2;
            c[a] -= c[b];

            /*** Stelle 8***/ write(a, b, c); // Ausgabe von a,b,c
        }

        /*** Stelle 9 ***/ write(a, b, c); // Ausgabe von a,b,c

        b = 7 + method2(++a, c);

        /*** Stelle 11 ***/ write(a, b, c); // Ausgabe von a,b,c

        a = method1(method2(method1(a), c));

        /*** Stelle 15 ***/ write(a, b, c); // Ausgabe von a,b,c
    }

    static void initialize() {

        int b = 4;

        a = 3;

        /*** Stelle 2 ***/ write(a, b); // Ausgabe von a und b
    }

    static int method1(int b) {

        /*** Stelle 6, 12  bzw. 14 ***/ write(a, b); // Ausgabe von a und b
        
        return a;
    }

    static int method2(int a, int[] c) {

        a++;
        c[0] /= 2;
        c = new int[4];
        
        /*** Stelle 10 bzw. 13 ***/ write(a, c); // Ausgabe von a,c (b undefiniert)

        return a;
    }

    static void kopf() {               // Ausgabe Tabellenkopf

        IO.println("Stelle | a=  | b=  | c=");
        IO.println("-------+-----+-----|-----------------");
    }

    static void write(int a, int[] c) { // Ausgabe von a,c;b undefiniert

        IO.print(i++, 2); IO.print(".    | ");
        IO.print(a, 3); IO.print(" |     | ");
        for (int j = 0; j < c.length - 1; j++) IO.print(c[j] + "; ");
        IO.println(c[c.length - 1]);
    }

    static void write(int a, int b) {  // Ausgabe von a,b

        IO.print(i++, 2); IO.print(".    | ");
        IO.print(a, 3); IO.print(" | "); IO.print(b, 3);
        IO.println(" |");
    }

    static void write(int a, int b, int[] c) { // Ausgabe von a,b,c

        IO.print(i++, 2); IO.print(".    | ");
        IO.print(a, 3); IO.print(" | "); IO.print(b, 3); IO.print(" | ");
        for(int j = 0; j < c.length - 1; j++) IO.print(c[j] + "; ");
        IO.println(c[c.length - 1]);
    }
}

