public class 수박수박수박수박수박수 {
    public static String solution(int n) {
        String answer = "";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sb.append('수');
            } else {
                sb.append('박');
            }
        }

        return sb.toString();
    }
}
