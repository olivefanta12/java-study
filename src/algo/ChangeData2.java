package algo;

public class ChangeData2 {
    public static void main(String[] args) {

        int arr[] = {10, 9 , 8, 7 , 6 , 5 , 4 , 3, 2, 1};
        int b = 0;
        int k = 0;
//        int temp;
//        int a = 9;
//        int b = 0;
//        int row = arr.length/2;

        // 1. arr[0] arr[9] 교환
        for (int i = 0; i <10; i++) {


            for (int j = arr[k]; j > arr[k+1]; j++) {
                int temp = arr[k];
                arr[k] = arr[k+1];
                arr[k+1] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

//        for (int i = 0; i <row; i++) {
//
//        }
//        // 1. arr[0] arr[9] 교환
//        temp = arr[a];
//        arr[a] = arr[b];
//        arr[b] = temp;
//        a--;
//        b++;
//
////        // 2. arr[1] arr[8] 교환
////        temp = arr[a];
////        arr[a] = arr[b];
////        arr[b] = temp;
////        a--;
////        b++;
////
////        // 3. arr[2] arr[7] 교환
////        temp = arr[a];
////        arr[a] = arr[b];
////        arr[b] = temp;
////        a--;
////        b++;
////
////        // 4. arr[3] arr[6] 교환
////        temp = arr[a];
////        arr[a] = arr[b];
////        arr[b] = temp;
////        a--;
////        b++;
////        // 5. arr[4] arr[5] 교환
////        temp = arr[a];
////        arr[a] = arr[b];
////        arr[b] = temp;
////        a--;
////        b++;
//        for (int i = 0; i <arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }
//}
