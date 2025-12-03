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
public class Gcd02 {
    public static void main(String[] args) {
        int a = 6;
        int b = 8;
        int n1 = 0; // index
        int n2 = 0;
        int arr[] = new int[a]; // [1][2][3][6][0][0]
        int arr1[] = new int[b];

        //if가 한줄일 경우 {}생략가능
        //ctrl + alt + l = 줄정렬
        // 1, 6 의 약수 채우기 =============================================
        if (a% 1 == 0) {
            arr[n1] = 1;
            n1++;

        }
        if (a% 2 == 0) {
            arr[n1] = 2;
            n1++;

        }
        if (a% 3 == 0) {
            arr[n1] = 3;
            n1++;

        }
        if (a% 4 == 0) {
            arr[n1] = 4;
            n1++;

        }
        if (a% 5 == 0) {
            arr[n1] = 5;
            n1++;

        }
        if (a% 6 == 0) {
            arr[n1] = 6;
            n1++;

        }

        if (b% 1 == 0){
            arr1[n2] = 1;
            n2++;
        }
        if (b% 2 == 0){
            arr1[n2] = 2;
            n2++;
        }
        if (b% 3 == 0){
            arr1[n2] = 3;
            n2++;
        }
        if (b% 4 == 0){
            arr1[n2] = 4;
            n2++;
        }
        if (b% 5 == 0){
            arr1[n2] = 5;
            n2++;
        }
        if (b% 6 == 0){
            arr1[n2] = 6;
            n2++;
        }
        if (b% 7 == 0){
            arr1[n2] = 7;
            n2++;
        }
        if (b% 8 == 0){
            arr1[n2] = 8;
            n2++;
        }

        // 3. 최대 공약수 구하기
        int result = 0;
        int c = 0;
        if (arr[c] == arr1[0]) result = arr[c];
        if (arr[c] == arr1[1]) result = arr[c];
        if (arr[c] == arr1[2]) result = arr[c];
        if (arr[c] == arr1[3]) result = arr[c];
        c++;

        if (arr[c] == arr1[0]) result = arr[c];
        if (arr[c] == arr1[1]) result = arr[c];
        if (arr[c] == arr1[2]) result = arr[c];
        if (arr[c] == arr1[3]) result = arr[c];



        System.out.println("메인끝");


        //System.out.println(arr1[0]); // = 무조건 값이 들어가는게 아니라 int = 0, double = 0.0
        //2. 8의 약수구하기 ===========================================================
    } // end of main

}
