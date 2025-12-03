package ex03;

import java.util.Scanner;

/**
 * 동전 종류 : 500, 100, 50, 10 - 4가지 종류
 * money를 입력받아서 1200원
 * 각각의 동전의 최소 개수를 구할예정
 */
public class CoinTest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("돈을 입력 : ");
        int money = sc.nextInt();
        int coin [] = {500, 100, 50, 10};
        int restMoney = money;
        int count = 0;

        // 1. 500원으로 나눠서 개수를 구할거다.
        // 500 100 50 10

        for (int i = 0; i <4; i++) {
            count = restMoney / coin[i];
            restMoney = restMoney%coin[i];
            System.out.println(coin[i]+"동전 갯수 : "+count);
            System.out.println("남은 금액 : "+restMoney + "원");
        }
        //count = restMoney / coin[0];
        //restMoney = restMoney%coin[0];
        //System.out.println("500동전 개수 : "+count);
        //System.out.println("남은 금액 : "+restMoney);

        //count = restMoney/coin[1];
        //restMoney = restMoney%coin[1];
        //System.out.println("100동전 개수 : "+count);
        //System.out.println("남은 금액 : "+restMoney);

        //count = restMoney/coin[2];
        //restMoney = restMoney%coin[2];
        //System.out.println("50동전 개수 : "+count);
        //System.out.println("남은 금액 : "+restMoney);

        //count = restMoney/coin[3];
        //restMoney = restMoney%coin[3];
        //System.out.println("10동전 개수 : "+count);
        //System.out.println("남은 금액 : "+restMoney);
    }
}