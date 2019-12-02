package homework;

import edu.princeton.cs.algs4.StdIn;

public class Prac1_1_14 {
    public static void main(String[] args) {
        int N = StdIn.readInt();
        System.out.printf("the result of method log is :%s\r\n",lg(N));
    }

    private static int lg(int N) {
        int shiftRightCount=0;
        do {
            N>>=1;
            shiftRightCount++;
        }while (N !=0);
        return shiftRightCount-1;
    }
}
