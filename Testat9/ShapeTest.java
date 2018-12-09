/******************************  ShapeTest.java  ******************************/

import AlgoTools.IO;

/**
 * @version 08.01.17
 *  
 * @author  hegerdes
 * @author  hlauts
 */

public class ShapeTest {

/**
 * Diesen Programm Testet die Klassen
 * Shape
 * Shere
 * Cube
 */

  public static void main(String[] argv) {
     
     // Test der Klasse Shape
     IO.println();
     IO.println("Testaufrufe fuer Shape!");
     Shape normShape = new Shape();          // Erstellt die default Shape
     IO.println("Die Figur normShape: " + normShape); 

     Shape punkt = new Shape("weiß", 4, 8, 15);
     IO.println("Die Figur Punkt: " + punkt);

     punkt.move(10, 10, 10);
     IO.println("Die Figur Punkt nach move: " + punkt);
     IO.println("Die Figur Punkt hat die Flaeche: " + punkt.getArea() +                  " , und das  Volumen: " + punkt.getVolume());

     IO.println("Die Objekte normShape und Punkt haben den Abstand: " +                   punkt.getDistanceTo(normShape));
     IO.println();


     // Testet der Klasse Sphere
     IO.println();
     IO.println("Testaufrufe fuer Sphere");
     Sphere normSphere = new Sphere();
     IO.println("Die Kugel normSphere: " + normSphere);

     Sphere fball = new Sphere("bunt", -8, -15, 9, 5);
     IO.println("Die Kugel Fußball: " + fball);
     IO.println("Fußball hat das Volumen: " + fball.getVolumen());
     IO.println("Fußball hat die Flaeche: " + fball.getArea());

     fball.move(-1, -1, 1);
     fball.setRadius(11.5);
     IO.println("Die Kugel Fußball nach move und Vergroeßerung: " + fball);
     IO.println("Fußball hat das Volumen: " + fball.getVolumen());
     IO.println("Fußball hat die Flaeche: " + fball.getArea());
     
     IO.println("Abstand zwischen normSphere und Fußball: " +                            fball.getDistanceTo(normSphere));
     IO.println();

     // Testet die Classe Cube
     IO.println();
     IO.println("Testaufrufe fuer Cube");
     Cube c1 = new Cube();
     IO.println("Der Cube1: " + c1);
     
     c1.move(6, 7, 8);
     c1.setWidth(3);
     IO.println("Der Cube1 nach move und neuer Kantenlaenge: " + c1);

     Cube c2 = new Cube("Gruen", -4, -8, -16, 4);
     IO.println("Der Cube2: " + c2);
     IO.println("Der Cube2 hat das Volumen: " + c2.getVolume());
     IO.println("Der Cube2 hat die Flaeche: " + c2.getArea());

     IO.println("Der Cube1 und Cube2 haben den Abstand: " +                                     c2.getDistanceTo(c1));
     IO.println("Der Cube2 hat den Abstand zum 0 Punkt: " +                                      c2.getDistanceTo(new Shape()));




  }
}

