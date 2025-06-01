package project_X.process3.ex7;

public class AnimalSong extends Song{
    private String type;
    public AnimalSong(String name, int time, String musician, String type){
        super(name,time, musician);
        setType(type);

    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
