import java.util.Arrays;

public class 과일_장수 {
    public int solution(int k, int m, int[] score) {
        // 점수를 내림차순으로 정렬
        Arrays.sort(score);

        int answer = 0;
        int n = score.length;

        // 상자를 만들 수 있는 최대 개수
        int boxCount = n / m;

        // 상자를 만들 수 있는 경우에만 계산
        if (boxCount > 0) {
            // 상자에 담길 사과 중 가장 낮은 점수는 score[n - m * i - 1] (i는 상자 번호)
            for (int i = 1; i <= boxCount; i++) {
                int lowestScore = score[n - i * m]; // 가장 낮은 점수
                answer += lowestScore * m; // 가격 계산
            }
        }

        return answer;
    }
}
