import java.util.stream.IntStream;

public class 음양_더하기 {
    public static void main(String[] args) {
        Solution solution   = new Solution();
        solution.solution(new int[]{4,7,12}, new boolean[]{true,false,true});
    }
    static class Solution {
        public int solution(int[] absolutes, boolean[] signs) {


            int sum = IntStream.rangeClosed(0, absolutes.length-1)
                    .map(i -> {
                        if (signs[i]) {
                            return absolutes[i];
                        } else {
                            return -absolutes[i];
                        }
                    }).sum();



            return sum;
        }
    }
}