public class 푸드파이터_대회 {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();

        // 음식의 양을 기반으로 선수들이 먹을 음식의 수를 결정
        for (int i = 1; i < food.length; i++) {
            // 각 음식의 수를 반으로 나누어 선수들이 먹을 수 있는 양을 결정
            int count = food[i] / 2;
            // 왼쪽 선수의 음식 배치
            for (int j = 0; j < count; j++) {
                answer.append(i); // 음식 번호를 문자열에 추가
            }
        }

        // 물을 추가
        answer.append(0);

        // 오른쪽 선수의 음식 배치 (왼쪽 선수와 같은 순서로 추가)
        for (int i = food.length - 1; i > 0; i--) {
            int count = food[i] / 2;
            for (int j = 0; j < count; j++) {
                answer.append(i); // 음식 번호를 문자열에 추가
            }
        }

        return answer.toString();
    }
}
