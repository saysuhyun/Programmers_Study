import java.util.HashMap;
import java.util.Map;

public class 성격_유형_검사하기 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new String[]{"TR", "RT", "TR"},
            new int[]{7, 1, 3}));
    }

    private static class Solution {
        // 1~7점
        // 동점일 경우, 사전 순으로 빠른 성격 유형
        // 하나의 지표에서 유형은 서로 뒤바뀌게 나올 수 있다.

        // 방법
        // hashMap
        // key값으로 사전순으로 배열 key: "RT", "CF", "JM", "AN",
        // 역순인 것도 "TR", "FC", "MJ", "NA"
        // value는 +, -로

        // 역순이라면 -
        // 결국 판별은 누가 더 우위인지 판별이기 때문에 1~7점 => -3~3점으로 변경
        public String solution(String[] survey, int[] choices) {
            Map<String, Integer> hashMap = new HashMap<>();
            for(int i=0; i<survey.length; i++){
                char[] chars = survey[i].toCharArray();
                int num = choices[i] - 4;
                if(chars[0] < chars[1]) { // 사전순으로 배정되었다면
                    hashMap.put(survey[i], hashMap.getOrDefault(survey[i], 0) + num);
                }else{ // 역순이라면
                    String key = Character.toString(chars[1]) + Character.toString(chars[0]);
                    hashMap.put(key, hashMap.getOrDefault(key, 0) - num);
                }
            }

            String answer = "";
            answer+= !hashMap.containsKey("RT") || hashMap.get("RT") <= 0 ? "R" : "T";
            answer+= !hashMap.containsKey("CF") || hashMap.get("CF") <= 0 ? "C" : "F";
            answer+= !hashMap.containsKey("JM") || hashMap.get("JM") <= 0 ? "J" : "M";
            answer+= !hashMap.containsKey("AN") || hashMap.get("AN") <= 0 ? "A" : "N";
            return answer;
        }
    }
}