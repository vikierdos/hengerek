package hu.szamalk.modell;

public class TomorHenger extends MertaniHenger{
    private double fajsuly;

    public TomorHenger(double sugar, double magassag) {
        this(sugar, magassag, 1);
    }

    public TomorHenger(double sugar, double magassag, double fajsuly) {
        super(sugar, magassag);
        this.fajsuly = fajsuly;
    }

    public double getFajsuly() {
        return fajsuly;
    }

    public void setFajsuly(double fajsuly) {
        this.fajsuly = fajsuly;
    }

    @Override
    public String toString() {
        return "TomorHenger{" +
                "fajsuly=" + fajsuly +
                '}';
    }
}
