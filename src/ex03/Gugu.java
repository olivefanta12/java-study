package ex03;

import java.util.Scanner;

public class Gugu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력 :");
        int gugu = sc.nextInt();

        for (int i = 1; i <10; i++) {
            System.out.println(gugu+"*"+i+"="+gugu*i);
        }
        //System.out.println("2*2 = 4");
        //System.out.println("2*3 = 6");
        //System.out.println("2*4 = 8");
    }
}
