import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        boolean[] isPainting = new boolean[n + 1];
        Arrays.fill(isPainting, true);
        for (int index = 0; index < section.length; index++) {
            isPainting[section[index]] = false;
        }

        for (int index = 1; index < isPainting.length; index++) {
            if (!isPainting[index]) {
                answer++;

                if (index + m < isPainting.length) {
                    index += m - 1;
                } else {
                    break;
                }
            }
        }

        return answer;
    }
}
