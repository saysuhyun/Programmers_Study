import java.util.Stack;

public class 문자열_내_p와_y의_개수 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("pPoooyY"));
        System.out.println(solution.solution("Pyy"));
    }

    static class Solution {
        boolean solution(String s) {
            Stack stack = new Stack<Character>();
            for (char item : s.toLowerCase().toCharArray()) {

                if ('p' == item || 'y' == item) {
                    if (stack.isEmpty()) {
                        stack.push(item);
                    } else {
                        if (stack.peek().equals(item)) {
                            stack.push(item);
                        } else {
                            stack.pop();
                        }
                    }
                }
            }


            return stack.size() > 0 ? false : true;
        }
    }
}