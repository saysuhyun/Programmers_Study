public class 핸드폰_번호_가리기 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution("444");
        System.out.println(result);
    }

    static class Solution {
        public String solution(String phone_number) {

            return phone_number.replaceAll(".(?=.{4})", "*");
        }

        public String solutionV2(String phone_number) {

            if (phone_number.length() < 4)
                return phone_number;

            char[] charArray = phone_number.toCharArray();
            for (int i = 0 ; i < phone_number.length() - 4; i++){
                charArray[i] = '*';
            }

            return String.valueOf(charArray);
        }
    }
}