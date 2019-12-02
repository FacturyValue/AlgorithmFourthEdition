package homework;

import edu.princeton.cs.algs4.BinarySearch;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

/**
 *  随机匹配。编写一个使用BinarySearch 的程序，它从命令行接受一个整型参数T，
 *  并会分别针对N=10^3、10^4、10^5 和10^6
 *  将以下实验运行 T 遍：生成两个大小为N 的随机6 位正整数数组并找出同时存在于两个数组中的整数的数量。
 *  打印一个表格，对于每个N，给出T 次实验中该数量的平均值。
 */
public class Prac1_1_39 {
    public static void main(String[] args) {
        /*if (args.length < 1) {
            System.out.println("error!");
            return;
        }*/
//        int T = Integer.parseInt(args[0]);
        int T = StdIn.readInt();
        int[] num = new int[4];
        for (int i = 0; i < T; i++) {
            int N = 100;
            for (int j = 0; j < 4; j++) {
                N *= 10;
                int[] a = new int[N];
                int[] b = new int[N];
                for (int k = 0; k < N; k++) {
                    a[k] = StdRandom.uniform(100000, 1000000);
                    b[k] = StdRandom.uniform(100000, 1000000);
                }
                Arrays.sort(a);
                for (int k = 0; k < N; k++) {
                    if (BinarySearch.indexOf(a, b[k]) != -1) {
                        num[j]++;
                    }
                }
            }
        }
        System.out.println("   N\t Average");
        int N = 100;
        for (int i = 0; i < 4; i++) {
            N *= 10;
            System.out.printf("%7d %9.2f\n", N, (double) num[i] / T);
        }
    }

}
