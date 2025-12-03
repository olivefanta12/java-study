package ex03;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        double speed;

        Scanner sc = new Scanner(System.in);
        System.out.println("속도를 입력하세요 : ");
        speed = sc.nextDouble();

        if (speed <= 100 && speed >= 60)
            System.out.println("정상속도");
        else
            System.out.println("비정상속도");
    }
}
