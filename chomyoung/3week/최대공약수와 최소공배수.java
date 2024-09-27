import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Solution {
    // 최대공약수: 공통된 약수 중 가장 큰 값 (교집합)
        // 케이스
        // 1. 작은 수가 큰 수의 약수인 경우
        // 2. 작은 수가 큰 수의 약수인 경우 X
    // 최소공배수: 둘 중 누가 큰지 비교해서, 큰수와 작은 수의 약수를 비교하고, 큰수와 다른 작은 수의 약수
        // 케이스
        // 1. 최대공약수가 1인 경우. 그냥 n * m
        // 2. 최대공약수 > 1인 경우, n과 m을 곱하고 최대공약수로 나눈다.
    // 두 수의 모든 약수를 가지고..?
    // 약수 - 제곱까지만 구하기 + 구한 것들을 나누기한 값으로 보충 => for문 횟수 줄이기
    public int[] solution(int n, int m) {

        int bigNum = n > m? n : m;
        int smallNum = n > m? m : n;
        List<Integer> bigNumList = new ArrayList<>();
        List<Integer> smallNumList = new ArrayList<>();

        int maxDivisor = 1;
        int minMultiple = 1;

        // 큰 값의 약수 구하기
        for (int i = 1; i<=Math.sqrt(bigNum); i++){
            if(bigNum%i == 0){
                bigNumList.add(i);
                if(i!=Math.sqrt(bigNum)) {
                    bigNumList.add(bigNum / i);
                }
            }
        }

        // 작은 값의 약수 구하기
        for (int i = 1; i<=Math.sqrt(smallNum); i++){
            if(smallNum%i == 0){
                smallNumList.add(i);
                if(i!=Math.sqrt(smallNum)) {
                    smallNumList.add(smallNum / i);
                }
            }
        }

        // 최대공약수 구하기
        if(bigNumList.contains(smallNum)){
            maxDivisor = smallNum;
        } else {
            for (int i : smallNumList) {
                if (i > maxDivisor && bigNumList.contains(i)) {
                    maxDivisor = i;
                }
            }
        }

        // 최소공배수 구하기
        if(maxDivisor == 1){
            minMultiple = n * m;
        } else {
            minMultiple = n * m / maxDivisor;
        }

        return new int[]{maxDivisor, minMultiple};
    }
}