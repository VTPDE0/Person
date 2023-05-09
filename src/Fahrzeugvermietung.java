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
    public void addReservierung(Person person, Fahrzeug fahrzeug) {
        if (!darfFahren(person)) {
            System.out.println("Person erfüllt die Vorrasetzungen nicht");
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
