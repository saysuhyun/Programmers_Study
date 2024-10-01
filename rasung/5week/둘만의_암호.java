class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        char[] str = s.toCharArray();
        for (char ch: str) {
            int cnt = 0;

            while (cnt != index) {
                if (ch == 'z') {
                    ch = 'a';
                } else {
                    ch++;
                }

                if (!skip.contains(String.valueOf(ch))) {
                    cnt++;
                }
            }
            answer.append(ch);
        }

        return answer.toString();
    }
}
