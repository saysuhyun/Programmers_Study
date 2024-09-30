import java.util.Stack;

public class 햄버거_만들기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int result = solution.solution(new int[]{1, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1});
//        int result = solution.solution(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1});
        int result = solution.solution(new int[]{1, 3, 2, 1, 2, 1, 3, 1, 2});
        System.out.println(result);
    }

    static class Solution {
        public int solution(int[] ingredient) {
            int answer = 0;
            //1:빵, 2:야채, 3:고기
            //재료를 돌려가면 탐색
            //빵을 햄버거가 되면 스택에 넣지 말고 반환
            if (ingredient.length < 3){
                return 0;
            }
            Stack<Integer> stack = new Stack<>();
            for (int i = 0 ; i < ingredient.length; i++){
                stack.push(ingredient[i]);
                if (stack.size() >= 4){
                    if (isHamBerger(stack,ingredient[i]))
                        answer++;
                }
            }
            return answer;
        }

        public boolean isHamBerger(Stack<Integer> stack, int ingredient){
            if (ingredient != 1)
                return false;
            int stackSize = stack.size()-1;
            if (
                    stack.elementAt(stackSize - 1) == 3
                    && stack.elementAt(stackSize - 2) == 2
                    && stack.elementAt(stackSize - 3) == 1
            ) {
                stack.pop();
                stack.pop();
                stack.pop();
                stack.pop();
                return true;
            }else {
                return false;
            }
        }
    }
}