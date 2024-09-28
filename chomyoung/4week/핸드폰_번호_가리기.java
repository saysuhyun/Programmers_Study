public class 핸드폰_번호_가리기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
    }

    private static class Solution {
        // 핸드폰 마스킹
        // return 뒷자리 4자리만 남겨놓고 나머지 숫자 전부 *

        // 앞부분과 뒷부분 분리 substring
        // length 활용
        // 앞부분 길이 * "*" + 뒷부분 4자리
        public String solution(String phone_number) {
            int length = phone_number.length();
            String backFourNum = phone_number.substring(length-4);
            StringBuilder stringBuilder = new StringBuilder();
            int i = 1;
            while (i <= length-4){
                stringBuilder.append("*");
                i++;
            }
            return stringBuilder.append(backFourNum).toString();
        }
    }
}