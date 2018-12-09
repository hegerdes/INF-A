/******************************  Cube.java  ***********************************/

import AlgoTools.IO;

/**
 * @version 09.01.17
 *  
 * @author  hegerdes
 */

/**
 * Die Klasse Cube ist eine Erweitung zur Klasse Shape
 * Shape kann:
 * Ein neues Shape in einem 3-dim Raum anlegen
 * default: schwarz, in pos: 0,0,0
 * die Farbe kann bestimmt werden
 * Shape kann:
 * move - den Ursprung verschieben
 * getDistanceTo - Abstand zweier Shapes
 * getArea - Flaeche eines Shapes
 * getVolume - Voulumen eines Shapes
 * toString - das Shape ausgeben
 */

public class Cube extends Shape{


  /**
   * Laenge einer seite
   */
   private double width;
   
   /**
    * Erstellt einen standart Cube mit den standart Werten aus Shape
    */
   public Cube(){
     
     this.width = 1.0;
   }

   /**
    * Erstellt einen neuen Cube mit:
    * @param colour - Die Farbe des Cubes
    * @param x - Die x-Koordinate (rechte obere Ecke)
    * @param y - Die y-Koordinate (rechte obere Ecke)
    * @param z - Die z-Koordinate (rechte obere Ecke)
    * @param width - Die Kantenlaenge des Cubes
    * @throws RuntimeException - Wenn ein Wert unguelig ist
    */
   public Cube(String color, double x, double y, double z, double width){
     
     super(color, x, y, z);

     setWidth(width);
   }

   /**
    * Setzt die Kantenlaenge des Cubes
    * @param width - die Kantenlange
    * @throws RuntimeException - Wenn Kantenlaenge negativ ist
    */
    public void setWidth(double x){
      
      if(x < 0){
        throw new RuntimeException("Kantenlaenge darf nicht kleiner" +                     " als 0 sein");
      }
      this.width = x;
    }

    /**
     * Gibt die Kantenlaenge von Cube aus
     * @return Kantenlaenge des Cubes
     */
    public double getWidth(){
       
       return width;
    }

    /**
     * Gibt den Flaecheninhalt des Cubes aus
     * @return Flaecheninhalt vom Cube
     */
    public double getArea(){
        
      return (width * width * 6);
    }

    /**
     * Gibt das Volumen des Cubes aus
     * @return Volumen vom Cube
     */
    public double getVolume(){
      
      return (width * width * width);
    }

    /**
     * Gibt des Cube als String beschieben aus
     * @return String mit Beschreibung des Cubes
     */
    public String toString(){
      return (super.toString() + " | Kantenlaenge = " + width);
    }

    /**
     * Bestimmt den Abstand zwischen einen Cube und einem anderem Cube bzw den         Abstand zu einem anderen Shape
     * Fallunterscheidung zwischen:
     * Cube und Cube
     * Cube und Shape
     * Bei Cube und Cube wird der Mittelpunkt beider Cubes fuer die Abstands
     * Berechnung genutzt
     * Bei Cube und Shape wird der Abstand zwischen oberer rechter Ecke
     * also x, y, z, und Shape x, y z berechnet
     * @return Abstand zwischen zwei Objekten
     */
    public double getDistanceTO(Shape other){
      
      if (other instanceof Cube){
        double c1m = width / 2;
        Cube c2 = (Cube) other;
        double c2m = c2.width / 2;

        double tmp = Math.sqrt(((x - c1m) - (c2.x - c2m)) * ((x - c1m) -                       (c2.x - c2m)) + ((y - c1m) - (c2.y - c2m)) * ((y - c1m) -                       (c2.y - c2m)) + ((z - c1m) - (c2.z - c2m)) * ((z - c1m) -                       (c2.z - c2m)));
        return tmp;
      }
      
      return super.getDistanceTo(other);
    }


     
  public static void main(String[] argv) {

  }
}

