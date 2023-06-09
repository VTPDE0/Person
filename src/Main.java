import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*Hier erzeugen wir neue Liste die heißt "fahrzeugListe". Liste ist neue Objekt von Klasse Fahrzeugvermietung

        Fahrzeugvermietung (großgeschrieben) ist eine Klasse, davon wird ein Objekt fahrzeuge (kleingeschrieben) erzeugt. Objekt übernimmt Eingenschaften von Klasse Fahrzeugvermietung.
        */
        Fahrzeugvermietung fahrzeuge = new Fahrzeugvermietung();

        /*
       Hier erzeugen wir 5 Fahrzeuge
        Fahrzeug fahrzeug1 = new Fahrzeug("randomMarke1", "randomModell1", "randomFarbe1", "randomKennzeichen1");
        Fahrzeug fahrzeug2 = new Fahrzeug("randomMarke2", "randomModell2", "randomFarbe2", "randomKennzeichen2");
        Fahrzeug fahrzeug3 = new Fahrzeug("randomMarke3", "randomModell3", "randomFarbe3", "randomKennzeichen3");
        Fahrzeug fahrzeug4 = new Fahrzeug("randomMarke4", "randomModell4", "randomFarbe4", "randomKennzeichen4");
        Fahrzeug fahrzeug5 = new Fahrzeug("randomMarke5", "randomModell5", "randomFarbe5", "randomKennzeichen5");

       Fahrzeug (großgeschrieben) ist eine Klasse, davon wird ein Objekt fahrzeug1 (kleingeschrieben) erzeugt. Objekt übernimmt Eigenschaften von Konstruktor 1
       Fahrzeug (großgeschrieben) ist eine Klasse, davon wird ein Objekt fahrzeug2 (kleingeschrieben) erzeugt. Objekt übernimmt Eigenschaften von Konstruktor 2 (Fahrzeug mit Parameter "Marke" der war zu ABS unbenannt und hat ein Wert "BMW")
       in die Klammern sind die Werte für die Parameters die haben wir für dementsprechenden Konstruktoren eingelegt in Klasse "Fahrzeug"

        */

        //Hier erzeugen wir 5 Autos
        Auto auto1 = new Auto("VW", "Golf", "blau", "B-AB 1234", 17, 4, true);
        Auto auto2 = new Auto("BMW", "3er", "schwarz", "F-XY 789", 18, 5, false);
        Auto auto3 = new Auto("Audi", "A4", "rot", "M-CD 456", 16, 4, false);
        Auto auto4 = new Auto("Ford", "Fiesta", "grün", "K-LM 321", 17, 3, true);
        Auto auto5 = new Auto("Mercedes-Benz", "C-Klasse", "silber", "S-NZ 246", 15, 4, true);

        //Hier erzeugen wir 3 Motorräder
        Motorrad motorrad1 = new Motorrad("Honda", "CBR600", "rot", "K-KA 5678", 600, 250.0, 15.0);
        Motorrad motorrad2 = new Motorrad("Kawasaki", "Ninja 300", "schwarz", "rKennzeichen2mrtd", 610, 240.50, 17.5);
        Motorrad motorrad3 = new Motorrad("Yamaha", "YZF-R1", "blau", "W-WW 9876", 590, 275.80, 13.0);
        Motorrad motorrad4 = new Motorrad("Honda", "CBR1000RR", "rot", "H-HH 1234", 1000, 289.00, 15.5);
        Motorrad motorrad6 = new Motorrad("BMW", "S1000RR", "schwarz", "B-BB 9012", 999, 290.00, 13.8);

        //Hier erzeugen wir 7 Personen
        Person person1 = new Person("Max", "Mustermann", 18);
        Person person2 = new Person("Emma", "Müller", 12);
        Person person3 = new Person("Ben", "Schmidt", 22);
        Person person4 = new Person("Mia", "Schneider", 34);
        Person person5 = new Person("Hannah", "Meyer", 13);
        Person person6 = new Person("Lukas", "Fischer", 45);
        Person person7 = new Person("Moritz", "Webber", 28);

        /*
        //Ausgabe funktioniert gut, nur nimmt viel Platz in Konsole
        System.out.println("Auto1: " + auto1.getMarke()); //Fahrzeug1:
        System.out.println("Auto1: " + auto1.getKennzeichen()); //Fahrzeug1:

        System.out.println("Motorrad2: " + auto2.getMarke()); //Fahrzeug2:
        System.out.println("Motorrad2: " + auto2.getKennzeichen()); //Fahrzeug2:

        System.out.println("Auto3: " + auto3.getMarke()); //Fahrzeug3:
        System.out.println("Auto3: " + auto3.getModell()); //Fahrzeug3:
        System.out.println("Auto3: " + auto3.getFarbe());
        System.out.println("Auto3: " + auto3.getKennzeichen());
        */

        /*
        Hier fügen wir die Autos und Motorräder zur Liste "fahrzeuge" hinzu
        eigentlich spielt es keine Role mehr, war für 3.2 implementiert
         */

        fahrzeuge.addFahrzeuge(auto1);
        fahrzeuge.addFahrzeuge(auto2);
        fahrzeuge.addFahrzeuge(auto3);
        fahrzeuge.addFahrzeuge(auto4);
        fahrzeuge.addFahrzeuge(auto4);
        fahrzeuge.addFahrzeuge(auto5);
        fahrzeuge.addFahrzeuge(motorrad1);
        fahrzeuge.addFahrzeuge(motorrad2);
        fahrzeuge.addFahrzeuge(motorrad3);


        /*Warum das ding funktioniert nicht?
        for (Fahrzeug fahrzeug : fahrzeuge) {
            System.out.println(fahrzeug);
   kann ich überhaupt so eine Fahrzeug aufrufen?
             }*/

        /*
        Hier werden die Reservierungen erstellt und dank Methoden "darfFahren" und "checkReservierung" von Klasse Fahrzeugvermietung geprüft
        und als Kommentare wird erwartete und gewünschte Verhalten beschrieben
        */

        fahrzeuge.addReservierung(person5, auto3);
        //darfFahren - falsch
        //Reservierung wird nicht erstellt    (Person zu jung)                  Hannah Meyer 13 Jahre alt ist (zu jung);           VW Golf noch nicht reserviert (Fahrzeug ist verfügbar)

        fahrzeuge.addReservierung(person1, auto1);
        //addReservierung - true
        //Reservierung ist erstellt.          (alles in Ordnung)                Max Mustermann 18 Jahre alt ist (alt genug);       VW Golf noch nicht reserviert (Fahrzeug ist verfügbar)

        fahrzeuge.addReservierung(person1, auto4);
        //hatPersonBereitsReserviert - true
        //Reservierung wird nicht erstellt    (Person hat schon Reservierung)   Max Mustermann 18 Jahre alt ist (alt genug);       Ford Fiesta ist verfügbar (Fahrzeug noch nicht reserviert)

        /*
        - Erwartetes Verhalten
            - wenn eine Person eine zweite Reservierung erstellt, soll eine Fehlermeldung erscheinen und keine Reservierung erzeugt werden
        - Beobachtetes Verhalten
            - eine Person kann mehr als eine Reservierung erstellen. Eine Fehlermeldung wird nicht angezeigt.
                - wird eine Reservierung beim ersten Versuch erstellt?
                - werden alle Prüfungen richtig ausgeführt?
         %%% Erledigt? %%%
         */

        fahrzeuge.addReservierung(person4, auto1);
        //istFahrzeugReserviert - true
        //Reservierung wird nicht erstellt    (Auto ist schon reserviert)       Mia Schneider 34 Jahre alt ist (alt genug);        Ford Fiesta ist nicht verfügbar (Fahrzeug ist schon reserviert)

        fahrzeuge.addReservierung(person7, motorrad1);
        //addReservierung - true
        //Reservierung ist erstellt.           (alles in Ordnung)               Moritz Webber 28 Jahre alt ist (alt genug);        Honda CBR600 noch nicht reserviert (Fahrzeug ist verfügbar)

         /*
        - Erwartetes Verhalten
            - wenn ein Auto wird zweites Mal reservieren, soll eine Fehlermeldung erscheinen und keine Reservierung erzeugt werden
        - Beobachtetes Verhalten
            - ein Auto kann mehr als einmal reserviert werden. Eine Fehlermeldung wird nicht angezeigt.
                - wird eine Reservierung beim ersten Versuch erstellt?
                - werden alle Prüfungen richtig ausgeführt?
         */

        /*_____________________________________________________________________________________
        // Erstellung eines Objekts der Klasse Person
        Person person1 = new Person();

        // Set-Methoden für die Person-Eingenschaften
        person1.setVorname("Max");
        person1.setNachname("Mustermann");
        person1.setAlter(25);

        Person person2 = new Person();
        person2.setVorname("Emma");
        person2.setNachname("Müller");
        person2.setAlter(22);

        Person person3 = new Person();
        person3.setVorname("Ben");
        person3.setNachname("Schmidt");
        person3.setAlter(34);

        Person person4 = new Person();
        person4.setVorname("Mia");
        person4.setNachname("Schneider");
        person4.setAlter(56);

        Person person5 = new Person();
        person5.setVorname("Hannah");
        person5.setNachname("Meyer");
        person5.setAlter(28);

        Person person6 = new Person();
        person6.setVorname("Lukas");
        person6.setNachname("Fischer");
        person6.setAlter(17);

        // Get-Methoden für die Person-Eingenschaften
        System.out.println();
        System.out.println("_____Person:_____");
        System.out.println("Vorname: " + person1.getVorname()); //  public String getVorname()
        System.out.println("Nachname: " + person1.getNachname());
        System.out.println("Alter: " + person1.getAlter());

        // Erstellung einer Klasse "Fahrzeug"
        Auto auto1 = new Auto();

        // Set-Methoden für die Fahrzeug-Eingenschaften
        //Die Get-Methoden folgen dann unten
        auto1.setMarke("VW");
        auto1.setModell("Golf");
        auto1.setFarbe("Blau");
        auto1.setKennzeichen("B-AB 1234");
        auto1.setFelgenDurchmesser(16.0);
        auto1.setAnzahlTueren(5);
        auto1.setAutomatikGetriebe(true);

        // Erstellung Klasse Fahrzeug
        Motorrad motorrad = new Motorrad();

        // Set-Methoden für die Motorrad-Eingenschaften
        //Die Get-Methoden folgen dann unten
        motorrad.setMarke("Honda");
        motorrad.setModell("CBR600");
        motorrad.setFarbe("Rot");
        motorrad.setKennzeichen("K-KA 5678");
        motorrad.setCcm(600);
        motorrad.setvMax(250.0);
        motorrad.setTankinhalt(15.0);

        // Get-Methoden für die Auto-Eingenschaften
        System.out.println();
        System.out.println("_____Auto:_____");
        System.out.println("Marke: " + auto1.getMarke());
        System.out.println("Modell: " + auto1.getModell());
        System.out.println("Farbe: " + auto1.getFarbe());
        System.out.println("Kennzeichen: " + auto1.getKennzeichen());
        System.out.println("Felgendurchmesser: " + auto1.getFelgenDurchmesser());
        System.out.println("Anzahl Türen: " + auto1.getAnzahlTueren());
        System.out.println("Automatikgetriebe: " + auto1.isAutomatikGetriebe());

        // Get-Methoden für die Motorrad-Eingenschaften
        System.out.println();
        System.out.println("_____Motorrad:_____");
        System.out.println("Marke: " + motorrad.getMarke());
        System.out.println("Modell: " + motorrad.getModell());
        System.out.println("Farbe: " + motorrad.getFarbe());
        System.out.println("Kennzeichen: " + motorrad.getKennzeichen());
        System.out.println("ccm: " + motorrad.getCcm());
        System.out.println("vMax: " + motorrad.getvMax());
        System.out.println("Tankinhalt: " + motorrad.getTankinhalt());

        /* Eine Person und ein Fahrzeug erstellen
        Person person1 = new Person();
        person1.setVorname("Max");
        person1.setNachname("Mustermann");
        habe oben das Gleiche gemacht Z11*/

        /*
        Hier geben wir die Liste von gespeicherte Reservierungen in der Konsole aus und damit prüfen,
        dass unsere Methoden "hatPersonBereitsReserviert" und "darfFahren" funktionieren und nur entsprechende Reservierungen sind gespeichert

        List ist Liste; <Klasse Reservierung>; "reservierungen"- ist die name von Liste; mit "=" zuweisen wir den Wert für "reservierungen";
        fahrzeuge.getReservierung- ist die Methode von Klasse Fahrzeugvermietung
        */

        List<Reservierung> reservierungen = fahrzeuge.getReservierung();
        for (Reservierung reservierung : reservierungen) {
            System.out.println("Gespeicherte Reservierung" + ":");
            System.out.println("Person: " + reservierung.getPerson().getNachname() + " " + reservierung.getPerson().getVorname());
            System.out.println("Fahrzeug: " + reservierung.getFahrzeug().getMarke() + " " + reservierung.getFahrzeug().getModell());
            System.out.println("--------------------");
        }
        /*
        Hier entfernen wir bestimmte Reservierung mithilfe Methode aus der Klasse Fahrzeugvermietung "removeReservierung"
        welche Reservierung wird entfernt wird in diese Methode definiert -> Klasse Fahrzeugvermietung -> Zeile 24 und 25
        da steht erstmal "Max Mustermann"
         */
        fahrzeuge.removeReservierung();

        /*
         Hier geben wir die Liste von gespeicherte Reservierungen in der Konsole erneut aus und prüfen ob Reservierung war wirklich entfernt
         */
        System.out.println("Aktualisierte Liste der Reservierungen:");
        System.out.println("--------------------");

        for (Reservierung reservierung : reservierungen) {
            System.out.println("Gespeicherte Reservierung" + ":");
            System.out.println("Person: " + reservierung.getPerson().getNachname() + " " + reservierung.getPerson().getVorname());
            System.out.println("Fahrzeug: " + reservierung.getFahrzeug().getMarke() + " " + reservierung.getFahrzeug().getModell());
            System.out.println("--------------------");
        }
        /*Auto auto3 = new Auto();
        auto3.setMarke("BMW");
        auto3.setModell("3er");
        auto3.setFarbe("schwarz");
        auto3.setKennzeichen("F-XY 789");
        auto3.setFelgenDurchmesser(18.0);
        auto3.setAnzahlTueren(4);
        auto3.setAutomatikGetriebe(true);
        //Erste Auto dann ganz oben Z33
        Auto auto2 = new Auto();
        auto2.setMarke("Audi");
        auto2.setModell("A4");
        auto2.setFarbe("rot");
        auto2.setKennzeichen("M-CD 456");
        auto2.setFelgenDurchmesser(17.0);
        auto2.setAnzahlTueren(4);
        auto2.setAutomatikGetriebe(false);

        Auto auto4 = new Auto();
        auto4.setMarke("Ford");
        auto4.setModell("Fiesta");
        auto4.setFarbe("Grün");
        auto4.setKennzeichen("K-LM 321");
        auto4.setFelgenDurchmesser(15.0);
        auto4.setAnzahlTueren(3);
        auto4.setAutomatikGetriebe(true);

        Auto auto5 = new Auto();
        auto5.setMarke("Mercedes-Benz");
        auto5.setModell("C-Klasse");
        auto5.setFarbe("Silber");
        auto5.setKennzeichen("S-NZ 246");
        auto5.setFelgenDurchmesser(19.0);
        auto5.setAnzahlTueren(4);
        auto5.setAutomatikGetriebe(true);

        Motorrad motorrad1 = new Motorrad();
        motorrad.setCcm(20);
        motorrad.setvMax(11);
        motorrad.setTankinhalt(15);

        // Eine Reservierung erstellen und Person und Fahrzeug setzen
        Reservierung reservierung1 = new Reservierung(person1, auto1);
        Reservierung reservierung2 = new Reservierung(person2, auto2);
        Reservierung reservierung3 = new Reservierung(person3, auto3);
        Reservierung reservierung4 = new Reservierung(person4, auto4);
        Reservierung reservierung5 = new Reservierung(person5, auto5);
        //reservierung.setPerson(person);
        //reservierung.setFahrzeug(auto);

        // Getter-Methoden aufrufen, um Person und Fahrzeug der Reservierung zu erhalten
        Person reserviertePerson1 = reservierung1.getPerson();
        Fahrzeug reserviertesFahrzeug1 = reservierung1.getFahrzeug();

        Person reserviertePerson2 = reservierung2.getPerson();
        Fahrzeug reserviertesFahrzeug2 = reservierung2.getFahrzeug();

        Person reserviertePerson3 = reservierung3.getPerson();
        Fahrzeug reserviertesFahrzeug3 = reservierung3.getFahrzeug();

        Person reserviertePerson4 = reservierung4.getPerson();
        Fahrzeug reserviertesFahrzeug4 = reservierung4.getFahrzeug();

        Person reserviertePerson5 = reservierung5.getPerson();
        Fahrzeug reserviertesFahrzeug5 = reservierung5.getFahrzeug();

        // Ausgabe der reservierten Person und des reservierten Fahrzeugs
        System.out.println();
        System.out.println("_____Reservierung1:_____");
        System.out.println("Reservierte Person: " + reserviertePerson1.getVorname() + " " + reserviertePerson1.getNachname());
        System.out.println("Reserviertes Fahrzeug: " + reserviertesFahrzeug1.getMarke() + " " + reserviertesFahrzeug1.getModell());

        System.out.println();
        System.out.println("_____Reservierung2:_____");
        System.out.println("Reservierte Person: " + reserviertePerson2.getVorname() + " " + reserviertePerson2.getNachname());
        System.out.println("Reserviertes Fahrzeug: " + reserviertesFahrzeug2.getMarke() + " " + reserviertesFahrzeug2.getModell());

        System.out.println();
        System.out.println("_____Reservierung3:_____");
        System.out.println("Reservierte Person: " + reserviertePerson3.getVorname() + " " + reserviertePerson3.getNachname());
        System.out.println("Reserviertes Fahrzeug: " + reserviertesFahrzeug3.getMarke() + " " + reserviertesFahrzeug3.getModell());

        System.out.println();
        System.out.println("_____Reservierung4:_____");
        System.out.println("Reservierte Person: " + reserviertePerson4.getVorname() + " " + reserviertePerson4.getNachname());
        System.out.println("Reserviertes Fahrzeug: " + reserviertesFahrzeug4.getMarke() + " " + reserviertesFahrzeug4.getModell());

        System.out.println();
        System.out.println("_____Reservierung5:_____");
        System.out.println("Reservierte Person: " + reserviertePerson5.getVorname() + " " + reserviertePerson5.getNachname());
        System.out.println("Reserviertes Fahrzeug: " + reserviertesFahrzeug5.getMarke() + " " + reserviertesFahrzeug5.getModell());
*/
    }

}