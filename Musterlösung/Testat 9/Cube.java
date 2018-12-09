/******************************  Cube.java  ***********************************/

/**
 * Diese Klasse repraesentiert einen Wuerfel im dreidimensionalen Raum. Der
 * Wuerfel wird durch seinen rechten oberen hinteren Eckpunkt sowie die
 * Kantenlaenge repraesentiert.
 */
public class Cube extends Shape {

  /**
   * Kantenlaenge des Wuerfels
   */
  private double width;

  /**
   * Instanziiert einen neuen Wuerfel mit der uebergebenen Kantenlaenge, der
   * uebergebenen Farbe <tt>colour</tt> und der rechten, oberen, hinteren Ecke
   * an der Position (<tt>x</tt>,<tt>y</tt>,<tt>z</tt>).
   *
   * @param colour
   *          die Farbe des neuen Wuerfels
   * @param x
   *          die x-Koordinate der rechten oberen hinteren Ecke des neuen
   *          Wuerfels
   * @param y
   *          die y-Kooridnate der rechten oberen hinteren Ecke des neuen
   *          Wuerfels
   * @param z
   *          die z-Kooridnate der rechten oberen hinteren Ecke des neuen
   *          Wuerfels
   * @param width
   *          die Kantenlaenge dieses neuen Wuerfels
   *
   * @throws RuntimeException
   *          im Falle einer negativen Kantenlaenge
   */
  public Cube(String color, double x, double y, double z, double width) {

    super(color, x, y, z);
    setWidth(width);
  }

  /**
   * Setzt die Kantenlaenge dieses Wuerfels auf den uebergebenen Wert. 
   *
   * @param width
   *          die neue Kantenlaenge dieses Wuerfels.
   *
   * @throws RuntimeException
   *          im Falle einer negativen Kantenlaenge
   */
  public void setWidth(double width) {

    if (width < 0) {
      throw new RuntimeException("Fehler: Kantenlaenge ist negativ!");
    }

    this.width = width;
  }

  /**
   * Liefert die Kantenlaenge dieses Wuerfels.
   *
   * @return Kantenlaenge des Wuerfels
   */
  public double getWidth() {

    return width;
  }

  /**
   * Liefert das Volumen dieses Wuerfels.
   *
   * @return Volumen dieses Wuerfels
   */
  public double getVolume() {

    return width * width * width;
  }

  /**
   * Liefert den Flaecheninhalt dieses Wuerfels.
   *
   * @return Flaecheninhalt dieses Wuerfels
   */
  public double getArea() {

    return 6 * width * width;
  }

  /**
   * Liefert den Abstand von diesem Wuerfel zum uebergebenen <tt>Shape</tt>
   * <tt>other</tt>. Falls <tt>other</tt> ebenfalls ein <tt>Cube</tt> ist, wird
   * der korrekte Abstand zwischen diesen beiden Wuerfeln geliefert, also der
   * Abstand der beiden Mittelpunkte, sonst der Abstand, den
   * <tt>Shape.getDistanceTo()</tt> liefert.
   *
   * @param other
   *          die Shape zu der der Abstand von dieser Shape berechnet werden
   *          soll.
   *
   * @return Abstand zu <tt>other</tt>
   */
  public double getDistanceTo(Shape other) {

    if (other instanceof Cube) { // Falls other Cube

      double h = width / 2;

      Cube o = (Cube) other;

      double oh = o.width / 2;

      return Math.sqrt((x - h - (o.x - oh)) * (x - h - (o.x - oh))
          + (y - h - (o.y - oh)) * (y - h - (o.y - oh)) + (z - h - (o.z - oh))
          * (z - h - (o.z - oh)));

    }

    // Falls other kein Cube
    return super.getDistanceTo(other);
  }

  /**
   * Liefert eine Repraesentation dieses Wuerfels in Form eines Strings. 
   *
   * @return Repraesentation des Wuerfels
   */
  public String toString() {

    return "[" + super.toString() + ", Kantenlaenge=" + width + "]";
  }
}
