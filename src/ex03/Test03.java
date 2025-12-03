package ex03;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        String star = "*";
        int c = 5;
        int r = 5;

        for (int k = 0; k < r; k++) {
            for (int i = 0; i < c; i++) {
                System.out.print(star);
            }
            System.out.println();
            c--;
        }


    }
}
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        System.out.println("적어 :");
//
//        for (int i = 1; i < a; i++) {
//                System.out.println((a + i) * (a / 2));
//            }
//        }
//    }
