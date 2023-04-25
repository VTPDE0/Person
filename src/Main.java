public class Main {
    public static void main(String[] args) {
        // Erstellung eines Objekts der Klasse Person
        Person person = new Person();

        // Set-Methoden für die Person-Eingenschaften
        person.setVorname("Max");
        person.setNachname("Mustermann");
        person.setAlter(25);

        // Get-Methoden für die Person-Eingenschaften
        System.out.println();
        System.out.println("_____Person:_____");
        System.out.println("Vorname: " + person.getVorname()); //  public String getVorname()
        System.out.println("Nachname: " + person.getNachname());
        System.out.println("Alter: " + person.getAlter());

        // Erstellung einer Klasse "Fahrzeug"
        Auto auto = new Auto();

        // Set-Methoden für die Fahrzeug-Eingenschaften
        //Die Get-Methoden folgen dann unten
        auto.setMarke("VW");
        auto.setModell("Golf");
        auto.setFarbe("Blau");
        auto.setKennzeichen("B-AB 1234");
        auto.setFelgenDurchmesser(16.0);
        auto.setAnzahlTueren(5);
        auto.setAutomatikGetriebe(true);

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
        System.out.println("Marke: " + auto.getMarke());
        System.out.println("Modell: " + auto.getModell());
        System.out.println("Farbe: " + auto.getFarbe());
        System.out.println("Kennzeichen: " + auto.getKennzeichen());
        System.out.println("Felgendurchmesser: " + auto.getFelgenDurchmesser());
        System.out.println("Anzahl Türen: " + auto.getAnzahlTueren());
        System.out.println("Automatikgetriebe: " + auto.isAutomatikGetriebe());

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

        // Eine Person und ein Fahrzeug erstellen
        Person person1 = new Person();
        person.setVorname("Max");
        person.setNachname("Mustermann");

        Auto auto1 = new Auto();
        auto.setMarke("Volkswagen");
        auto.setModell("Golf");
        auto.setFarbe("blau");
        auto.setKennzeichen("B-AB 1234");
        auto.setFelgenDurchmesser(17.0);
        auto.setAnzahlTueren(5);
        auto.setAutomatikGetriebe(true);

        // Eine Reservierung erstellen und Person und Fahrzeug setzen
        Reservierung reservierung = new Reservierung(person, auto);
        //reservierung.setPerson(person);
        //reservierung.setFahrzeug(auto);

        // Getter-Methoden aufrufen, um Person und Fahrzeug der Reservierung zu erhalten
        Person reserviertePerson = reservierung.getPerson();
        Fahrzeug reserviertesFahrzeug = reservierung.getFahrzeug();

        // Ausgabe der reservierten Person und des reservierten Fahrzeugs
        System.out.println();
        System.out.println("_____Reservierung:_____");
        System.out.println("Reservierte Person: " + reserviertePerson.getVorname() + " " + reserviertePerson.getNachname());
        System.out.println("Reserviertes Fahrzeug: " + reserviertesFahrzeug.getMarke() + " " + reserviertesFahrzeug.getModell());
    }
}