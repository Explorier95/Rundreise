import java.util.Scanner;

/**
 * &#064;Autor  Fabian Tappendorf
 * Programm zur ermittlung der Entfernung zwischen zwei Städten oder Punkten.
 */
public class Route {

    /**
     * Vordefinierte Stadt.
     */
    private final String[] stadt = {"Aachen", "Berlin", "Chemnitz", "Erfurt", "Dresden"};
    /**
     * Eigene Stadt durch eingabe.
     */
    private final String[] eigenStadt = new String[4];
    /**
     * Eigene Routen durch eingabe.
     */
    private final int[][] eigenEntfaernung = new int[4][4];

    /**
     * Vordefinierte Routen.
     */
    private final int[][] entfaernung = {

            {0, 640, 580, 440, 650},
            {640, 0, 280, 300, 220},
            {580, 280, 0, 152, 80},
            {440, 300, 152, 0, 215},
            {650, 220, 80, 215, 0}
    };
    /**
     * Scanner für die eingabe.
     */
    Scanner eingabe = new Scanner(System.in);

    private int kOrt1;
    private String kStadt1;
    private int kOrt2;
    private String kStadt2;

    /**
     * @param wert Ändert Variable KOrt1.
     */

    public void setKOrt1(int wert) {
        this.kOrt1 = wert;
    }

    /**
     * @param wert Ändert Variable KOrt2.
     */

    public void setKOrt2(int wert) {
        this.kOrt2 = wert;
    }

    /**
     * Default Konstruktor ohne Parameter
     */
    public Route(){

    }

    /**
     * Default Konstruktor 2.
     *
     * @param ort1 Anfangsort.
     * @param ort2 Destination.
     */
    public Route(String ort1, String ort2) {

        kStadt1 = ort1;
        kStadt2 = ort2;

        try {
            switch (ort1) {
                case "Aachen" -> kOrt1 = 0;
                case "Berlin" -> kOrt1 = 1;
                case "Chemnitz" -> kOrt1 = 2;
                case "Erfurt" -> kOrt1 = 3;
                case "Dresden" -> kOrt1 = 4;
                default -> kOrt1 = Integer.parseInt(null);
            }

            switch (ort2) {
                case "Aachen" -> kOrt2 = 0;
                case "Berlin" -> kOrt2 = 1;
                case "Chemnitz" -> kOrt2 = 2;
                case "Erfurt" -> kOrt2 = 3;
                case "Dresden" -> kOrt2 = 4;
                default -> kOrt2 = Integer.parseInt(null);
            }
        } catch (Exception e) {
            System.out.println("Es wurde ein falscher Ort eingegeben");
        }
    }

    /**
     * Defaultkonstruktor 3
     * @param ort1  Erster selbst angegebener Ort.
     * @param l1    Länge Ort1 zu Ort2.
     * @param l2    Länge Ort1 zu Ort3.
     * @param l3    Länge Ort1 zu Ort4.
     * @param ort2  Zweiter selbst angegebener Ort.
     * @param l11   Länge Ort2 zu Ort1.
     * @param l22   Länge Ort2 zu Ort3.
     * @param l33   Länge Ort2 zu Ort4.
     * @param ort3  Dritter selbst angegebener Ort.
     * @param l111  Länge Ort3 zu Ort1.
     * @param l222  Länge Ort3 zu Ort2.
     * @param l333  Länge Ort3 zu Ort4.
     * @param ort4  Vierter selbst angegebener Ort.
     * @param l1111 Länge Ort4 zu Ort1.
     * @param l2222 Länge Ort4 zu Ort2.
     * @param l3333 Länge Ort4 zu Ort3.
     */

    public Route(String ort1, int l1, int l2, int l3, String ort2, int l11, int l22, int l33, String ort3, int l111, int l222, int l333, String ort4, int l1111, int l2222, int l3333) {

        eigenStadt[0] = ort1;
        eigenStadt[1] = ort2;
        eigenStadt[2] = ort3;
        eigenStadt[3] = ort4;

        int[] zwischenspeicher1 = {0, l1, l2, l3};
        int[] zwischenspeicher2 = {l11, 0, l22, l33};
        int[] zwischenspeicher3 = {l111, l222, 0, l333};
        int[] zwischenspeicher4 = {l1111, l2222, l3333, 0};

        eigenEntfaernung[0] = zwischenspeicher1;
        eigenEntfaernung[1] = zwischenspeicher2;
        eigenEntfaernung[2] = zwischenspeicher3;
        eigenEntfaernung[3] = zwischenspeicher4;


    }

