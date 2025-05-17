package project_X.process2;

public class RoadToBiodome06 {
    public static int[] array;
    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("두개의 배열을 입력해주세요");
            return;
        }
        array=new int[args.length];

        int n=0;
        int m=0;
        int cnt=0;
        int c=0;
        int index=0;
        int arrcnt=0;
        for(String s:args){
            if(s.contains("]")) {
                if (c!=1) n=cnt;
                else m=cnt;
                arrcnt+=1;
                cnt=0;
                c=1;
            }
            cnt++;
            s=s.replace("[","").replace("]","").replace(",","").trim();
            array[index++]=Integer.parseInt(s);
        }
        System.out.printf("n: %d, m: %d\n",n+1,m+1);

        if(arrcnt<2){
            System.out.println("두개의 배열을 입력해주세요");
            return;
        }

        for(int i=0;i<array.length-1;i++){
            int minIdx = i;
            for(int j = i+1;j<array.length;j++){
                if(array[j]<array[minIdx]){
                    minIdx=j;
                }
            }
            int temp = array[i];
            array[i]=array[minIdx];
            array[minIdx]=temp;
        }

        double mean = findMean();
        double median = findMedian();

        System.out.printf(" Mean : %.1f, Median : %.1f",mean,median);

    }
    public static double findMean(){
        double sum =0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return sum/array.length;
    }
    public static double findMedian(){
        double median=0;
        if(array.length%2==0){
            int mid1=array[(array.length/2)-1];
            int mid2 = array[array.length/2];
            median=(mid1+mid2)/2.0;
        }
        else {
            int mid=array.length/2;
            median=array[mid];
        }
        return median;
    }
}

