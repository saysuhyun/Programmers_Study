public class 삼총사 {
    public static void main(String[] args) {
        int[] result1 = {-3, -2, -1, 0, 1, 2, 3};
        System.out.println(solution(result1));

    }

    public static int solution(int[] number) {
        int answer = 0;
        int n = number.length;

        // 모든 가능한 3개의 학생을 선택하기 위한 이중 반복문
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    // 세 학생의 번호의 합이 0인지 확인
                    if (number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

}
