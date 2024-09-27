class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] babyWords = {"aya", "ye", "woo", "ma"};

        for (String word : babbling) {
            if (word.contains("ayaaya") || word.contains("yeye") || word.contains("woowoo") || word.contains("mama")) {
                continue;
            }
            // 반례 : "yayae"
            for (String babyWord : babyWords) {
                word = word.replace(babyWord, "|");
            }
            word = word.replace("|", "");

            if (word.isEmpty()) answer++;
        }
        return answer;
    }
}
