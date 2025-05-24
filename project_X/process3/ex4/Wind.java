package project_X.process3.ex4;

import java.util.Scanner;

public class Wind extends EnergySource{
    private int windAmount;
    final String sourceWind="풍력";

    @Override
    void produceEnergy() {
        System.out.print("속도를 입력하세요 : ");
        Scanner s = new Scanner(System.in);
        setWindAmount(s.nextInt()-5);
        System.out.printf("%s 에너지를 %d만큼 생성했습니다\n",getSourceWind(),getWindAmount());
    }
    public void useEnergy(int use) {
        int u = getWindAmount()-use;
        setWindAmount(u);
        System.out.printf("%s 에너지를 %d 사용했습니다\n",getSourceWind(),getWindAmount());
    }

    public void setWindAmount(int windAmount) {
        this.windAmount = windAmount;
    }

    public int getWindAmount() {
        return windAmount;
    }

    public String getSourceWind() {
        return sourceWind;
    }
}
