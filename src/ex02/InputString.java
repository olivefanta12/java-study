package ex02;

import java.util.Scanner;

public class InputString {
    public static void main(String[] args) {
        String name;
        int age;

        Scanner sc = new Scanner(System.in);

        System.out.println("이름을 입력하세요 :");
        name = sc.nextLine();

        System.out.println("나이를 입력하세요 :");
        age = sc.nextInt();

        System.out.println(name + "입니다.");
        System.out.println(age + "살");
    }
}
