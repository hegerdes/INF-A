/******************************  Sphere.java  *********************************/

/**
 * Diese Klasse repraesentiert eine Kugel im dreidimensionalen Raum. Die Kugel
 * wird durch ihren Mittelpunkt und ihren Radius repraesentiert.
 */
public class Sphere extends Shape {

  /**
   * Radius der Kugel
   */
  private double radius;

  /**
   * Instanziiert eine neue Einheitskugel mit der Farbe <tt>"schwarz"</tt> und
   * dem Koordinatenursprung als Position.
   */
  public Sphere() {

    this.radius = 1.0;
  }

  /**
   * Instanziiert eine neue Kugel mit dem uebergebenen Radius, der uebergebenen
   * Farbe <tt>colour</tt> und der Position
   * (<tt>x</tt>, <tt>y</tt>, <tt>z</tt>).
   *
   * @param radius
   *          der Radius der neuen Kugel
   * @param colour
   *          die Farbe der neuen Kugel
   * @param x
   *          die x-Koordinate der neuen Kugel
   * @param y
   *          die y-Kooridnate der neuen Kugel
   * @param z
   *          die z-Kooridnate der neuen Kugel
   *
   * @throws RuntimeException
   *         im Falle eines negativen Radius
   */
  public Sphere(String color, double x, double y, double z, double radius) {

    super(color, x, y, z);

    setRadius(radius);
  }

  /**
   * Setzt den Radius dieser Kugel auf den uebergebenen Wert.
   *
   * @param radius
   *          der neue Radius dieses Kreises.
   *
   * @throws RuntimeException
   *          im Falle eines negativen Radius
   */
  public void setRadius(double radius) {

    if (radius < 0) {
      throw new RuntimeException("Fehler: Radius ist negativ!");
    }

    this.radius = radius;
  }

  /**
   * Liefert den Radius dieser Kugel.
   *
   * @return Radius dieser Kugel
   */
  public double getRadius() {

    return radius;
  }

  /**
   * Liefert den Abstand dieser Kugel zur uebergebenen <tt>Shape</tt>
   * <tt>other</tt>. Falls <tt>other</tt> auch eine Kugel ist, wird der
   * korrekte Abstand der beiden Kugeln geliefert, sonst das, was
   * <tt>other.getDistanceTo()</tt> liefert.
   *
   * @param other
   *          Der <tt>Shape</tt> zu der der Abstand von dieser Kugel berechnet
   *          werden soll.
   *
   * @return Abstand zu <tt>other</tt>
   */
  public double getDistanceTo(Shape other) {

    if (other instanceof Sphere) {          // Falls Sphere other ist:
      Sphere otherSphere = (Sphere) other;  // Cast, um an radius zu kommen
                                                 // Radien abziehen
      double d = super.getDistanceTo(other) - otherSphere.radius - radius;
      return d < 0 ? 0 : d;                      // liegt Schnitt vor?
    }

    return super.getDistanceTo(other); // Falls other kein Sphere
  }

  /**
   * Berechnet das Volumen dieser Kugel.
   *
   * @return Volumen der Kugel
   */
  public double getVolume() {

    return 4.0 / 3 * Math.PI * radius * radius * radius;
  }

  /**
   * Berechnet den Flaecheninhalt dieser Kugel.
   *
   * @return Flaecheninhalt der Kugel
   */
  public double getArea() {

    return 4 * Math.PI * radius * radius;
  }

  /**
   * Liefert eine Repraesentation dieser Kugel in Form eines Strings.
   *
   * @return Repraesentation der Kugel
   */
  public String toString() {

    return "[" + super.toString() + ", Radius=" + radius + "]";
  }
}
