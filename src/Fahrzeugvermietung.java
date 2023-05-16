import java.util.ArrayList;
import java.util.List;

public class Fahrzeugvermietung {
    private List<Reservierung> reservierung = new ArrayList<Reservierung>();
    private List<Fahrzeug> fahrzeuge = new ArrayList<Fahrzeug>(); //Fahrzeug oder Fahrzeuge?

    public void addFahrzeuge(Fahrzeug fahrzeug) {
        this.fahrzeuge.add(fahrzeug);
    }

    public void removeFahrzeug(Fahrzeug fahrzeug) {
        this.fahrzeuge.remove(fahrzeug);
    }

    /*public void removeFahrzeug(int index) {
        this.fahrzeuge.remove(index);
     */
    //Die Methode hier fügt Reservierung hinzu, wenn die Voraussetzungen sind erfüllt (z.B. Person muss < 18 Jahre alt sein(darfFahren),
    // eine Person darf nur ein Auto reservieren(hatPersonBereitsReserviert), ein Auto darf nur einmal reserviert werden(obAutoSchonReserviertIst))
    public void addReservierung(Person person, Fahrzeug fahrzeug) {
        //Bedienungen für Methode "darfFahren" zum prüfen ob Person mindestens 18 AJhre alt ist
        if (!darfFahren(person)) {
            System.out.println("Reservierung wird nicht erstellt");
            System.out.println("Person muss mindestens 18 Jahre alt sein");
            //Erklärung welche Person wollte Reservierung erstellen, aber ist zu jung und darf nicht fahren
            System.out.println("-Name:" + person.getNachname() + "; Vorname:" + person.getVorname() + "; Alter:" + person.getAlter() + ".");
            System.out.println("___________________________________________");
            return;
        }
        // Bedienungen für Methode "hatPersonBereitsReserviert" zum Prüfen ob Person hat nur einmal reserviert
        if (hatPersonBereitsReserviert(person) == true) {
            System.out.println("Reservierung wird nicht erstellt");
            System.out.println("Diese Person hat schon ein Auto bereits reserviert:");
            //Erklärung welche Person wollte Reservierung erstellen, aber hat bereits andere Auto reserviert
            System.out.println("-Name:" + person.getNachname() + "; Vorname:" + person.getVorname() + "; Alter:" + person.getAlter() + ".");
            System.out.println("___________________________________________");
            return;
        } else {
            System.out.println("Reservierung ist mit der folgenden Fahrzeug");
            System.out.println("-Marke:" + fahrzeug.getMarke() + "; Modell:" + fahrzeug.getModell() + ".");
            System.out.println("und folgenden Person");
            System.out.println("-Name:" + person.getNachname() + "; Vorname:" + person.getVorname() + "; Alter:" + person.getAlter() + ".");
            System.out.println("erfolgreich erstellt");
            System.out.println("___________________________________________");
        }


        /*hier war ein !!!  Fehler    !!!- obwohl Reservierung darf nicht gespeichert werden- war es doch gespeichert. Und zwar Reservierung war gespeichert, wenn obAutoSchonReserviertIst
        true ist. Das sollte umgekehrt funktionieren.
        nach else war keine Reservierung gespeichert, sonst kam Nachricht, dass diese Fahrzeug bereits reserviert ist, sollte auch umgekehrt sein


        Bedienungen für Methode "obAutoSchonReserviertIst" zum prüfen, ob Fahrzeug mehr als einmal reserviert ist

        if (obAutoSchonReserviertIst(fahrzeug) == true) {
            //reservierung.add erzeugt neue Reservierung und dann alle Methoden die müssen Reservierungen prüfen funktionieren
            //ohne diese Zeile funktioniert nur darfFahren, weil es prüft die Personen, die existieren außer Reservierungsliste
            this.reservierung.add(new Reservierung(person, fahrzeug));

        } else {
            obAutoSchonReserviertIst(fahrzeug);                     Methode "obAutoSchonReserviertIst" war mit dem Argument "fahrzeug" aufgerufen
            System.out.println("Reservierung wird nicht erstellt");
            System.out.println("Diese Fahrzeug ist bereits reserviert:");
            //Erklärung welches Auto darf man nicht reservieren, da es bereits reserviert ist
            System.out.println("-Marke:" + fahrzeug.getMarke() + "; Modell:" + fahrzeug.getModell() + ".");
            System.out.println("___________________________________________");
        }

    }
    */

        //Bedienungen für Methode "obAutoSchonReserviertIst" zum prüfen, ob Fahrzeug mehr als einmal reserviert ist
        //wenn diese Methode gibt true raus, bedeutet das, dass Fahrzeug ist schon reserviert und Reservierung kann nicht erzeugt werden


        //sonst (else) wird dann
        if (!obAutoSchonReserviertIst(fahrzeug) == true) { //Methode obAutoSchonReserviertIst

        } else {
            //reservierung.add erzeugt neue Reservierung und dann alle Methoden die müssen Reservierungen prüfen funktionieren
            //ohne diese Zeile funktioniert nur darfFahren, weil es prüft die Personen, die existieren außer Reservierungsliste
            this.reservierung.add(new Reservierung(person, fahrzeug));
            obAutoSchonReserviertIst(fahrzeug);
            System.out.println("Reservierung wird nicht erstellt");
            System.out.println("Diese Fahrzeug ist bereits reserviert:");
            //Erklärung welches Auto darf man nicht reservieren, da es bereits reserviert ist
            System.out.println("-Marke:" + fahrzeug.getMarke() + "; Modell:" + fahrzeug.getModell() + ".");
            System.out.println("___________________________________________");
        }

    }

    //                      |
    // [ res1, res2, res3, res4 ] => this.reservierung
    // res4.person     res4.fahrzeug

    private boolean hatPersonBereitsReserviert(Person person) { //"hatPersonBereitsReserviert" name von Methode. "(Person person) person muss ein Objekt von klasse Person sein"
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

    private boolean obAutoSchonReserviertIst(Fahrzeug fahrzeug) {
        for (Reservierung current : this.reservierung) {
            if (current.getFahrzeug().equals(fahrzeug)) {
                return false; // Fahrzeug wurde bereits reserviert
            }
        }
        return true; // Fahrzeug ist noch nicht reserviert
    }

    public void removeReservierung(Reservierung reservierung) {
        this.reservierung.remove(reservierung);
    }
}
