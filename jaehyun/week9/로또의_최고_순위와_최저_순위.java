import java.util.HashSet;
import java.util.Set;

public class 로또의_최고_순위와_최저_순위 {
    public static void main(String[] args) {
        Solution solution = new Solution();


    }

    static class Solution {
        public int[] solution(int[] lottos, int[] win_nums) {
            int countZero = 0;  // 0 개수
            int matchCount = 0; // 일치하는 숫자 개수

            Set<Integer> winSet = new HashSet<>();
            for (int num : win_nums) {
                winSet.add(num);
            }

            for (int num : lottos) {
                if (num == 0) {
                    countZero++;
                } else if (winSet.contains(num)) {
                    matchCount++;
                }
            }
            int maxRank = getRank(matchCount + countZero);
            int minRank = getRank(matchCount);

            return new int[]{maxRank, minRank};

        }

        private int getRank(int matchCount) {
            return switch (matchCount) {
                case 6 -> 1;
                case 5 -> 2;
                case 4 -> 3;
                case 3 -> 4;
                case 2 -> 5;
                default -> 6;
            };
        }
    }
}
