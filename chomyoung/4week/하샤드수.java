import java.util.ArrayList;
import java.util.List;

public class 하샤드수 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(500));
    }

    private static class Solution {

        // 양의 정수 x
        // split해서(string split 혹은 자릿수 나누기) sum이 x % sum == 0 이면 하샤드 수
        // 주의: 일의 자리는 %로. 나머지는 / 10의 제곱 % 10 => 일의 자리 수를 남겨야하기에
        // return 하샤드 수 ? true : false
        public boolean solution(int x) {
            int length = String.valueOf(x).length();
            int sum = x % 10;
            for(int i=1; i<length; i++){
                sum += (int) (x/Math.pow(10, i))%10;
            }
            return x % sum == 0;
        }
    }

}