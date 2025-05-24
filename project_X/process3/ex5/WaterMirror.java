package project_X.process3.ex5;

public class WaterMirror extends AncientArtifact implements EnergyGenerator, WeatherController{
    public WaterMirror(String name){
        super(name);
        System.out.printf("%s 유물이 생성되었습니다.\n",getName());
    }

    @Override
    void describe() {
        System.out.println("물의 거울 : 수증기를 모아 에너지를 생성하고, 날씨를 조절합니다");
    }

    @Override
    public void generateEnergy() {
        System.out.println("물의 거울로 에너지 생성 중! 수증기를 모아 에너지를 생성합니다.");
    }

    @Override
    public void controlWeather() {
        System.out.println("물의 거울로 날씨를 조절하는 중! 주변 공기의 흐름을 이용해 날씨를 조절합니다");
    }
}
