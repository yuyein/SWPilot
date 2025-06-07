package project_X.process3.ex7;

public class Player {
    private final int MAX_ANIMAL = 5;
    private final int MAX_PERSON =50;
    private final int MIN_VOLUME =0;
    //음악을 1곡 재생 가능
    private Song song;
    private int volume;
    public void play(Song s) {
        setSong(s);
        if(s instanceof AnimalSong && volume>MAX_ANIMAL){
            volume=MAX_ANIMAL;
            System.out.printf("동물을 위해 볼륨을 %d로 낮춥니다.\n",volume);
        }
        String str="";
        if(s instanceof AnimalSong) {
            str=((AnimalSong) s).getType();
        } else if (s instanceof ManagerSong) {
            str=((ManagerSong) s).getGenre();
        }
        System.out.printf("\"%s, %d분, %s, %s\" 재생합니다\n",s.getName(),s.getTime(),song.getMusician(),str);
    }

    public void stop(){
        if(song==null){
            System.out.println("재생 중인 노래가 없습니다\n");
        }
        else {
            System.out.printf("%s를 일시정지 합니다\n", song.getName());
        }
    }
    public void controlV(int n){
        int max = song instanceof AnimalSong ? MAX_ANIMAL :MAX_PERSON;
        if (volume < MIN_VOLUME || volume > max) {
            System.out.printf("[Player] 볼륨은 0부터 %d 까지 설정할 수 있습니다.\n", max);
            return;
        }
        setVolume(n);
        System.out.printf("볼륨을 %d로 조절합니다\n",getVolume());
    }
    public void setSong(Song song) {
        this.song = song;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public int getVolume() {
        return volume;
    }
}
