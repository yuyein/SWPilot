package project_X.process1;

public class HelloBiodome09 {
    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("숫자를 입력해주세요");
            return;
        }
        try{
            int n = Integer.parseInt(args[0]);
            if(!(n>=3&&n<=100)){
                System.out.println("잘못된 입력입니다. 3~100사이의 숫자를 입력하세요");
                return;
            }
            String blank=" ";
            int star=1;
            int b=n;
            for(int i=0;i<n;i++) {
                for (int j = 0; j < b;j++ ) {
                    System.out.printf(blank);
                }
                for(int k=0;k<star;k++){
                    System.out.printf("*");
                }
                System.out.printf("\n");
                b-=1;
                star+=2;
            }
            for(int i=0;i<n;i++){
                System.out.printf(" ");
            }
            System.out.printf("|");

        }catch (NumberFormatException e){
            System.out.println("잘못된 입력입니다. 3~100사이의 숫자를 입력하세요");
            return;
        }


    }
}
