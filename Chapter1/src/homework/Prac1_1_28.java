package homework;

import edu.princeton.cs.algs4.BinarySearch;
import edu.princeton.cs.algs4.StdIn;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 删除重复元素。
 * 修改BinarySearch 类中的测试用例来删去排序之后白名单中的所有重复元素。
 */
public class Prac1_1_28 {
    public static void main(String[] args) {
        int[] whitelist = { 7, 1, 5, 1, 9, 5, 7, 7, 5, 1 };
        Arrays.sort(whitelist);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i < whitelist.length-1;i++){
            if (whitelist[i] !=whitelist[i+1])
                list.add(whitelist[i]);
        }
        list.add(whitelist[whitelist.length-1]);
        whitelist = new int[list.size()];
        for (int i =0;i<whitelist.length;i++){
            whitelist[i] = list.get(i);
            System.out.print(whitelist[i]+" ");
        }

//        Integer[] array = list.toArray(new Integer[list.size()]);
        System.out.println();
        System.out.println(BinarySearch.indexOf(whitelist, StdIn.readInt()));
    }
}
