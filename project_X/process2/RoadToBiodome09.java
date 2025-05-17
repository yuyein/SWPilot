package project_X.process2;

import java.util.LinkedList;
import java.util.Queue;

public class RoadToBiodome09 {
    //public static List<>
    public static int[][] map; //지도
    public static int[][] visit; //방문여부
    public static int[]dx={-1,1,0,0};//상하좌우
    public static int[] dy ={0,0,-1,1};

    static int N;
    static int M;
    public static Queue<int[]> q = new LinkedList<>();
    public static void main(String[] args) {
        if(args.length<1){
            System.out.println("2차원 배열을 입력해주세요");
            return;
        }
        N = args.length;
        M = args[0].length();
        map = new int[N][M];
        visit = new int[N][M];
        for(int i=0;i<args.length;i++){
            String s = args[i];
            for(int j=0;j<s.length();j++){
                map[i][j]=s.charAt(j)-'0';
                visit[i][j]=-1;
            }
        }
        int result = bfs(0,0); //0,0에서 시작
        System.out.println(result);
        //그냥 출력
        for(int i=0;i<map.length;i++){
            for(int j=0;j<map[i].length;j++){
                System.out.printf("%d ",map[i][j]);
            }
            System.out.println();
        }


    }
    public static int bfs(int x, int y){
        if(map[x][y]==0||map[N-1][M-1]==0){
            return -1; //출발이 갈 수 없는 곳이거나 도착지점이 갈 수 없는 곳이거나
        }
        q.offer(new int[] {x,y}); //처음 시작(0,0)을 queue에 삽입
        visit[x][y]=0; //방문한 곳이라고 표시

        while(!q.isEmpty()){
            int[] current = q.poll();
            int currentX = current[0];
            int currentY = current[1];

            for(int i=0;i<4;i++){
                int nextX = currentX+dx[i];
                int nextY = currentY+dy[i];

                if(nextX>=0&&nextY>=0&&nextX<N&&nextY<M){ //범위 체크
                     if(map[nextX][nextY]==1&&visit[nextX][nextY]==-1){ //갈수있는 길인지, 방문한 적 없는 곳인지
                        visit[nextX][nextY]=visit[currentX][currentY]+1;
                        q.offer(new int[] {nextX,nextY});
                    }
                }
            }
            /*
            for(int i=0;i<map.length;i++){
                for(int j=0;j<map[i].length;j++){
                    System.out.printf("%3d ",visit[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            */
        }
        return visit[N-1][M-1];
    }
}
