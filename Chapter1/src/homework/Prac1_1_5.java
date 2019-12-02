package homework;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import org.junit.Test;


public class Prac1_1_5 {
    public static void main(String[] args) {
//        double x = StdIn.readDouble();
//        double y = StdIn.readDouble();
//        if ((x>=0&&x<=1)&&(y>=0&&y<=1))
//            System.out.println(true);
//        else
//            System.out.println(false);
        System.out.println(exR1(StdIn.readInt()));
    }
    public static String exR1(int n){
        if (n<=0)
            return "";
        String s=exR1(n-3)+n+exR1(n-2)+n;
        return s;
    }

    /**
     * ���Ϊһ��Fibonacci
     */
    @Test
    public void guessResult(){
        int f=0;
        int g=1;
        for (int i=0;i<=15;i++){
            StdOut.println(f);
            f+=g;
            g=f-g;
        }
    }
    @Test
    public void listResult(){
        double t=9.0;
        while (Math.abs(t-9.0/t) > .001)
            t=(9.0/t + t)/2.0;
        StdOut.println(t);
    }
    @Test
    public void listSum(){
        int sum=0;
        for (int i=1; i<1000;i++)
            sum++;
        StdOut.print(sum);
    }
    @Test
    public void listjSum2(){
        int sum=0;
        for (int i=1;i<1000;i*=2){
            for (int j=0;j<1000;j++)
                sum++;
        }
//        StdOut.println(sum);
//        StdOut.println(Math.pow(2.0,10.0));
//        char a ='a';
//        System.out.println('a'+1);
//        System.out.println('b'+4);
//        System.out.println('c'+'b');
//        System.out.println((char)('a'+4));
//        System.out.println(4.1>=4);
//        double e =2.0e-6;
//        System.out.println( 2.0e-6);
        System.out.println(0.000002*100000000.0);
        System.out.println(2.0e-6*100000000.1);
        System.out.println(true&&false || true&&true);
    }
}
