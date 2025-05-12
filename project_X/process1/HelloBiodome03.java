package project_X.process1;

public class HelloBiodome03 {
    public static void main(String[] args) {
        double temp; double humid; double oxygen;
        if(args.length<3){
            System.out.println("입력된 값이 올바르지 않습니다. [온도][습도][산소농도] 순서 대로 숫자 값을 입력해주세요");
            return;
        }
        try {
            temp=Double.parseDouble(args[0]);
            humid=Double.parseDouble(args[1]);
            oxygen=Double.parseDouble(args[2]);
            System.out.printf("생명지수 H = %.2f",calculation(temp,humid,oxygen));
            //소수점 셋째 자리에서 반올림,,

        }catch (NumberFormatException e){
            System.out.println("입력된 값이 올바르지 않습니다. [온도][습도][산소농도] 순서 대로 숫자 값을 입력해주세요");
            return;
        }


    }

    public static double root(double humid){
        if (humid < 0) {
            System.out.println("음수는 제곱근을 구할 수 없습니다.");
            return -1;
        }
        if (humid == 0 || humid == 1) {
            return humid;
        }
             return guessroot(humid,humid);
    }
    public static double abs(double r, double temp){
        if(r>temp){
            return r-temp;
        }
        else{
            return temp-r;
        }
    }
    public static double calculation(double temp, double humid, double oxygen){
        double result;
        double pie=3.14;
        result=0.415*abs(root(humid),temp)+(oxygen/(pie*pie));
        return result;
    }

    public static double guessroot(double r, double h){
        double next =(h+r/h)/2;
        if(h-next<0){
            if(-h+next<0.0001){
            return next;
            }
        }
        else
        {
            if(h-next<0.0001){
                return next;
            }
        }
        return guessroot(r,next);
    }

}
