package ex03;

import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        long fact = 1;
        int n;

        System.out.println("정수를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1; i <=n; i++)
            fact =fact * i;

        System.out.printf("%d! 는 %d입니다. \n",n ,fact);

    }
}
