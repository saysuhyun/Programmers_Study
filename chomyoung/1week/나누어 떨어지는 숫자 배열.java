import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {

    // array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환
    // validation 체크: divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환
    // array 돌면서, divisor로 나눌 때 나머지 0, 해당 값들 오름차순 정렬
    // stream filter 활용. 리스트가 0이면 -1
    // int[] -> List<Integer> -> int[]

    public int[] solution(int[] arr, int divisor) {
        List<Integer> convertedList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> filteredList = convertedList.stream()
            .filter(a -> a % divisor == 0)
            .sorted()
            .collect(Collectors.toList());

        List<Integer> answerList = filteredList.size() == 0 ? Arrays.asList(-1) : filteredList;
        return answerList.stream().mapToInt(i->i).toArray();
    }

    // 개선점
    // 1. Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray();
}
