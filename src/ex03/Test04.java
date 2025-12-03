package ex03;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        String space = " ";
        String star = "*";

        Scanner sc = new Scanner(System.in);
        System.out.println("몇 줄 : ");
        int a = sc.nextInt();

        for (int i = 1; i <=a; i++) { //i는 몇줄(a)로 할것인가 ?
            //1행
            for (int j = a; j >i; j--) { // j = 첫행에 띄어쓰기가(a) 나와야 하고 그다음부터 줄어듬
                System.out.print(space); // j = j는 점점 작아지니 높이보다 작아지면 안됨 역방향으로 내려오는 삼각형이라 봄
            }
            for (int k = 0; k <i; k++) { // k = 별이 한개에서 점점 늘어나야함
                System.out.print(star);  // k = k는 점점 커지니 i(높이)보다 커야함 직각삼각형
            }
            System.out.println();  //한줄 입력하고 띄어쓰기 해야함
        }                          // 두개의 삼각형을 붙혀놓은느낌
    }
}
