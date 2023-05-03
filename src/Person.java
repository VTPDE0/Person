// Person-Klasse
public class Person {
    private String vorname;
    private String nachname;
    private int alter;
    private Reservierung reservierung;

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    /* public boolean hatFahrzeugReserviert() {
        return reservierung != null;        //"!=" bedeutet nicht gleich
    }

    public void reservieren(Person person, Fahrzeug fahrzeug) {
        // Bedingungen prüfen
        if (person.getAlter() < 18) {
            System.out.println("Person ist nicht 18 Jahre alt und kann keine Reservierung vornehmen.");
            return;
        }
        if (person.getReservierung() != null) {
            System.out.println("Person hat bereits ein Fahrzeug reserviert.");
            return;
        }
        for (Reservierung r : reservierungen) {
            if (r.getFahrzeug() == fahrzeug) {
                System.out.println("Das Fahrzeug ist bereits reserviert.");
                return;
            }
        }
    }*/
}