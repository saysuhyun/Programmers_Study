import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {

        Deque<Integer> queue = new LinkedList<>();

        for (int num : arr) {
            if (!queue.isEmpty() && queue.peekLast() == num) {
                continue;
            } else {
                queue.offer(num);
            }
        }
        return queue.stream().mapToInt(Integer::intValue).toArray();

    }
}