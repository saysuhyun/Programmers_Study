import java.util.*;

public class SameNumber {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        ArrayList<Integer> answer = solve(arr);
        System.out.println(answer);
    }

    public static ArrayList<Integer> solve(int[] arr) {
        ArrayList<Integer> answerList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            // list가 비어있거나 가장 마지막 배열 값이랑 현재 값이 다른경우에만 add
            if (answerList.isEmpty() || answerList.get(answerList.size() - 1) != arr[i]) {
                answerList.add(arr[i]);
            }
        }
        return answerList;
    }
}
