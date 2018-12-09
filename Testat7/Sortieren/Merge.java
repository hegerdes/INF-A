public class Merge {                             // Klasse Merge

  public static int[] merge (int[]a, int[]b) {   // mischt a und b
                                                 // liefert Ergebnis zurueck

    int i=0, j=0, k=0;                           // Laufindizes
    int[] c = new int[a.length + b.length];      // Platz fuer Folge c besorgen

    while ((i<a.length) && (j<b.length)) {       // mischen, bis ein Array leer
      if (a[i] < b[j])                           // jeweils das kleinere Element
          c[k++] = a[i++];                       // wird nach c uebernommen
      else
          c[k++] = b[j++];
    }

    while (i<a.length) c[k++] = a[i++];          // ggf.: Rest von Folge a
    while (j<b.length) c[k++] = b[j++];          // ggf.: Rest von Folge b

    return c;                                    // Ergebnis abliefern
  }
}
