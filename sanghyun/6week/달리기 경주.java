import java.util.*;

public class Run {
    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};

        HashMap<String, Integer> playerIndexMap = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            playerIndexMap.put(players[i], i);
        }


        HashMap<String, Integer> hMap = new HashMap<>();
        for(String c: callings) {

            // idx를 hashmap에 기록해두고 계속 업데이트한다.
            int idx = playerIndexMap.get(c); 

            // hMap 업데이트
            hMap.put(c, hMap.getOrDefault(c, 0) + 1);
            if (idx > 0) { 
                String tempA = players[idx - 1];
                players[idx - 1] = c;
                players[idx] = tempA;

                playerIndexMap.put(c, idx - 1);
                playerIndexMap.put(tempA, idx);
            }
   
        }
        String[] answer = players;

        //System.out.println(Arrays.asList(answer));
    }
}