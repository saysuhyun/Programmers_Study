import java.util.ArrayList;
import java.util.List;

class Solution {
    // 약수 구하기 알고리즘
    // 제곱근까지 % i == 0 인 것들을 모으고,
    // 나머지 뒷부분인 n / x 들을 더해준다.
    // 제곱근의 경우는 더해주지않는다.
    // 더해줄 때, 동시성 문제를 피하기위해 arrayList 복제본 필요
    // return 약수를 모두 더한 값 stream reduce
    public int solution(int n) {
        List<Integer> frontDivisorList = new ArrayList<>();
        for(int i = 1; i <= Math.sqrt(n) ; i++){
            if(n%i==0){
                frontDivisorList.add(i);
            }
        }

        List<Integer> fullDivisorList = new ArrayList<>(frontDivisorList);
        for(Integer i : frontDivisorList){
            if(i != Math.sqrt(n)){
                fullDivisorList.add(n/i);
            }
        }

        return fullDivisorList.stream().reduce(0, Integer::sum);
    }
}