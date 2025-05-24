package project_X.process3.ex4;

import java.util.Scanner;

public class BiodomeFamily04 {
    public static void main(String[] args) {
        /*
        main 함수에서 에너지 관리 시스템을 시뮬레이션한다.

3가지 에너지 원천 객체를 생성한다.

각 에너지 원천으로 에너지 생산을 수행한다.

각 에너지 원천의 에너지를 30씩 사용한다.

남아있는 에너지량을 출력한다
        */
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
