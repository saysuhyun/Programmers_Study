import java.util.*;
public class SameNumber {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        int[] answer = solve(arr);
    }

    // 문제 풀이 로직을 여기에 작성
    public static int[] solve(int[] arr) {

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int[] answer = {0};
        return answer;
    }
}
