public class 숫자_짝궁 {
    public static void main(String[] args) {
        System.out.println(solution("12321"	,"42531"));
    }
    public static String solution(String X, String Y) {
        int[] countX = new int[10];
        int[] countY = new int[10];

        for (char c : X.toCharArray()) {
            countX[c - '0']++;
        }

        for (char c : Y.toCharArray()) {
            countY[c - '0']++;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 9; i >= 0; i--) {
            int commonCount = Math.min(countX[i], countY[i]);
            for (int j = 0; j < commonCount; j++) {
                result.append(i);
            }
        }
        if (result.length() == 0) {
            return "-1";
        } else if (result.toString().chars().allMatch(c -> c == '0')) {
            return "0";
        }
        return result.toString();
    }


}
