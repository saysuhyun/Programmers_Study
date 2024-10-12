import java.util.HashMap;
import java.util.Map;

public class 대충_만든_자판 {

    public static void main(String[] args) {

    }

    private static class Solution {
        // 1개~100(최대)
        // 주의:
        // 같은 문자가 자판 전체에 여러 번 할당될 수도.
        // 키 하나에 같은 문자가 여러번 할당될 수도.
        // 배정된 문자열이 없을 수도 => return -1
        // return 특정 문자열을 작성할 때, 키를 최소 몇 번 눌러야 그 문자열을 작성할 수 있는지

        // 방법
        // 1. hashMap을 만들어서 각 문자별로 최소한으로 걸리는 값을 value값으로
        // 주의: index이기 때문에 +1씩
        public int[] solution(String[] keymap, String[] targets) {
            int[] answer = new int[targets.length];

            Map<Character, Integer> hashMap = new HashMap<>();
            for(String key : keymap){
                char[] chars = key.toCharArray();
                for(int i=0; i<chars.length; i++){
                    // key값이 있다면 최솟값을 저장하도록
                    if(hashMap.containsKey(chars[i])){
                        if(hashMap.get(chars[i]) > i) {
                            hashMap.put(chars[i], i+1);
                        }
                    }else{
                        hashMap.put(chars[i], i+1);
                    }
                }
            }
            System.out.println("hashmap: "+ hashMap);

            for(int i=0; i< targets.length; i++){
                int cnt = 0;
                char[] chars = targets[i].toCharArray();
                for(char c : chars){
                    if(hashMap.containsKey(c)){
                        cnt += hashMap.get(c);
                    }else {
                        cnt = -1;
                        break;
                    }
                }
                answer[i] = cnt;
            }

            return answer;
        }
    }
}