package homework;

/**
 * 1、当矩阵A的列数（column）等于矩阵B的行数（row）时，A与B可以相乘。
 * 2、矩阵C的行数等于矩阵A的行数，C的列数等于B的列数。
 * 3、乘积C的第m行第n列的元素等于矩阵A的第m行的元素与矩阵B的第n列对应元素乘积之和。
 * 乘法结合律： (AB)C=A(BC)．
 * 乘法左分配律：(A+B)C=AC+BC
 * 乘法右分配律：C(A+B)=CA+CB
 * 对数乘的结合性k(AB）=(kA)B=A(kB）．
 * 转置 (AB)T=BTAT．
 * 矩阵乘法一般不满足交换律。
 */
public class Matrix {
    /**
     * 向量点乘
     * 向量与向量相乘为数。
     * 数与向量相乘仍为向量
     * 向量相加减也为向量
     * a和b的点积公式为:a·b =a1·b1+...+an·bn
     * 向量是由n个实数组成的一个n行1列（n×1）或一个1行n列（1×n）的有序数组；
     * @param x
     * @param y
     * @return
     */
    public static double dot(double[] x, double[] y) {
        double result = 0;
        //注意：要求一维向量a和向量b的行列数相同。
        if (x.length == y.length) {
            for (int i = 0; i < y.length; i++) {
                result += x[i] * y[i];
            }
            return result;
        } else {
            System.out.println("Error!");
            return result;
        }
    }

    /**
     * 矩阵和矩阵之积
     * @param a
     * @param b
     * @return
     */
    public static double[][] mult(double[][] a, double[][] b) {
        if (a[0].length == b.length) {
            double[][] s = new double[a.length][b[0].length];
            for (int i = 0; i < s.length; i++) {
                for (int j = 0; j < s[0].length; j++) {
                    for (int k = 0; k < b.length; k++) {
                        s[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            return s;
        } else {
            System.out.println("Error!");
            return null;
        }
    }

    /**
     * 矩阵转置
     * a.length    行数
     * a[0].length 列数
     * @param a
     * @return
     */
    public static double[][] transpose(double[][] a) {
       double[][] s  = new double[a[0].length][a.length];
       for (int i=0;i<s.length;i++){
           for (int j=0;j<s[0].length;j++)
               s[i][j] = a[j][i];
       }
        return s;
        /*double[][] s = new double[a[0].length][a.length];
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                s[i][j] = a[j][i];
            }
        }*/
    }

    /**
     * 矩阵和向量之积
     * @param a
     * @param x
     * @return
     */
    public static double[] mult(double[][] a, double[] x) {
        if (a[0].length == x.length) {
            double[] y = new double[a.length];
            for (int i = 0; i < y.length; i++) {
                for (int j = 0; j < x.length; j++) {
                    y[i] += a[i][j] * x[j];
                }
            }
            return y;
        } else {
            return null;
        }
    }

    /**
     * 向量和矩阵之积
     * @param y
     * @param a
     * @return
     */
    public static double[] mult(double[] y, double[][] a) {
        if (y.length == a.length) {
            double[] x = new double[a[0].length];
            /*for (int i = 0; i < x.length; i++) {
                for (int j = 0; j < y.length; j++) {
                    x[i] += y[j] * a[j][i];
                }
            }*/
            for (int i=0;i<a[0].length;i++){
                for (int j=0;j<y.length;j++){
                    x[i] = x[i] + y[j] * a[j][i];
                }
            }
            return x;
        } else {
            return null;
        }
    }
}
