package project_X.process3.ex7;

public class Song{
    private String name;
    private int time;
    private String musician;
    public Song(String name, int time, String musician){
     setName(name);
     setTime(time);
     setMusician(musician);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setMusician(String musician) {
        this.musician = musician;
    }

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }

    public String getMusician() {
        return musician;
    }
}
