public class Babbling {
    public static void main(String[] args) {
        String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        int answer = 0;
        String[] validSyllables = { "aya", "ye", "woo", "ma" };
        
        for (String word : babbling) {
            boolean isValid = true;
            String prev = "";

            while (word.length() > 0 && isValid) {
                boolean found = false;

                for (String syllable : validSyllables) {
                    if (word.startsWith(syllable)) {
                        if (syllable.equals(prev)) {
                            isValid = false;
                            break;
                        }

                        word = word.substring(syllable.length());
                        prev = syllable;
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    isValid = false;
                }
            }

            if (isValid && word.isEmpty()) {
                answer++;
            }
        }
        
    }
}