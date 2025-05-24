package project_X.process3.ex5;

import java.util.List;

public class Sorcerer { //마법사 클래스
    /*
    유물을 사용하는 마법사 클래스 Sorcerer 를 설계한다.

마법는 이름 필드를 가진다.

마법사는 여러 종류의 유물을 소유할 수 있지만, 마법사가 사라져도 유물은 존재한다

마법사는 유물의 능력을 확인하고, 활용할 수 있다.
     */
    private String name;
    public List<AncientArtifact> list;
    public  Sorcerer(String name){
        setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void showArtifacts() {
        for (AncientArtifact artifact : list) {
            System.out.printf("마법사 \'%s\'이 %s를 소유하게 되었습니다\n",getName(),artifact.getName());
        }
    }

    public void identify(String s){
        for (AncientArtifact artifact : list) {
            if (artifact.getName().equals(s)) {
                System.out.println("마법사 '" + name + "'이 " + artifact.getName() + "의 능력을 확인합니다.");
                artifact.describe();
            }
        }
    }
    public void useArtifacts(String s){
        for (AncientArtifact artifact : list) {
            if (artifact.getName().equals(s)) {
                System.out.println("마법사 '" + name + "'이 " + artifact.getName() + "의 능력을 사용합니다.");
                artifact.describe();

                if (artifact instanceof EnergyGenerator) {
                    ((EnergyGenerator) artifact).generateEnergy();
                }

                if (artifact instanceof WeatherController) {
                    ((WeatherController) artifact).controlWeather();
                }
            }


            System.out.println();
        }
    }
}
