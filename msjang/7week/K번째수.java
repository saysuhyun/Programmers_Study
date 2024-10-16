import java.util.Arrays;

public class K번째수 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] solution1 = solution
                .solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});

    }

    static class Solution {
        // i번째 부터 j번째 까지 자르고 정려후 k번째 수
        public int[] solution(int[] array, int[][] commands) {
            int[] answer = new int[commands.length];

            for (int t = 0 ; t < commands.length ; t++){
                int i = commands[t][0];
                int j = commands[t][1];
                int k = commands[t][2];

                int[] tempInts = Arrays.copyOfRange(array, i - 1, j);
                Arrays.sort(tempInts);

                answer[t] = tempInts[k-1];
            }

            return answer;
        }
    }
}