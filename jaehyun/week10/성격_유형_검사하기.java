import java.util.HashMap;

public class 성격_유형_검사하기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};
        System.out.println(solution.solution(survey, choices));

    }
    static class Solution {
        public String solution(String[] survey, int[] choices) {
            HashMap<Character, Integer> scoreMap = new HashMap<>();
            scoreMap.put('R', 0);
            scoreMap.put('T', 0);
            scoreMap.put('C', 0);
            scoreMap.put('F', 0);
            scoreMap.put('J', 0);
            scoreMap.put('M', 0);
            scoreMap.put('A', 0);
            scoreMap.put('N', 0);

            for (int i = 0; i < survey.length; i++) {
                char disagreeType = survey[i].charAt(0);
                char agreeType = survey[i].charAt(1);
                int choice = choices[i];

                if (choice < 4) { //비동의
                    int score = 4 - choice;
                    scoreMap.put(disagreeType, scoreMap.get(disagreeType) + score);
                } else if (choice > 4) { //동의
                    int score = choice - 4;
                    scoreMap.put(agreeType, scoreMap.get(agreeType) + score);
                }
            }

            StringBuilder answer = new StringBuilder();
            answer.append(scoreMap.get('R')>=scoreMap.get('T')?'R':'T');
            answer.append(scoreMap.get('C')>=scoreMap.get('F')?'C':'F');
            answer.append(scoreMap.get('J') >= scoreMap.get('M') ? 'J' : 'M');
            answer.append(scoreMap.get('A') >= scoreMap.get('N') ? 'A' : 'N');

            return answer.toString();
        }
    }
}
