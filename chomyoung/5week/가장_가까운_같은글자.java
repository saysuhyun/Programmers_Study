import java.util.HashMap;

public class 가장_가까운_같은글자 {

    public static void main(String[] args) {

    }

    private static class Solution {
        // 자신의 앞에 같은 글자가 없으면 -1
        // 자신의 앞에 같은 글자가 있으면(가장 가까운) 몇 칸
        // HashMap => 글자가 key, 최근 인덱스가 value
        public int[] solution(String s) {
            int length = s.length();
            int[] answer = new int[length];
            HashMap<Character, Integer> hashMap = new HashMap<>();
            for(int i = 0; i<length; i++){
                Character c = s.charAt(i);
                if(hashMap.containsKey(c)){
                    answer[i] = i - hashMap.get(c); // 몇 칸 떨어져있는지
                }else{
                    answer[i] = -1;
                }
                hashMap.put(s.charAt(i), i);
            }

            return answer;
        }
    }
}