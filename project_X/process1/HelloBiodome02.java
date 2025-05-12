package project_X.process1;

public class HelloBiodome02 {
    public static void main(String[] args) {
        int sun; int wind; int ground;
        if(args.length<3){
            System.out.println("error : 인자가 부족합니다.");
            return;
        }
        try {
            sun = Integer.parseInt(args[0]); //태양광
            wind = Integer.parseInt(args[1]); //풍력
            ground = Integer.parseInt(args[2]); //지열
        } catch (NumberFormatException e){
            System.out.println("error : 숫자가 아닙니다");
            return;
        }
        int sum=sun+wind+ground;
        double s = (double)sun/sum*100;
        double w = (double)wind/sum*100;
        double g = (double)ground/sum*100;
        System.out.printf("총 에너지 사용량은 %d입니다.\n",sum);
        System.out.printf("태양광 %.10f%%, 풍력 %.10f%%, 지열 %.10f%%",s,w,g);

    }
}
