package ex03;

import java.util.Scanner;

public class GetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, value = 0;

        while(value != -1) {
            sum = sum + value;
            System.out.println("정수 입력 :");
            value = sc.nextInt();
        }
        System.out.println("정수의 합 : " + sum);
    }
}
