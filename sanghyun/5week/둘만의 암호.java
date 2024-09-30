import java.util.*;

public class Crypt {
    public static void main(String[] args) {
        String s = "aukks";
        String skip = "wbqd";
        int index = 5;

        char[] sArr = s.toCharArray();

        Set<Character> skipSet = new HashSet<>();
        for (char ch : skip.toCharArray()) {
            skipSet.add(ch);
        }

        StringBuilder sb = new StringBuilder();
        
        for (char c : sArr) {
            char current = c;
            int shift = index; // 이동할 인덱스
            
            // index 만큼 이동하면서 skip 문자를 건너뜀
            while (shift > 0) {
                current = (char) ((current - 'a' + 1) % 26 + 'a'); // 한 칸 이동
                if (!skipSet.contains(current)) {
                    shift--; // skip 문자가 아닌 경우에만 이동 카운트 감소
                }
            }

            sb.append(current); // 변환된 문자 추가
        }

        String answer = sb.toString();
    }
}