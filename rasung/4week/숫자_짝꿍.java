import java.util.stream.Collectors;

class Solution {
    public String solution(String X, String Y) {
        int[] xCnt = new int[10];
        int[] yCnt = new int[10];
        for (int index = 0; index < X.length(); index++) {
            xCnt[X.charAt(index) - '0']++;
        }
        for (int index = 0; index < Y.length(); index++) {
            yCnt[Y.charAt(index) - '0']++;
        }

        // 정답이 0이 되는 케이스 찾기
        boolean flag = false;
        if (xCnt[0] > 0 && yCnt[0] > 0) {
            for (int index = 1; index < 10; index++) {
                // X, Y 둘다 한개 이상 있을 경우
                if (xCnt[index] > 0 && yCnt[index] > 0) {
                    break;
                }
                if (index == 9) flag = true;
            }
        }

        if (flag) return "0";

        // 정답이 -1이 되는 케이스 찾기
        flag = false;
        for (int index = 1; index < 10; index++) {
            if (xCnt[index] == 0 && yCnt[index] > 0 || xCnt[index] > 0 && yCnt[index] == 0 || xCnt[index] == 0 && yCnt[index] == 0) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }

        if (flag) return "-1";

        StringBuilder sb = new StringBuilder();
        for (int index = 0; index < 10; index++) {
            if (xCnt[index] != 0 && yCnt[index] != 0) {
                int min = Math.min(xCnt[index], yCnt[index]);

                for (int i = 0; i < min; i++) {
                    sb.append(index);
                }
            }
        }

        return sb.toString().chars()
                .mapToObj(c -> (char) c)
                .sorted((a, b) -> Character.compare(b, a))
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
