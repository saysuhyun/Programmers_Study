import java.util.HashMap;

public class 달리기경주 {

    public static void main(String[] args) {

    }

    private static class Solution {
        // 위치가 바뀐
        // 순서대로 -> 해설진 부름 -> 업데이트된 순서 배열
        // 1. Map으로?
        // 2. LinkedList?
        // 3. 배열에서 직접
        // 인덱스를 계속해서 접근하고, 변경해야할 때 유리한 알고리즘
        public String[] solution(String[] players, String[] callings) {
            String[] answer = players;
            HashMap<String, Integer> hashMap = new HashMap<>();
            int num = 0;
            for(String player : players){
                hashMap.put(player, num);
                num++;
            }
            for(String call : callings){
                int currentPlayerNum = hashMap.get(call);
                String frontPlayerNm = answer[currentPlayerNum-1];
                hashMap.put(call, currentPlayerNum-1);
                hashMap.put(frontPlayerNm, currentPlayerNum);
                answer[currentPlayerNum-1] = call;
                answer[currentPlayerNum] = frontPlayerNm;
            }

            return answer;
        }
    }
}