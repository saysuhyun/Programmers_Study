class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        /*
         *      입력방식 => 점수|보너스|[옵션]
         *
         *      [점수] 0 ~ 10
         *
         *      [보너스] S, D, T
         *      - S = 점수^1, D = 점수^2, T = 점수^3
         *
         *      [옵션] *, #
         *      - *: 해당 점수와 바로 전의 점수 2배, #: 해당 점수 마이너스 => 1S 2S* 3T#
         *      - *: 중첩시 4배                                   => 1S* 2S*
         *      - *, #: 중첩시 -2배                               => 1S# 2S*
         *      - *, #: 둘중 하나만 존재하며 존재 하지 않을수도 있다.     => 1S
         *
         *      3번의 기회!
         */
        int[] pointArray = new int[4];
        int chance = 0;

        for (int i = 0; i < dartResult.length(); i++) {
            char ch = dartResult.charAt(i);
            // 점수 처리
            if (Character.isDigit(ch)) {
                chance++;
                if (ch == '1' && dartResult.charAt(i + 1) == '0') {
                    i++;
                    pointArray[chance] += 10;
                } else {
                    pointArray[chance] += Integer.parseInt(String.valueOf(ch));
                }
                continue;
            }

            // [보너스 처리]
            if (ch == 'S') {
                pointArray[chance] = (int) Math.pow(pointArray[chance], 1);
            } else if (ch == 'D') {
                pointArray[chance] = (int) Math.pow(pointArray[chance], 2);
            } else if (ch == 'T') {
                pointArray[chance] = (int) Math.pow(pointArray[chance], 3);
            }

            // [옵션 처리]
            if (ch == '*') {
                if (chance > 1) {
                    pointArray[chance - 1] = pointArray[chance - 1] * 2;
                }
                pointArray[chance] = pointArray[chance] * 2;
            } else if (ch == '#') {
                pointArray[chance] = pointArray[chance] * -1;
            }
        }

        for (int index = 1; index < 4; index++) {
            answer += pointArray[index];
        }

        return answer;
    }
}
