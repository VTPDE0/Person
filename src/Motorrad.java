// Motorrad-Klasse
public class Motorrad extends Fahrzeug {
    private int ccm;
    private double vMax;
    private double tankinhalt;

    //hier nutzen wir unsere Konstruktor "Fahrzeug" mit die Parameter von Klasse "Motorrad"
    public Motorrad(String marke, String modell, String farbe, String kennzeichen, int ccm, double vMax, double tankinhalt) {
        super(marke, modell, farbe, kennzeichen);
        setCcm(ccm);
        setvMax(vMax);
        setTankinhalt(tankinhalt);
    }

    public int getCcm() {

        return ccm;
    }

    public void setCcm(int ccm) {
        this.ccm = ccm;
    }

    public double getvMax() {
        return vMax;
    }

    public void setvMax(double vMax) {
        this.vMax = vMax;
    }

    public double getTankinhalt() {
        return tankinhalt;
    }

    public void setTankinhalt(double tankinhalt) {
        this.tankinhalt = tankinhalt;
    }
}
