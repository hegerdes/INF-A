/***************************  VerweisSchlange.java  ***************************/

/**
 * Implementiert den Abstrakten Datentyp Schlange mit Hilfe von Verweisen
 * und die darauf definierten Operationen: empty, enq, deq, front
 */
public class VerweisSchlange implements Schlange
{

  /**
   * Verweis auf den Schlangenanfang.
   */
  private Eintrag head;

  /**
   * Verweis auf das Schlangenende.
   */
  private Eintrag tail;

  /**
   * Erzeugt eine leere VerweisSchlange.
   */
  public VerweisSchlange()
  {
    head = tail = null;
  }

  /**
   * Testet, ob die VerweisSchlange leer ist.
   *
   * @return true, falls die Schlage leer ist, sonst false.
   */
  public boolean empty()
  {
    return head == null;
  }

  /**
   * Fuegt eine Element in die Schlange ein.
   *
   * @param x Objekt, welches eingefuegt werden soll.
   */
  public void enq(Object x)
  {

    if (empty())
      tail = head = new Eintrag();
    else
    {
      tail.next = new Eintrag();           // Neuen anhaengen
      tail = tail.next;                    // Schlangenende 1 weitersetzen
    }
    tail.inhalt = x;                       // x zuweisen
    tail.next = null;                      // Schlangenende
  }

  /**
   * Entfernt das vorderste Schlangenelement.
   *
   * @throws RuntimeException
   *           Wird geworfen, falls die Schlange leer ist.
   */
  public void deq()
  {
    if (empty())                           // Falls Schlange leer, dann Abbruch
      throw new RuntimeException("deq: Schlange ist leer");

    head = head.next;                      // Naechtster Eintrag wird aktuell

    if (head == null)                      // wenn Kopf auf kein Objekt verweist
      tail = null;                         // Schlangenende setzen
  }

  /**
   * Liefert das vorderste Element der Schlange.
   *
   * @return Das vorderste Schlangenelement.
   * @throws RuntimeException
   *           Wird geworfen, falls die Schlange leer ist.
   */
  public Object front()
  {
    if (empty())                           // Falls Schlange leer, dann Abbruch
      throw new RuntimeException("front: Schlange ist leer");

    return head.inhalt;
  }
}
