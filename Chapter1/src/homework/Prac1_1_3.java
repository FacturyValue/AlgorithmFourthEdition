package homework;

import edu.princeton.cs.algs4.StdIn;
import org.junit.Test;


public class Prac1_1_3 {
    public static void main(String[] args) {
        /*while (!StdIn.isEmpty()){
            StdIn.readInt();
        }*/
        int a = StdIn.readInt();
        int b = StdIn.readInt();
        int c = StdIn.readInt();
        if (a==b&&b==c)
            System.out.println("equal");
        else
            System.out.println("not equal");
    }
    @Test
    public void test(){
        int sum =0;
        for (int i=1;i<1000;i++)
            for (int j=0;j<i;j++)
                sum++;
        System.out.println(sum);//1+2+3+4+..+999=499500
    }
    @Test
    public void test1(){
        int[][] a =new int[][]{{1,1},{2,2}};
        int[] y = new int[]{1,1};
        int[] x = new int[a[0].length];
        for (int i=0;i<x.length;i++){
            for (int j=0;j<y.length;j++){
                x[i] +=  y[j] * a[j][i];
            }
                System.out.println(x[i]);
        }
    }
}
