import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        /*
         *  빵(1) - 야채(2) - 고기(3) - 빵(1)
         *
         *  예시) 1, 2, 1, 2, 3, 1, 3, 1, 1
         *     - 1, 2, (1, 2, 3, 1), 3, 1, 1
         *     - (1, 2, 3, 1), 1
         *     - 1
         */
        List<Integer> ingredientList = Arrays.stream(ingredient)
                .boxed()
                .collect(Collectors.toList());

        for (int index = 0; index < ingredientList.size(); index++) {
            if (index >= 3) {
                if (ingredientList.get(index) == 1 && ingredientList.get(index - 1) == 3 && ingredientList.get(index - 2) == 2 && ingredientList.get(index - 3) == 1) {
                    for (int i = 0; i < 4; i++) {
                        ingredientList.remove(index - 3);
                    }

                    answer++;
                    index -= 3;
                }
            }
        }

        return answer;
    }
}
