package algo;

public class ChangeData3 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 1};
        int temp;
//        int a = 0;
//        int b = arr[0];
//        int c = arr[1];
//        int ab = arr.length;

        for (int j = 1; j <arr.length; j++) {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] > arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }
        }

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr [k] + " ");
        }


            //1회전

//        if (arr[0] > arr[1]) {
//            temp = arr[1];
//            arr[1] = arr[0];
//            arr[0] = temp;
//        }
//        if (arr[1] > arr[2]) {
//            temp = arr[2];
//            arr[2] = arr[1];
//            arr[1] = temp;
//        }
//        if (arr[2] > arr[3]) {
//            temp = arr[3];
//            arr[3] = arr[2];
//            arr[2] = temp;
//        }
//        //2회전
//
//        if (arr[0] > arr[1]) {
//            temp = arr[1];
//            arr[1] = arr[0];
//            arr[0] = temp;
//        }
//        if (arr[1] > arr[2]) {
//            temp = arr[2];
//            arr[2] = arr[1];
//            arr[1] = temp;
//
//        //3회전
//        }
//        if(arr[0]>arr[1]){
//            temp = arr[1];
//            arr[1] = arr[0];
//            arr[0] = temp;
//        }
            }
        }