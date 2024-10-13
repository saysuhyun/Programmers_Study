public class 덧칠하기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int result = solution.solution(8, 4, new int[]{2, 3, 6});
//        int result = solution.solution(5, 4, new int[]{1, 3});
        int result = solution.solution(4, 1, new int[]{1, 2, 3, 4});
        System.out.println(result);
    }

    static class Solution {
        // n : 1 미터 벽길이 구역
        // m : 롤러의 길이
        // section : 칠 해야 되는 구역 번호, 오름차순, 중복 없음
        // 최소 횟수로 칠하는 방법 구하기
        public int solution(int n, int m, int[] section) {
            int answer = 0;
            int paintSection = 0;

            for (int item : section) {
                if (paintSection < item){
                    paintSection = item + (m-1);
                    answer++;
                }
            }

            return answer;
        }
    }
}