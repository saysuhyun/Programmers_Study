import java.util.HashMap;
import java.util.Map;

public class 가장_많이_받은_선물 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(new String[]{"muzi", "ryan", "frodo", "neo"},
                new String[]{"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"});
    }

    static class Solution {
        public int solution(String[] friends, String[] gifts) {
            int friendsNum = friends.length;

            Map<String, Integer> friendIndexMap = new HashMap<>();
            for (int i = 0; i < friendsNum; i++) {
                friendIndexMap.put(friends[i], i);
            }

            int[][] giftCount = new int[friendsNum][friendsNum];
            int[] giftScore = new int[friendsNum];

            for (String gift : gifts) {
                String[] parts = gift.split(" ");
                int from = friendIndexMap.get(parts[0]);
                int to = friendIndexMap.get(parts[1]);
                giftCount[from][to]++;
                giftScore[from]++;
                giftScore[to]--;
            }

            int maxScore = 0;
            for (int i = 0; i < friendsNum; i++) {
                int count = 0;
                for (int j = 0; j < friendsNum; j++) {
                    if (i == j) continue;

                    if (giftCount[i][j] > giftCount[j][i]) {
                        count++;
                    }
                    else if (giftCount[i][j] == giftCount[j][i] && giftScore[i] > giftScore[j]) {
                        count++;
                    }
                }
                maxScore = Math.max(maxScore, count);
            }

            return maxScore;
        }
    }
}