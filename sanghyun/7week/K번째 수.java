import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        List<Integer> answerList = new ArrayList<>();
        for(int[] command : commands) {
            int start = command[0];
            int end = command[1];
            int position = command[2];
            List<Integer> list = new ArrayList<>();
            
            int scope = end - start;
            for(int i = start-1; i < start + scope; i++) {
                list.add(array[i]);
            }
            list = list.stream().sorted().collect(Collectors.toList());
            answerList.add(list.get(position-1));
        }
        answer = answerList.stream().mapToInt(i -> i).toArray();
        return answer;
    }
} 