package algo;

/**
 * 1~100까지의 수에서 2의 배수를 출력하시오.
 * 1. 비즈니스
 * 2. 샘플링
 * 3.노가다
 * 4.패턴
 */

public class T01 {
    public static void main(String[] args) {
        int num = 1;
        String result = "맞음";

        if (num%2 == 0) {
            result = "맞음";
            System.out.print(num+" ");
        } else {
            result = "틀림";
        }
        num++;


        if (num%2 == 0) {
            result = "맞음";
            System.out.print(num+" ");
        } else {
            result = "틀림";
        }
        num++;


        if (num%2 == 0) {
            result = "맞음";
            System.out.print(num+" ");
        } else {
            result = "틀림";
        }
        num++;

        if (num%2 == 0) {
            result = "맞음";
            System.out.print(num+" ");
        } else {
            result = "틀림";
        }
        num++;

        if (num%2 == 0) {
            result = "맞음";
            System.out.print(num+" ");
        } else {
            result = "틀림";
        }
        num++;
    }
}
