package homework;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * 乱序检查。
 * 通过实验检查表1.1.10 中的乱序代码是否能够产生预期的效果。编写一个程序ShuffleTest，
 * 接受命令行参数M 和N，将大小为M 的数组打乱N 次且在每次打乱之前都将数组重新初始化为a[i] = i。
 * 打印一个M×M 的表格，对于所有的列j，行i 表示的是i 在打乱后落到j 的位置的次数。数组中的所有元素的值都应该接近于N/M。
 */
public class Prac1_1_36 {
    public interface IShuffle
    {
        public void shuffle(int[] a);
    }

    public static void ShuffleTest(IShuffle shuffle, int m, int n)
    {
        int[][] s = new int[m][m];

        for (int k = 0; k < n; k++)
        {
            int[] a = new int[m];
            for (int i = 0; i < m; i++)
                a[i] = i;

            shuffle.shuffle(a);

            for (int i = 0; i < m; i++)
                s[i][a[i]]++;
        }

        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < m; j++)
                StdOut.printf("%7d", s[i][j]);
            StdOut.println();
        }
    }

    public static void main(String[] args)
    {
//        int m = Integer.parseInt(args[0]);
//        int n = Integer.parseInt(args[1]);
        int m = StdIn.readInt();
        int n = StdIn.readInt();

        // closure
        IShuffle shuffle = new IShuffle()
        {
            public void shuffle(int[] a)
            {
                StdRandom.shuffle(a);
            }
        };

        ShuffleTest(shuffle, m, n);
    }
}
