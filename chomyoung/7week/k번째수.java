import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class k번째수 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{new int[]{2, 5, 3}, new int[]{4, 4, 1}, new int[]{1, 7, 3}}));
    }

    private static class Solution {
        // 자르고 정렬했을때, k번째 수 구하기
        // i, j, k
        // 1. 먼저 자르고, 정렬 진행 => ?
        // 주의: 인덱스 vs 번째
        public int[] solution(int[] array, int[][] commands) {
            int[] answer = new int[commands.length];

            for(int i=0; i<commands.length ;i++){
                // Str으로 바꿨다가 substring했다가 다시 int[]로 바꿔서 정렬....
                // 그냥 int[]로 노가다해서 가져온다음, 정렬
                List<Integer> newList = new ArrayList<>();
                for(int j=0; j<array.length;j++){
                    if(j>=commands[i][0] - 1 && j <= commands[i][1] - 1) {
                        newList.add(array[j]);
                    }
                }
                Collections.sort(newList);
                answer[i] = newList.get(commands[i][2] - 1);
            }
            return answer;
        }
    }
}