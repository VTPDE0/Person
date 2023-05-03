// Fahrzeug-Klasse
public class Fahrzeug {
    private String marke;
    private String modell;
    private String farbe;
    private String kennzeichen;
    //new Fahrzeug ();


    //Konstruktor 1
    public Fahrzeug() {

    }

    //Konstruktor 2
    public Fahrzeug(String ASD) {
        setMarke(ASD);
    }


    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }
}