
package project_X.process3.ex3;

public class BiodomeFamily03 {
    public static void main(String[] args) {
        LifeNest l = new LifeNest();
        Organism penguin = new Animal("펭귄","동물","남극","육식","물고기");
        Organism koala = new Animal("코알라","동물","호주", "초식","유칼립투스");
        Organism cactus= new Plant("선인장","식물","사막","11월","열매있음");
        Organism mint = new Plant("페퍼민트","식물","정원","7월","열매없음");

        l.addOrganism(penguin);
        l.addOrganism(koala);
        l.addOrganism(cactus);
        l.addOrganism(mint);
        l.displayAll();

        System.out.println();

        l.removeOrganism(koala);
        l.removeOrganism(cactus);

        l.printList();

    }
}

