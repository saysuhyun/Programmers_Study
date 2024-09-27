import java.util.*;

public class Solution {
    // 각 자릿 수의 합 더하기
    // 각 자릿 수 => length
    // N / i
    // for문 돌려서 10배씩 줄여나간다.
    public int solution(int n) {
        int answer = 0;
        int length = String.valueOf(n).length();

        for(int i = (int) Math.pow(10, length-1); i>0; i = i/10){
            int digitNum = n / i;
            answer += digitNum;
            n -= digitNum * i;
        }
        return answer;
    }
}