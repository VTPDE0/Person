public class Reservierung {
    private Person person;
    private Fahrzeug fahrzeug;


    public Reservierung(Person person, Fahrzeug fahrzeug) {
        this.person = person;
        this.fahrzeug = fahrzeug;
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