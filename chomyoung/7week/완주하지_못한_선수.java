import java.util.HashMap;
import java.util.Map;

public class 완주하지_못한_선수 {

    public static void main(String[] args) {

    }

    private static class Solution {
        // 한명 빼고 모두 완주
        // 참여한 사람들과 완주한 사람들
        // return 완주 못한 선수의 이름
        // 주의 : 동명이인
        // 방법: hashmap => 없는 경우에만 넣는다.
        // 있는 경우에 -1
        public String solution(String[] participant, String[] completion) {
            String answer = "";
            HashMap<String, Integer> hashMap1 = new HashMap<>();
            for(String s : completion){
                // 갯수를 더해준다.
                hashMap1.put(s, hashMap1.getOrDefault(s, 0)+1);
            }

            for(String s : participant){
                if(!hashMap1.containsKey(s)){
                    return s;
                };
                hashMap1.put(s, hashMap1.get(s) - 1);
            }

            // 동일인물로 인해 안 끝나는 경우
            for (Map.Entry<String, Integer> entry : hashMap1.entrySet()) {
                if(entry.getValue() < 0){
                    answer = entry.getKey();
                    break;
                }
            }

            return answer;
        }
    }
}