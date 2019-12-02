package homework;


public class Prac1_1_11 {
    public static void main(String[] args) {
        boolean[][] a = new boolean[10][10];//�½���ά����
        a = RandomInitial(a);//�����ʼ��
        TestPrint(a);//��ӡ����
    }

    public static void TestPrint(boolean[][] a) {
        for (int i = 0; i < a.length; i++)//��ӡ�к�
            System.out.print(" " + i);
        System.out.println(" "); //��õ� 0 1 2 3 4 5 6 7 8 9
        for (int i = 0; i < a.length; i++) {
            System.out.print(i); //ÿһ�п�ͷ������
            for (int j = 0; j < a.length; j++) {
                if (a[i][j])
                    System.out.print("*" + " ");
                else
                    System.out.print(" " + " ");
            }
            System.out.println(" "); //�����е�ģ��
        }
    }

    public static boolean[][] RandomInitial(boolean[][] a) {
        for (int i = 0; i < a.length; i++) //��
        {
            for (int j = 0; j < a.length; j++) //��
            {
                if (Math.random() > 0.5) //��ΪMath.random()��Χ��0-1
                    a[i][j] = true;
                else
                    a[i][j] = false;
            }
        }
        return a;
    }
}
