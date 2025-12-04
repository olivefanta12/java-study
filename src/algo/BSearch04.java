package algo;

import java.util.Arrays;

// 4 찾기
public class BSearch04 {
    public static void main(String[] args) {
        int[] arr = {1,4,3,2,5,7,8,9,6}; // 9개

        // 1. 정렬
        Arrays.sort(arr); // 1,2,3,4,5,6,7,8,9
                          // 0,1,2,3,4,5,6,7,8
        int target = 8;
        int mid = arr.length/2; // 3
        int a = arr.length-1;
        int start = arr[0];
        int end = arr[a];

        // 2. 검색
        if(target == arr[mid]){
            System.out.println(target+"를 찾았습니다.");
            return;
        }

        if(target > arr[mid]){ // 1,2,3,4,[5],6,7,8,9
            mid = 4;
        }

        if(target < arr[mid]){ // 1,2,3,4,5,6,7,8,9
            mid = 4;
        }

        if(target == arr[mid]){ // 1,2,3,4,5,6,7,8,9
            System.out.println(target+"를 찾았습니다.");
            return;
        }

        if(target > arr[mid]){
            mid = 6;
        }

        if(target < arr[mid]){
            mid = 8;
        }

        if(target == arr[mid]){ // 0, 1, 2, 3, 4, 10, [11]
            System.out.println(target+"를 찾았습니다.");
            return;
        }


        System.out.println("main끝");
    }
}

