package project_X.process3.ex7;

public class BiodomeFamily07 {
    public static void main(String[] args) {
        AnimalSong s1 = new AnimalSong("초원을 그리며",2,"레이나","사슴");
        AnimalSong s2 = new AnimalSong("영웅 호테",1,"돈키","당나귀");
        AnimalSong s3 = new AnimalSong("과자를 줄게",3,"제롬","코끼리");
        ManagerSong s4 = new ManagerSong("화양연화",2,"장양림","재즈");
        ManagerSong s5 = new ManagerSong("시간의 수평선",4,"하윤","팝");

        Player player = new Player();
        MusicLibary musicList = new MusicLibary();
        musicList.addList(s1);
        musicList.addList(s2);
        musicList.addList(s3);
        musicList.addList(s4);
        musicList.addList(s5);

        System.out.println();

        player.play(s4);
        player.controlV(30);
        player.controlV(5);
        System.out.println();

        musicList.deleteList("시간의 수평선");

        System.out.println();

        musicList.printList("동물");
        System.out.println();
        musicList.printList("사람");

        System.out.println();
        musicList.SearchName("과자를 줄게");
    }
}
