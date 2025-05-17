package project_X.process2;

public class RoadToBiodome04 {
    public static int [] array;
    public static void main(String[] args) {
        //선택정렬 구현
        if(args.length==0){
            System.out.println("입력을 확인해주세요");
            return;
        }
        else {
            array = new int[args.length];
        }
        String[] tokens=new String[args.length];
        for(int i=0;i<args.length;i++){
            if(args[i].length()>1){
                tokens[i] = args[i].substring(0,args[i].length()-1);
            }
            else tokens[i]=args[i];
        }
       for(int i=0;i<args.length;i++){
           array[i]=Integer.parseInt(tokens[i]);
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
        double median=findMedian();
        for(int i=0;i<array.length;i++){
            System.out.printf("%d ",array[i]);
        }
        if(array.length%2==0)
            System.out.printf("\n평균값 : %.1f 중앙값 : %.1f",mean,median);
        else
            System.out.printf("\n평균값 : %.1f 중앙값 : %d",mean,(int)median);

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

