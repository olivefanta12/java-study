package algo;

import ex04.People;

import javax.management.JMRuntimeException;
import java.util.Arrays;

//10찾기
public class BSearch01 {
    public static void main(String[] args) {
        int[] arr = {10, 4, 2, 3, 1};

        //1. 정렬 {1,2,3,4,10}
        Arrays.sort(arr);

        //2. 검색
        if (10 == arr[2]) {
            System.out.println("종료");
        }

        if (10 < arr[2]) { //false
            System.out.println("10은 커요");

            if (10 == arr[1]) {
                System.out.println("10을 찾았습니다.");
            }
        } else {
            System.out.println("10은 커요");

            if (10 == arr[3]) {
                System.out.println("10을 찾았습니다.");
            } else {
                System.out.println("arr[4]에 10이 있습니다.");
            }
        }


        System.out.println("main 끝");
    }
}

