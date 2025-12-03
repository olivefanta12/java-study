package ex03;

import java.util.Scanner;

public class StarTest01 {
    public static void main(String[] args) {
        int b = 3;


        Scanner sc = new Scanner(System.in);
        System.out.println("입력 : ");
        int a = sc.nextInt();

        for (int i = a; i>0; i--) {
            for (int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i <=a; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = a; i >0; i--) {
            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }
            for (int k = a; k >=i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }

//        for (int i = a; i >0; i--) {
//            for (int j = 0; j <i; j++) {
//                System.out.println(" ");
//            }
//            for (int k = a; k >=i; k--) {
//                System.out.println("*");
//            }
//            System.out.println();
//
//        }

//        1+8
//        3+6
//        5+4
//        7+2
//        9
        //System.out.print(" ");
        //System.out.print(" ");
        //System.out.print(" ");
        //System.out.print(" ");
        //System.out.print("*");
        //System.out.println();

        //System.out.print(" ");
        //System.out.print(" ");
        //System.out.print(" ");
        //System.out.print("*");
        //System.out.print("*");
        //System.out.println();

        //System.out.print(" ");
        //System.out.print(" ");
        //System.out.print("*");
        //System.out.print("*");
        //System.out.print("*");
        //System.out.println();

        //System.out.print("*");
        //System.out.print("*");
        //System.out.println();

        //System.out.print("*");
        //System.out.println();




       // for (int i = a; i >=1; i--) {
       //     for (int j = 1; j <=i; j++) {
       //         System.out.print("*");
       //     }
        //    System.out.println();
       // }
        }
    }
