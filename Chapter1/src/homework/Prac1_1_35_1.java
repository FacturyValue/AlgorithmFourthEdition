package homework;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;
/**
 * 实验题
 * 模拟掷骰子。以下代码能够计算每种两个骰子之和的准确概率分布：
 * int SIDES = 6;
 * double[] dist = new double[2 * SIDES + 1];
 * for(int i = 1; i <= SIDES; i++)
 *     for(int j = 1; j <= SIDES; j++)
 *         dist[i+j] += 1.0;
 * for (int k = 2; k <= 2*SIDES; k++)
 *     dist[k] /= 36.0;
 *
 *     dist[i] 的值就是两个骰子之和为i 的概率。用实验模拟N 次掷骰子，并在计算两个1 到 6 之间的随机整数之和时记录每个值的出现频率以验证它们的概率。
 *     N 要多大才能够保证你的经验数据和准确数据的吻合程度达到小数点后三位？
 */
public class Prac1_1_35_1 {
    public static void main(String[] args) {
        int SIDES = 6;
        double[] dist = new double[2 * SIDES + 1];
        for (int i = 1; i <= SIDES; i++) {
            for (int j = 1; j <= SIDES; j++) {
                dist[i + j] += 1.0;
            }
        }
        System.out.print("Probability:");
        for (int k = 2; k <= 2 * SIDES; k++) {
            dist[k] /= 36.0;
            System.out.printf("%6.3f", dist[k]);
        }
        System.out.println();
        int[] num = new int[2 * SIDES + 1];
        int N = StdIn.readInt();
        for (int i = 0; i < N; i++) {
            num[StdRandom.discrete(dist)]++;
        }
        double frequency;
        boolean isAccurate = true;
        System.out.print("Frequency:");
        for (int i = 2; i <= 2 * SIDES; i++) {
            frequency = (double) num[i] / N;
            System.out.printf("%6.3f", frequency);
            if (Math.abs(frequency - dist[i]) > 0.001) {
                isAccurate = false;
            }
        }
        System.out.println();
        System.out.println("Is accurate? " + isAccurate);
    }
}
