package ex04;

import java.util.Scanner;

public class Cal01 {

    private static int aa;
    private static int bb;
    private static int minus;
    private static int add;
    private static int multi;
    private static int divide;

    // add, minus, multi, divide
    static void add(int a, int b){
        System.out.println("합의 값은 : "+(a+b));
    }
    static void minus(int a, int b){
        System.out.println("빼기의 값은 : "+(a-b));
    }
    static void multi(int a, int b){
        System.out.println("곱의 값은 : "+(a*b));
    }
    static void divide (int a, int b){
        System.out.println("나누기의 값은 : "+(a/b));
    }

    public static void main(String[] args) {
        int a = aa;
        int b = bb;
        int arr [] = {add, minus, multi, divide};

        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력 : ");
        int aa = sc.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("두번째 숫자를 입력 : ");
        int bb = sc.nextInt();

        Scanner sc3 = new Scanner(System.in);
        System.out.println("기호를 적으세요 (0) = 더하기");
        System.out.println("기호를 적으세요 (1) = 마이너스");
        System.out.println("기호를 적으세요 (2) = 곱하기");
        System.out.println("기호를 적으세요 (3) = 나누기");
        System.out.println("기호를 적으세요 : ");
        int c = sc.nextInt();

        if(c==0){
            add(aa, bb);
        } else if (c==1){
            minus(aa, bb);
        } else if (c==2){
            multi(aa, bb);
        } else if (c==3){
            divide(aa, bb);
        }

        //Cal01.add(3, 5); = 같은 파일일땐 cal01생략
        //add (aa, bb);



    }
}
