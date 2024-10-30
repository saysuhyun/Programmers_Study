import java.util.Arrays;

public class 로또의_최고순위와_최저순위 {

    public static void main(String[] args) {

    }

    private static class Solution {

        // ## 두 배열의 요소 비교 활용
        // - 공통된 것이 있다면 count ++ // 반복문으로 판별?

        // # 문제 해결 방법
        // 공통된 요소의 갯수가 로또 최저 순위의 기준이 되는 개수
        // 공통된 요소 갯수와 0의 갯수를 합친 것이 최고 순위의 기준이 되는 개수이다.

        // 1) 0이 있다면 0의 갯수만큼 count ++
        // 2) 0의 갯수 무시하고, 모두 다 틀렸을 때를 count++ =>최저 순위다.
        // 3) 1번과 2번을 합하면 최고순위

        public static int[] solution(int[] lottos, int[] win_nums) {
            // 0의 갯수 구하기
            long zeroCount = Arrays.stream(lottos)
                .filter(num -> num == 0)
                .count();

            // 배열 간의 교집합을 구해서 최소 갯수 구하기.
            long matchCount = Arrays.stream(lottos)
                .filter(num -> Arrays.stream(win_nums).anyMatch(w -> w == num))
                .count();

            // 최고순위, 최저 순위를 담는다.
            // 각 순위는 7-갯수의 값과 같다.
            int minRank = (int) (matchCount == 0 ? 6 : 7 - matchCount);
            int maxRank = (int) (matchCount + zeroCount == 0 ? 6 : 7 - (matchCount + zeroCount));

            return new int[]{maxRank, minRank};
        }
    }
}