package project_X.process1;

public class HelloBiodome05 {
    public static void main(String[] args) {
        int g; int h;
        System.out.println(cal1());

    }
    public static int cal1(){
        int g; int h;
        int n=0; int m=0;
        for(g =0;g<16;g++){
            for(h=0;h<16;h++){
                if((g&1>>g<<2|h+g^h)==1 && (g%2<<h>>g|(1&0^0))==2){
                    n=h;
                    m=g;
                }
            }
        }
        return cal2(n,m);
    }
    public static int cal2(int h, int g){
        return (h*h+g)*(h<<h)+(g<<g);
    }
}
