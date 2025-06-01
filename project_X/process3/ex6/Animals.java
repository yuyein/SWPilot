package project_X.process3.ex6;

public class Animals { //ex3의 Animal과 차이를 두기 위해서 Animals로 작성
    private String name;
    private String type;
    private int age;
    public Animals(String name, String type, int age){
        setName(name);
        setType(type);
        setAge(age);
    }
    public void printInfo(){
        System.out.printf("%s(%s, %d살)",getName(),getType(),getAge());
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {this.age = age;}
    public void setType(String type) {
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getType() {
        return type;
    }
}
