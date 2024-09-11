public class 문자열_다루기_기본 {


    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean result = solution.solution("a1234");
        System.out.println(result);
    }

    static class Solution {
        public boolean solution(String s) {

            //정규식으로 더 쉽게 풀수 있다.
            //s.matches("(^[0-9]*$)"

            if(s.length() != 4 && s.length() != 6)
                return false;

            char[] charArray = s.toCharArray();
            for (char c : charArray) {
                if (!(c >= '0' && c <= '9'))
                    return false;
            }
            return true;

        }
    }
}