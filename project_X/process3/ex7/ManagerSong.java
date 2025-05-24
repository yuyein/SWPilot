package project_X.process3.ex7;

public class ManagerSong extends Song {
    private String genre;
    public ManagerSong(String name,int time, String musician, String genre){
        super(name, time, musician);
        setGenre(genre);
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
}
