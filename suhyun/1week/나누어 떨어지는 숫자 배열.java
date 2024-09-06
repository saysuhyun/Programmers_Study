import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {

        List<Integer> answer = new ArrayList<>();

        // 나누어주는 거 확인
        for (int num : arr) {
            if (num % divisor == 0) {
                answer.add(num);
            }
        }

        // 오름차순 정렬해두기
        Collections.sort(answer);
        return answer.size() == 0 ? new int[] { -1 } : answer.stream().mapToInt(Integer::intValue).toArray();

    }

    /* 다른 사람 문제 풀이 : stream */
    public int[] solution2(int[] arr, int divisor) {
        // 스트림 사용해서 filter에서 조건 만족한 경우만 다시 배열에 넣음
        int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();

        if (answer.length == 0)
            answer = new int[] { -1 };

        // 정렬
        java.util.Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(new int[] { 5, 9, 7, 10 }, 5);
    }
}