package jaehyun.week3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 정수_내림차순으로_배치하기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(118372));

    }
    private static class Solution {
        public long solution(long n) {
            String str = Long.toString(n);
            //문자열을 큰 순서대로 정렬
            String sortedStr = Arrays.stream(str.split(""))
                    .sorted((a, b) -> b.compareTo(a))
                    .collect(Collectors.joining());
            //정렬된 문자열 long 타입으로 변환
            return Long.parseLong(sortedStr);

        }
    }
}
