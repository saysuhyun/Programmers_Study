import java.util.HashSet;
import java.util.Set;

public class 둘만의_암호 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution("aukks","wbqd",5);
    }
    static class Solution {
        public String solution(String s, String skip, int index) {
            Set<Character> skipSet = new HashSet<>();
            for (char c : skip.toCharArray()) {
                skipSet.add(c);
            }

            StringBuilder encrypted = new StringBuilder();

            for (char c : s.toCharArray()) {
                int shiftCount = index;

                while (shiftCount > 0) {
                    c++;
                    if (c > 'z') c = 'a';
                    if (!skipSet.contains(c)) shiftCount--;
                }

                encrypted.append(c);
            }

            return encrypted.toString();
        }
    }
}