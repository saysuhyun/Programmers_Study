import java.util.HashSet;
import java.util.Set;

public class 폰켓몬 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{3, 3, 3, 2, 2, 2});
        System.out.println(result);
    }

    static class Solution {
        public int solution(int[] nums) {
            int max = nums.length / 2;

            Set<Integer> set = new HashSet<>();

            for (int i = 1; i < nums.length; i++) {
                if (set.size() >= max){
                    break;
                }
                set.add(nums[i]);
            }

            int answer = set.size();
            return answer;
        }
    }


}

