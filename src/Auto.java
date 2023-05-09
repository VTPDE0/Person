// Auto-Klasse
public class Auto extends Fahrzeug {
    private double felgenDurchmesser;
    private int anzahlTueren;
    private boolean automatikGetriebe;

    //hier nutzen wir unsere Konstruktor "Fahrzeug" mit die Parameter von Klasse "Auto"
    //erlädigt(Warum denn double int und boolean müssen zu String getauscht werden????)
    public Auto(String marke, String modell, String farbe, String kennzeichen, double felgenDurchmesser, int anzahlTueren, boolean automatikGetriebe) {
        super(marke, modell, farbe, kennzeichen);
        setFelgenDurchmesser(felgenDurchmesser);
        setAnzahlTueren(anzahlTueren);
        setAutomatikGetriebe(automatikGetriebe);

    }

    public double getFelgenDurchmesser() {
        return felgenDurchmesser;
    }


    public void setFelgenDurchmesser(double felgenDurchmesser) {
        this.felgenDurchmesser = felgenDurchmesser;
    }

    public int getAnzahlTueren() {
        return anzahlTueren;
    }

    public void setAnzahlTueren(int anzahlTueren) {
        this.anzahlTueren = anzahlTueren;
    }

    public boolean isAutomatikGetriebe() {
        return automatikGetriebe;
    }

    public void setAutomatikGetriebe(boolean automatikGetriebe) {
        this.automatikGetriebe = automatikGetriebe;
    }
}
