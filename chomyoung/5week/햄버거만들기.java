import java.util.Stack;

public class 햄버거만들기 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1}));
    }

    private static class Solution {
        // 아래서부터 위로 -> 순서에 맞게 쌓여서 완성된 햄버거 포장
        // 1,2,3,1 조합을 앞에서부터 제거(stack에서 제거)
            // for문으로 변환하는 과정에서
            // 1231이 되는 순간 제거
        // return 햄버거 포장 갯수
        public int solution(int[] ingredient) {
            int answer = 0;
            Stack<Integer> stack = new Stack<>();
            for (int i : ingredient) {
                stack.push(i);

                // 스택의 크기가 4 이상일 때, 가장 최근 4개가 1, 2, 3, 1인지 확인
                if (stack.size() >= 4) {
                    int size = stack.size();
                    if (stack.get(size - 4) == 1 &&
                        stack.get(size - 3) == 2 &&
                        stack.get(size - 2) == 3 &&
                        stack.get(size - 1) == 1) {

                        // 최근 4개의 숫자가 1,2,3,1이면 스택에서 제거
                        stack.pop();
                        stack.pop();
                        stack.pop();
                        stack.pop();

                        answer++;
                    }
                }
            }

            return answer;
        }
    }
}