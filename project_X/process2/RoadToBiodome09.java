package project_X.process2;

public class RoadToBiodome09 {
    //public static List<>
    public static int[][] map;
    public static void main(String[] args) {
        if(args.length<1){
            System.out.println("2차원 배열을 입력해주세요");
            return;
        }
        map = new int[args.length][args[0].length()];
        for(int i=0;i<args.length;i++){
            String s = args[i];
            for(int j=0;j<s.length();j++){
                map[i][j]=s.charAt(j)-'0';
            }
        }
        //그냥 출력
        for(int i=0;i<map.length;i++){
            for(int j=0;j<map[i].length;j++){
                System.out.printf("%d ",map[i][j]);
            }
            System.out.println();
        }

        //0은 이동 x, 1은 이동 가능





    }
}
