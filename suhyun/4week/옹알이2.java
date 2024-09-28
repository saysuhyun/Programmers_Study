public class 옹알이2 {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] validSounds = {"aya", "ye", "woo", "ma"};

        for (String word : babbling) {
            String modifiedWord = word;

            // 각 발음을 빈 문자열로 대체
            for (String sound : validSounds) {
                modifiedWord = modifiedWord.replace(sound, " ");
            }

            // 연속된 발음이 있는지 확인
            boolean isValid = true;
            for (String sound : validSounds) {
                if (word.contains(sound + sound)) {
                    isValid = false;
                    break;
                }
            }

            // 발음이 유효한지 확인
            if (isValid && modifiedWord.trim().isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}
