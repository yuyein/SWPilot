
package project_X.process3.ex3;

public class Organism {
    private String name;
    private String species;
    private String habitat;
    public Organism(String name, String species, String habitat){ //생성자
        setName(name);
        setSpecies(species);
        setHabitat(habitat);
    }
    public void setName(String name) { this.name=name; }
    public void setSpecies(String s) { this.species=s; }
    public void setHabitat(String h) { this.habitat=h; }

    public String getName() {return name;}

    public String getSpecies() {return species;}

    public String getHabitat() {return habitat;}
    public void displayInfo(){
        System.out.printf("%s, %s, %s\n",getName(),getSpecies(),getHabitat());
    }
}
