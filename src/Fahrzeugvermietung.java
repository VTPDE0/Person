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
    //Die Methode hier fügt Reservierung hinzu, wenn die Voraussetzungen sind Erfüllt (z.B Person muss < 18 Jahre alt sein(darfFahren) oder wenn )
    public void addReservierung(Person person, Fahrzeug fahrzeug) {
        if (!darfFahren(person)) {
            System.out.println("Reservierung wird nicht erstellt");
            System.out.println("Person erfüllt die Voraussetzungen nicht");
            System.out.println("Person muss mindestens 18 Jahre alt sein");
            System.out.println("-Name:" + person.getNachname() + "; Vorname:" + person.getVorname() + "; Alter:" + person.getAlter() + ".");
            System.out.println("___________________________________________");
            return;
        }
//Methode zum Prüfen ob Person hat nur einmal reserviert
        if (hatPersonBereitsReserviert(person)) {
            System.out.println("Reservierung wird nicht erstellt");
            System.out.println("Diese Person hat schon ein Auto bereits reserviert");
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

//Methode zum prüfen, ob Fahrzeug mehr als einmal reserviert ist
        if (checkReservierung(person, fahrzeug) == true) {
            this.reservierung.add(new Reservierung(person, fahrzeug));
        } else {
            checkReservierung(person, fahrzeug);
            System.out.println("Eine Fahrzeug darf nur einmal reserviert sein");
            System.out.println("___________________________________________");
        }
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
