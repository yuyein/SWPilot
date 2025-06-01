package project_X.process3.ex5;

import java.util.List;

public class Sorcerer { //마법사 클래스
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
