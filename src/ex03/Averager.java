package ex03;

import java.util.Scanner;

public class Averager {
    public static void main(String[] args) {
        int total = 0,  count = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("점수 입력 : ");
            int grade = sc.nextInt();
            if (grade < 0)  break;
            total += grade;
            count++;
        }
        System.out.println("평균 : " + total / count);
    }
}
