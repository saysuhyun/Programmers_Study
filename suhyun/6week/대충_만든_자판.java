public class 대충_만든_자판 {
    public int[] solution(String[] keymap, String[] targets) {
        int[] charMap = new int[26];
        for (int i = 0; i < 26; i++) charMap[i] = Integer.MAX_VALUE;

        for (int i = 0; i < keymap.length; i++)
            for (int j = 0; j < keymap[i].length(); j++)
                charMap[keymap[i].charAt(j) - 'A'] = Math.min(charMap[keymap[i].charAt(j) - 'A'], j + 1);

        int[] answer = new int[targets.length];
        for (int i = 0; i < targets.length; i++) {
            int totalPress = 0;
            for (char c : targets[i].toCharArray()) {
                if (charMap[c - 'A'] == Integer.MAX_VALUE) {
                    totalPress = -1;
                    break;
                }
                totalPress += charMap[c - 'A'];
            }
            answer[i] = totalPress;
        }
        return answer;
    }
}
