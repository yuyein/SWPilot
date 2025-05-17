package project_X.process2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RoadToBiodome07 {
    public static String[] animals;
    public static Map<String,Integer> map = new LinkedHashMap<String,Integer>();
    public static int[] cnt;
    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("동물을 입력해주세요");
            return;
        }
        for (String arg : args) {
            if (arg.matches("\\d+")) {
                throw new IllegalArgumentException("숫자만 입력된 인자 발견: " + arg);
            }
        }

        animals = new String[args.length];

        countAnimals(args);

        //리스트를 정렬
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
        for (int i = 0; i < entryList.size() - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < entryList.size(); j++) {
                if (entryList.get(j).getValue() > entryList.get(minIdx).getValue()) {
                    minIdx = j;
                } else if (entryList.get(j).getValue() == entryList.get(minIdx).getValue()) {
                    String k1 = entryList.get(j).getKey();
                    String k2 = entryList.get(minIdx).getKey();
                    if (k1.compareTo(k2) < 0) {
                        minIdx = j;
                    }
                }
                Map.Entry<String, Integer> temp = entryList.get(i);
                entryList.set(i, entryList.get(minIdx));
                entryList.set(minIdx, temp);
            }
        }

        int c = 0;
        for (Map.Entry<String, Integer> entry : entryList) {
            if (c == entryList.size() - 1)
                System.out.println(entry.getKey());
            else
                System.out.printf("%s, ", entry.getKey());
            c++;
        }


}

    public static void countAnimals(String[] args){
        int cnt=0;
        for(String s : args){
            s=s.replace("[","").replace("]","").replace(",","").trim();
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }
            else {
                cnt=1;
                map.put(s,cnt);
            }
        }
    }
}