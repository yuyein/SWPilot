package project_X.process3.ex8;

import java.time.LocalDateTime;

public class NewMember extends Member implements Manage{
    public NewMember(String name, LocalDateTime time){
        super(name, time);
        System.out.printf("%s님 신규 멤버로 가입되었습니다.\n",getName());
    }

    public NewMember(String name, LocalDateTime time, String skill){
        super(name, time, skill);
        System.out.printf("%s님 신규 멤버로 가입되었습니다.\n",getName());
    }

    @Override
    public boolean cancel() {
        return false;
    }

    @Override
    public boolean open() {
        return false;
    }
}
