import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] list = s.split("");

        Arrays.sort(list, Collections.reverseOrder());

        for (String str: list) {
            answer.append(str);
        }


        return answer.toString();
    }
}
