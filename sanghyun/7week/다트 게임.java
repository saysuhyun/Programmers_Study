import java.util.*;

public class Dart {
    public static void main(String[] args) {
        String dartResult = "1S2D*3T"; // 입력 문자열
        char[] cArr = dartResult.toCharArray(); // 입력 문자열을 문자 배열로 변환

        ArrayList<Double> scores = new ArrayList<>(); // 각 점수를 저장할 리스트
        double nowScore = 0; // 현재 점수

        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];

            // 숫자인 경우 점수 계산
            if (Character.isDigit(c)) {
                if (i > 0 && Character.isDigit(cArr[i - 1])) {
                    nowScore = nowScore * 10 + Character.getNumericValue(c); // 10점 처리
                } else {
                    nowScore = Character.getNumericValue(c);
                }
            } else {
                // 보너스 계산
                if (c == 'S') {
                    nowScore = Math.pow(nowScore, 1); // S는 1제곱
                } else if (c == 'D') {
                    nowScore = Math.pow(nowScore, 2); // D는 2제곱
                } else if (c == 'T') {
                    nowScore = Math.pow(nowScore, 3); // T는 3제곱
                }

                // 옵션 계산
                if (i + 1 < cArr.length) {
                    if (cArr[i + 1] == '*') {
                        nowScore *= 2;
                        if (!scores.isEmpty()) {
                            scores.set(scores.size() - 1, scores.get(scores.size() - 1) * 2); // 이전 점수도 2배로
                        }
                        i++; // '*' 처리했으니 다음 문자를 건너뜀
                    } else if (cArr[i + 1] == '#') {
                        nowScore *= -1; // '#'은 음수로 만듦
                        i++; // '#' 처리했으니 다음 문자를 건너뜀
                    }
                }

                scores.add(nowScore); // 계산된 점수를 리스트에 저장
                nowScore = 0; // 현재 점수 초기화
            }
        }

        // 최종 점수 계산
        double totalScore = 0;
        for (double score : scores) {
            totalScore += score;
        }

        System.out.println("최종 점수: " + totalScore);
    }
}
