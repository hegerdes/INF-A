/******************************  Shape.java  **********************************/

/**
 * Diese Klasse repraesentiert eine allgemeine Figur im dreidimensionalen Raum.
 * Jedes Objekt besitzt eine Farbe und eine Position im Raum.
 */
public class Shape {

  /**
   * Farbe dieses <tt>Shape</tt>s
   */
  public String colour;

  /**
   * x-Koordinate dieses <tt>Shape</tt>s
   */
  public double x;

  /**
   * y-Koordinate dieses <tt>Shape</tt>s
   */
  public double y;

  /**
   * z-Koordinate dieses <tt>Shape</tt>s
   */
  public double z;

  /**
   * Instanziiert ein neues <tt>Shape</tt> mit der Farbe <tt>"schwarz"</tt>
   * und dem Koordinatenursprung als Position.
   */
  public Shape() {

    this("schwarz", 0.0, 0.0, 0.0);
  }

  /**
   * Instanziiert ein neues <tt>Shape</tt> mit der uebergebenen Farbe
   * <tt>colour</tt> und der Position (<tt>x</tt>, <tt>y</tt>, <tt>z</tt>).
   *
   * @param colour
   *          die Farbe des neuen <tt>Shape</tt>
   * @param x
   *          die x-Koordinate des neuen <tt>Shape</tt>
   * @param y
   *          die y-Koordinate des neuen <tt>Shape</tt>
   * @param z
   *          die z-Koordinate des neuen <tt>Shape</tt>
   */
  public Shape(String colour, double x, double y, double z) {

    this.colour = colour;
    this.x = x;
    this.y = y;
    this.z = z;
  }

  /**
   * Verschiebt dieses <tt>Shape</tt> im Raum um <tt>dX</tt> in x-Richtung, um
   * <tt>dY</tt> in y-Richtung und um <tt>dZ</tt> in z-Richtung.
   *
   * @param dX
   *          der Wert, um den dieses <tt>Shape</tt> in x-Richtung verschoben
   *          wird.
   * @param dY
   *          der Wert, um den dieses <tt>Shape</tt> in y-Richtung verschoben
   *          wird.
   * @param dZ
   *          der Wert, um den dieses <tt>Shape</tt> in z-Richtung verschoben
   *          Wird.
   */
  public void move(double dX, double dY, double dZ) {

    x += dX;
    y += dY;
    z += dZ;
  }

  /**
   * Liefert den Abstand dieses <tt>Shape</tt> zum uebergebenen <tt>Shape</tt>
   * <tt>other</tt>. In dieser Version der Methode wird der Abstand zwischen der
   * durch (<tt>x</tt>,<tt>y</tt>,<tt>z</tt>) gegebenen Position dieses
   * <tt>Shape</tt> im Raum zu der durch (<tt>other.x</tt>, <tt>other.y</tt>,
   * <tt>other.z</tt>) gegebenen Position des <tt>Shape</tt> <tt>other</tt> in
   * euklidischer Metrik berechnet.
   *
   * @param other
   *          das <tt>Shape</tt>, zu dem der Abstand dieses <tt>Shape</tt>
   *          berechnet werden soll.
   *
   * @return den Abstand zwischen diesem und dem gegebenen <tt>Shape</tt>
   */
  public double getDistanceTo(Shape other) {

    return Math.sqrt((x - other.x) * (x - other.x) + (y - other.y)
        * (y - other.y) + (z - other.z) * (z - other.z));
  }

  /**
   * Liefert das Volumen dieses <tt>Shape</tt>.
   *
   * @return das Volumenen dieses <tt>Shape</tt>
   */
  public double getVolume() {

    return 0.0;
  }

  /**
   * Liefert den Flaecheninhalt dieses <tt>Shape</tt>.
   *
   * @return der Flaecheninhalt dieses <tt>Shape</tt>
   */
  public double getArea() {

    return 0.0;
  }

  /**
   * Liefert eine Repraesentation dieses <tt>Shape</tt> in Form eines Strings.
   * Alle nach aussen sichtbaren Attribute werden zusammen mit ihren Werten
   * aufgelistet.
   *
   * @return eine textuelle Repraesentation dieses <tt>Shape</tt>
   */
  public String toString() {

    return "Farbe=" + colour + ", Position=(" + x + "; " + y + "; " + z + ")";
  }
}
