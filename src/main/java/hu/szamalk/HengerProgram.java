package hu.szamalk;

import hu.szamalk.modell.LyukasHenger;
import hu.szamalk.modell.MertaniHenger;
import hu.szamalk.modell.TomorHenger;

import java.util.ArrayList;
import java.util.List;


public class HengerProgram {
    private List<MertaniHenger> hengerek;

    public HengerProgram() {
        hengerek = new ArrayList<>();
    }

    public double atlagTerfogat(){
        return 0.0;
    }

    public double csovekSulya(){
        return 0.0;
    }

    private List<MertaniHenger> lista(){
        return new ArrayList<>();
    }

    public void run(){

        MertaniHenger mh = new MertaniHenger(1,1);
        TomorHenger th = new TomorHenger(1,1);
        LyukasHenger lyh = new LyukasHenger(1,1,.5);

        System.out.println("mh = " + mh);
        System.out.println("th = " + th);
        System.out.println("lyh = " + lyh);
        int db = MertaniHenger.getHengerDb();
        System.out.printf("A feladatban használt hengerek (%d db): ", db);

    }

    public static void main(String[] args) {
        new HengerProgram().run();
    }
}