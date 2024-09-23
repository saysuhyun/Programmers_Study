import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Solution {
    // n의 각 자릿수를 배열로 만든다.
    // 일의 자리, 10의 자리,.. 이런식으로 나머지를 배열에 더하면 자동으로 역순
    public int[] solution(long n) {
        List<Integer> answerList = new ArrayList<>();
        while(n>0){
            answerList.add((int) (n%10));
            n = n/10;
        }
        return answerList.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}