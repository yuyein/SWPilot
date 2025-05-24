package project_X.process3.ex6;

import java.util.ArrayList;
import java.util.List;

public class BiodomeFamily06 {
    public static void main(String[] args) {
        Animals a = new Animals("제니","원숭이",4);
        Animals b = new Animals("고먀","코끼리",4);
        Animals c = new Animals("타이","호랑이",9);
        Animals d = new Animals("로아","코뿔소",5);
        Animals e = new Animals("바비","사슴",7);

        List<Animals> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        //사슴은 호랑이 앞에 올 수 없음, 5살 이하 코끼리는 호랑이 앞에 올 수 없음
        list.sort((x, y) -> {
            // x가 먼저 와야 하면 -1
            // y가 먼저 와야 하면 1
            // 같으면 0
            // 호랑이는 항상 사슴이나 어린 코끼리보다 먼저
            if (x.getType().equals("호랑이") &&
                    (y.getType().equals("사슴") ||
                            (y.getType().equals("코끼리") && y.getAge() <= 5))) {
                return -1;
            }
            return 0; // 그 외는 순서 유지
        });

        int index =0;
        for(Animals animals : list){
            animals.printInfo();
            if(index<list.size()-1)
                System.out.printf(", ");
            index++;
        }
    }
}
