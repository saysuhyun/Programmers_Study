public class 소수찾기 {

    static boolean[] isPrime;

    public int solution(int n ){

        int sum = 0 ;
        checkPrime(n);

        for(int i = 0 ; i<=n ; i++){
            if (isPrime[i]) {
                sum++;
            }
        }

        System.out.println(sum);
        return sum;
    }

    // 에라토스테네스의 체 활용
    public static void checkPrime(int num) {

        isPrime = new boolean[num + 1];

        for (int i = 0; i < isPrime.length; i++) {
            isPrime[i] = true;
        }

        // 0이랑 1은 소수 아님
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (isPrime[i]) { // 소수인 경우 그 수 제외하고 배수를 모두 false로 변경
                for (int j = i * i; j <= num; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }
}
