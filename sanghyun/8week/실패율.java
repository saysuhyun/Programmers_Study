import java.util.*;

public class FailRate {
    public static void main(String[] args) {
        int N =5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

        double totalPlayers = stages.length;

        // 실패율을 저장할 Map
        Map<Integer, Double> failRateMap = new HashMap<>();

        // 각 스테이지별 실패율 계산
        for (int stage = 1; stage <= N; stage++) {
            int stuckPlayers = 0; // 해당 스테이지에서 멈춘 플레이어 수
            int reachedPlayers = 0; // 해당 스테이지에 도달한 플레이어 수

            for (int s : stages) {
                if (s >= stage) reachedPlayers++; // 해당 스테이지에 도달한 플레이어
                if (s == stage) stuckPlayers++;   // 해당 스테이지에서 멈춘 플레이어
            }


            if (reachedPlayers == 0) {
                failRateMap.put(stage, 0.0);
            } else {
                failRateMap.put(stage, (double) stuckPlayers / reachedPlayers);
            }
        }

        List<Map.Entry<Integer, Double>> sortedList = new ArrayList<>(failRateMap.entrySet());
        sortedList.sort((entry1, entry2) -> {
            int valueComparison = entry2.getValue().compareTo(entry1.getValue()); 
            if (valueComparison != 0) {
                return valueComparison;
            }
            return entry1.getKey().compareTo(entry2.getKey()); 
        });

        // 결과 배열 생성
        int[] answer = new int[N];
        for (int i = 0; i < sortedList.size(); i++) {
            answer[i] = sortedList.get(i).getKey();
        }
    
       
    }
}