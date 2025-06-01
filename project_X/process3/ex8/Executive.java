package project_X.process3.ex8;

import java.time.LocalDateTime;

public class Executive extends Member{ //운영진
    public Executive(String name, LocalDateTime time){
        super(name, time);
    }

    public Executive(String name, LocalDateTime time, String skill){
        super(name, time, skill);
    }

}
