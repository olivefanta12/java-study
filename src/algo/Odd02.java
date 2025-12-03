package algo;

/**
 * 1부터 100까지 수 중 출력하는데, 홀수면 홀수, 짝수면 짝수를 출력하시오
 * 1. 비즈니스 파악하기 ex 주제에 관한 정보 습득
 * 2. 샘플링하기 ex 1~5까지 만들기 (짧을수록 오류날 가능성이 높음)
 * 3. 노가다
 * 4. 패턴짜기
 */
public class Odd02 {
    public static void main(String[] args) {
        int num = 1;
        String result = "홀수";


        for (int i = 0; i < 4; i++) {
            if (num % 2 == 0) {
                result = "홀수";
            } else {
                result = "짝수";
            }
            num++;
            System.out.println(num+result);
        }
    }
}
