package ex03;

import java.util.Scanner;

public class RockPaperScissor {
    final int 가위 = 0;
    final int 바위 = 1;
    final int 보 = 2;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("가위 = 0");
        System.out.println("바위 = 1");
        System.out.println("보 = 2");
        System.out.println("입력하세요 :");
        int user = sc.nextInt();

        int computer = (int) (Math.random() * 3);
        if (user == computer)
            System.out.println("비겼음");
        else if (user == (computer+1) % 3)
            System.out.println("인간 : " + user + "컴퓨터 : " + computer + "인간 승리" );
        else
            System.out.println("인간 : " + user + "컴퓨터 : " + computer + "컴퓨터 승리");

    }
}
