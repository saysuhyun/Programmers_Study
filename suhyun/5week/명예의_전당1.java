import java.util.PriorityQueue;

public class 명예의_전당1 {
    public int[] solution(int k, int[] score) {
        int n = score.length;
        int[] answer = new int[n];
        PriorityQueue<Integer> hallOfFame = new PriorityQueue<>(); // 최소 힙 사용

        for (int i = 0; i < n; i++) {
            hallOfFame.offer(score[i]); // 현재 점수를 추가

            // 명예의 전당의 크기가 k를 초과하면 최솟값 제거
            if (hallOfFame.size() > k) {
                hallOfFame.poll();
            }

            // 현재 명예의 전당의 최하위 점수를 기록
            if (hallOfFame.size() < k) {
                answer[i] = hallOfFame.peek(); // k보다 작으면 최하위 점수는 0
            } else {
                answer[i] = hallOfFame.peek(); // k개 이상이면 최하위 점수
            }
        }

        return answer;
    }
}
