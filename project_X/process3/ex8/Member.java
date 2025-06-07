package project_X.process3.ex8;

import java.time.LocalDateTime;

public class Member {
    private String name;
    private LocalDateTime time;
    private String skill;
    public Member(String name, LocalDateTime time){
        this.name= name;
        this.time = time;
    }
    public Member(String name, LocalDateTime time, String skill){
        this.name=name;
        this.time=time;
        this.skill=skill;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public String getSkill() {
        return skill;
    }
}
