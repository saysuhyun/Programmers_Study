import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (o1, o2) -> {
            char word1 = o1.charAt(n);
            char word2 = o2.charAt(n);

            if (word1 > word2) {
                return 1;
            } else if (word1 < word2) {
                return -1;
            } else {
                return o1.compareTo(o2);
            }
        });

        return strings;
    }
}
