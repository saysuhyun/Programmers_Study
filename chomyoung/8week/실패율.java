import java.util.*;
import java.util.stream.Collectors;

public class 실패율 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3}));
    }

    private static class Solution {
        // 실패율 : 도달 but 아직 완주x / 도달
        // N+1은 마무리
        // 내림차순으로
        // result의 길이는 N과 동일

        // 방법
        // 1. hashMap
        // 2. 실패율: 배열에서 stage 갯수 / stage보다 크거나 같은 stage갯수
        // 3. value를 기준으로 내림차순 정렬
        public int[] solution(int N, int[] stages) {
            int[] answer = new int[N];
            Map<Integer, Double> failureRateMap = new HashMap<>();

            // 1. 각 스테이지에 도달한 사용자 수를 카운트하기 위해 배열 생성
            int[] stageCounts = new int[N + 2]; // 0은 뺴야하며, N+1도 있기에
            for (int stage : stages) {
                stageCounts[stage]++;
            }

            // 2. 전체 사용자 수로부터 각 스테이지 실패율을 계산
            int totalPlayers = stages.length;

            for (int i = 1; i <= N; i++) {
                if (totalPlayers > 0) {
                    double failureRate = (double) stageCounts[i] / totalPlayers;
                    failureRateMap.put(i, failureRate);
                    totalPlayers -= stageCounts[i]; // 다음 스테이지로 넘어가며 전체 플레이어 수 갱신
                } else {
                    failureRateMap.put(i, 0.0); // 도전한 사용자가 없는 경우 실패율을 0으로 처리
                }
            }

            // 3. 실패율을 기준으로 정렬하고, 실패율이 같으면 스테이지 번호 순으로 오름차순 정렬
            List<Integer> sortedStages = failureRateMap.keySet().stream()
                    .sorted((a, b) -> {
                        int compareResult = failureRateMap.get(b).compareTo(failureRateMap.get(a));
                        return compareResult == 0 ? Integer.compare(a, b) : compareResult;
                    })
                    .collect(Collectors.toList());

            // 4. 정렬된 스테이지 번호를 answer 배열에 담아 반환
            for (int i = 0; i < N; i++) {
                answer[i] = sortedStages.get(i);
            }

            return answer;
        }
    }
}
