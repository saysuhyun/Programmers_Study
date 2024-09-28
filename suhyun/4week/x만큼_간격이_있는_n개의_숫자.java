public class x만큼_간격이_있는_n개의_숫자 {
    public long[] solution(int x, int n) {
        // 결과 배열 초기화
        long[] answer = new long[n];

        // x부터 시작해 x씩 증가하는 숫자를 n개 생성
        for (int i = 0; i < n; i++) {
            answer[i] = (long) x * (i + 1);
        }

        return answer;
    }
}
