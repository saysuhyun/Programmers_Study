import java.util.*;

public class 두개_뽑아서_더하기 {
    public static void main(String[] args) {

    }

    static class Solution {
        public int[] solution(int[] numbers) {
            Set<Integer> sumSet = new TreeSet<>();

            for (int i = 0; i < numbers.length - 1; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    sumSet.add(numbers[i] + numbers[j]);
                }
            }

            int[] answer = new int[sumSet.size()];
            int index = 0;
            for (int num : sumSet) {
                answer[index++] = num;
            }

            return answer;
        }
    }
}
