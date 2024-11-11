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


    @Override
    public double terfogat(){
        double terfogatA = super.terfogat();
        double sugarB = super.getSugar() - falvastagsag;
        double terfogatLy = super.terfogat(sugarB, super.getMagassag());

        return terfogatA-terfogatLy;
    }

    public double getFalvastagsag() {
        return falvastagsag;
    }

    public void setFalvastagsag(double falvastagsag) {
        this.falvastagsag = falvastagsag;
    }

    @Override
    public String toString() {
        String os = super.toString();
        return os + " <-- LyukasHenger{" +
                "falvastagsag=" + falvastagsag +
                '}';
    }


}
