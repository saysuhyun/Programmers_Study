public class 자릿수_더하기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int reuslt = solution.solution(123);

        System.out.println(reuslt);
    }

    static class Solution {
        public int solution(int n) {
            int answer = 0;
            String str = String.valueOf(n);
            for (char item : str.toCharArray()){
                answer += item - '0';
            }

            return answer;
        }
    }


}