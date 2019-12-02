package homework;


import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 编写一段程序，创建一个N×N 的布尔数组a[][]。其中当i 和j 互质时（没有相同因子），a[i][j] 为true，否则为false。
 */
public class Prac1_1_30 {
   /* public static void main(String[] args) {
        boolean[][] array=RandomInitial(StdIn.readInt());
        for (int i=0;i<array.length-1;i++){
            for (int j=0;j<array[0].length-1;j++){
             if (array[i][j])
                 System.out.printf(" "+0);
             else
                 System.out.printf(" "+1);
            }
            System.out.println();
        }

    }
    public static boolean[][] RandomInitial(int N){
        boolean[][] a = new boolean[N][N];
        int d =2;
        for (int i=0;i<a.length-1;i++)
            for (int j=0;j< a[0].length-1;j++){
                if (i % d==0 || j % d==0)
                    a[i][j] = false;
                else
                    a[i][j] = true;
            }
        return a;
    }*/
    /**
     * 判断两数是否互质，若两数的最大公约数是1则两数互质
     * @param a
     * @param b
     * @return  若互质则true，否则false
     */
    private static boolean isCoprime(int a, int b) {
        for(int i = 2; i < Math.sqrt(a); ++i) {
            if(a % i == 0 && b % i == 0)
                return false;
        }
        return true;
    }

    /**
     * 使用2300多年前的欧几里得算法求解两数的最大公约数
     * @param p 数一
     * @param q 数二
     * @return  最大公约数
     */
    private static int gcd(int p, int q) {
        if(q == 0)
            return p;
        int r = p % q;
        return gcd(q, r);
    }

    private static boolean[][] boolArray(int N) {
        // 创建NxN的布尔二维数组
        boolean[][] boolArr = new boolean[N][N];
        for(int i = 1; i <= N; ++i)
            for(int j = 1; j <= N; ++j)
                if(1 == gcd(i,j))
                    boolArr[i - 1][j - 1] = true;
                else
                    boolArr[i - 1][j - 1] = false;
        return boolArr;
    }

    public static void main(String[] args) {
//        int N = 5;
//        boolean[][] boolArr = boolArray(N);
//        for(int i = 0; i < N; ++i) {
//            for (int j = 0; j < N; ++j)
//                StdOut.print(boolArr[i][j] + "\t");
//            StdOut.println();
//        }
        int N =StdIn.readInt();
        boolean[][] a = new boolean[N][N];
        for (int i=0;i<N;i++) {
            for (int j = 0; j < N; j++) {
                a[i][j] = eculid(i, j) == 1;
                StdOut.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int eculid(int p,int q){
        if (p < q){
            int t =p;
            p = q;
            q = t;
        }
        if (q == 0)
            return p;
        else
            return eculid(q,p % q);
    }
}
