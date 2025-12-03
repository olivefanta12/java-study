package algo;

public class ChangeData {
    public static void main(String[] args) {
        // {1,2,3} -> {3,2,1}
        int[] arr = {1,2,3};

        int temp = arr[2]; // temp = 3, {1,2,3}
        arr[2] = arr[0]; // temp = 3 {1,2,1}
        arr[0] = temp; // temp = 3 {3,2,1}
        // sum = sum +1  =누적연산
        // int temp = 수학연산


        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
