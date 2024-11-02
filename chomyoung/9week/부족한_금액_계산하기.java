public class 부족한_금액_계산하기 {

    public static void main(String[] args) {

    }

    private static class Solution {
        // 등차수열
        public long solution(int price, int money, int count) {
            long answer = money - (long) price * count * (count + 1) / 2;
            return answer < 0 ? -answer : 0;
        }
    }
}