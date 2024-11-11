class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        // bandage는 [시전 시간, 초당 회복량, 추가 회복량]
        int additionalHealTime = 0;
        int maxHP = health;
        int monsterAttackTime = 0;
        for (int time = 1; time <= 1000; time++) {
            if (health <= 0 || monsterAttackTime == attacks.length) {
                break;
            }

            if (monsterAttackTime < attacks.length) {
                if (time == attacks[monsterAttackTime][0]) {
                    health -= attacks[monsterAttackTime][1];
                    additionalHealTime = 0;
                    monsterAttackTime++;
                    continue;
                }
            }
            // 회복되는 체력이 최대 HP를 넘어갈 경우 최대 HP로 회복
            if (health + bandage[1] > maxHP) {
                health = maxHP;
            } else {
                health += bandage[1];
            }

            additionalHealTime++;
            if (additionalHealTime == bandage[0]) {
                if (health + bandage[2] <= maxHP) {
                    health += bandage[2];
                }
                additionalHealTime = 0;
            }
        }

        if (health <= 0) {
            answer = -1;
        } else {
            answer = health;
        }

        return answer;
    }
}
