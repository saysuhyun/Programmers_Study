import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collector;

public class 정수_내림차순으로_배치하기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        long result = solution.solution(1918372);
        System.out.println(result);


    }

    static class Solution {
        public long solution(long n) {
            String s = String.valueOf(n);
            String[] arr = s.split("");
            Arrays.sort(arr, Collections.reverseOrder());

            StringBuilder sb = new StringBuilder();
            for (String value : arr) {
                sb.append(value);
            }

            long answer = Long.valueOf(sb.toString());

            return answer;
        }
    }
}