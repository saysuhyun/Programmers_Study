class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int t = bandage[0]; // 시전 시간
        int x = bandage[1]; // 초당 회복량
        int y = bandage[2]; // 추가 회복량

        int currentHealth = health;
        int consecutiveSuccess = 0;
        int attackIndex = 0;
        int time = 0;

        while (time <= attacks[attacks.length - 1][0]) {
            if (attackIndex < attacks.length && attacks[attackIndex][0] == time) {
                currentHealth -= attacks[attackIndex][1];
                consecutiveSuccess = 0;
                attackIndex++;
                if (currentHealth <= 0) {
                    return -1;
                }
            } else {
                if (consecutiveSuccess < t) {
                    currentHealth += x;
                    consecutiveSuccess++;
                    if (consecutiveSuccess == t) {
                        currentHealth += y;
                        consecutiveSuccess = 0;
                    }
                }
                currentHealth = Math.min(currentHealth, health);
            }
            time++;
        }

        return currentHealth;
    }
}