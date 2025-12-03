package algo;

/**
 * 6의 약수를 구하고, 8의 약수를 구해서 최대공약수를 찾아라
 * 1. 비즈니스 (6을 1~6까지 나눠서 떨어지는 약수 = 배열에 넣기)
 * 2.         (8을 1~8까지 나눠서 떨어지는 약수 = 배열에 넣기)
 * 3. arr1 = [1,2,3,6]
 * 4. arr2 = [1,2,4,8]
 * 5. 두수의 약수를 비교해서 최대공약수 찾기
 * 6. 후보 1 -> 2 -> X
 */

public class Gcd04 {
    //공급
    //책임 = 약수를 구해서 리턴하기 함수는 1개의 책임
    static int[] 약수구하기(int a){
        int arr[] = new int[a];
        int k1 = 1;
        int n1 = 0;

        for (int i = 0; i < a; i++) {
            if (a% k1 == 0) {
                arr[n1] = k1;
                n1++;
            }
            k1++;
        }
        return arr;

    }

    static int 최대공약수구하기(int arr[], int arr1[]){
//        int arr[] = 약수구하기(6); = 합성함수
//        int arr1[] = 약수구하기(8);

        int result = 0;
        int c = 0;

        for (int i = 0; i <4; i++) {
            for (int j = 0; j <4; j++) {
                if (arr[c] == arr1[j]) result = arr[c]; //if가 한줄일 경우 {}생략가능
            }
            c++;
        }
        return result;
    }
    public static void main(String[] args) {
        // 1. 약수구하기
        int arr[] = 약수구하기(6);
        int arr1[] = 약수구하기(8);


        // 2. 최대 공약수 구하기

        int result = 최대공약수구하기(arr, arr1);

        // 3. 출력하기

        System.out.println("최대공약수 : "+result);



        System.out.println("메인끝");


        //System.out.println(arr1[0]); // = 무조건 값이 들어가는게 아니라 int = 0, double = 0.0
        //2. 8의 약수구하기 ===========================================================
    } // end of main

}
