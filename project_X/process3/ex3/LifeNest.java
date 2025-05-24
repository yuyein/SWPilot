package project_X.process3.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LifeNest {
    public static List<Organism> organismList = new ArrayList<>();

    public void addList(Organism c){
        System.out.printf("[LifeNest] %s 추가되었습니다.\n",c.getName());
        organismList.add(c);
    }

    public void deleteList(Organism c){
        System.out.printf("[LifeNest] %s 삭제되었습니다.\n",c.getName());
        organismList.remove(c);
    }

    public void printList(){
    System.out.println("\n전체 동식물 목록 출력:");
        for (int i = 0; i < organismList.size(); i++) {
            System.out.print((i + 1) + ". ");
            organismList.get(i).displayInfo();
        }
    }

    public void modifyHabitat(String name){
        for(int i =0;i<organismList.size();i++){
            if(organismList.get(i).getName()==name){
                Scanner s = new Scanner(System.in);
                System.out.printf("변경할 서식지를 입력해주세요: ");
                organismList.get(i).setHabitat(s.next());
                System.out.printf("[LifeNest] %s 서식지가 변경되었습니다.",name);
            }
        }
    }
    public void addOrganism(Organism c) {
        System.out.printf("[LifeNest] %s 추가되었습니다.\n",c.getName());
        organismList.add(c);

    }
    public void removeOrganism(Organism c) {
        System.out.printf("[LifeNest] %s 삭제되었습니다.\n",c.getName());
        organismList.remove(c);

    }
    public void displayAll(){
        System.out.println("\n전체 동식물 목록 출력:");
        for (int i = 0; i < organismList.size(); i++) {
            System.out.print((i + 1) + ". ");
            organismList.get(i).displayInfo();
        }
    }

}
