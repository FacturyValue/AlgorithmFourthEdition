package homework;

public class Prac1_1_18 {
    public static void main(String[] args) {
        int a=mystery(3,11);
        System.out.println(a);
    }

    private static int mystery(int a, int b) {
        if (b==0)
            return 1;
        if (b % 2==0)
            return mystery(a+a,b/2);
        return mystery(a+a,b/2)*a;
    }
}
