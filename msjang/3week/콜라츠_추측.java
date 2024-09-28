public class 콜라츠_추측 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int result = solution.solution(1);
        System.out.println(result);
    }

    static class Solution {
        public int solution(int num) {
            if (num == 1)
                return 0;

            long numLong = (long) num;
            for (int i = 1; i <= 500; i++) {
                if (numLong % 2 == 0) {
                    numLong /= 2;
                } else {
                    numLong = (numLong * 3) + 1;
                }

                if (numLong == 1) {
                    return i;
                }
            }

            return -1;
        }
    }
}