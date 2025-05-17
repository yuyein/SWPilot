package project_X.process2;

public class RoadToBiodome08 {
    public static int[] queue=new int[1000];
    public static int front=0;
    public static int rear=0;
    public static int max=1000;
    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("입력을 확인하세요");
            return;
        }

        for(int i=0;i<args.length;i++){
            enqueue(Integer.parseInt(args[i]));
        }
        for(int i=0;i<queue.length;i++){
            int v = peek();
            if(queue[i]==0){
                break;
            }
            System.out.printf("자원 %d을 제공했습니다.\n",v);
            dequeue();
        }
        System.out.println("모든 요청이 처리되었습니다");


    }
    public static void enqueue(int n){
        if(rear==max-1){
            System.out.println("Queue is Full");
            return;
        }
        queue[rear++]=n;
    }
    public static int dequeue(){
        if(front==rear){
            return -1;
        }
        return queue[front++];
    }
    public static int peek(){
        return queue[front];
    }
}
