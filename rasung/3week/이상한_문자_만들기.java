class Solution {
    public String solution(String s) {
        String[] words = s.split("");
        StringBuilder answer = new StringBuilder();
        int wordLength = 0;
        for (String word : words) {
            if (word.equals(" ")) {
                wordLength = 0;
            } else {
                wordLength++;
            }

            if (wordLength % 2 == 0) {
                answer.append(word.toLowerCase());
            } else {
                answer.append(word.toUpperCase());
            }
        }

        return answer.toString();
    }
}
