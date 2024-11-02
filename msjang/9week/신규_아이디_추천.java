public class 신규_아이디_추천 {
    public static void main(String[] args) {
        Solution solution  = new Solution();
        solution.solution("...!@BaT#*..y.abcdefghijklm");
    }

    static class Solution {
        // 카카오 아이디 규칙에 맞지 않을 경우 규칙에 맞는 아이디 추천 문제.
        // 아이디 길이 3 ~ 15
        // 아이디 : 알파벳 소문자, 숫자, -,_,. 처음과 끝에 . 사용 불가
        public String solution(String new_id) {
            String answer = "";

            answer = new_id.toLowerCase();

            answer = answer.replaceAll("[^a-z0-9\\-_.]", "");

            answer = answer.replaceAll("\\.+", ".");

            answer = answer.replaceAll("^[.]|[.]$", "");

            if (answer.isBlank()){
                answer = "a";
            }

            if (answer.length() > 15){
                answer = answer.substring(0, 15);
                answer = answer.replaceAll("[.]$", "");
            }
            StringBuilder sb = new StringBuilder(answer);

            while (sb.toString().length() <= 2)
                sb.append(sb.toString().charAt(answer.length() - 1));

            return sb.toString();

        }
    }
}