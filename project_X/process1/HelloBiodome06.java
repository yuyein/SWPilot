package project_X.process1;

public class HelloBiodome06 {
    public static void main(String[] args) {
        if(args.length<2){
            System.out.println("두 개의 유전자 코드를 입력해주세요.");
            return;
        }
        String str1 = args[0];
        String str2 = args[1];

        //int cnt=0;
        int check=0;
        if(str1.length()!=str2.length()){
            System.out.println("일치하지 않습니다");
        }
        else{
            int i=0;
            while(i<str1.length()){
                if(str1.charAt(i)!=str2.charAt(i)){
                    check=1;
                    break;
                }
                i++;
            }
            if(check==0){
                System.out.println("동일한 유전자 코드입니다.");
            }
            else {
                System.out.println("일치하지 않습니다");
            }
        }

    }
}
