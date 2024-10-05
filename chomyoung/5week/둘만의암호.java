import java.util.HashSet;
import java.util.Set;

public class 둘만의암호 {

    public static void main(String[] args) {

    }

    private static class Solution {

        // char s(각 알파벳) + index => 만약 넘어가면 다시 하나씩 진행
        // 소문자 97~122
        // if ch > 122 => - 26 (index<=20이므로)
        // skip에 포함된 문자들을 Set으로 저장
        // 밀려나는 index의 갯수 :
        public String solution(String s, String skip, int index) {
            char[] answer = new char[s.length()];

            Set<Character> skipSet = new HashSet<>();
            for (char ch : skip.toCharArray()) {
                skipSet.add(ch);
            }

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                int count = 0;

                // index만큼 뒤로 밀어내기
                while (count < index) {
                    ch++;
                    if (ch > 'z') {
                        ch = 'a';
                    }
                    if (!skipSet.contains(ch)) {
                        count++;  // skip에 포함되지 않는 문자만 count
                    }
                }

                answer[i] = ch;
            }

            return new String(answer);
        }
    }
}