import java.util.stream.IntStream;

class Solution {

    // 대상: a~b 각자와 그 사이의 숫자들의 합
    // [a, ... , b]를 먼저 구하고, 더하기 진행(가우스 법칙?)
    // 숫자 구하기: range
    // 더하기: stream sum
    // 간단하게 한다면, for문인데...

    public long solution(int a, int b) {
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        return IntStream.rangeClosed(a, b).asLongStream().sum();
    }

}