    /**
     * Getter Stadt 1.
     */
    public String getKStadt1() {
        return kStadt1;
    }
    /**
     * Getter Stadt 2.
     */
    public String getKStadt2() {
        return kStadt2;
    }
    /**
     * Gebe den ersten Ort wieder.
     */
    public int getKOrt1() {
        return kOrt1;
    }
    /**
     * Gebe den zweiten Ort wieder.
     */
    public int getKOrt2() {
        return kOrt2;
    }
    /**
     * Gibt alle Staedte wieder die selber eingegeben wurden.
     */
    public void getAlleStadt() {
        for (int i = 0; i < eigenStadt.length; i++) {
            System.out.println(eigenStadt[i] + "");
        }
    }
    /**
     * Gibt alle Routen wieder
     */
    public void getEigeneentfernung() {
        for (int i = 0; i < eigenEntfaernung.length; i++) {
            for (int j = 0; j < eigenStadt.length; j++) {
                System.out.println(eigenEntfaernung[i][j] + "");
            }
        }
    }

    public String[] getRundreise() {

        String[] listederRundReise = new String[5];

        System.out.println("Bitte gebe deinen Ausgangspunkt an: ");
        listederRundReise[0] = eingabe.next();
        System.out.println("Wohin soll es gehen? ");
        listederRundReise[1] = eingabe.next();
        System.out.println("Wohin soll es dann gehen? ");
        listederRundReise[2] = eingabe.next();
        System.out.println("Wohin soll es dann gehen? ");
        listederRundReise[3] = eingabe.next();
        System.out.println("Wohin soll es dann gehen? ");
        listederRundReise[4] = eingabe.next();
        System.out.println("Danke jetzt ist Schluss ...");

        return listederRundReise;
    }

    public void routeDerRundReiseBerechnen(String[] reise){

        try{
            System.out.println("1. Von " + reise[0] + " nach " + reise[1] + " " + entfaernung[0][1] + " Km");
            System.out.println("2. Von " + reise[1] + " nach " + reise[2] + " " + entfaernung[1][2] + " Km");
            System.out.println("3. Von " + reise[2] + " nach " + reise[3] + " " + entfaernung[2][3] + " Km");
            System.out.println("4. Von " + reise[3] + " nach " + reise[4] + " " + entfaernung[3][4] + " Km");
            System.out.println("5. Von " + reise[4] + " nach " + reise[0] + " " + entfaernung[4][0] + " Km");
            int gesammtlaenge = entfaernung[0][1] + entfaernung[1][2] + entfaernung[2][3] + entfaernung[3][4] + entfaernung[4][0];
            System.out.println("Gesammtlaenger der Tour: " + gesammtlaenge + " Km");

        }catch(IllegalArgumentException e){
            System.out.println("Die Stadt ist nicht in der Liste vorhanden!");
        }
    }

