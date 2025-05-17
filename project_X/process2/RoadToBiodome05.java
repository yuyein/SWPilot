package project_X.process2;

public class RoadToBiodome05 {
    public static int[] array;
    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("두개의 배열을 입력해주세요");
            return;
        }
        //따로 들어온 두 배열을 하나의 배열로 합치는 과정
        array = new int[args.length]; //하나의 배열로 만들 배열 선언
        /*
        int[] array = new int[args.length];
        int index = 0;

        for (String arg : args) {
            // 대괄호 제거 + 공백 제거 + 쉼표 제거
            arg = arg.replace("[", "").replace("]", "").replace(",", "").trim();

            try {
                array[index++] = Integer.parseInt(arg);
            } catch (NumberFormatException e) {
                System.out.println("숫자로 변환할 수 없는 입력: " + arg);
            }
        }
         */
        int arrcnt=0;
        for(int k=0;k<args.length;k++){
            String input=args[k];
            if(args[k].contains("[")) {
               input= input.replace("[", "");
            }
            if(args[k].contains("]")) {
                input=input.replace("]", "");
                arrcnt+=1;
            }

            if(input.length()>1){
                input=input.substring(0,input.length()-1);
            }
            array[k] = Integer.parseInt(input);

        }
        if(arrcnt<2){
            System.out.println("두개의 배열을 입력해주세요");
            return;
        }

        quicksort(0,array.length-1);

        for(int j =0;j<array.length;j++){
            System.out.printf("%d ",array[j]);
        }



    }
    public static void swap(int first, int second){
        int temp = array[first];
        array[first]=array[second];
        array[second]=temp;
    }

    public static void quicksort(int start, int end){
        if(start>=end) return;
        int index = partition(start,end);
        quicksort(start,index-1);
        quicksort(index,end);
    }
    public static int partition(int start, int end){
        int pivot = array[(start+end)/2]; //배열의 중간에 있는 값을 pivot으로 잡기
        while(start<=end){
            while(array[start]<pivot) start++;
            while(array[end]>pivot) end--;
            if(start<=end){
                swap(start,end);
                start++;
                end--;
            }
        }
        return start; //다음 분할 시작점
    }
}
