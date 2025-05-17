package project_X.process2;

import java.util.ArrayList;
import java.util.List;

public class RoadToBiodome02 {
    public static List<String> stack = new ArrayList<String>();
    public static int top=0;
    public static int bottom=0;
    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("입력된 메시지가 올바르지 않습니다. 다시 한번 확인해주세요.");
            return;
        }

        String str ="" ;
        String origin ="";
        for(int i=0;i<args.length;i++){
            origin = args[i];
            for(int j =0;j<args[i].length();j++) { //문자열 push
                push(String.valueOf(args[i].charAt(j)));
            }
            if(i!=args.length-1)
                push(" ");
        }
        while(top>0){
            str+=pop();
        }
        if(origin.equals(str)){
            System.out.println("회문입니다. : " + origin);
        }
        else {
            System.out.printf("%s", str);
        }
        //보너스 문제

        /*
        if(check.trim().equals("")){
            System.out.println("문자를 입력해주세요");
            return;
        }*/
    }
    public static void push(String s){
        stack.add(s);
        top++;
    }

    public static String pop(){
        if(top==0){
            return "";
        }
        String s=stack.get(top-1);
        top--;
        return s;
    }

    public static boolean isEmpty(){
        if(top==0) return true;
        else return false;
    }

    public static String peek(){
        if(top==0){
            return "";
        }
        return stack.get(top-1);
    }
}
