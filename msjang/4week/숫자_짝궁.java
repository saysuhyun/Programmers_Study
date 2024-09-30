import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 숫자_짝궁 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution("100", "103450");
        System.out.println(result);
    }

    static class Solution {
        public String solution(String X, String Y) {
            int[] xCount = new int[10];
            int[] yCount = new int[10];

            for (char item : X.toCharArray()) {
                xCount[item - '0']++;
            }
            for (char item : Y.toCharArray()) {
                yCount[item - '0']++;
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 9; i >= 0; i--) {
                int count = Math.min(xCount[i], yCount[i]);
                for (int j = 0; j < count; j++) {
                    sb.append(i);
                }
            }

            if (sb.length() == 0) return "-1";

            if (sb.charAt(0) == '0') return "0";

            return sb.toString();
        }
    }

}