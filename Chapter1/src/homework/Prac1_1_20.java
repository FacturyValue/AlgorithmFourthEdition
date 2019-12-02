package homework;

import edu.princeton.cs.algs4.StdIn;

/**
 * 编写一个递归的静态方法计算 ln( N! ) 的值。
 */
public class Prac1_1_20 {
    public static void main(String[] args) {
        double a=calculator(StdIn.readInt());
        System.out.println(a);
    }
    private static double calculator(int N) {
        if (N==0) return 0;
        if (N==1) return 0;
        return  Math.log(N)+calculator(N-1);
    }
    public static double ln(int N){
        if (N==0)
            return 0;
        else
            return Math.log(N)+ln(N-1);
    }

}
