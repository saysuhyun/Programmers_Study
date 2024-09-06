import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Solution {

    // N마리 중 N/2 마리를 가진다.
    // 종류에 따라 번호 붙인다.
    // 동일한 종류 폰켓몬 가질 수 있으나, 최대한 다양한 종류 희망
    // 파라미터: nums ex) [3,1,2,4]
    // validation: 1차원 배열. 1<= N <= 10_000. N은 짝수
    // 목표: 선택할 수 있는 폰켓몬 종류 개수의 최댓값 하나만 return

    // N마리가 주어진다면 최댓값은 N/2 이다. 즉, 모두 다양하더라도...
    // hashSet 사용
    // N/2보다 작다면 return HashSet size
    // N/2와 같다면 return N/2
    // N/2보다 크다면 return N/2

    // 관건: int[] -> Integer[]

    public int solution(int[] nums) {
        Integer[] integers = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Set<Integer> hashSet = new HashSet<>(Arrays.asList(integers));
        int diversityLength = hashSet.size();
        int maxLength = nums.length;

        if (diversityLength < maxLength){
            return diversityLength;
        } else{
            return maxLength;
        }
    }

    // 개선점
    // 1. IntStream.of(nums).boxed().collect(Collectors.toSet()): 불필요한 객체 반환 제거
    // 2. Math.min(diversityLength, maxLength) : 로직 간소화
}

