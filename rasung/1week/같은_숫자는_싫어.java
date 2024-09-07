import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        for (int number : arr) {
            if (stack.isEmpty()) {
                stack.push(number);
                continue;
            }
            if (number != stack.peek()) {
                stack.push(number);
            }
        }

        int[] answer = new int[stack.size()];
        for (int index = 0; index < stack.size(); index++) {
            answer[index] = stack.get(index);
        }
        return answer;
    }
}
