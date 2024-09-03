import java.util.*;

// 폰켓몬 문제 풀이
class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        int max = nums.length/2;

        HashSet<Integer> numbers = new HashSet<>();

        Arrays.stream(nums).forEach(numbers::add);

        return numbers.size() > max ? max : numbers.size();
    }
}