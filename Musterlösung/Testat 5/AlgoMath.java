/******************************  AlgoMath.java  *******************************/

import AlgoTools.IO;

/**
 * Implementation verschiedener Hilfs-Methoden. Die Methoden koennen von aussen
 * angesprochen werden, oder mit diesem Programm getestet werden.
 */
public class AlgoMath {

    /**
     * Berechnet die Ackermann Funktion.
     *
     * @param n Erster Parameter in der Definition von Peter
     * @param m Zweiter Parameter in der Definition von Peter
     *
     * @return Ergebnis der Funktion
     */
    public static int ackermann(int n, int m) {
        if(n < 0 || m < 0) {
            throw new RuntimeException("Die Parameter der Ackermann Funktion "
                + "müssen positiv sein!");
        }
        return ackerRek(n, m);
    }

    /**
     * @see #ackermann(int, int)
     */
    public static int ackerRek(int n, int m) {
        if(n == 0) {
            return m + 1;
        }
        if(m == 0) {
            return ackerRek(n - 1, 1);
        }
        return ackerRek(n - 1, ackerRek(n, m - 1));
    }


    /**
     * Berechnet, ob eine Zeichenkette ein Palindrom ist.
     *
     * @param wort die zu prüfende Zeichenkette
     *
     * @return <tt>true</tt>, wenn <tt>wort</tt> ein Palindrom ist
     */
    public static boolean istPalindrom(char[] wort) {
        if(wort.length <= 1) {
            return true;
        }

        char[] mitte = new char[wort.length - 2];
        for(int i = 0; i < mitte.length; ++i) {
            mitte[i] = wort[i + 1];
        }

        return wort[0] == wort[wort.length - 1] && istPalindrom(mitte);
    }


    /**
     * Berechnet die Potenz einer Zahl.
     *
     * @param basis natuerliche Zahl als Basis
     * @param exponent natuerliche Zahl als Potenz
     *
     * @return <tt>basis</tt> hoch <tt>exponent</tt>
     *
     * @throws RuntimeException basis=exponent=0
     *
     */
    public static double potenz(double basis, int exponent) {
        if(basis == 0) {
            if(exponent <= 0) {
                throw new RuntimeException("0^" + exponent
                    + " ist nicht definiert");
            } else {
                return 0;
            }
        }

        return (exponent < 0)
            ? (1f / potenzRek(basis, -exponent))
            : potenzRek(basis, exponent);
    }

    /**
     * @see #potenz(double, int)
     */
    private static double potenzRek(double basis, int exponent) {
        if (exponent == 0) {
            return 1;
        }

        return potenzRek(basis, exponent - 1) * basis;
    }


    /**
     * Gibt das Menue fuer die Benutzung aller Methoden auf der Konsole aus.
     */
    public static void menue() {
        IO.println("+------------------------------------------------------+");
        IO.println("| Folgende Optionen stehen zur Wahl                    |");
        IO.println("| a - berechnet die Ackermann Funktion                 |");
        IO.println("| p - prüft, ob ein Wort ein Palindrom ist             |");
        IO.println("| e - berechnet Potenz mit ganzzahligem Exponenten     |");
        IO.println("| RETURN - beenden                                     |");
        IO.println("+------------------------------------------------------+");
    }

    /**
     * Das Programm, fragt beim Benutzer ab welche Methode gewaehlt werden soll,
     * dann die dazu passenden Parameter und schliesslich wird das Ergebnis der
     * Methode ausgegeben. Da keine RuntimeException an den Benutzer gelangen
     * soll, wird auch hier Fehlerbehandlung gemacht.
     */
    public static void main(String[] args) {
        IO.println("+------------------- Willkommen -----------------------+");

        char option;
        do {
            menue();
            option = IO.readChar("Was moechten sie tun? ");

            switch (option) {
            case 'a':
            case 'A':
                IO.println(">>> Ackermann <<<");
                int n, m;
                do {
                    n = IO.readInt("Bitte ersten Parameter n eingeben: ");
                    m = IO.readInt("Bitte zweiten Parameter m eingeben: ");
                } while(n < 0 || m < 0);
                IO.println("Ackermann(" + n + ", " + m + ") = "
                    + ackermann(n, m));
                break;
            case 'p':
            case 'P':
                IO.println(">>> Palindrom <<<");
                char[] wort = IO.readChars("Bitte einen String eingeben: ");
                if(istPalindrom(wort)) {
                    IO.println("Das eingegebene Wort ist ein Palindrom! :-)");
                } else {
                    IO.println("Das eingegebene Wort ist kein Palindrom! :'(");
                }
                break;
            case 'e':
            case 'E':
                IO.println(">>> Potenz <<<");
                double basis;
                int exponent;
                do {
                    IO.println("Beachte: 0^e ist undefiniert, falls e <= 0!");
                    basis =
                        IO.readDouble("Bitte eine Zahl als Basis eingeben: ");
                    exponent = IO.readInt("Bitte eine ganze Zahl "
                                            + "als Exponent eingeben: ");
                } while(basis == 0 && exponent <= 0);
                IO.println(basis + "^" + exponent + " = "
                      + potenz(basis,exponent));
                break;
            case '\n':
                IO.println("Auf Wiedersehen!");
                break;
            default:
                IO.println("Falsche Eingabe, bitte nochmal versuchen");
            }

        } while (option != '\n');

    }
}
