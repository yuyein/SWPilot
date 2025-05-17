package project_X.process2;

public class RoadToBiodome10 {
    public static final int MAX = 101;
    public static boolean graph[][] = new boolean[MAX][MAX];
    public static boolean visit[] = new boolean[MAX];
    public static boolean input[] = new boolean[MAX];
    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("입력을 확인하세요");
            return;
        }

        try{
            for(String s : args){
                String[] part = s.split(",");
                if(part.length!=2){
                    System.out.println("입력을 확인하세요");
                    return;
                }
                int relation1 = Integer.parseInt(part[0]);
                int relation2 = Integer.parseInt(part[1]);

                if (relation1 < 1 || relation1 > 100 || relation2 < 1 || relation2 > 100) {
                    System.out.println("식물 번호는 1~100 사이여야 합니다.");
                    return;
                }
                graph[relation1][relation2]=true;
                graph[relation2][relation1]=true;

                input[relation1]=true;
                input[relation2]=true;

            }
        }catch (NumberFormatException e){
            System.out.println("입력값이 숫자가 아닙니다");
            return;
        }

        int groupCount=0;
        boolean connection = false;
        for(int i=1;i<=100;i++){
            if(input[i]&&!visit[i]){
                dfs(i);
                groupCount++;
            }
        }
        System.out.println(groupCount);
    }
    public static void dfs(int current){
        visit[current]=true;
        for(int i=1;i<=100;i++){
            if(graph[current][i]&&!visit[i]){
                dfs(i);
                visit[i]=true;
            }
        }
    }
}
