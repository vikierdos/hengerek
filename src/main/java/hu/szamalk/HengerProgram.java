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
        hengerek.add(new MertaniHenger(1,1));
        hengerek.add(new TomorHenger(1,1));
        hengerek.add(new TomorHenger(1,1, .5));
        hengerek.add(new LyukasHenger(1,1,.5));
        hengerek.add(new LyukasHenger(1,1,.1));
        hengerek.add(new LyukasHenger(1,1,.9));
    }

    public double atlagTerfogat(){
        int db = MertaniHenger.getHengerDb();
        double osszt = 0;
        for (MertaniHenger henger : hengerek) {
            osszt += henger.terfogat();
        }
        return osszt/db;
    }

    public double csovekSulya(){
        return 0.0;
    }

    private List<MertaniHenger> lista(){
        return new ArrayList<>();
    }

    public void run(){
        int db = MertaniHenger.getHengerDb();
        System.out.printf("A feladatban használt hengerek (%d db):\n", db);
        for (MertaniHenger henger : hengerek) {
            System.out.println(henger);
        }
        System.out.println("Átlag térfogat: " + atlagTerfogat());
//        for (MertaniHenger henger : this.lista()) {
//            System.out.println(henger);
//        }



    }

    public static void main(String[] args) {
        new HengerProgram().run();
    }
}