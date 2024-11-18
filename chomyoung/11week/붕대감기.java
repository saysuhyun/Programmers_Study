public class 붕대감기 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{5, 1, 5}, 30,
            new int[][]{{2, 10}, {9, 15}, {10, 5}, {11, 5}}));
    }

    private static class Solution {
        // 1 * x : 체력 회복
        // t초 연속 감는다면 t * x + y
        // limit : 최대 체력 존재
        // 공격 당할 때는 취소. 끝나면 즉시 붕대감기
        // 공격 당할 때 일정한 데미지
        // 만약 체력 <= 0 : 죽는다.

        public int solution(int[] bandage, int health, int[][] attacks) {
            int t = bandage[0];
            int recoverPerSec = bandage[1];
            int additionalRecover = bandage[2];
            int currentHealth = health;
            int consecutiveSuccessTime = 0; // 연속 성공 시간
            int attackIndex = 0; // 공격 인덱스
            int attackTime = attacks.length > 0 ? attacks[0][0] : Integer.MAX_VALUE; // 첫 번째 공격 시간

            for (int time = 1; ; time++) {
                // 공격 시간 도달 시 공격 반영
                if (time == attackTime) {
                    int damage = attacks[attackIndex][1];
                    currentHealth -= damage;

                    // 체력이 0 이하가 되면 즉시 죽음
                    if (currentHealth <= 0) {
                        return -1;
                    }

                    // 공격을 받았으므로 붕대 감기 초기화
                    consecutiveSuccessTime = 0;
                    attackIndex++;
                    attackTime = (attackIndex < attacks.length) ? attacks[attackIndex][0] : Integer.MAX_VALUE;
                } else {
                    // 공격을 받지 않은 경우 회복 진행
                    if (consecutiveSuccessTime < t) {
                        currentHealth = Math.min(currentHealth + recoverPerSec, health); // 초당 회복량 적용
                        consecutiveSuccessTime++;
                    }

                    // t초 동안 연속 시전 성공하면 추가 회복량 적용
                    if (consecutiveSuccessTime == t) {
                        currentHealth = Math.min(currentHealth + additionalRecover, health);
                        consecutiveSuccessTime = 0; // 다시 초기화하여 다음 회복 시작
                    }
                }

                // 모든 공격이 끝났다면 최종 체력 반환
                if (attackIndex >= attacks.length) {
                    return currentHealth;
                }
            }
        }
    }
}