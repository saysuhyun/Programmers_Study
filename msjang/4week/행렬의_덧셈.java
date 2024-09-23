public class 행렬의_덧셈 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] result = solution.solution(new int[][]{{1, 2}, {2, 3}}, new int[][]{{3, 4}, {5, 6}});
//        int[][] result = solution.solution(new int[][]{{1}, {2}}, new int[][]{{3}, {5}});
        for (int[] item : result) {
            for (int item2 : item) {
                System.out.println(item2);
            }
        }
    }

    static class Solution {
        public int[][] solution(int[][] arr1, int[][] arr2) {

            for (int i = 0 ; i < arr1.length ; i++){
                for (int k = 0 ; k < arr1[0].length ; k++){
                    arr1[i][k] += arr2[i][k];
                }
            }

            return arr1;
        }
    }
}