
package project_X.process3.ex3;

public class Animal extends Organism{
    private String digest;
    private String feed;
    public Animal(String name, String species, String habitat,String digest, String feed) {
        super(name, species, habitat);
        setDigest(digest);
        setFeed(feed);
    }
    public void setDigest(String digest) {this.digest = digest;}
    public void setFeed(String feed) {this.feed = feed;}
    public String getDigest() {return digest;}
    public String getFeed() {return feed;}
    @Override
    public void displayInfo(){
        System.out.printf("%s, %s, %s, %s, %s\n",getName(),getSpecies(),getHabitat(),getDigest(),getFeed());
    }
}

