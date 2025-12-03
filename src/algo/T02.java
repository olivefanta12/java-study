package algo;

/**
 * 1~100까지의 수에서 2의 배수를 출력하시오.
 * 1. 비즈니스
 * 2. 샘플링
 * 3.노가다
 * 4.패턴
 */

public class T02 {
    public static void main(String[] args) {
        int num = 1;


        for (int i = 1; i <=100; i++) {
            if (num%2 == 0) {
                System.out.print(num+" ");
            }
            num++;
        }

    }
}
