import java.util.HashMap;

public class 대충_만든_자판 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(
                new String[]{"ABACD", "BCEFD"},
                new String[]{"ABCD","DG", "AABB"});
//        int[] result = solution.solution(
//                new String[]{"AA"},
//                new String[]{"B"});
//        int[] result = solution.solution(
//                new String[]{"AB", "AAB"},
//                new String[]{"B"});
        for (int i : result) {
            System.out.println(i);
        }
    }

    static class Solution {
        // keymap 있는 인덱스와 숫자를 hashmap에 저장 각 배열의 뒤에서 부터 읽는다.
        // target 배열을 각 hashmap에서 찾아서 인덱스를 저장한다.
        public int[] solution(String[] keymap, String[] targets) {
            int[] answer = new int[targets.length];
            HashMap<Character, Integer> map = new HashMap<>();

            for (String item : keymap) {
                for (int i = 0; i < item.length(); i++) {
                    char c = item.charAt(i);
                    if (!map.containsKey(c)) {
                        map.put(c, i + 1);
                        continue;
                    }

                    if (map.get(c) > i + 1)
                        map.put(c, i + 1);

                }
            }

            for (int i = 0; i < targets.length; i++) {
                String target = targets[i];
                int indexCnt = 0;
                for (int k = 0; k < target.length(); k++) {

                    if (map.containsKey(target.charAt(k))) {
                        indexCnt += map.get(target.charAt(k));
                    }else {
                        answer[i] = -1;
                        break;
                    }

                    answer[i] = indexCnt;
                }

            }
            return answer;
        }
    }
}