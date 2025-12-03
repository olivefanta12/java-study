package ex02;

public class TypeConversion {
    public static void main(String[] args) {
        int i;
        double f;


        f = 1 / 5;
        System.out.println(f);

        f = 1.5 / 10;
        System.out.println(f);

        f = (double) 1 / 5;
        System.out.println(f);

        f = (double) -1.5 / 2.3;
        System.out.println(f);

        i = (int) 1.7 + (int) 1.8;
        System.out.println(i);

        i = (byte) 1 + (byte) 2;
        System.out.println(i);
    }
}
