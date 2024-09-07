import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int totalCount = nums.length / 2;
        HashSet<Integer> poketmon = new HashSet<>();
        for (int num : nums) {
            poketmon.add(num);
        }

        if (poketmon.size() >= totalCount) {
            answer = totalCount;
        } else {
            answer = poketmon.size();
        }

        return answer;
    }
}
