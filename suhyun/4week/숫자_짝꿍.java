import java.util.HashMap;
import java.util.Map;

public class 숫자_짝꿍 {
    public String solution(String X, String Y) {
        // 각 숫자의 개수를 저장할 맵
        Map<Character, Integer> countX = new HashMap<>();
        Map<Character, Integer> countY = new HashMap<>();

        // X의 각 숫자 개수 세기
        for (char c : X.toCharArray()) {
            countX.put(c, countX.getOrDefault(c, 0) + 1);
        }

        // Y의 각 숫자 개수 세기
        for (char c : Y.toCharArray()) {
            countY.put(c, countY.getOrDefault(c, 0) + 1);
        }

        // 공통 숫자를 저장할 StringBuilder
        StringBuilder commonDigits = new StringBuilder();

        // 공통 숫자 찾기
        for (char c = '9'; c >= '0'; c--) {
            if (countX.containsKey(c) && countY.containsKey(c)) {
                // 공통 숫자의 개수만큼 추가
                int minCount = Math.min(countX.get(c), countY.get(c));
                for (int i = 0; i < minCount; i++) {
                    commonDigits.append(c);
                }
            }
        }

        // 결과 처리
        if (commonDigits.length() == 0) {
            return "-1"; // 공통 숫자가 없을 경우
        } else if (commonDigits.toString().replaceAll("0", "").isEmpty()) {
            return "0"; // 공통 숫자가 0으로만 구성된 경우
        } else {
            return commonDigits.toString(); // 가장 큰 정수 반환
        }
    }
}
