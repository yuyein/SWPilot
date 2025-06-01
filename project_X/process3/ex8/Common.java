package project_X.process3.ex8;

import java.time.LocalDateTime;

public class Common extends Member{
    public Common(String name, LocalDateTime time){
        super(name, time);
    }

    public Common(String name, LocalDateTime time, String skill){
        super(name, time, skill);
    }
}
