package project_X.process3.ex7;

import java.util.ArrayList;
import java.util.List;

public class MusicLibary {
    List<Song> musicList = new ArrayList<>();
    public void addList(Song s){
        String str="";
        if(s instanceof AnimalSong) {str=((AnimalSong) s).getType();} else if (s instanceof ManagerSong) {
            str = ((ManagerSong) s).getGenre();
        }
        musicList.add(s);
        System.out.printf("새로운 노래 \"%s, %d분, %s, %s\" 추가되었습니다.\n",s.getName(),s.getTime(),s.getMusician(),str);
    }
    public void deleteList(String str){
        for(int i =0; i<musicList.size();i++){
            if(musicList.get(i).getName().equals(str)){
                musicList.remove(i);
                System.out.printf("%s 노래를 제거했습니다\n",str);
            }
        }
    }
    public void printList(String s){
        if(s.equals("동물")){
            for(int i=0;i<musicList.size();i++){
                if(musicList.get(i) instanceof AnimalSong){
                    System.out.printf("\"%s, %d분, %s, %s\"\n",musicList.get(i).getName(),musicList.get(i).getTime(),
                            musicList.get(i).getMusician(),((AnimalSong) musicList.get(i)).getType());
                }
            }
        }
        else if(s.equals("사람")){
            for(int i=0;i<musicList.size();i++){
                if(musicList.get(i) instanceof ManagerSong){
                    System.out.printf("\"%s, %d분, %s, %s\"\n",musicList.get(i).getName(),musicList.get(i).getTime(),
                            musicList.get(i).getMusician(),((ManagerSong) musicList.get(i)).getGenre());
                }
            }
        }
    }

    public void SearchName(String title){
        String str ="" ;
        for(int i=0;i<musicList.size();i++){
            if(musicList.get(i).getName().equals(title)){
                if(musicList.get(i) instanceof AnimalSong) {str=((AnimalSong) musicList.get(i)).getType();}
                else if (musicList.get(i) instanceof ManagerSong) {
                    str = ((ManagerSong) musicList.get(i)).getGenre();
                }
                System.out.printf("\"%s, %d분, %s, %s\"\n",musicList.get(i).getName(),musicList.get(i).getTime(),musicList.get(i).getMusician(),str);
            }
        }
    }


}
