import java.util.Arrays;

public class 문자열_내림차순으로_배치하기 {
    public String solution(String s) {

        StringBuilder upperSb = new StringBuilder();
        StringBuilder lowerSb = new StringBuilder();

        // 대소문자별로 분리
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upperSb.append(c);
            } else if (Character.isLowerCase(c)) {
                lowerSb.append(c);
            }
        }

        // char로 배열 변경
        char[] upperChar = upperSb.toString().toCharArray();
        char[] lowerChar = lowerSb.toString().toCharArray();

        // 오름차순 정렬
        Arrays.sort(upperChar);
        Arrays.sort(lowerChar);

        // 내림차순 정렬을 위해 StringBuilder로 변경
        StringBuilder upperSbReverse = new StringBuilder(new String(upperChar));
        StringBuilder lowerSbReverse = new StringBuilder(new String(lowerChar));

        // 내림차순 정렬
        String upperString = upperSbReverse.reverse().toString();
        String lowerString = lowerSbReverse.reverse().toString();

        return lowerString + upperString;
    }

    public String solution2(String s) {

        // char로 변경 후 오름차순으로 정렬
        char[] sol = s.toCharArray();
        Arrays.sort(sol);

        // 오름차순 정렬한 거 reverse로 내림차순 정렬하면 그대로 끝..? ㄴ
        return new StringBuilder(new String(sol)).reverse().toString();
    }

}
