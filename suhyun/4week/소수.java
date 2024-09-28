public class 소수 {
    public int solution(int[] nums) {
        int answer = 0;

        // 3개의 수를 선택하기 위한 이중 반복문
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (isPrime(sum)) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    // 소수 판별 함수
    private boolean isPrime(int num) {
        if (num < 2) return false; // 2보다 작은 수는 소수가 아님
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // 나누어 떨어지면 소수가 아님
            }
        }
        return true; // 소수
    }
}
