package project_X.process3.ex8;

import java.time.LocalDateTime;

public class BiodomeFamily08 {
    public static void main(String[] args) {
        Club club = new Club();
        Member host = new Executive("Jone",LocalDateTime.now());
        Member c1 = new Common("Jane",LocalDateTime.now());
        Member c2 = new Common("Doe",LocalDateTime.now());
        Member n1 = new NewMember("Amy",LocalDateTime.now());
        Member n2 = new NewMember("Leo",LocalDateTime.now());

        club.addMember(host);
        club.addMember(c1);
        club.addMember(c2);
        club.addMember(n1);
        club.addMember(n2);

        Session session = new Session(LocalDateTime.now(),"도메 스타디움",host);

        club.addSession(session);
        club.getSessionsList();
        session.joinSession(c1,n1);
        club.getSessionsList();

    }



}
