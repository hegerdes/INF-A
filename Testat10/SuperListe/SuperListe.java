/******************************  SuperListe.java  *****************************/

import AlgoTools.IO;

/**
 * Diese Klasse erweitert die Klasse VerweisListe und kann all ihre Methordne
 * VerweisListe kann:
 * empty() - angeben ob die Liste leer ist
 * endpos() - angeben ob man sich am Ende der Liste befindet
 * reset() - das erste Element wird zum ersten Element
 * advance() - das naechste Element wird zum aktuellem
 * elem() - gibt das aktuelle Element aus
 * insert(Object x) - Fuegt ein neues Object x an die aktuelle Stelle ein
 * delete() - loescht das aktuelle Element - nachstest Element wird aktuell
 *
 *
 * @version 15.01.17
 *  
 * @author  hegerdes
 * @author  hlauts
 */

public class SuperListe extends VerweisListe implements Liste{

  private Keller tmpkeller;
  private Schlange tmpschlange;
  
  /**
   * Erzeugt eine neue Liste indem der Konstruktor der oberklasse genutzt
   * wird
   */
  public SuperListe(){
     
    super();
  }
  
  /**
   * Dreht die Reihnfolge der Schlange um
   * Das letzte Element ist nun das erste
   * @param tmpschlange - speichert die Elemente in einer neu erstellten 
   * schlange zwischen
   * @throws Exception - Wenn Liste leer ist
   */
  public void umdrehen(){

    if(empty()){
      throw new RuntimeException("Liste ist lerr! Kann nicht geflipt werden");
    }

    tmpschlange = new VerweisSchlange(); 
    reset();       // setzt Liste auf Anfang

    while(!this.empty()){
      // loescht alles aus Liste und packt in in Schlange
      tmpschlange.enq(this.elem());
      this.delete();
    }

    reset();
    while(!tmpschlange.empty()){
      // loescht alles aus Schlange und packt in in Liste
      // in umgekehrter Reihnfolge
      this.insert(tmpschlange.front());
      tmpschlange.deq();
    }
    reset();
/**
 * Versuch das Umpacken mit Keller zu loesen
 * Versuch das flippen mit einem Keller zu loesen:

    tmpkeller = new VerweisKeller();
    reset();
    while(!empty()){
      tmpkeller.push(elem());
      delete();
    }
    if(empty()){
      IO.println("Liste ist leer");
      reset();
    }
    while(!tmpkeller.empty()){
      IO.println("Keller ist: " + tmpkeller.top());
      this.insert(tmpkeller.top());
      tmpkeller.pop();
    }
    while(!this.endpos()) {
      IO.println(this.elem());
      this.advance();
    }
 */  
  }
  
  /**
   * Sucht in der Liste nach Dublicaten und loescht diese
   * @param neu - themp Schlange um die Elemente zwischenzuspeichern
   * @throws Exception - Wenn Liste leer ist
   */
  public void unique(){

    if(empty()){
      throw new RuntimeException("Liste ist lerr! Kann nicht geflipt werden");
    }

    Object themp;
    Schlange neu = new VerweisSchlange();

    this.reset();
    while(!this.endpos()){
      // legt nur die nichtdublicate in Schlange
      themp = this.elem();
   //   IO.println(this.elem());
      this.advance();
      if(!this.endpos()){
        if(!themp.equals(elem())){
          neu.enq(themp);
        }
      }
    }
    reset();
    while(!this.empty()){
      // leer die Liste
      this.delete();
    }
    while(!neu.empty()){
      // legt von Schlange alles wieder in Liste
      this.insert(neu.front());
      neu.deq();
    }
    // Liste wird umgedreht, da sie dank Schlange falsche Reihnfolge hat
    umdrehen();

/*      while(!dublikat && !this.endpos()){
        if(themp.equals(this.elem())){
          dublikat = true;
          this.delete();
        }
        this.advance();
      }
      dublikat = false;
*/  
/*    while (!this.endpos()) {
      IO.println(this.elem());
      this.advance();
    }
*/  }
  
  /**
   * Gibt das n-te Element der Liste aus
   * @param n - Das Element an der Stlle n
   * @return - Das Element das sich an der n-ten Stelle befindet
   * @throws Exception - Wenn n kleiner als 1 ist 
   * @throws Exception - Wenn n groeßer ist als die Liste lang ist
   */
   public Object elem(int n){
    
    this.reset();
    if(n < 1){
      throw new RuntimeException("Es gibt kein negatives Element");
    }
    for(int l = 1; l>n; l++){
      if(endpos()){
        throw new RuntimeException("So viele Elemente gibt es nicht");
      }
      this.advance();
    }
    return this.elem();
  }



  public static void main(String[] argv) {
     

  }
}

