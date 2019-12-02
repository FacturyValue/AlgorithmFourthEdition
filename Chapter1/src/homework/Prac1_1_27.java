package homework;

/**
 * 1.1.27 二项分布。
 * 估计用以下代码计算binomial(100, 50) 将会产生的递归调用次数：
 * 将已经计算过的值保存在数组中并给出一个更好的实现。
 *
 * 思路：用二维数组存储已计算的概率，下次需要时则直接取出即可，免去了再花时间去完成同样的计算，例如：binom[N][k] = (1.0 - p) * binomial(N - 1, k, p) + p * binomial(N - 1, k - 1, p);
 */
public class Prac1_1_27 {
    private static long COUNT = 0;
    private static long COUNT2 = 0;
    private static double[][] MATRIX;
    public static  double binomial(int N,int k,double p){
        COUNT++;
        if (N==0 && k==0) return 1.0;
        if (N < 0 || k < 0) return 0.0;
        return (1.0-p)*binomial(N-1,k,p)+ p*binomial(N-1,k-1,p);
    }



    public static void main(String[] args) {
//        System.out.println("result: " + binomial(100, 50, 0.25) + ", count: " + COUNT);
        System.out.println("result: " + betterBinomial(100, 50, 0.25) + ", count: " + COUNT2);
    }

    private static double betterBinomial(int N, int k, double p) {
        MATRIX = new double[N+1][k+1];
        for (int i=0;i <N+1;i++) {
            for (int j = 0; j < k+1; j++)
                MATRIX[i][j] = -1;
        }
        return bin(N,k,p);
    }

    private static double bin(int N, int k, double p) {
        COUNT2++;
        if (N == 0 && k == 0) {
            return 1.0;
        }
        if (N < 0 || k < 0) {
            return 0.0;
        }
        if (MATRIX[N][k] == -1)
            MATRIX[N][k] = (1.0-p)*bin(N-1,k,p)+p* bin(N-1,k-1,p);
        return MATRIX[N][k];
    }
}
