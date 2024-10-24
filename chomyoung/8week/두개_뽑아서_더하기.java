import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class 두개_뽑아서_더하기 {

    public static void main(String[] args) {

    }

    private static class Solution {
        // 서로 다른 인덱스에 있는 두개의 수를 뽑아서
        // 더한 모든 수를
        // 배열에
        // 오름차순

        // 방법
        // 1. 배열의 length 등차수열
        // 2. Key값으로 정렬된 TreeMap
        // 3. 반대로 answer 세팅
        public int[] solution(int[] numbers) {
            int length = numbers.length;
            List<Integer> answer = new ArrayList<>();
            Map<Integer, Integer> treeMap = new TreeMap<>();
            for(int i = 0; i<length; i++){
                for(int j=i+1; j<length; j++){
                    treeMap.putIfAbsent(numbers[i] + numbers[j], 0);
                }
            }

            for(Map.Entry<Integer, Integer> entry : treeMap.entrySet()){
                answer.add(entry.getKey());
            }

            return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        }
    }
}