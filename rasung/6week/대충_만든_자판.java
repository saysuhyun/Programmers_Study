class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int[] alphabet = new int[26];
        for (int index = 0; index < 26; index++) {
            alphabet[index] = 101;
        }

        for (int i = 0; i < keymap.length; i++) {
            for (int index = 0; index < keymap[i].length(); index++) {
                int alphabetIndex = keymap[i].charAt(index) - 65;
                alphabet[alphabetIndex] = Math.min(alphabet[alphabetIndex], index + 1);
            }
        }

         for (int index = 0; index < targets.length; index++) {
            String target = targets[index];
            int sum = 0;
            boolean check = false;
            for (int targetIndex = 0; targetIndex < target.length(); targetIndex++) {
                int alphabetIndex = target.charAt(targetIndex) - 65;
                if (alphabet[alphabetIndex] == 101) {
                    check = true;
                    break;
                }
                sum += alphabet[alphabetIndex];
            }
            if (check || sum == 0) {
                answer[index] = -1;
            } else {
                answer[index] = sum;
            }
        }

        return answer;
    }
}
