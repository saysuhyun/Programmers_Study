import java.util.Arrays;

public class 제일_작은_수_제거하기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(new int[]{10,2});
        for (int i : result) {
            System.out.println(i);
        }
    }

    static class Solution {
        public int[] solution(int[] arr) {

            int[] arrClone = arr.clone();
            if (arr.length <= 1) {
                return new int[]{-1};
            }
            Arrays.sort(arrClone);

            int[] answer = Arrays.stream(arr)
                    .filter(i -> i == arrClone[0] ? false : true)
                    .toArray();
            return answer;
        }
    }
}