/***************************  VerweisKeller.java ******************************/

/** Implementation eines Kellers mithilfe von Verweisen
 */

public class VerweisKeller implements Keller {

  private Eintrag top;                           // verweist auf obersten
                                                 // KellerEintrag

  public VerweisKeller() {                       // legt leeren Keller an    	
    top = null;
  }

  public boolean empty() {                       // liefert true,
    return top == null;                          // falls Keller leer
  }

  public void push(Object x) {                   // legt Objekt x    
    Eintrag hilf = new Eintrag();                // auf den Keller
    hilf.inhalt = x;
    hilf.next   = top;
    top         = hilf;
  }

  public Object top() {                          // liefert Top-Element 
    if (empty()) throw new 
      RuntimeException(" Keller ist leer ");
    return top.inhalt;                            
  }

  public void pop() {                            // entfernt Top-Element
    if (empty()) throw new 
      RuntimeException(" Keller ist leer ");
    top = top.next;
  }
}
