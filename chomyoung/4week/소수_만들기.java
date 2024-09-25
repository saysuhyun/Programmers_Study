import java.util.Arrays;

public class 소수_만들기 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{1,2,7,6,4}));
    }

    private static class Solution {
        public int solution(int[] nums) {
            // 간단하게는 다 더하면서 소수인지 판독
            // 주어진 숫자 int[] 중 3개의 수를 더할 때, 서로 다른 3개.
                // 서로 다른 3개를 골라 더함
                // 3중 for문...
            // 소수가 되는 경우
                // 소수 구하기: 제곱근까지 구하면 된다. 제곱근이 가장 큰 소수
            // return 개수
            int length = nums.length;
            int answer = 0;

            // 3개의 숫자이므로 i는 맨 뒤로부터 2개 앞인 숫자까지만
            for(int x=0; x<length-2; x++){
                for(int y=x+1; y<length-1; y++){
                    for(int z=y+1; z<length; z++){
                        System.out.println("x: "+x+"y: "+y+"z: "+z);
                        int sum = nums[x]+nums[y]+nums[z];
                        if(isPrime(sum)) {
                            answer++;
                        }
                    }
                }
            }

            return answer;
        }

        public boolean isPrime(int x){
            for(int i=2; i<=Math.sqrt(x); i++){
                if(x%i==0){
                    return false;
                }
            }
            return true;
        }
    }
}