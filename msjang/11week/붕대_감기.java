import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class 붕대_감기 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] bandage = {5, 1, 5};
        int health = 30;
        int[][] attacks = {{2,10},{9,15},{10,5},{11,5}};
        solution.solution(bandage, health, attacks);
    }

    static class Solution {
        public int solution(int[] bandage, int health, int[][] attacks) {
            int currentHealth = health;
            int maxHealTime = bandage[0];
            int regularHeal = bandage[1];
            int burstHeal = bandage[2];

            Map<Integer, Integer> attackSchedule = new HashMap<>();
            int lastAttackTime = 0;
            int consecutiveHealTime = 0;

            for (int[] attack : attacks) {
                attackSchedule.put(attack[0], attack[1]);
                lastAttackTime = Math.max(lastAttackTime, attack[0]);
            }

            for (int time = 1; time <= lastAttackTime; time++) {
                if (attackSchedule.containsKey(time)) {
                    currentHealth -= attackSchedule.get(time);
                    consecutiveHealTime = 0;
                } else {
                    currentHealth += regularHeal;
                    consecutiveHealTime++;

                    if (consecutiveHealTime == maxHealTime) {
                        currentHealth += burstHeal;
                        consecutiveHealTime = 0;
                    }

                    if (currentHealth > health) {
                        currentHealth = health;
                    }
                }

                if (currentHealth <= 0) {
                    return -1;
                }
            }

            return currentHealth;
        }
    }
}