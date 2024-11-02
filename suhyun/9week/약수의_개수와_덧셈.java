public class 약수의_개수와_덧셈 {
    public int solution(int left, int right) {
        int sum = 0;

        for (int i = left; i <= right; i++) {
            if (countDivisors(i) % 2 == 0) {
                sum += i;
            } else {
                sum -= i;
            }
        }

        return sum;
    }

    private int countDivisors(int num) {
        int count = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                count++;
                if (i != num / i) {
                    count++;
                }
            }
        }
        return count;
    }
}
