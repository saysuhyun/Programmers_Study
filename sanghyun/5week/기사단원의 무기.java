public class Knight {
    public static void main(String[] args) {
        int number = 16;
        int limit = 3;
        int power = 2;

        int answer = 1; // 1은 계산할 필요 없음
        for (int i = 2; i <= number; i++) {
            int temp = 0; 

            // 단순 for로하면 시간초과 반드시 제곱근 사용하여야함
            for (int j = 1; j <= Math.sqrt(i); j++) {

                // 우선 제곱근 미만의 약수 개수 카운팅
                if (i % j == 0) {
                    temp++;

                    // 제곱수가 아닌 경우 대칭인 나누는 수도 카운트
                    // ex) 4 * 4 는 한번만 카운트 해야하지만
                    // 2 * 6은 2와 6 모두 카운팅해야한다.
                    
                    if (j != i / j) { 
                        temp++;
                    }
                }
            }

            if (temp > limit) {
                temp = power;
            }
            System.out.println("now " + i + " : " + temp);
            answer += temp;
        }

        System.out.println(answer);
    }
}
