public class Reservierung {
    private Person person;
    private Fahrzeug fahrzeug;
    private String name;

    public Reservierung(Person person, Fahrzeug fahrzeug, String name) {
        setPerson(person);
        setFahrzeug(fahrzeug);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Fahrzeug getFahrzeug() {
        return fahrzeug;
    }

    public void setFahrzeug(Fahrzeug fahrzeug) {
        this.fahrzeug = fahrzeug;
    }

}