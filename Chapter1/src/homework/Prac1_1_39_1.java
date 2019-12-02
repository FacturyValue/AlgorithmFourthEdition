package homework;

import edu.princeton.cs.algs4.BinarySearch;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;
/**
 *  随机匹配。编写一个使用BinarySearch 的程序，它从命令行接受一个整型参数T，
 *  并会分别针对N=10^3、10^4、10^5 和10^6
 *  将以下实验运行 T 遍：生成两个大小为N 的随机6 位正整数数组并找出同时存在于两个数组中的整数的数量。
 *  打印一个表格，对于每个N，给出T 次实验中该数量的平均值。
 */
public class Prac1_1_39_1 {
    public static int experiment(int n)
    {
        int[] a = new int[n],
                b = new int[n];

        for (int i = 0; i < n; i++)
        {
            a[i] = StdRandom.uniform(100000, 1000000);
            b[i] = StdRandom.uniform(100000, 1000000);
        }

        Arrays.sort(b);

        int count = 0;
        for (int i = 0; i < n; i++)
            if (BinarySearch.rank(a[i], b) >= 0)
                count++;

        return count;
    }

    public static void batch(int t, int n)
    {
        long count = 0;
        for (int i = 0; i < t; i++)
            count += experiment(n);

        double avg = 1.0 * count / t;

        StdOut.printf("%8d: %9.2f\n", n, avg);
    }

    public static void main(String[] args)
    {
//        int t = Integer.parseInt(args[0]);
        int t = StdIn.readInt();

        int[] ns = { 1000, 10000, 100000, 1000000 };

        for (int i = 0; i < ns.length; i++)
            batch(t, ns[i]);

    }
}
