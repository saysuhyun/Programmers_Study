package jaehyun.week3;

import java.util.Arrays;

public class 제일_작은_수_제거하기 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(new int[] {4, 3, 2, 1})));
    }

    private static class Solution {
        public int[] solution(int[] arr) {
            if (arr.length == 1) {
                return new int[]{-1};
            }
            int minIndex = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[minIndex]) {
                    minIndex = i;
                }
            }

            //최소값 제외한 새로운 배열 생성
            int[] result = new int[arr.length -1];
            int index=0;
            for (int i=0;i<arr.length;i++) {
                if (i!=minIndex) {
                    result[index++] = arr[i];
                }
            }
            return result;

        }
    }
}
