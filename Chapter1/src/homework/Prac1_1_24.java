package homework;
/**
 *  给出使用欧几里德算法计算105 和24 的最大公约数的过程中得到的一系列p 和q 的值。扩展该算法中的代码得到一个程序Euclid，从命令行接受两个参数，计算它们的最大公约数并打印出每次调用递归方法时的两个参数。
 *  使用你的程序计算1 111 111 和1 234 567 的最大公约数。
 */

import edu.princeton.cs.algs4.StdIn;
public class Prac1_1_24 {
    public static void main(String[] args) {
        int a =StdIn.readInt();
        System.out.println("=========");
        int b =StdIn.readInt();
        System.out.println(calculator(a,b));
    }

    private static int calculator(int p, int q) {
        System.out.printf("the value p is %d,the value q is %d\r\n",p,q);
        if (p==0 || q==0)
            return 0;

        if (p < q ){
            int temp =p;
            p=q;
            q=temp;
        }
        if (p % q ==0)
            return q;
        return calculator(q,p %q);
    }
}
