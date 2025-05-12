package project_X.process1;

import java.util.ArrayList;
import java.util.List;

public class HelloBiodome07 {
    public static List<Character> list = new ArrayList<Character>();


    public static void main(String[] args) {
        String dna="";
        list.add('C');
        list.add('Y');
        list.add('J');
        list.add('E');
        list.add('H');
        if(args.length>1){
            for(int i =0;i< args.length;i++){
                dna+=args[i].toUpperCase();
            }
        }
        else {
            dna = args[0].toUpperCase();
        }
        String r = dnaZip(dna);
        System.out.println(r);

    }
    public static String dnaZip(String dna){
        String result="";
        int cnt=0;
        if(dna.isEmpty()){
            return " 염기서열이 입력되지 않았습니다.";
        }
        for(int i=0;i<dna.length();i++){
            char pre;
            if(i==0){
                pre=dna.charAt(i);
                cnt++;
            }
            else {
                pre=dna.charAt(i-1);
                if (list.contains(dna.charAt(i)) && pre == dna.charAt(i)) {
                    cnt++;
                } else if (list.contains(dna.charAt(i)) && dna.charAt(i) != pre) {
                    result = result + String.valueOf(pre);
                    result= result + String.valueOf(cnt);
                    cnt=1;
                }
                else if(!list.contains(dna.charAt(i))){
                    return "염기서열은 C, J, H, E, Y 다섯가지로만 입력됩니다. 확인하고 다시 입력해주세요";
                }
            }
        }
        result += dna.charAt(dna.length() - 1);
        result += cnt;
        return result;

    }
}
