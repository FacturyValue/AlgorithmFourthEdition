package homework;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class Prac1_1_13 {
    public static void main(String[] args) {
//        int M = StdIn.readInt();
//        int N = StdIn.readInt();
//        double[][] a = new double[M][N];
//        double[][] newArray =ranDomInitial(a);
//        //���������ת��
//        transposition(newArray);

        int M = StdIn.readInt();
        int N = StdIn.readInt();
        int[][] a = new int[M][N];
        //�����������
        int[][] newArray=ranDomInitial(a);
        //��ӡת�ú�ľ��� ����һ
//            printTransposedMatrix(newArray);
        //��ӡת�ú�ľ��� ������
        transposition(newArray);
    }
    public static void printTransposedMatrix(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("%4d", matrix[j][i]);
            }
            System.out.println();
        }
    }

    private static void transposition(int[][] a) {
        int rowNum= a.length;   //a�����еĳ���
        int colNum=a[0].length; //a�����еĳ���

        int[][] array=new int[colNum][rowNum];
            System.out.println(" ");
        for (int i=0;i<colNum;i++){
            for (int j=0;j<rowNum;j++){
                array[i][j]=a[j][i];
                System.out.printf("%4d",array[i][j]);
            }
            System.out.println();
        }
    }

    private static int[][] ranDomInitial(int[][] a) {
        int rowNum= a.length;
        int colNum =0;
        if (rowNum>0)
            colNum=a[0].length;
            for (int i=0;i<colNum;i++)
                System.out.print(" "+i);
            System.out.println();
            for (int i=0; i<rowNum;i++) {
                System.out.print(i);
                for (int j = 0; j < colNum; j++) {
                    if (StdRandom.uniform() >= 0.5)
                        a[i][j] = 1;
                    else
                        a[i][j] = 2;
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
            return a;

    }
}
