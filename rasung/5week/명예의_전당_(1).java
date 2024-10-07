import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> topScore = new LinkedList<>();
        int minScore = Integer.MAX_VALUE;

        for (int index = 0; index < score.length; index++) {
            if (topScore.size() < k) {
                if (minScore > score[index]) {
                    minScore = score[index];
                }
                topScore.add(score[index]);
                answer[index] = minScore;
            } else {
                if (score[index] >= minScore) {
                    // 최하위 점수 갱신
                    Collections.sort(topScore);
                    topScore.remove(0);
                    topScore.add(score[index]);
                    int searchMin = Integer.MAX_VALUE;
                    for (int i = 0; i < topScore.size(); i++) {
                        if (topScore.get(i) < searchMin) {
                            searchMin = topScore.get(i);
                        }
                    }
                    minScore = searchMin;
                }
                answer[index] = minScore;
            }
        }

        return answer;
    }
}
