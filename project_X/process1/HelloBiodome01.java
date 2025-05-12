package project_X.process1;

public class HelloBiodome01 {
    public static void main(String[] args) {
        //String name = args[0];
        if(args.length == 0){
            System.out.println("이름을 재입력해주세요");
            return;
        }
        String name = args[0];
        if(name.trim().equals("")){
            System.out.println("이름을 재입력해주세요");
        }
        else{

            System.out.printf("\"%s\"님, 안녕하세요",name);
        }
    }
    //보너스 문제
    public static String getName(String str, int index){
        if(index==10){
            return "";
        }
        return str.charAt(index)+getName(str,index+1);
    }
}