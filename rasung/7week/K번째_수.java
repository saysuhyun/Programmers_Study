import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int row = 0; row < commands.length; row++) {
            int startIndex = commands[row][0] - 1;
            int endIndex = commands[row][1] - 1;
            int searchKIndex = commands[row][2] - 1;
            List<Integer> numbers = new LinkedList<>();

            for (int index = startIndex; index <= endIndex; index++) {
                numbers.add(array[index]);
            }

            Collections.sort(numbers);

            answer[row] = numbers.get(searchKIndex);
        }

        return answer;
    }
}
