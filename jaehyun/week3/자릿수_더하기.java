package jaehyun.week3;

public class 자릿수_더하기 {
    public static void main(String[] args) {

    }
    private static class Solution {
            public int solution(int n) {
                int answer = 0;
                while (n > 0) {
                    answer+=(n%10);
                    n/=10;
                }

                return answer;
            }

    }
}
