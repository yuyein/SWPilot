package project_X.process3.ex8;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Session {
    /*
    연습 세션은 연습 날짜, 연습 장소, 참석 멤버, 개설자, 진행 상태 정보를 가진다.

연습 세션 진행 상태에는 개설, 취소 두 가지가 있다.

날짜와 장소 정보로 세션을 검색해 취소할 수 있다.

날짜와 장소 정보로 세션을 검색해 연기할 수 있으며, 연습 날짜만 변경한다.
     */
    private LocalDateTime date  ;
    private String place;
    private List<Member> list = new ArrayList<>();
    private Member host;
    private boolean status; //false이면 취소, true이면 오픈

    public Session(LocalDateTime time, String place, Member host){
        if((host instanceof Executive && ((Executive) host).open())||(host instanceof Common &&((Common)host).open())){
            this.date=time;
            this.place=place;
            this.host=host;
            setStatus(true);
            System.out.printf("[Session - %s]이 %d년 %d월 %d일, %s에 연습 세션을 오픈했습니다.\n",host.getName(),time.getYear(),time.getMonthValue(),time.getDayOfMonth(),place);
        }
        else {
            System.out.printf("[Session - %s]님은 아직 연습 세션을 오픈할 등급이 아닙니다.\n",host.getName());
        }
    }

    public void joinSession(Member... memebers){
        for(Member m : memebers){
            list.add(m);
        }
        String listmember="";
        for(int i=0;i<list.size();i++){
            listmember+=list.get(i).getName();
            if(i<list.size()-1) {
                listmember += ",";
            }
        }
        System.out.println("[Session]"+listmember+"이 연습에 참가했습니다");
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getPlace() {
        return place;
    }

    public List<String> getListName() {
        return list.stream()
                .map(member -> member.getName())
                .toList();
    }

    public String getHostName() {
        return host.getName();
    }

    public boolean getStatus(){
        return this.status;
    }



    public void modifySession(Member member, LocalDateTime time){
        if (host instanceof Executive && host.equals(member)) {
            System.out.printf("[Session - %s] %d년 %d월 %d일 %s 에서 진행되는 연습 날짜가 연기 되었습니다.\n",
                    member.getName(),time.getYear(),time.getMonthValue(),time.getDayOfMonth() ,place);
        }

    }
    public void removeSession(Member member){
        if (host instanceof Executive && host.equals(member)) {
            System.out.printf("[Session] %d년 %d월 %d일 %s 연습 세션이 취소되었습니다.\n",
                    member.getName(),date.getYear(),date.getMonthValue(),date.getDayOfMonth() ,place);
            setStatus(false);
        }

    }
    public void setStatus(boolean status) {
        this.status = status;
    }
}
