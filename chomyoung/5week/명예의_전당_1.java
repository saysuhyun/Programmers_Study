import java.util.PriorityQueue;

public class 명예의_전당_1 {

    public static void main(String[] args) {

    }

    private static class Solution {
        public int[] solution(int k, int[] score) {
            // 최소 힙을 사용하여 명예의 전당 점수를 관리
            PriorityQueue<Integer> hallOfFame = new PriorityQueue<>();
            int[] result = new int[score.length];

            for (int i = 0; i < score.length; i++) {
                // 현재 가수의 점수를 힙에 추가
                hallOfFame.offer(score[i]);

                // 명예의 전당에 있는 점수가 k개를 넘으면 가장 작은 점수 제거
                if (hallOfFame.size() > k) {
                    hallOfFame.poll();
                }

                // 매일 명예의 전당 최하위 점수 저장
                result[i] = hallOfFame.peek();
            }

            return result;
        }
    }
}