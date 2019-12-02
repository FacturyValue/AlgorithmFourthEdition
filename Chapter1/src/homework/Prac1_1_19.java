package homework;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 计算机用这段程序在一个小时之内能够得到F(N) 结果的最大N 值是多少？
 * 开发F(N) 的一 个更好的实现，用数组保存已经计算过的值。
 */
public class Prac1_1_19 {
    public static void main(String[] args) {
//        System.out.println(Long.MAX_VALUE);//9223372036854775807
//        System.out.println(Long.MIN_VALUE);//-9223372036854775808
        int M=StdIn.readInt();
        long[] fibonacci = F(M);
        for (int N = 0; N < M+1; N++) {
            StdOut.println(N + " " + fibonacci[N]);
        }
    }

    /*public static int F (int n){
        if (n==0) return 0;
        if (n==1) return 1;
        return F(n-1)+F(n-2);
    }*/
    public static long[] F(int N) {
        long[] fibonacci = new long[N+1];
        if (N==0) return fibonacci;
        fibonacci[1]=1;
        if (N==1) return fibonacci;
        for (int i=2;i<=N;i++){
            fibonacci[i] = fibonacci[i-1]+fibonacci[i-2];
        }
        return fibonacci;
    }
}
