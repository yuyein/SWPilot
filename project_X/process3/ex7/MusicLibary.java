package project_X.process3.ex7;

import java.util.ArrayList;
import java.util.List;

public class MusicLibary {
    /*
    MusicLibary 클래스를 정의한다. 아래 기능을 수행한다.

새로운 음악을 추가할 수 있다. (추가된 음악의 정보가 출력된다.)

기존 음악 제목으로 삭제할 수 있다. (삭제된 음악 정보가 출력한다.)

동물을 위한(또는 사람을 위한) 모든 음악 조회하기

제목/대상 동물/장르 등 조건으로 음악 검색하기
     */
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
                    System.out.printf("\"%s, %d분, %s, %s\"\n",musicList.get(i).getName(),musicList.get(i).getTime(),musicList.get(i).getMusician(),((AnimalSong) musicList.get(i)).getType());
                }
            }
        }
        else if(s.equals("사람")){
            for(int i=0;i<musicList.size();i++){
                if(musicList.get(i) instanceof ManagerSong){
                    System.out.printf("\"%s, %d분, %s, %s\"\n",musicList.get(i).getName(),musicList.get(i).getTime(),musicList.get(i).getMusician(),((ManagerSong) musicList.get(i)).getGenre());
                }
            }
        }
    }

    public void SearchName(String title){
        String str ="" ;
        for(int i=0;i<musicList.size();i++){
            if(musicList.get(i).getName().equals(title)){
                if(musicList.get(i) instanceof AnimalSong) {str=((AnimalSong) musicList.get(i)).getType();} else if (musicList.get(i) instanceof ManagerSong) {
                    str = ((ManagerSong) musicList.get(i)).getGenre();
                }
                System.out.printf("\"%s, %d분, %s, %s\"\n",musicList.get(i).getName(),musicList.get(i).getTime(),musicList.get(i).getMusician(),str);
            }
        }
    }


}
