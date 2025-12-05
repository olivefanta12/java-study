package algo;


import java.util.Arrays;

public class BSearch06 {


    public static void main(String[] args) {
        int[] arr = {7, 4, 1, 2, 3, 0, 8, 5, 6, 8, 9, 10};

        Arrays.sort(arr); // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10// 11 개


        int target = 10;
        int startIndex = 0;
        int endIndex = arr.length-1;
        int mid = 0;
        int n = 1;

        // 1회전 s = 0, m = 5
        // 2회전 s = 6, e = 10  m = 8
        // 3회전 s = 6, e = 7   m = 6

        while (true){

            mid = (endIndex - startIndex)/2 + startIndex;
            if(target == arr[mid]){
                System.out.println(target + "을 찾았습니다("+n+"라운드): " + arr[mid]);
                break;
            }

            if (target < arr[mid]){
                endIndex = mid-1;
            }

            if (target > arr[mid]){
                startIndex = mid+1;
            }
            n++;
        }




    }
}
