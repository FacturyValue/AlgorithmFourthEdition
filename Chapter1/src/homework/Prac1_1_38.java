package homework;

import edu.princeton.cs.algs4.*;

import java.util.Arrays;

/**
 * 二分查找与暴力查找。
 * 根据1.1.10.4 节给出的暴力查找法编写一个程序bruteForceSearch，
 * 在你的计算机上比较它和BinarySearch 处理largeW.txt 和largeT.txt 所需的时间。
 */
public class Prac1_1_38 {
    public static void main(String[] args) {

        In in = new In("algs4-data/largeW.txt");
        int[] whitelist = in.readAllInts();
        long startTime = System.currentTimeMillis();
        long endTime = System.currentTimeMillis();
        int key = StdIn.readInt();
        if (BruteForceSearch.rank(key, whitelist) == -1) {
            StdOut.println(key);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Brute force search time: " + (endTime - startTime));

        key = StdIn.readInt();
        startTime = System.currentTimeMillis();
        Arrays.sort(whitelist);
        if (BinarySearch.indexOf(whitelist, key) == -1) {
            StdOut.println(key);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Binary search time: " + (endTime - startTime));
    }

    /**
     * 二分查找 ： 非递归描述
     * @param key   关键字
     * @param arr   数组
     * @return  若找到则返回true，否则返回false
     */
    public static boolean BinaryLookup(int key, int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while(low <= high) {
            int mid = low + ((high - low) >> 1);
            if(key < arr[mid])
                high = mid - 1;
            else if(key > arr[mid])
                low = mid + 1;
            else
                return true;
        }
        return false;
    }
}
