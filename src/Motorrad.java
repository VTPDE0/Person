// Motorrad-Klasse
public class Motorrad extends Fahrzeug {
    private int ccm;
    private double vMax;
    private double tankinhalt;

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
