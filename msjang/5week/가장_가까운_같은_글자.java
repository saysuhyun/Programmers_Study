import java.util.HashMap;

public class 가장_가까운_같은_글자 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] bananas = solution.solution("foobar");
        for (int i : bananas) {
            System.out.println(i);
        }

    }

    static class Solution {
        public int[] solution(String s) {
            int[] answer = new int[s.length()];
            HashMap<Character, Integer> map = new HashMap<>();

            for (int i = 0; i < s.length(); i++) {
                if (map.get(s.charAt(i)) == null) {
                    answer[i] = -1;
                    map.put(s.charAt(i), i);
                }else {
                    Integer result = map.get(s.charAt(i));
                    answer[i] = i - result;
                    map.put(s.charAt(i), i);
                }
            }


            return answer;
        }
    }
}