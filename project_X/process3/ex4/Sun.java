package project_X.process3.ex4;

import java.util.Scanner;

public class Sun extends EnergySource {
    private int sunAmount;
    final String sourceSun="태양광";
    @Override
    void produceEnergy() {
        System.out.print("일조시간을 입력하세요 : ");
        Scanner s = new Scanner(System.in);
        setSunAmount(s.nextInt()-10);
        System.out.printf("%s 에너지를 %d만큼 생성했습니다\n",getSourceSun(),getSunAmount());
    }
    public void useEnergy(int use) {
        int u = getSunAmount()-use;
        setSunAmount(u);
        System.out.printf("%s 에너지를 %d 사용했습니다\n",getSourceSun(),getSunAmount());
    }
    public void setSunAmount(int sunAmount) {
        this.sunAmount = sunAmount;
    }
    public int getSunAmount() {
        return sunAmount;
    }
    public String getSourceSun() {
        return sourceSun;
    }
}
