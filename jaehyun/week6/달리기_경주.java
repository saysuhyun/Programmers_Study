package jaehyun.week6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 달리기_경주 {
    public static String[] solution(String[] players, String[] callings) {
        //players = {"mumu", "soe", "poe", "kai", "mine"}
        //callings = {["kai", "kai", "mine", "mine"}
        // 선수 이름, 등수 해시맵
        Map<String, Integer> playerIndex = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            playerIndex.put(players[i], i);
        }

        // callings 배열을 순차적으로 처리
        for (String called : callings) {
            int curIdx = playerIndex.get(called); // 추월한 선수 현재 인덱스
            if (curIdx > 0) { // 1등 추월 고려
                String frontPlayer = players[curIdx - 1];
                players[curIdx - 1] = called;
                players[curIdx] = frontPlayer;

                playerIndex.put(called, curIdx - 1);
                playerIndex.put(frontPlayer, curIdx);
            }
        }

        return players;
    }
    public static void main(String[] args){
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        System.out.println(Arrays.toString(solution(players, callings)));
        // ["mumu", "kai", "mine", "soe", "poe"]
    }
}
