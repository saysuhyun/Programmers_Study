public class 부족한_금액_계산하기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(3, 20, 4));
    }

    static class Solution {
        public long solution(int price, int money, int count) {
            long totalCost = price * (long) count * (count + 1) / 2;

            long shortage = totalCost - money;

            return shortage > 0 ? shortage : 0;
        }
    }
}
