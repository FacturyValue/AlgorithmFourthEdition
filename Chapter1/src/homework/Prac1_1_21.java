package homework;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

/**
 * 编写一段程序，从标准输入按行读取数据，其中每行都包含一个名字和两个整数。
 * 然后用printf() 打印一张表格，每行的若干列数据包括名字、两个整数和第一个整数除以第二个整数的结果，精确到小数点后三位。
 * 可以用这种程序将棒球球手的击球命中率或者学生的考试分数制成表格。
 */
public class Prac1_1_21 {
    public static void main(String[] args) {
        System.out.print("Please input count:");
        int n = StdIn.readInt();
        String[] nameArray = new String[n];
        int[] integerArray1 = new int[n];
        int[] integerArray2 = new int[n];
        for (int i = 0; i < n; i++) {
            nameArray[i] = StdIn.readString();
            integerArray1[i] = StdIn.readInt();
            integerArray2[i] = StdIn.readInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("|%4s|%4d|%4d|%6.3f|\n", nameArray[i], integerArray1[i], integerArray2[i],
//                    (float) integerArray1[i] / integerArray2[i]);

                    (float) (integerArray1[i] + integerArray2[i])/2);
            if (i != n - 1) {
            }
        }
    }

}
