package project_X.process2;

import java.util.ArrayList;
import java.util.List;

public class RoadToBiodome01 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("값을 입력해주세요");
            return;
        }
        try {
            List<Integer> list = new ArrayList<Integer>();
            for (String i : args) {
                int value = Integer.parseInt(i.replace(",",""));
                if (value < 0 || value> 1000) {
                    System.out.println("입력된 값의 범위가 올바르지 않습니다. 0에서 1000까지의 값을 입력해주세요.");
                    return;
                } else {
                    list.add(value);
                }
            }
            /* 스트림 사용
            array= Arrays.stream(args)
                    .map(Integer::parseInt)
                    .toList();
            */
            System.out.println(cnt(list));
        } catch (NumberFormatException e) {
            System.out.println("숫자를 입력해주세요");
            return;
        }
    }


    public static List<Integer> cnt(List<Integer> list){
        List<Integer> number = new ArrayList<Integer>();
        List<Integer> count = new ArrayList<Integer>();
        for(int i=0;i<list.size()-1;i++)
        {
            int k = list.get(i);
            for(int j =i+1;j< list.size();j++)
            {
                if(k== list.get(j)){
                    count.add(list.get(i));
                }
            }
            if(!count.contains(list.get(i))){
                number.add(list.get(i));
            }
        }

        return number;
    }
}
