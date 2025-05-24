package project_X.process3.ex3;

public class Plant extends Organism{
    private String flowering;
    private String fruit;
    public Plant(String name, String species, String habitat,String flowering, String fruit) {
        super(name, species, habitat);
        setFlowering(flowering);
        setFruit(fruit);
    }

    public void setFlowering(String flowering) {
        this.flowering = flowering;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public String getFlowering() {
        return flowering;
    }

    public String getFruit() {
        return fruit;
    }

    @Override
    public void displayInfo(){
        System.out.printf("%s, %s, %s, %s, %s\n",getName(),getSpecies(),getHabitat(),getFlowering(),getFruit());
    }
}

