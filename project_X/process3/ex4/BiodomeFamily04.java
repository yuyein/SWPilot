package project_X.process3.ex4;

import java.util.Scanner;

public class BiodomeFamily04 {
    public static void main(String[] args) {
        Sun s = new Sun();
        Wind w = new Wind();
        Ground g = new Ground();

        Scanner input = new Scanner(System.in);
        System.out.print("");
        s.produceEnergy();
        w.produceEnergy();
        g.produceEnergy();

        s.useEnergy(30);
        w.useEnergy(30);
        g.useEnergy(30);

        EnergyManager m  = new EnergyManager();
        System.out.printf("남은 에너지 : %d",m.addAll(s.getSunAmount(), w.getWindAmount(),g.getGroundAmount()));

    }
}
