package ex03;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("x의 값을 적으세요 :");
        int x = sc.nextInt();

        System.out.println("y의 값을 적으세요 :");
        int y = sc.nextInt();

        if (x > y) {
            System.out.println("MAX" + "x" + x);
        }else
            System.out.println("MIN" +x );

    }
}
