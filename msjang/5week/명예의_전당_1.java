import java.util.Collections;
import java.util.Stack;

public class 명예의_전당_1 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(4, new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000});

    }

    static class Solution {
        public int[] solution(int k, int[] score) {
            int[] answer = new int[score.length];
            Stack<Integer> stack = new Stack<>();
            //
            for (int i = 0; i < score.length; i++) {

                if (stack.size() < k){
                    stack.push(score[i]);
                    Collections.sort(stack, Collections.reverseOrder());
                    answer[i] = stack.peek();
                    continue;
                }


                if (stack.peek() < score[i]) {
                    //가장 작은거 빼고
                    stack.pop();
                    //새로운거 넣어서
                    stack.push(score[i]);
                    Collections.sort(stack, Collections.reverseOrder());
                    answer[i] = stack.peek();
                }else {
                    answer[i] = stack.peek();
                }
            }

            return answer;
        }
    }
}