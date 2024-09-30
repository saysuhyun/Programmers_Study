public class 소수_만들기 {
    public static void main(String[] args) {
        int[] example1 = {1, 2, 4,7,6}; // 결과: 1
        System.out.println(solution(example1));
    }

    public static int solution(int[] nums) {
        int answer =0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];

                    if (isPrime(sum)){
                        answer ++;
                    }
                }
            }
        }
        return answer;

    }
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
