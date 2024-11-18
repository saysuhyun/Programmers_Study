import java.util.*;

public class 붕대감기 {
    public static void main(String[] args) {
        int[] bandage1 = {5, 1, 5};
        int health1 = 30;
        int[][] attacks1 = {{2, 10}, {9, 15}, {10, 5}, {11, 5}};
        System.out.println(solution(bandage1, health1, attacks1));

    }

    public static int solution(int[] bandage, int health, int[][] attacks) {
        int t = bandage[0]; // 시전 시간
        int x = bandage[1]; // 초당 회복량
        int y = bandage[2]; // 추가 회복량

        int currentHealth = health;
        int successTime = 0; // 연속 성공 시간
        int attackIndex = 0; // 현재 공격 인덱스

        for (int time = 1; time <= attacks[attacks.length - 1][0]; time++) {
            if (attackIndex < attacks.length && attacks[attackIndex][0] == time) {
                currentHealth -= attacks[attackIndex][1];
                attackIndex++;
                successTime = 0;
                if (currentHealth <= 0) return -1;
                continue;
            }

            if (successTime < t) {
                currentHealth += x;
                successTime++;
            }

            if (successTime == t) {
                currentHealth += y;
                successTime = 0;
            }

            if (currentHealth > health) {
                currentHealth = health;
            }
        }

        return currentHealth;
    }
}