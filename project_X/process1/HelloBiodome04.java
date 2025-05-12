package project_X.process1;

public class HelloBiodome04 {
    public static double[][] element= {{0,0,0},{0,0,0}};
    public static void main(String[] args) {
        if(args.length<3){
            System.out.println(" 입력된 값이 올바르지 않습니다. [온도][습도][산소농도] 순서대로 숫자 값을 입력해주세요");
        }
        try{
            element[0][0]=Double.parseDouble(args[0]); //온도
            element[0][1]=Double.parseDouble(args[1]); //습도
            element[0][2]=Double.parseDouble(args[2]); //산소농도

            if(right(element)){
                double h=0.415*Math.abs(Math.sqrt(element[0][1])-element[0][0])+element[0][2]/(3.14*3.14);
                System.out.printf("생명의 나무는 안정적인 상태입니다. 건강지수는 %.2f입니다.",h);
            }
            else {
                String problem;
                if(element[1][0]==0) problem="온도";
                else if (element[1][1]==0) problem="습도";
                else problem="산소농도";
                System.out.printf("%s값이 정상 범위를 벗어났습니다. 확인이 필요합니다.",problem);
            }


        }catch (NumberFormatException e)
        {
            System.out.println(" 입력된 값이 올바르지 않습니다. [온도][습도][산소농도] 순서대로 숫자 값을 입력해주세요");
        }
    }

    public static boolean right(double[][] element){
        if(element[0][0]>=10 && element[0][0]<27.5){
            element[1][0]=1;
            if(element[0][1]>40 && element[0][1]<60){
                element[1][1]=1;
                if(element[0][2]>=19.5&&element[0][2]<=23.5){
                    element[1][2]=1;
                    return true;
                }
                else {
                    return false;
                }
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
}
