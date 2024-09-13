class Solution {
    public String solution(String s) {
        String answer = "";
        if (s.length() == 1 || s.length() == 2) return s;

        if (s.length() % 2 == 0) {
            int startIndex = s.length() / 2 - 1;
            int endIndex = s.length() / 2 + 1;
            answer = s.substring(startIndex, endIndex);
        } else {
            int mid = s.length() / 2;
            answer = s.charAt(mid) + "";
        }

        return answer;
    }
}
