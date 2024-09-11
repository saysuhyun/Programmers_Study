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
              // StringBuilder 를 이용하는 방법 보다 느리다.
//            String[] split = s.split("");
//            Arrays.sort(split, Collections.reverseOrder());
//            return String.join("", split);


            char[] charArray= s.toCharArray();
            Arrays.sort(charArray);
            return new StringBuilder(new String(charArray)).reverse().toString();
        }
    }
}