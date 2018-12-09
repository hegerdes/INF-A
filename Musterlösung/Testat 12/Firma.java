/******************************  Firma.java  **********************************/

import AlgoTools.IO;

/**
 * Eine Klasse, die eine Firma darstellt.
 */

public class Firma implements Comparable {

  /** Der Name der Firma */
  public String name;
  /** Der Jahresgewinn */
  public long jahresgewinn;
  // USt-ID mit separater Set-Methode zur Fehlerbehandlung
  private long ustid;

  /**
   * Erstellt eine neue Firma
   *
   * @param name
   *            der Name der Firma
   * @param jahresgewinn
   *            der Jahresgewinn
   * @param ustid
   *            die USt-ID
   */
  public Firma(String name, long jahresgewinn, long ustid) {

    this.name = name;
    this.jahresgewinn = jahresgewinn;

    setUstId(ustid);

  }

  /**
   * Liefert die Umsatzsteueridentifikationsnummer
   *
   * @return die Umsatzsteueridentifikationsnummer
   */
  public long getUstId() {
    return ustid;
  }

  /**
   * Setzt die Umsatzsteueridentifikationsnummer (>= 0)
   *
   * @param ustid
   *            Umsatzsteueridentifikationsnummer
   */
  public void setUstId(long ustid) {
    if (ustid < 0)
      throw new IllegalArgumentException("Ungueltige UStID.");

    this.ustid = ustid;
  }

  /**
   * @see {@link Comparable}
   */
  public int compareTo(Object x) {
    if(!(x instanceof Firma))
      throw new RuntimeException("Firma kann sich nur mit Firma vergleichen!");

    Firma other = (Firma)x;

    if(other.getUstId() == this.getUstId())
      return 0;
    else if(other.getUstId() > this.getUstId())
      return -1;
    else
      return 1;
  }

  /**
   * Liefert die auf (int) gecastete Umsatzsteueridentifikationsnummer
   */
  public int hashCode() {

    return (int) this.getUstId();

  }

  /**
   * Vergleicht zwei Objekte anhand ihrer Umsatzsteueridentifikationsnummer
   */
  public boolean equals(Object x) {

    if (!(x instanceof Firma)) {
      return false;
    } else if (this.getUstId() == ((Firma) x).getUstId()) {
      return true;
    } else {
      return false;
    }

  }

  /**
   * Liefert die Informationen über die Firma als String
   */
  public String toString() {

    return "Firma: " + name + ", UStID: " + getUstId() + ", Jahresgewinn: "
        + jahresgewinn;

  }

}
