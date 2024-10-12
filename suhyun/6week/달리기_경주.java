import java.util.HashMap;

public class 달리기_경주 {
    public String[] solution(String[] players, String[] callings) {

        HashMap<String, Integer> playerRank = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            playerRank.put(players[i], i);
        }
        
        for (String called : callings) {
            int currentRank = playerRank.get(called);
            if (currentRank > 0) {

                String frontPlayer = players[currentRank - 1];
                players[currentRank - 1] = called;
                players[currentRank] = frontPlayer;

                playerRank.put(called, currentRank - 1);
                playerRank.put(frontPlayer, currentRank);
            }
        }

        return players;
    }
}
