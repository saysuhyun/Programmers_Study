import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class 카드뭉치 {

    public static void main(String[] args) {

    }

    private static class Solution {
        // 카드 뭉치 2개, 서로 다른 단어만 존재
        // 재사용 x, 순서대로 사용할 것
        // 그렇다면 hashMap이나 queue을 이용해서
        // xIndex, jIndex
        public String solution(String[] cards1, String[] cards2, String[] goal) {
            Queue<String> queue1 = new LinkedList<>();
            Queue<String> queue2 = new LinkedList<>();

            for (String card : cards1) {
                queue1.add(card);
            }
            for (String card : cards2) {
                queue2.add(card);
            }

            for (String word : goal) {

                if (!queue1.isEmpty() && queue1.peek().equals(word)) {
                    queue1.poll();
                }
                else if (!queue2.isEmpty() && queue2.peek().equals(word)) {
                    queue2.poll();
                }
                else {
                    return "No";
                }
            }

            // 모든 단어가 성공적으로 매칭되면 "Yes"
            return "Yes";
        }
    }
}