package homework;

import edu.princeton.cs.algs4.StdIn;

import java.util.Scanner;

public class Prac1_1_9 {
    public static void main(String[] args) {
        /*int N=StdIn.readInt();
        String s="";
        for (int n=N;n>0;n /=2)
            s=(n % 2)+s;
        System.out.println(s);*/
//        Scanner input = new Scanner(System.in);
//        int N;
//        N=input.nextInt();
//        String s ="";
//        while (N!=0){
//            s = (N%2)+s;
//            N /=2;
//        }
//        System.out.println(s);
        Scanner input = new Scanner(System.in);
        String s ="";
        for (int n=input.nextInt();n>0;n/=16){
            s = (n %16)+s;
        }
        System.out.println(s);
    }
}
