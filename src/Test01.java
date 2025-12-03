public class Test01 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int price) {
                int answer = 0;

                    if (price >= 100000 && price < 300000) {
                        answer = (int) (price - (price * 5 / 100.0));
                    } else if (price >= 300000 && price < 500000) {
                        answer = (int) (price - (price * 10 / 100.0));
                    } else if (price >= 500000 && price <=1000000) {
                        answer = (int) (price - (price * 20 / 100.0));
                    }else if (price < 100000 && price >=10){
                        answer = price;
                    }
                return answer;
            }
        }
    }
}








