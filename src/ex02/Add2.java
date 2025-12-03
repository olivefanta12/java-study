package ex02;

import java.util.Scanner;

public class Add2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y, sum;

        System.out.println("첫번째 숫자를 입력해주십시오 :");
        x = sc.nextDouble();

        System.out.println("두번째 숫자를 입력해주십시오 :");
        y = sc.nextDouble();

        sum = x + y ;
        System.out.println("합의 값은 :" + sum);
    }
}
