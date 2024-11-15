public class 지폐접기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(new int[]{30, 15}, new int[]{26,17});
    }

    static public class Solution {
        public int solution(int[] wallet, int[] bill) {
            int count = 0;

            while (true) {
                if ((bill[0] <= wallet[0] && bill[1] <= wallet[1]) ||
                        (bill[0] <= wallet[1] && bill[1] <= wallet[0])) {
                    break;
                }
                if (bill[0] > bill[1]) {
                    bill[0] /= 2;
                } else {
                    bill[1] /= 2;
                }

                count++;
            }

            return count;
        }
    }
}