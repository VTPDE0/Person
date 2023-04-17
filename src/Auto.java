// Auto-Klasse
public class Auto extends Fahrzeug {
    private double felgenDurchmesser;
    private int anzahlTueren;
    private boolean automatikGetriebe;

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
