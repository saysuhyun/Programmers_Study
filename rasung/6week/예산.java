import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int totalCost = 0;

        Arrays.sort(d);

        for (int cost : d) {
            if (totalCost + cost <= budget) {
                totalCost += cost;
                answer++;
            } else {
                break;
            }
        }

        return answer;
    }
}
