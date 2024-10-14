import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        HashSet<Integer> reserveSet = new HashSet<>();
        HashSet<Integer> lostSet = new HashSet<>();

        for (int num : reserve) {
            reserveSet.add(num);
        }

        for (int num : lost) {
            if (reserveSet.contains(num)) {
                reserveSet.remove(num);
            } else {
                lostSet.add(num);
            }
        }

        for (int num : reserveSet) {
            if (lostSet.contains(num - 1)) {
                lostSet.remove(num - 1);
            } else lostSet.remove(num + 1);
        }

        return n - lostSet.size();
    }
}
