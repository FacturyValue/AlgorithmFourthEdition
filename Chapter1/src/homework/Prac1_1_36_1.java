package homework;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * 乱序检查。
 * 通过实验检查表1.1.10 中的乱序代码是否能够产生预期的效果。编写一个程序ShuffleTest，
 * 接受命令行参数M 和N，将大小为M 的数组打乱N 次且在每次打乱之前都将数组重新初始化为a[i] = i。
 * 打印一个M×M 的表格，对于所有的列j，行i 表示的是i 在打乱后落到j 的位置的次数。数组中的所有元素的值都应该接近于N/M。
 */
public class Prac1_1_36_1 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Error");
            return;
        }
        int M = Integer.parseInt(args[0]), N = Integer.parseInt(args[1]);
        int[] a = new int[M];
        int[][] num = new int[M][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                a[j] = j;
            }
            StdRandom.shuffle(a);
            for (int j = 0; j < M; j++) {
                num[a[j]][j]++;
            }
        }
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}
