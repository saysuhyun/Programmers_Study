import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> answer = new LinkedList<>();

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] % divisor == 0) {
                answer.add(arr[index]);
            }
        }

        if (answer.size() == 0) {
            answer.add(-1);
        } else {
            Collections.sort(answer);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
