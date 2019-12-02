package homework;


import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * 为BinarySearch 类添加一个静态方法rank()，它接受一个键和一个整型有序数组（可能存在重复键）作为参数并返回数组中小于该键的元素数量，
 * 以及一个类似的方法count() 来返回数组中等于该键的元素的数量。
 * 注意：如果i 和j 分别是rank(key,a) 和count(key,a)的返回值，那么a[i..i+j-1] 就是数组中所有和key 相等的元素
 */
public class Prac1_1_29 {
    /**
     * 二分查找统计
     * @param key   待查找关键字
     * @param arr   待查找数组
     * @return  返回小于key的个数即等于key的第一个元素的索引值，若找不到则返回-1
     */
    private static int countLowers(int key, int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while(low <= high) {
            int mid = low + ((high - low) >> 1);
            if(key < arr[mid])
                high = mid - 1;
            else if(key > arr[mid])
                low = mid + 1;
            else {
                while(mid > 0 && arr[mid] == arr[mid - 1])              // 注意判断条件的先后顺序
                    -- mid;
                return mid;
            }
        }
        return low;     // -1; 根据算法原理可知low是小于key的个数
    }

    /**
     * 统计与key相等的个数
     * @param key   待查找关键字
     * @param arr   待查找数组
     * @return  返回与key相等的个数
     */
    private static int countEquals(int key, int[] arr) {
        int lowers = countLowers(key, arr);
        int idx = lowers;
        if(idx == arr.length || key != arr[idx])                        // 注意判断条件的先后顺序
            return 0;
        int cnt = 1;
        while((idx < arr.length - 1) && (arr[idx] == arr[idx + 1])) {   // 注意判断条件的先后顺序
//            ++ cnt;
//            ++ idx;
            cnt++;
            idx++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        // 从文件读取数据
        In in = new In("algs4-data/tinyW.txt");
        int[] whiteList = in.readAllInts();
        // 排序并打印输出
        Arrays.sort(whiteList);
        for(int idx = 0; idx < whiteList.length; ++idx)
            StdOut.print(whiteList[idx] + "\t");
        StdOut.println();
        // 从控制台读取关键字
        int key = StdIn.readInt();
        int lowers = countLowers(key, whiteList);
        StdOut.println("小于\t" + key + "\t的个数是：\t" + lowers);
        int equals = countEquals(key, whiteList);
        StdOut.println("等于\t" + key + "\t的个数是：\t" + equals);
    }
}
