public class 기사단원의_무기 {
    public int solution(int number, int limit, int power) {
        int totalWeight = 0;

        for (int i = 1; i <= number; i++) {
            int divisorCount = countDivisors(i);

            // 공격력이 limit를 초과하는 경우 power로 설정
            if (divisorCount > limit) {
                totalWeight += power;
            } else {
                totalWeight += divisorCount;
            }
        }

        return totalWeight;
    }

    // 주어진 숫자의 약수 개수를 계산하는 메서드
    private int countDivisors(int n) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++; // i는 약수
                if (i != n / i) {
                    count++; // n / i도 약수
                }
            }
        }
        return count;
    }
}
