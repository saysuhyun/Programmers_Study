import java.util.stream.Stream;
import java.util.*;

public class CaseSort {
    public static void main(String[] args) {
        String s = "Zbcdefg";

        // char -> Character 형으로 변환
        Character[] charArray = s.chars()
                .mapToObj(c -> (char) c)
                .toArray(Character[]::new);

        // charArray를 역순 정렬
        Arrays.sort(charArray, Collections.reverseOrder());

        StringBuilder result = new StringBuilder();
        for (char c : charArray) {
            result.append(c);
        }
        System.out.println(result);
    }
}
