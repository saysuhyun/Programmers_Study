public class Solution {
    public static int solution(int n) {
        // 소수 여부를 저장하는 배열 생성
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;  // 0과 1을 제외한 모든 수 true로 초기화
        }

        // 2부터 시작해서 n의 제곱근까지 반복하며 소수의 배수 지우기
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                // i의 배수들을 소수가 아니라고 표시
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                answer++;
            }
        }

        return answer;
    }
}