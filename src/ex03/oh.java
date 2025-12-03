package ex03;

import java.util.Scanner;

public class oh {
    public static void main(String[] args) {
        //int solution(int num1, int num2) {
            int answer = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자1 입력: ");
        int num1 = sc.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("숫자2 입력: ");
        int num2 = sc2.nextInt();
            if(num1 == num2)
                System.out.print("1");
            else
                System.out.print("-1");
    }
}
