/******************************  Sphere.java  *********************************/

import AlgoTools.IO;

/**
 * @version 08.01.17
 *  
 * @author  hegerdes
 * @author  hlauts
 */

/**
 * Diese Klasse bat auf den 3-Dim Raum der Klasse Shape auf
 * Die Klasse Shape beinhaltet:
 * Farbe einer Figur (Ohne Angabe ist dies schwarz)
 * Die Position (Ohne Angaben ist dies 0, 0, 0)
 * Die Klasse kann:
 * Flaeche
 * Volumen
 * Distanz zuwschen 2 Shapes
 * Shape verschieben
 */

public class Sphere extends Shape{
  
  //Radius der Kugel
  private double radius;  
  

  /**
   * Standart Kugel mit Radius 1 und den Standat Werten aus Shape
   * Farbe Schwarz, Koordinaten = 0, 0, 0
   */
  public Sphere(){
    
    this.radius = 1.0;
  }
  
  /**
   * Erzeigt eine neue Sphere mit den Werten die an den Konstruktor 
   * uebergeben werden
   * Dabei wird fuer Colour, x, y, z Der Konstruktor von Shape genutzt
   * @param color Die Farbe der Sphere
   * @param x - Die x-Koordinate der Sphere
   * @param y - Die y-Koordinate der Sphere
   * @param z - Die z-Koordinate der Sphere
   * Die Koordinaten beschreiben die Mitte der Sphere
   * @param radius
   */
  public Sphere (String color, double x, double y, double z, double radius){

    super(color, x, y, z);
    
    setRadius(radius);
  }

  /**
   * Setzt den Radius der Sphere
   * @param radius - der Radius der Sphere
   * @throws RuntimeException Wenn Radius kleiner ist als 0
   */

  public void setRadius(double radius){
    if(radius < 0){
      throw new RuntimeException("Keinen negativen Radius eingeben");
    }
    this.radius = radius;
  }

  /**
   * Gibt den Radius eines Sphere aus
   * @return Radius vom Sphere
   */
  public double getRadius(){
    return radius;
  }
  
  /**
   * Berechnet den Abstand zwischen einer Sphere und einer anderen Sphere bzw
   * zu einem anderem Shape
   * @return Abstand der beiden Objekte
   */
  public double getDistanceTo (Shape other){

    if(other instanceof Sphere){                  // Wenn beides Sphere ist
      Sphere s2 = (Sphere) other;
      
      return super.getDistanceTo(other) - radius - s2.radius;
    }

    
    return super.getDistanceTo(other);            
  }
  
  /**
   * Berechnet das Volumen einer Sphere
   * @return Das Volumen einer Sphere
   */

  public double getVolumen(){
    
    double themp = ((4/3) * Math.PI * radius * radius * radius);
    return themp;
  }

  /**
   * Berechnet die Oberflaeche eines Shapes
   * @return Flaeche des Shapes
   */
  public double getArea(){
    
    return (4 * Math.PI * radius * radius);
  }
  
  /**
   * Beschreibt das Shape als String und gibt diesen aus
   * @return String mit Beschrebung von Shape und zusaetzlichem Radius
   */
  public String toString(){
    
    return super.toString() + " ; Radius = " + radius;
  }
  public static void main(String[] argv) {
     
  
  }
}

