import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    // 문자열을 char[]로
    // char[] 안에 있는 요소 돌면서 민다.
    // 공백이면 공백 그대로 남겨놓는다.
    // 공백인지 어떻게 체크? ' ' == c
    // 마지막에 char끼리 붙여서 문자열로 return
    // z -> a, Z -> A
    // 일단 -26 하고 n을 더하면 좋을듯

    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        for(char c : s.toCharArray()) {
            if(' ' == c){
                answer.append(" ");
                continue;
            }
            boolean isLowerCaseOverZ = c <= 90 && c+n>90;
            boolean isUpperCaseOverZ = c >= 97 && c+n > 122;
            if(isLowerCaseOverZ || isUpperCaseOverZ){
                char newChar = (char) (c - 26 + n);
                answer.append(newChar);
                continue;
            }
            char newChar = (char) (c + n);
            answer.append(newChar);
        }

        return answer.toString();
    }
}