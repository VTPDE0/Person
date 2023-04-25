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
    public void addReservierung (Person person, Fahrzeug fahrzeug) {
        if (checkReservierung(person, fahrzeug)==true)
        {
            this.reservierung.add(new Reservierung(person, fahrzeug));
        }
    }
    public boolean checkReservierung (Person person, Fahrzeug fahrzeug) {
        if (person.getAlter()>=18 && reservierung.size() == 0)
            return true;
        else if (person.getAlter()>=18) {
            for (int i = reservierung.size(); i > 0; --i) {
                if (reservierung.get(i - 1).getPerson().getVorname() == person.getVorname() &&
                        reservierung.get(i - 1).getPerson().getNachname() == person.getNachname() &&
                    reservierung.get(i - 1).getPerson().getAlter() == person.getAlter()) {
                    return false;
                }
                if ()
            }
        }
        return false;
    }
    public void removeReservierung (Reservierung reservierung) {
        this.reservierung.remove(reservierung);
    }
}
