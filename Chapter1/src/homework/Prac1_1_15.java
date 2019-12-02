package homework;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class Prac1_1_15 {
    private static int[] RandomInitialArray(int[] a) {
        for (int i=0;i<a.length;i++){
            a[i] =StdRandom.uniform(a.length-1);
        }
        return a;
    }
    public static int[] histogram(int[] a, int M) {
        int[] result = new int[M];
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0 && a[i] < M) {
                result[a[i]]++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
//        int[] a = {1, 1, 2, 3, 1, 7, 5, 3, 2, 2, 2};
        int N = StdIn.readInt();
        int[] a=RandomInitialArray(new int[N]);
        int[] result = histogram(a,10);
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%3d", result[i]);
        }
        System.out.println();
    }
}
