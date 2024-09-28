public class Solution {
    public static String solution(String s, int n) {
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                //'A'를 기준으로 n만큼 이동한 뒤 다시 'A'로 순환하도록 함
                //'A'를 빼서 인덱스를 0부터 시작하도록
                //+'A'는 최종적으로 인덱스를 실제 문자로 변환 위해
                char shifted = (char) ((c - 'A' + n) % 26 + 'A');
                result.append(shifted);
            } else if (Character.isLowerCase(c)) {
                char shifted = (char) ((c - 'a' + n) % 26 + 'a');
                result.append(shifted);
            } else {
                // 공백
                result.append(c);
            }
        }

        return result.toString();
    }
}