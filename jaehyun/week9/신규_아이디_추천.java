public class 신규_아이디_추천 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("...!@BaT#*..y.abcdefghijklm"));
    }

    static class Solution {
        public String solution(String new_id) {
            //1단계: 소문자로 치환
            new_id = new_id.toLowerCase();

            //2단계: 소문자, 숫자, -,_,. 만 사용 가능
            new_id = new_id.replaceAll("[^a-z0-9-_.]", "");

            //3단계: . 2번 이상
            new_id = new_id.replaceAll("\\.{2,}", ".");

            //4단계: 아이디 처음 위치 .
            new_id = new_id.replaceAll("^[.]|[.]$", "");

            //5단계: 빈 문자열일때 'a'
            if (new_id.isEmpty()) {
                new_id = "a";
            }

            //6단계: 길이 15로. 마지막에 . 되면 지우기
            if (new_id.length() >= 16) {
                new_id = new_id.substring(0, 15);
                new_id = new_id.replaceAll("[.]$", "");
            }

            //7단계: 길이 2 이하이면 마지막 문자 계속 붙이기
            while (new_id.length() < 3) {
                new_id += new_id.charAt(new_id.length() - 1);
            }

            return new_id;
        }
    }
}
