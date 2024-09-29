import java.util.*;

public class Similar {
    public static void main(String[] args) {
        String s = "foobar";
        char[] cArr = s.toCharArray();
        List<Character> list = new ArrayList<>();

        int[] answer = new int[cArr.length];
        for(int i = 0; i < cArr.length; i++) {
           
            if(list.size() == 0) {
                answer[i] = -1;
                list.add(cArr[i]);
            } else {
                int idx = list.indexOf(cArr[i]);
                if(idx == -1) {
                    answer[i] = -1;
                    list.add(cArr[i]);
                } else {
                    answer[i] = i - idx;
                    list.set(idx, '0');
                    list.add(cArr[i]);
                }
            }
            
           
        }

    }
}