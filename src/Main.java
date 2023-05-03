import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
/*
%%gemacht%% Z 13,18,19                          erstens:    Beschreibung ausfüllen
%%gemacht%% Klasse "Fahrzeug" Z21-29            zweitens:   Einen Fahrzeug Konstruktor mit allen Feldern/Eingenschaften erstellen
%%gemacht%% Klasse "Fahrzeug" Z21-29            drittens:   Beschreiben alles was in neuen Konstruktor passiert ist
%%gemacht%% Z23 und 31-3                        viertens:   Neues Objekt mit neues Konstruktor erstellen, danach alle eingenschaften mit system.out ausgeben
*/
        /*
Fahrzeugvermietung (großgeschrieben) ist eine Klasse, davon wird ein Objekt vermietung (kleingeschrieben) erzeugt. Objekt übernimmt Eingenschaften von Klasse Fahrzeugvermietung.
         */
        Fahrzeugvermietung vermietung = new Fahrzeugvermietung();

        /*
Fahrzeug (großgeschrieben) ist eine Klasse, davon wird ein Objekt fahrzeug1 (kleingeschrieben) erzeugt. Objekt übernimmt Eingenschaften von Konstruktor Fahrzeug ohne irgendwelche Eingenschaften.
Fahrzeug (großgeschrieben) ist eine Klasse, davon wird ein Objekt fahrzeug2 (kleingeschrieben) erzeugt. Objekt übernimmt Eingenschaften von Konstruktor Fahrzeug mit Parameter "Marke" der war zu ABS unbenannt und hat ein Wert "BMW"
         */
        Fahrzeug fahrzeug1 = new Fahrzeug();
        Fahrzeug fahrzeug2 = new Fahrzeug("BMW");
        Fahrzeug fahrzeug3 = new Fahrzeug("randomMarke", "randomModell", "randomFarbe", "randomKennzeichen");

        System.out.println("Fahrzeug1: " + fahrzeug1.getMarke()); //Fahrzeug1:
        System.out.println("Fahrzeug1: " + fahrzeug1.getKennzeichen()); //Fahrzeug1:

        System.out.println("Fahrzeug2: " + fahrzeug2.getMarke()); //Fahrzeug2:
        System.out.println("Fahrzeug2: " + fahrzeug2.getKennzeichen()); //Fahrzeug2:

        System.out.println("Fahrzeug3: " + fahrzeug3.getMarke()); //Fahrzeug3:
        System.out.println("Fahrzeug3: " + fahrzeug3.getModell()); //Fahrzeug3:
        System.out.println("Fahrzeug3: " + fahrzeug3.getFarbe());
        System.out.println("Fahrzeug3: " + fahrzeug3.getKennzeichen());

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