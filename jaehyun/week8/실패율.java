import java.util.*;

public class 실패율 {
    public static void main(String[] args) {

    }

    static class Solution {
        public String solution(int[] numbers, String hand) {
            int[][] keypad = {
                    {3, 1}, // 0
                    {0, 0}, // 1
                    {0, 1}, // 2
                    {0, 2}, // 3
                    {1, 0}, // 4
                    {1, 1}, // 5
                    {1, 2}, // 6
                    {2, 0}, // 7
                    {2, 1}, // 8
                    {2, 2}  // 9
            };

            int[] leftPos = {3, 0};
            int[] rightPos = {3, 2};
            StringBuilder result = new StringBuilder();

            // 주 사용 손 설정
            String primaryHand = hand.equals("right") ? "R" : "L";

            for (int number : numbers) {

                int[] targetPos = keypad[number];

                if (number == 1 || number == 4 || number == 7) {
                    result.append("L");
                    leftPos = targetPos;
                } else if (number == 3 || number == 6 || number == 9) {

                    result.append("R");
                    rightPos = targetPos;
                } else {
                    int leftDist = Math.abs(leftPos[0] - targetPos[0]) + Math.abs(leftPos[1] - targetPos[1]);
                    int rightDist = Math.abs(rightPos[0] - targetPos[0]) + Math.abs(rightPos[1] - targetPos[1]);

                    if (leftDist < rightDist) {
                        result.append("L");
                        leftPos = targetPos;
                    } else if (rightDist < leftDist) {
                        result.append("R");
                        rightPos = targetPos;
                    } else {
                        // 거리가 같을떄는 주 사용 손 사용
                        if (primaryHand.equals("R")) {
                            result.append("R");
                            rightPos = targetPos;
                        } else {
                            result.append("L");
                            leftPos = targetPos;
                        }
                    }
                }
            }

            return result.toString();
        }
    }
}
