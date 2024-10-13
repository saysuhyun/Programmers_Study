package jaehyun.week6;

public class 덧칠하기 {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int lastPainted = 0; // 마지막으로 롤러처리한 구역의 끝번호

        for (int s : section) {
            if (s > lastPainted) {
                // 새로운 구역
                answer++;
                lastPainted = s + m - 1;
            }
        }

        return answer;
    }
}
//n = 8, m = 4, section = [2, 3, 6]