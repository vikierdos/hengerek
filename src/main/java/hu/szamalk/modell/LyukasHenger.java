package hu.szamalk.modell;

public class LyukasHenger extends TomorHenger{
    private double falvastagsag;

    public LyukasHenger(double sugar, double magassag, double falvastagsag) {
        this(sugar, magassag, 1, falvastagsag);
    }

    public LyukasHenger(double sugar, double magassag, double fajsuly, double falvastagsag) {
        super(sugar, magassag, fajsuly);
        this.falvastagsag = falvastagsag;
    }

    public double terfogat(){
        return -1;
    }

    public double getFalvastagsag() {
        return falvastagsag;
    }

    public void setFalvastagsag(double falvastagsag) {
        this.falvastagsag = falvastagsag;
    }

    @Override
    public String toString() {
        return "LyukasHenger{" +
                "falvastagsag=" + falvastagsag +
                '}';
    }


}
