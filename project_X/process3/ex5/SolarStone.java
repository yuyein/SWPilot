package project_X.process3.ex5;

public class SolarStone extends AncientArtifact implements EnergyGenerator{
    public SolarStone(String name){
        super(name);
        System.out.printf("%s 유물이 생성되었습니다.\n",getName());
    }
    @Override
    void describe() {
        System.out.println("태양의 돌 : 빛을 받은 시간에 따라 에너지의 양이 달라집니다.");

    }
    @Override
    public void generateEnergy() {
        System.out.print("태양의 돌로 에너지 생성 중!");
    }
}
