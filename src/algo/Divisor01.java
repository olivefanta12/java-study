package algo;

import java.util.Scanner;

/**
 * 12의 약수를 출력하시오.
 * 1. 비즈니스 이해 12를 1부터 12까지 다 나누어서 떨어지면 약수
 * 2. 샘플링 만들기 = 6의 약수 구하기
 * 3. 노가다
 * 4. 패턴찾기
 */
public class Divisor01 {
    public static void main(String[] args) {
        int Divisor = 1;
        int Divisorcount = 0;
        int Divisorcount1 = 0;
        String DivisorString = "맞음";


        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력 :");
        int Divisoraa = sc.nextInt();

        System.out.println("숫자를 입력 :");
        int Divisoraa1 = sc.nextInt();

        int[] s1 = new int[Divisoraa];
        int[] s2 = new int[Divisoraa1];
        int DivisorlastNum = 0;


        for (int i = 1; i <= Divisoraa; i++) {
            if (Divisoraa % i == 0) {
                s1[i - 1] = i;
                System.out.println(i + "은 약수 " + DivisorString);
                Divisorcount++;
            }
        }
        System.out.println();
        System.out.println();

        for (int i = 1; i <= Divisoraa1; i++) {
            if (Divisoraa1 % i == 0) {
                s2[i - 1] = i;
                System.out.println(i + "은 약수 " + DivisorString);
                Divisorcount1++;
            }
        }


        System.out.println();
        System.out.println();

        System.out.println(Divisoraa + "약수 갯수 :" + Divisorcount);
        System.out.println(Divisoraa1 + "약수 갯수 :" + Divisorcount1);

        for (int i = 0; i <=Divisoraa-1; i++) {
            for (int j = 0; j <=Divisoraa1-1; j++) {
                if(s1[i] == s2[j]){
                    if (s1[i] >= DivisorlastNum){
                        DivisorlastNum = s1[i];
                    }
                }
            }
        }
        System.out.println("최대 공약수 : "+DivisorlastNum);

//        }else if (s1[aa-1] < s2[aa1-1]) {
//            System.out.println("최대 공약수 입니다. : " + s2[aa1-1]);
//        }

    }
}
