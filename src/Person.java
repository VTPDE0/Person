// Person-Klasse
public class Person {
    private String vorname;
    private String nachname;
    private int alter;
    //private Reservierung reservierung;

    //konstruktor für die Personen mit 3 Parameters
    public Person(String vorname, String nachname, int alter) {
        setVorname(vorname);
        setNachname(nachname);
        setAlter(alter);
    }

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


}