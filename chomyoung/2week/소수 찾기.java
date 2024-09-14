import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    // 1~n : Intstream rangeclosed 를 통해 생성 => 이게 느린가....
    // 소수인 경우 : 2부터 n-1까지 나머지가 0이 있다면 => 너무 느리다.
        // 중요: 제곱근의 정수값까지 나머지를 구하면 된다.
        // isPrime에서  i <= n 이었을때는 시간 초과. 하지만, i <= (int) Math.sqrt(n); 처럼 제곱근 사용 후, 통과
    public int solution(int n) {
        int cnt = 0;
        for(int i = 2; i < n+1; i++){
            if(isPrime(i)){
                cnt++;
            }
        }
        return cnt;
    }

    public boolean isPrime(int n) {
        if(n == 1) return false;
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {		// 2보다 크고 n보다 작은 수로 나눈다.
            if (n % i == 0) return false;		// 만약 나누어 떨어지는 것이 있다면 false 반환
        }
        return true;				// 모두 나누고도 떨어지는 수가 없다면 true 반환
    }

}