package project_X.process3.ex8;

import java.time.LocalDateTime;

public class Executive extends Member implements Manage{ //운영진
    public Executive(String name, LocalDateTime time){
        super(name, time);
        System.out.printf("%s님 운영진으로 가입되었습니다.\n",getName());
    }

    public Executive(String name, LocalDateTime time, String skill){
        super(name, time, skill);
        System.out.printf("%s님 운영진으로 가입되었습니다.\n",getName());
    }


    @Override
    public boolean cancel() {
        return true;
    }

    @Override
    public boolean open() {
        return true;
    }


}
