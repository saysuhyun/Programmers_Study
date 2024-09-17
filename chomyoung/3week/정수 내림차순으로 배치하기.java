import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    // 각 자릿 수 : n % 10
    // 내림차순 정렬
    // 숫자 붙이기 => for문 + pow ?
    // 그냥 stringbuilder - 런타임 에러
    public int solution(long n) {
        List<Integer> answerList = Arrays.stream(String.valueOf(n).split(""))
            .map(Integer::parseInt)
            .sorted((o1, o2) -> o2 - o1)  // 내림차순 정렬
            .collect(Collectors.toList());
        StringBuilder sb = new StringBuilder();
        for(Integer i : answerList){
            sb.append(i);
        }
        return Integer.parseInt(sb.toString());
    }
}