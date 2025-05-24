package project_X.process3.ex4;

import java.util.Scanner;

public class Ground extends EnergySource {
    private int GroundAmount;
    final String sourceGround="지열";

    @Override
    void produceEnergy() {
        System.out.print("온도를 입력하세요 : ");
        Scanner s = new Scanner(System.in);
        setGroundAmount(s.nextInt()*5+20);
        System.out.printf("%s 에너지를 %d만큼 생성했습니다\n",getSourceGround(),getGroundAmount());
    }
    public void useEnergy(int use) {
        int u = getGroundAmount()-use;
        setGroundAmount(u);
        System.out.printf("%s 에너지를 %d 사용했습니다\n",getSourceGround(),getGroundAmount());
    }

    public void setGroundAmount(int groundAmount) {
        GroundAmount = groundAmount;
    }

    public int getGroundAmount() {
        return GroundAmount;
    }

    public String getSourceGround() {
        return sourceGround;
    }
}
