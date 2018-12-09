/******************************  Shape.java  **********************************/

import AlgoTools.IO;

/**
 * @version 04.01.17
 *  
 * @author  hegerdes
 * @author  hlauts
 */

/**
 * Die Implimentierung der Klasse Shape
 * Shape stellt veranschaulicht einen Punkt in einem 3-dim Raum
 * Dieser wird durch coulor und x, y, z beschieben
 * Dieser Punkt kann verscoben werden
 * Volumen kann berechnet werden
 * Flaeche kann berechnet werde
 * Distanz zu einem anderen Punkt
 * Das Shape kann als String beschieben ausgegeben werden
 * @param colour - Die Farbe des Shapes
 * @param x - Die x-Koordinate
 * @param y - Die y-Koordinate
 * @param z - Die z-Koordinate
 */
public class Shape {

  public String colour;

  public double x;

  public double y;

  public double z;
  
  /**
   * Erzeugt eine Instanz mit defaul Werten
   * Wird erzeugt wenn keine Parameter uebergeben werden
   */
  public Shape(){
    
    this("schwarz", 0.0, 0.0, 0.0);
  }
  /**
   * Erzeugt die Instanz eines Shapes mit vorgegebenen Parametern
   * @param colour - Die Farbe des Shapes
   * @param x - Die x-Koordinate
   * @param y - Die y-Koordinate
   * @param z - Die z-Koordinate
   */
  public Shape(String colour, double x, double y, double z){
    
    this.colour = colour;
    this.x = x;
    this.y = y;
    this.z = z;
  }
  /**
   * Verschiebt das Shape um die uebergebenen Werte
   * @param dX - Die Verschiebung auf der x-Achse
   * @param dY - Die Verschiebung auf der y-Achse
   * @param dZ - Die Verschiebung auf der z-Achse
   */
  public void move(double dX, double dY, double dZ){

    x = x + dX;
    y = y + dY;
    z = z + dZ;
  }
  /**
   * Berechnet das Volumen vom Shape
   * @return Ein Shape hat kein Volumen, daher 0
   */
  public double getVolume(){
    
    return 0.0;
  }
  /**
   * Berechnet die Flaeche vom Shape
   * @return Ein Shape hat keine Flaeche, daher 0
   */
  public double getArea(){
    
    return 0.0;
  }
  /**
   * Berechnet den Abstand zwischen einem Shape und einem anderem Shape
   * @return Abstand zwischen Shape und Shape other
   */
  public double getDistanceTo(Shape other){

    double tmp = 0;

    tmp = ((x - other.x) * (x - other.x) + (y - other.y) * (y - other.y) +             (z - other.z) * (z - other.z));

//    return wurzel(tmp);
    return Math.sqrt(tmp);
  }
  /** 
   * Berechnet die Ganzzahlige Quadratwurzel von wz
   * @return Wurzel von wz
   */
  private static double wurzel (double wz){
    double t = 1, z = 0;

    while(wz > 0){
      wz -= t;
      t += 2;
      z++;
    }
    return z;
  }
  /**
   * Gibt Shape beschieben als String aus
   * @return String mit Farbe und Koordinaten von Shape
   */
  public String toString(){
    
    return "Farbe = " + colour + " | Position = " + x + ", " + y + ", " + z;
  }


  public static void main(String[] argv) {
     
     
  }
}
 
