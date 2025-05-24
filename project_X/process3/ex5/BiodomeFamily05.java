package project_X.process3.ex5;

import java.util.ArrayList;

public class BiodomeFamily05 {
    public static void main(String[] args) {
        Sorcerer sorcerer = new Sorcerer("아리엘");
        AncientArtifact s = new SolarStone("태양의 돌");
        AncientArtifact w = new WindAmulet("바람의 부적");
        AncientArtifact water = new WaterMirror("물의 거울");

        System.out.println();

        sorcerer.list = new ArrayList<>();
        sorcerer.list.add(s);
        sorcerer.list.add(w);
        sorcerer.list.add(water);

        sorcerer.showArtifacts();
        System.out.println();

        sorcerer.identify("태양의 돌");


        sorcerer.useArtifacts("물의 거울");

    }
}
