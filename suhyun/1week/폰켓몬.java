import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();

        // 중복제거
        for (int num : nums) {
            // 같은 놈이 map에 있으면 넘기고 없으면 넣기
            if (map.size() != 0 && map.get(num) != null) {
                continue;
            } else {
                map.put(num, num);
                answer++;
            }
        }

        // answer가 기존 최댓값보다 큰 경우 최댓값으로 값 변경
        if (answer > nums.length / 2) {
            answer = nums.length / 2;
        }

        return answer;
    }
}