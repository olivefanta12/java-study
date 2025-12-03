package ex02;

import java.util.Scanner;

public class AreaTest {
    public static void main(String[] args) {
        final double PI = 3.141592; //final = 수정불가 Read Only로 변경한다는 뜻
        double area;
        // double radius, area;
        //radius = 5.0;
        //area = PI * radius * radius;
        //System.out.println("반지름이 5인 원의 면적은 :" + area);

        Scanner sc = new Scanner(System.in);
        System.out.println("반지름을 넣어주세요 :");
        double radius = sc.nextDouble();

        area = PI * radius * radius;
        System.out.println("반지름" + radius + "길이의 면적은 :"+ area + "입니다.");

    }
}
