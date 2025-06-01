package project_X.process3.ex8;

import java.time.LocalDateTime;

public class NewMember extends Member{
    public NewMember(String name, LocalDateTime time){
        super(name, time);
    }

    public NewMember(String name, LocalDateTime time, String skill){
        super(name, time, skill);
    }
}
