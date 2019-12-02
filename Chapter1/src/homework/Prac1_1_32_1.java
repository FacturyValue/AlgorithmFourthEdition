package homework;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * 假设标准输入流中含有一系列double 值。编写一段程序，从命令行接受一个整数N 和两个double 值l 和r。
 * 将(l，r) 分为N 段并使用StdDraw 画出输入流中的值落入每段的数量的直方图。
 * 此图也反映了伪随机数是均匀分布的。
 */
public class Prac1_1_32_1 {
    public static void main(String[] args) {
        In in = new In("algs4-data/largeW.txt");
        double[] whiteList = in.readAllDoubles();
//        @SuppressWarnings("resource")
//        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        for (int i=0;i<whiteList.length;i++){
            list.add(whiteList[i]);
        }
//        while (scanner.hasNextDouble()) {
//            list.add(scanner.nextDouble());
//        }
        int N = StdIn.readInt();
        double l = StdIn.readDouble();
        double r = StdIn.readDouble();
        int[] num = new int[N];
        int max = 0;
        double step = (r - l) / N;
        for (int i = 0; i < list.size(); i++) {
            double element = list.get(i);
            if (element >= l && element <= r) {
                for (int j = 0; j < N; j++) {
                    if (element > l + step * j && element <= l + step * j + step) {
                        num[j]++;
                        if (max < num[j]) {
                            max = num[j];
                        }
                    }
                }
            }
        }
        for (int i = 0; i < N; i++) {
            double x = (1.0 * i + 0.5) / N;
            double y = num[i] / (max * 2.0);
            double rw = 0.4 / N;
            StdDraw.filledRectangle(x, y, rw, y);
        }
    }
}
