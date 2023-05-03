import java.util.ArrayList;
import java.util.List;

public class Fahrzeugvermietung {
    private List<Reservierung> reservierung = new ArrayList<Reservierung>();
    private List<Fahrzeug> fahrzeuge = new ArrayList<Fahrzeug>(); //Fahrzeug oder Fahrzeuge?

    public void addFahrzeuge(Fahrzeug fahrzeug) {
        this.fahrzeuge.add(fahrzeug);
    }
    /*
    - main
        - Fahrzeugvermietung Objekt erzeugen
        - Fahrzeuge Objekte erzeugen mehrere 5 Autos und 3 Motorräder
        - Alle Fahrzeuge zu der Liste "Fahrzeug" hinzufügen mit addFahrzeuge von Fahrzeugvermietung Klasse
        - 7 Personen erstellen die unterschiedlich alt sind
        - Reservierung mit einer Person und ein Fahrzeug erstellen mit addReservierung Funktion von Klasse Fahrzeugvermietung
            - addReservierung prüft das Alter der Person und gibt eine Fehlermedlung aus (wenn es nicht erlaubt ist (Person ist 17))
            - addReservierung prüft ob Fahrzeug bereits reserviert ist und gibt eine Fehlermedlung wenn nötig
            - addReservierung prüft ob Person hat schon eine Fahrzeug reserviert und gibt eine Fehlermedlung wenn das ist der Fall
            - addReservierung speichert neue Reservierung wen alles passt in die Reservierung Liste
                - reservierung.add (neue Reservierung Objekt mit Fahrzeug und Person)
    */

    public void removeFahrzeug(Fahrzeug fahrzeug) {
        this.fahrzeuge.remove(fahrzeug);
    }

    /*public void removeFahrzeug(int index) {
        this.fahrzeuge.remove(index);
     */
    public void addReservierung(Person person, Fahrzeug fahrzeug) {
        if (!darfFahren(person)) {
            //system.out.println("Person erfüllt die Vorrasetzungen nicht");
            return;
        }

        if (hatPersonBereitsReserviert(person)) {
            System.out.println("Man darf nur 1x reservieren");
            return;
        }

        /*if (checkReservierung(person, fahrzeug) == true) {
            this.reservierung.add(new Reservierung(person, fahrzeug));
        }*/
    }

    //                      |
    // [ res1, res2, res3, res4 ] => this.reservierung
    // res4.person     res4.fahrzeug

    private boolean hatPersonBereitsReserviert(Person person) {
        for (Reservierung current : this.reservierung) {
            if (current.getPerson().equals(person)) {
                return true;
            }
        }

        return false;
    }

    private boolean darfFahren(Person person) {
        if (person.getAlter() < 18) {
            return false;
        }

        return true;
    }

    public boolean checkReservierung(Person person, Fahrzeug fahrzeug) {
        if (person.getAlter() >= 18)
            return true;


        return false;
    }

    public void removeReservierung(Reservierung reservierung) {
        this.reservierung.remove(reservierung);
    }
}
