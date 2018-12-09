/****************************  ShapeTest.java  ********************************/
import AlgoTools.IO;

/**
 * Programmbeschreibung: Testet die Klassen Shape, Sphere und Cube.
 */

public class ShapeTest {

  public static void main(String[] argv) {

    // Test der Klasse Shape
    Shape shape = new Shape();
    IO.println("Shape shape: " + shape);
    shape.colour = "gruen";
    shape.move(1.0, 1.0, 1.0);
    IO.println("Shape shape: " + shape + ", Flaeche=" + shape.getArea()
        + ", Volumen=" + shape.getVolume());
    IO.println("Abstand zum Ursprung=" + shape.getDistanceTo(new Shape()));
    shape.x = 2;
    shape.y = 0;
    shape.z = 1;
    IO.println("Abstand zum Ursprung=" + shape.getDistanceTo(new Shape()));

    // Test der Klasse Sphere
    Sphere sphere1 = new Sphere();
    IO.println("Sphere sphere1: " + sphere1);
    sphere1.setRadius(1.5);
    IO.println("Neuer Radius=" + sphere1.getRadius());
    IO.println("Sphere sphere1: " + sphere1);

    Sphere sphere2 = new Sphere("blau", 2, 2, 1, 2);
    IO.println("Sphere sphere2: " + sphere2);
    IO.println("Abstand zum Ursprung=" + sphere2.getDistanceTo(new Shape()));
    IO.println("Abstand zu shape=" + sphere2.getDistanceTo(shape));
    IO.println("Abstand zum Einheitskreis im Ursprung="
        + sphere2.getDistanceTo(new Sphere()));
    IO.println("Flaeche=" + sphere2.getArea() + "; Volumen="
        + sphere2.getVolume());

    // Test der Klasse Cube
    Cube cube1 = new Cube("rot", 0, 1, 2, 3);
    IO.println("Cube cube1:" + cube1);
    IO.println("Flaeche=" + cube1.getArea() + "; Volumen="
        + cube1.getVolume());
    cube1.move(-1, -1, -1);
    cube1.setWidth(4);
    IO.println("Neue Breite=" + cube1.getWidth());
    IO.println("Cube cube1:" + cube1);
    IO.println("Flaeche=" + cube1.getArea() + ", Volumen="
        + cube1.getVolume());
    IO.println("Abstand zum Ursprung=" + cube1.getDistanceTo(new Shape()));
    IO.println("Abstand von cube1 zu sphere2="
        + cube1.getDistanceTo(sphere2));
    IO.println("Abstand von sphere2 zu cube1="
        + sphere2.getDistanceTo(cube1));

    Cube cube2 = new Cube("gelb", 1, 0, 2, 1.5);
    IO.println("Cube cube2:" + cube2);
    IO.println("Abstand von cube1 zu cube2="
        + cube1.getDistanceTo(cube2));
    IO.println("Abstand von cube2 zu cube1="
        + cube2.getDistanceTo(cube1));

  }
}
