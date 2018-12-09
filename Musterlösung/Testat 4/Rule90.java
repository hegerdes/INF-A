/*******************************  Rule90.java  ********************************/

/**
 * Simuliert den zellulären Automaten Rule90. Liest das initiale System und die
 * zu simulierenden Zeitschritte ein und gibt beim Simulieren zu jedem
 * Zeitschritt den Zustand des Systems in einer Zeile aus.
 *
 * @author Lukas Kalbertodt
 */

import AlgoTools.IO;

public class Rule90 {
    public static void main(String[] args) {
        // Die initialen Werte einlesen (System darf nicht leer sein)
        int[] eingabe;
        do {
            eingabe = IO.readInts("Initiales System eingeben: ");
        } while(eingabe.length == 0);

        // Die Anzahl der zu simulierenden Zeitschritte eingeben
        int zeitschritte;
        do {
            zeitschritte = IO.readInt("Anzahl Zeitschritte eingeben: ");
        } while(zeitschritte < 0);

        // Leere Zeile, damit die Ausgabe besser aussieht
        IO.println();

        // Eingelesenes Integer-Array in Boolean-Array umwandeln
        boolean[] zellen = new boolean[eingabe.length];
        for(int i = 0; i < eingabe.length; i++) {
            zellen[i] = eingabe[i] > 0;
        }

        // Wir speichern uns die Arraylänge in `laenge`, um weniger tippen zu
        // müssen.
        int laenge = zellen.length;

        // Die initialen Zellen ausgeben
        for(int i = 0; i < laenge; i++) {
            if(zellen[i]) {
                IO.print("@ ");
            } else {
                IO.print(". ");
            }

        }
        IO.println();

        // Wir laufen so oft durch, wie der Benutzer angegeben hat.
        for(int schritt = 0; schritt < zeitschritte; schritt++) {
            // Wir erzeugen die Zellen des neuen Zeitschritts. Dazu legen wir
            // erstmal ein neues Array mit gleicher Länge an. Danach füllen
            // wir jede Stelle entsprechend der Regeln.
            boolean[] neu = new boolean[laenge];
            for(int pos = 0; pos < neu.length; pos++) {
                boolean links = zellen[(pos - 1 + laenge) % laenge];
                boolean rechts = zellen[(pos + 1 + laenge) % laenge];
                neu[pos] = links ^ rechts;
            }

            // Die alten Zellen durch die neuen ersetzen
            zellen = neu;

            // Die neuen Zellen ausgeben
            for(int i = 0; i < laenge; i++) {
                if(zellen[i]) {
                    IO.print("@ ");
                } else {
                    IO.print(". ");
                }
            }
            IO.println();
        }
    }
}
