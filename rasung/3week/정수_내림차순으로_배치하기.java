import java.util.*;

class Solution {
    public long solution(long n) {
        List<String> list = new LinkedList<>();
        String strNumber = n + "";
        for (int i = 0; i < strNumber.length(); i++) {
            list.add(strNumber.charAt(i) + "");
        }

        list.sort(Collections.reverseOrder());

        return Long.parseLong(String.join("", list));
    }
}
