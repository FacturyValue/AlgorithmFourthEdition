public class Main {

    public static void main(String[] args) {
//        String s1 = new String("hello");
        String s1 ="hello";
        String s2 = s1;
        s1 = "world";
        System.out.println(s1);//world
        System.out.println(s2);//hello
    }

}
