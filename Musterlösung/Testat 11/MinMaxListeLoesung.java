/******************************* MinMaxListe.java *****************************/
import AlgoTools.IO;

/**
 */
public class MinMaxListeLoesung extends VerweisListe {

  // Kleinstes und größtes Objekt, null wenn Liste leer.
  private Object min;
  private Object max;

  /**
   *  Gibt das kleinste Element der Liste zurück
   * @return Das kleinste Element
   */
  public Object getMin() {
    return min;
  }

  /**
   *  Gibt das größte Element der Liste zurück
   * @return Das größte Element
   */
  public Object getMax() {
    return max;
  }


  public void insert(Object x) {
    // Objekt einfügen
    super.insert(x);

    Comparable compX = (Comparable)x;

    // Falls das eingefügte Objekt größer oder kleiner als Min/Max ist,
    // muss man Min/Max aktualisieren. Wenn min und max null sind, wird
    // es auf jeden Fall überschrieben.
    if(min == null || compX.compareTo(min) < 0) {
      min = compX;
    }
    if(max == null || compX.compareTo(max) > 0) {
      max = compX;
    }
  }

  /**
   *  Durchsucht die ganze Liste nach dem Minimum und Maximum
   */
  private void findMinMax() {
    // Wir speichern uns unsere jetzige Position, um dort später wieder
    // hinzukommen. Wenn wir derzeit in der endpos sind, speichern wir
    // uns null.
    Object position = endpos() ? null : elem();

    // An den Anfang der Liste springen
    reset();

    // Wir tun so als wäre das jetzige (erste) Element das Min/Max
    min = elem();
    max = elem();

    // Einmal die Liste von vorne nach hinten durchgehen
    while(!endpos()) {
      // Wenn das jetzige Element kleiner oder größer ist, als unser
      // bisheriges Min/Max, aktualisieren wir unser Min/Max
      Comparable e = (Comparable)elem();
      if(e.compareTo(min) < 0) {
        min = e;
      }
      if(e.compareTo(max) > 0) {
        max = e;
      }

      // In der Liste weitergehen
      advance();
    }

    // Alte Position der Liste wiederherstellen
    reset();
    while(!endpos() && elem() != position) {
      advance();
    }
  }

  public void delete() {
    Object e = elem();

    super.delete();

    if(empty()) {
      // Liste ist leer, also sind min und max = null
      min = null;
      max = null;
    } else if(e == min || e == max) {
      // Das Maximum oder Minimum wurde gelöscht
      // -> Ganze Liste durchlaufen, um das neue zu finden
      findMinMax();
    }

  }
}
