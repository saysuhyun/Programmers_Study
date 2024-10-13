import java.util.Arrays;
import java.util.HashMap;

public class 추억점수 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(
            new String[]{"may", "kein", "kain", "radi"}, new int[]{5, 10, 1, 3}, new String[][]{{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
    }

    private static class Solution {
        // 인물의 그리움 점수
        // 사진별로 추억 점수 매긴 거 배열에 담아 return

        // 인물별 => key, value hashmap
        public int[] solution(String[] name, int[] yearning, String[][] photo) {
            int[] answer = new int[photo.length];
            HashMap<String, Integer> hashMap = new HashMap<>();
            for(int i=0;i<name.length;i++){
                hashMap.put(name[i], yearning[i]);
            }
            for(int j=0; j<photo.length; j++){
                for(int z=0; z<photo[j].length; z++) {
                    if(hashMap.containsKey(photo[j][z])) {
                        answer[j] += hashMap.get(photo[j][z]);
                    }
                }
            }
            return answer;
        }
    }
}