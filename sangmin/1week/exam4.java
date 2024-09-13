import java.util.*;

// 숫자 배열 문제 풀이
class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }

        if (list.size() == 0) {
            list.add(-1);
        }
        
        // 배열 생성 및 정렬
        int answer[] = new int[list.size()];
        for (int j = 0; j < answer.length; j++) {
            answer[j] = list.get(j).intValue();
        }

        Arrays.sort(answer);

        return answer;
    }
}