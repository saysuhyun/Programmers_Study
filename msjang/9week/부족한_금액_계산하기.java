public class 부족한_금액_계산하기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(3, 20, 4);

    }

    static class Solution {
        // 놀이기구 이용 횟수 count.
        // 놀이기구 이용료 price

        public long solution(int price, int money, int count) {

            long totalPrice = 0;

            for (int i = 1; i <= count; i++) {
                totalPrice += price * i;
            }
            long result = money - totalPrice;
            if (result > 0){
                return 0;
            }else {
                return -1*result;
            }

        }
    }

}