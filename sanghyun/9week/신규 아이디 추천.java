import java.util.*;

public class Newid {
    public static void main(String[] args) {
        String new_id = "...!@BaT#*..y.abcdefghijklm".toLowerCase(); // 1단계

        char[] cArr = new_id.toCharArray();
        ArrayList<Character> list = new ArrayList<>();

        // 2단계
        for (char c : cArr) {
            if (Character.isLetterOrDigit(c) || c == '_' || c == '-' || c == '.') {
                list.add(c);
            }
        }

        // 3단계
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) == '.' && list.get(i - 1) == '.') {
                list.remove(i);
                i--; 
            }
        }

        // 4단계
        if (!list.isEmpty() && list.get(0) == '.') {
            list.remove(0);
        }
        if (!list.isEmpty() && list.get(list.size() - 1) == '.') {
            list.remove(list.size() - 1);
        }

        // 5단계
        if (list.isEmpty()) {
            list.add('a');
        }

        // 6단계
        if (list.size() > 15) {
            list = new ArrayList<>(list.subList(0, 15));
          
            if (list.get(list.size() - 1) == '.') {
                list.remove(list.size() - 1);
            }
        }

        // 7단계
        while (list.size() < 3) {
            list.add(list.get(list.size() - 1));
        }

        StringBuilder sb = new StringBuilder();
        for(Character c: list) {
            sb.append(c);
        }
        
        System.out.println(sb);
    }
}
