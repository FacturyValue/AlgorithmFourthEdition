package homework;

/**
 *  使用1.1.6.4 节中的rank() 递归方法重新实现BinarySearch 并跟踪该方法的调用。每当该方法被调用时，
 *  打印出它的参数lo 和hi 并按照递归的深度缩进。提示：为递归方法添加一个参数来保存递归的深度。
 */
public class Prac1_1_22 {
    public static int rank(int key,int[] a){
        return rank(key,a,0,a.length-1,0);
    }

    private static int rank(int key, int[] a, int lo, int hi) {
        if (lo>hi) return -1;
        int mid =lo +(hi-lo) /2;
        if (key < a[mid])
            return rank(key,a,lo,mid-1);
        else if (key > a[mid])
            return rank(key,a,mid+1,hi);
        else
            return mid;
    }

    private static int rank(int key, int[] a, int lo, int hi,int depth){
        for (int i=0;i<depth;i++){
            System.out.printf(" ");
        }
        System.out.printf("lo is %s,hi is %s,depth is %d \r\n",lo,hi,depth);
        if (lo >hi) return -1;
        int mid =lo +(hi-lo) /2;
        if (key < a[mid])
            return rank(key,a,lo,mid-1,depth+1);
        else if (key > a[mid])
            return rank(key,a,mid+1,hi,depth+1);
        else
            return mid;
    }

    public static void main(String[] args) {
        int[] a ={1, 2, 3, 4, 6, 7, 8, 9, 12,14,19,22};
        int key =5;
        int position = rank(key,a);
        if (position == -1)
            System.out.println("not found!");
        else
            System.out.printf("positon is %d \r\n",position);
    }
}
