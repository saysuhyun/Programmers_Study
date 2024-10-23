import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] patternA = { 1, 2, 3, 4, 5 };
        int[] patternB = { 2, 1, 2, 3, 2, 4, 2, 5 };
        int[] patternC = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
        
        int totalA = 0;
        int totalB = 0;
        int totalC = 0;
        
        for (int i = 0; i < answers.length; i++) { 
            if (answers[i] == patternA[i % patternA.length]) totalA++;
            if (answers[i] == patternB[i % patternB.length]) totalB++;
            if (answers[i] == patternC[i % patternC.length]) totalC++;
        }

        int maxScore = Math.max(totalA, Math.max(totalB, totalC));

        List<Integer> result = new ArrayList<>();
        if (totalA == maxScore) result.add(1);
        if (totalB == maxScore) result.add(2);
        if (totalC == maxScore) result.add(3);
        

        return result.stream().mapToInt(i -> i).toArray();
        
    }
}