package ex04;

import java.util.Scanner;

public class Cal02 {

    private static int aa;
    private static int bb;
    private static int minus;
    private static int add;
    private static int multi;
    private static int divide;

    // add, minus, multi, divide
    static int add(int a, int b){
        //System.out.println("합의 값은 : "+(a+b));
        //return = int나 메서드
        //return 안하면 void
        return a+b;
    }
    static int minus(int a, int b){
        //System.out.println("빼기의 값은 : "+(a-b));
        return a-b;
    }
    static int multi(int a, int b){
        //System.out.println("곱의 값은 : "+(a*b));
        return a*b;
    }
    static int divide (int a, int b){
        //System.out.println("나누기의 값은 : "+(a/b));
        return a/b;
    }

    public static void main(String[] args) {
            int r1 = add(3, 5);
            int r2 = minus(3, 5);
            int r3 = multi(3, 5);
            int r4 = divide(3, 5);
        System.out.println(r1+r2+r3+r4);
        }

        //Cal01.add(3, 5); = 같은 파일일땐 cal01생략
        //add (aa, bb);



    }
