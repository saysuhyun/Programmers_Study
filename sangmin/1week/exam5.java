// 가운데 글자 찾기 문제 풀이
class Solution {
    public String solution(String s) {
        String answer = "";

        // 가운데 글자 찾기
        int a = s.length() / 2;

        if (s.length() % 2 == 0) {
            // 짝수
            answer = String.valueOf(s.charAt(a - 1));
            answer += String.valueOf(s.charAt(a));
        } else {
            // 홀수
            answer = String.valueOf(s.charAt(a));
        }

        return answer;
    }
}