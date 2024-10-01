class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        boolean[] check = new boolean[26];
        int[] cnt = new int[26];

        for (int index = 0; index < s.length(); index++) {
            int alphabetNumber = s.charAt(index) - 97;

            if (check[alphabetNumber]) {
                int newIndex = index - cnt[alphabetNumber];
                cnt[alphabetNumber] = index;
                answer[index] = newIndex;
            } else {
                check[alphabetNumber] = true;
                answer[index] = -1;
                cnt[alphabetNumber] = index;
            }
        }

        return answer;
    }
}
