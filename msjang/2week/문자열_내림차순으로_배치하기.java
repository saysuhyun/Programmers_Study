import java.util.Arrays;
import java.util.Collections;

public class 문자열_내림차순으로_배치하기 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution("Aabbcdefg");
        System.out.println(result);
    }

    static class Solution {
        public String solution(String s) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String str = new String(c);
            return new StringBuilder(str).reverse().toString();
        }
    }
}