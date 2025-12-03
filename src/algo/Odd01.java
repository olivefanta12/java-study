package algo;

/**
 * 1부터 100까지 수 중 출력하는데, 홀수면 홀수, 짝수면 짝수를 출력하시오
 * 1. 비즈니스 파악하기 ex 주제에 관한 정보 습득
 * 2. 샘플링하기 ex 1~5까지 만들기 (짧을수록 오류날 가능성이 높음)
 * 3. 노가다
 * 4. 패턴짜기
 */
public class Odd01 {
    public static void main(String[] args) {
        int num = 1;
        String result = "홀수";


        //num = 1
        if (num%2 == 0){ //false
            result = "짝수";
        }else{
            result = "홀수";
        }
        System.out.println(num+"은"+result+"입니다"); // 홀수
        num++;


        //num = 2
        if (num%2 == 0){ //true
            result = "짝수";
        }else{
            result = "홀수";
        }
        System.out.println(num+"은"+result+"입니다"); // 짝수
        num++;

        //num = 3
        if (num%2 == 0){
            result = "짝수";
        }else{
            result = "홀수";
        }
        System.out.println(num+"은"+result+"입니다");
        num++;

        if (num%2 == 0){
            result = "짝수";
        }else{
            result = "홀수";
        }
        System.out.println(num+"은"+result+"입니다");
        num++;

        if (num%2 == 0){
            result = "짝수";
        }else{
            result = "홀수";
        }
        System.out.println(num+"은"+result+"입니다");
        num++;
    }
}
