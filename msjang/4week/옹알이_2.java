public class 옹알이_2 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new String[]{"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"});
        System.out.println(result);
    }
    static class Solution {
        public int solution(String[] babbling) {
            int answer = 0;
            String[] tongues = {"aya", "ye", "woo", "ma"};

            for (String babble : babbling) {
                boolean isValid = true;
                for (String tongue : tongues) {
                    if (babble.contains(tongue + tongue)) {
                        isValid = false;
                        break;
                    }
                }
                if (!isValid) {
                    continue;
                }

                for (String tongue : tongues) {
                    babble = babble.replace(tongue, " ");
                }

                if (babble.trim().isEmpty()) {
                     answer++;
                }
            }

            return answer;
        }
    }
}