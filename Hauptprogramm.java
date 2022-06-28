
/**
 * @Autor Fabian Tappendorf
 * Ein Programm für die eingabe der Routen.
 * (RouteTest.java)
 */

public class Hauptprogramm {

    public static void main(String[] args) {

        Route reise2 = new Route("Aachen","Berlin");
        Route reise3 = new Route();
/**
 * Pruefungsspalten
 */
        /*System.out.println("----------------------");
        reise.getKStadt1();
        reise.getKStadt2();
        System.out.println("----------------------");

        System.out.println(ort1);
        System.out.println(ort2);
        System.out.println(reise.getEntfaernung(ort1,ort2));
        System.out.println(reise.getKOrt1());

        System.out.println(reise.getKOrt2());

        int ort1 = reise.getKOrt1();
        int ort2 = reise.getKOrt2();
        System.out.println("----------------------");
        System.out.println("Die Entfernung zwischen " + reise.getKStadt1() +" und " +  reise.getKStadt2() + " betraegt " + reise.getEntfaernung(ort1,ort2) + " Kilometer !");
        System.out.println("----------------------");

         */
/**
 * Hauptprogramm zur Auswahl zwischen Zwischenlängen von zwei Staedten oder Eingabe eigener Listen.
 */
        reise3.programm();
/**
 * Eigene Tour erstellen und Zwischenlaengen und Gesammtlaenge Ausgeben.
 */
        reise3.routeDerRundReiseBerechnen(reise3.getRundreise());
    }
}
