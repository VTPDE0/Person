import java.util.ArrayList;
import java.util.List;

public class Fahrzeugvermietung {
    private List<Reservierung> reservierung = new ArrayList<Reservierung>();
    private List<Fahrzeug> fahrzeuge = new ArrayList<Fahrzeug>(); //Fahrzeug oder Fahrzeuge?

    public void removeReservierung(Reservierung reservierung) {
        this.reservierung.remove(reservierung);
    }

    public List<Reservierung> getReservierung() {
        return this.reservierung;
    }

    public void addFahrzeuge(Fahrzeug fahrzeug) {
        this.fahrzeuge.add(fahrzeug);
        /*Das Schlüsselwort "this" wird in der Programmierung verwendet, um auf das aktuelle Objekt oder die aktuelle Instanz einer Klasse
        zu verweisen. Es wird verwendet, um auf die Eigenschaften und Methoden des aktuellen Objekts zuzugreifen.*/
    }

    public void removeReservierung() {
        for (Reservierung reservierung : reservierung) {
            if (reservierung.getPerson().getNachname().equals("Mustermann") &&
                    reservierung.getPerson().getVorname().equals("Max")) {
                this.reservierung.remove(reservierung);
            }
        }
    }

    private boolean hatPersonBereitsReserviert(Person person) { //"hatPersonBereitsReserviert" name von Methode. "(Person person) person muss ein Objekt von klasse Person sein"
        for (Reservierung current : this.reservierung) {
            if (current.getPerson().equals(person)) {
                return true;
            }
        }

        return false;
    }

    private boolean darfFahren(Person person) {
        if (person.getAlter() < 18) {   //Prüft mithilfe Methode person.getAlter aus Person Klasse ob Person weniger als 18 Jahre alt ist
            return false;               //wenn Person junger als 18 ist - Methode gibt false zurück
        }

        return true;                //sonst (wenn Person ist alter als 18 ist) - true
    }

    private boolean istFahrzeugReserviert(Fahrzeug fahrzeug) {
        for (Reservierung current : this.reservierung) {
            if (current.getFahrzeug().equals(fahrzeug)) {
                return true; // Fahrzeug wurde bereits reserviert
            }
        }
        return false; // Fahrzeug ist noch nicht reserviert
    }

    public void addReservierung(Person person, Fahrzeug fahrzeug) {
        if (!darfFahren(person)) {
            System.out.println("Reservierung wird nicht erstellt");
            System.out.println("Person muss mindestens 18 Jahre alt sein");
            System.out.println("-Name:" + person.getNachname() + "; Vorname:" + person.getVorname() + "; Alter:" + person.getAlter() + ".");
            System.out.println("-Marke:" + fahrzeug.getMarke() + "; Modell:" + fahrzeug.getModell() + ".");
            System.out.println("___________________________________________");
            return;
        } else if (hatPersonBereitsReserviert(person)) {
            System.out.println("Reservierung wird nicht erstellt");
            System.out.println("Diese Person hat schon ein Auto bereits reserviert:");
            System.out.println("-Name:" + person.getNachname() + "; Vorname:" + person.getVorname() + "; Alter:" + person.getAlter() + ".");
            System.out.println("-Marke:" + fahrzeug.getMarke() + "; Modell:" + fahrzeug.getModell() + ".");
            System.out.println("___________________________________________");
            return;
        } else if (istFahrzeugReserviert(fahrzeug)) {
            System.out.println("Reservierung wird nicht erstellt");
            System.out.println("Diese Fahrzeug ist bereits reserviert:");
            System.out.println("-Name:" + person.getNachname() + "; Vorname:" + person.getVorname() + "; Alter:" + person.getAlter() + ".");
            System.out.println("-Marke:" + fahrzeug.getMarke() + "; Modell:" + fahrzeug.getModell() + ".");
            System.out.println("___________________________________________");
            return;
        } else {
            this.reservierung.add(new Reservierung(person, fahrzeug));
            System.out.println("Reservierung ist mit folgendem Fahrzeug:");
            System.out.println("-Marke:" + fahrzeug.getMarke() + "; Modell:" + fahrzeug.getModell() + ".");
            System.out.println("und folgender Person:");
            System.out.println("-Name:" + person.getNachname() + "; Vorname:" + person.getVorname() + "; Alter:" + person.getAlter() + ".");
            System.out.println("erfolgreich erstellt");
            System.out.println("___________________________________________");
        }
    }

}
