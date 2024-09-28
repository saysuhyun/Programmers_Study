public class 삼총사 {
    public int solution(int[] number) {
        int answer = 0;
        int n = number.length;

        // 3개의 숫자를 선택하는 조합을 검사
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    // 세 숫자의 합이 0인지 확인
                    if (number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}
