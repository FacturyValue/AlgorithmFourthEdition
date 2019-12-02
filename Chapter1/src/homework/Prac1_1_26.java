package homework;

import edu.princeton.cs.algs4.StdIn;

/**
 * 将三个数字排序。假设a、b、c 和t 都是同一种原始数字类型的变量。证明以下代码能够将a、 b、c 按照升序排列：
 */
public class Prac1_1_26 {
    public static void main(String[] args) {
        int a = StdIn.readInt();
        int b = StdIn.readInt();
        int c = StdIn.readInt();
        int t;
        if (a > b) {
            t = a;
            a = b;
            b = t;
        }
        if (a > c) {
            t = a;
            a = c;
            c = t;
        }
        if (b > c) {
            t = b;
            b = c;
            c = t;
        }
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    }
}
