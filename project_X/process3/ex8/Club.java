package project_X.process3.ex8;
import java.util.ArrayList;
import java.util.List;

public class Club {
    private List<Member> members = new ArrayList<>();
    private List<Session> sessions = new ArrayList<>();

    public void addMember(Member member) {
        members.add(member);
    }

    public void addSession(Session session) {
        sessions.add(session);
    }

    public void getSessionsList() {
        System.out.println("---- 개설된 연습 전체 조회 ----");
        for (Session session : sessions) {
            System.out.printf("일자 : %d년 %d월 %d일 \t 장소 : %s \t 호스트 : %s \t 참여 멤버 : %s \t 상태 : %s \n",session.getDate().getYear(),session.getDate().getMonthValue(),
                    session.getDate().getDayOfMonth(),session.getPlace(),session.getHostName(),session.getListName(),session.getStatus());

        }
    }
}
