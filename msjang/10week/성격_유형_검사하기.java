import java.util.HashMap;
import java.util.Map;

public class 성격_유형_검사하기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(new String[]{"AN", "CF", "MJ", "RT", "NA"}, new int[]{5, 3, 2, 7, 5});
    }

    static class Solution {
        public String solution(String[] survey, int[] choices) {
            int[] scores = new int[8];
            String types = "RTCFJMAN";

            for (int i = 0; i < survey.length; i++) {
                int score = choices[i] - 4;
                char type = score < 0 ? survey[i].charAt(0) : survey[i].charAt(1);
                scores[types.indexOf(type)] += Math.abs(score);
            }

            StringBuilder result = new StringBuilder();
            result.append(scores[0] >= scores[1] ? "R" : "T");
            result.append(scores[2] >= scores[3] ? "C" : "F");
            result.append(scores[4] >= scores[5] ? "J" : "M");
            result.append(scores[6] >= scores[7] ? "A" : "N");

            return result.toString();
        }
    }
}