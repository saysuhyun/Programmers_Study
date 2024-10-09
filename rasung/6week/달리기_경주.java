import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        Map<String, Integer> mapByPlayer = new HashMap<>();
        Map<Integer, String> mapByRank = new HashMap<>();

        for (int rank = 0; rank < players.length; rank++) {
            mapByPlayer.put(players[rank], rank + 1);
            mapByRank.put(rank + 1, players[rank]);
        }

        for (String name: callings) {
            // 추월할 사람의 순위와 이름
            int currentRank = mapByPlayer.get(name);

            // 추월 당할 사람의 순위와 이름
            String backPlayer = mapByRank.get(currentRank - 1);
            int backRank = mapByPlayer.get(backPlayer);

            mapByPlayer.put(name, currentRank - 1);
            mapByRank.put(currentRank - 1, name);

            mapByPlayer.put(backPlayer, backRank + 1);
            mapByRank.put(backRank + 1, backPlayer);
        }

        for (int i = 0; i < players.length; i++) {
            answer[i] = mapByRank.get(i + 1);
        }

        return answer;
    }
}
