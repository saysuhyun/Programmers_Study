import java.util.HashMap;

public class 달리기_경주 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] result = solution.solution(
                new String[]{"mumu", "soe", "poe", "kai", "mine"},
                new String[]{"kai", "kai", "mine", "mine"});
        for (String s : result) {
            System.out.println(s);
        }
    }

    static class Solution {
        public String[] solution(String[] players, String[] callings) {

            HashMap<String, Integer> map = new HashMap<>();

            for (int i = 0 ; i < players.length ; i++){
                map.put(players[i],i);
            }

            for (int i = 0 ; i < callings.length ; i++){
                String callPlayer = callings[i];
                int callNum = map.get(callPlayer);
                String temp = players[callNum-1];
                players[callNum-1] = callPlayer;
                players[callNum] = temp;
                map.put(callPlayer,callNum-1);
                map.put(temp,callNum);
            }

            return players;
        }
    }
}