    /**
     * Funktion zur Erfassung der Matrix ohne den Konstruktor.
     *
     * @param o  x Wert.
     * @param o2 y Wert.
     * @return Gibt die Werte der Matrix wieder.
     */
    public int getEntfaernung(int o, int o2) {

        return entfaernung[o][o2];

    }
    /**
     * Methode für die Eingabe und Ausgabe in Programm().
     */
    private void eingabeStadt() {

        System.out.println("Erste Stadt: ");
        String eins = eingabe.next();
        System.out.println("Zweite Stadt: ");
        String zwei = eingabe.next();
        System.out.println("Dritte Stadt: ");
        String drei = eingabe.next();
        System.out.println("Vierte Stadt: ");
        String vier = eingabe.next();

        System.out.println("Entfernung von " + eins + " zu " + zwei + ":");
        int l1 = eingabe.nextInt();
        System.out.println("Entfernung von " + eins + " zu " + drei + ":");
        int l2 = eingabe.nextInt();
        System.out.println("Entfernung von " + eins + " zu " + vier + ":");
        int l3 = eingabe.nextInt();
        System.out.println("Entfernung von " + zwei + " zu " + eins + ":");
        int l11 = eingabe.nextInt();
        System.out.println("Entfernung von " + zwei + " zu " + drei + ":");
        int l22 = eingabe.nextInt();
        System.out.println("Entfernung von " + zwei + " zu " + vier + ":");
        int l33 = eingabe.nextInt();
        System.out.println("Entfernung von " + drei + " zu " + eins + ":");
        int l111 = eingabe.nextInt();
        System.out.println("Entfernung von " + drei + " zu " + zwei + ":");
        int l222 = eingabe.nextInt();
        System.out.println("Entfernung von " + drei + " zu " + vier + ":");
        int l333 = eingabe.nextInt();
        System.out.println("Entfernung von " + vier + " zu " + eins + ":");
        int l1111 = eingabe.nextInt();
        System.out.println("Entfernung von " + vier + " zu " + zwei + ":");
        int l2222 = eingabe.nextInt();
        System.out.println("Entfernung von " + vier + " zu " + drei + ":");
        int l3333 = eingabe.nextInt();

        System.out.println("Erstelle eine neue Route . . .");
        Route eigeneRoute = new Route(eins, l1, l2, l3, zwei, l11, l22, l33, drei, l111, l222, l333, vier, l1111, l2222, l3333);
        System.out.println("-----------------------------------");
        System.out.println("Gebe alle eigenen Staedte aus: ");
        System.out.println("-----------------------------------");
        eigeneRoute.getAlleStadt();
        System.out.println("-----------------------------------");
        System.out.println("Gebe alle eigenen Entfernungen aus: ");
        System.out.println("-----------------------------------");
        eigeneRoute.getEigeneentfernung();
        System.out.println("-----------------------------------");
    }


    /**
     * Whileschleife für die Eingabe.
     * Wird solange ausgeführt bis kein Fehler mehr kommt.
     */

    public void programm(){
        boolean ok = false;
        while(!ok){

            try {
                System.out.println("---------------------------------------");
                System.out.println("Bitte gebe Ausgangsort oder Auswahl an:");
                System.out.println("0 - fuer Aachen");
                System.out.println("1 - fuer Berlin");
                System.out.println("2 - fuer Chemnitz");
                System.out.println("3 - fuer Erfurt");
                System.out.println("4 - fuer Dresden");
                System.out.println("5 - fuer Eigene Route (Leange 4x4)");
                System.out.println("---------------------------------------");
                System.out.println("Auswahl: ");

                int s1 = eingabe.nextInt();
                String stadt1 = null;
                switch (s1) {
                    case 0:
                        stadt1 = "Aachen";
                        break;
                    case 1:
                        stadt1 = "Berlin";
                        break;
                    case 2:
                        stadt1 = "Chemnitz";
                        break;
                    case 3:
                        stadt1 = "Erfurt";
                        break;
                    case 4:
                        stadt1 = "Dresden";
                        break;
                    case 5:
                        eingabeStadt();
                        ok = true;
                        break;

                }


                if (ok == false) {
                    System.out.println("------------------------------------");
                    System.out.println("Bitte gebe Destination an");
                    System.out.println("0 - fuer Aachen");
                    System.out.println("1 - fuer Berlin");
                    System.out.println("2 - fuer Chemnitz");
                    System.out.println("3 - fuer Erfurt");
                    System.out.println("4 - fuer Dresden");
                    System.out.println("Welche Route soll berechnet werden?");
                    System.out.println("-------------------------------------");
                    System.out.println("Destination: ");
                    int s2 = eingabe.nextInt();

                    String stadt2 = switch (s2) {
                        case 0 -> "Aachen";
                        case 1 -> "Berlin";
                        case 2 -> "Chemnitz";
                        case 3 -> "Erfurt";
                        case 4 -> "Dresden";
                        default -> throw new IllegalStateException("Unexpected value: " + s2);
                    };

                    System.out.println("Die Entfernung zwischen " + stadt1 + " und " + stadt2 + " betraegt " + getEntfaernung(s1, s2) + " Kilometer !");
                    ok = true;
                }}catch(Exception e) {
                System.out.println("Falsche einfabe bitte wiederholen!");
                }
        }
    }

}
