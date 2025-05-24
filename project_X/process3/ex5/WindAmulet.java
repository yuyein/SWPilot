package project_X.process3.ex5;

public class WindAmulet extends AncientArtifact implements WeatherController{
    public WindAmulet(String name){
        super(name);
        System.out.printf("%s 유물이 생성되었습니다.\n",getName());
    }
    @Override
    void describe() {
        System.out.println("바람의 부적 : 주변 공기의 흐름을 이용해 날씨를 조절합니다");
    }
    @Override
    public void  controlWeather(){
        System.out.println("바람의 부적으로 주변 공기의 흐름으로 날씨를 조절했습니다!");
    }
}
