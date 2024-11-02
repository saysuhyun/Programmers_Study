import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Stream;

public class 숫자_문자열과_영단어 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution("one4seveneight");
        String one = "one4seveneight".replace("one", "1");
    }

    static class Solution {
        public int solution(String s) {
            String[] numList = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

            for (int i = 0 ; i < numList.length ; i ++){
                s = s.replace(numList[i], String.valueOf(i));
            }

            return Integer.parseInt(s);
        }

    }
}