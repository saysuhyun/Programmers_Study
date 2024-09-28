import java.util.Arrays;

public class x만큼_간격이_있는_N개의_숫자 {

    public static void main(String[] args) {
        long[] result1 = solution(2, 5);
        System.out.println(Arrays.toString(result1));

    }

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < n; i++) {
            answer[i] = (long)x*(i+1);
        }
        return answer;
    }
}
