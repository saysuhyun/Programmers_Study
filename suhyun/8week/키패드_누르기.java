import java.util.HashMap;
import java.util.Map;

public class 키패드_누르기 {

    public String solution(int[] numbers, String hand) {
        StringBuilder result = new StringBuilder();
        Map<Integer, int[]> keypad = new HashMap<>();

        keypad.put(1, new int[] { 0, 0 });
        keypad.put(2, new int[] { 0, 1 });
        keypad.put(3, new int[] { 0, 2 });
        keypad.put(4, new int[] { 1, 0 });
        keypad.put(5, new int[] { 1, 1 });
        keypad.put(6, new int[] { 1, 2 });
        keypad.put(7, new int[] { 2, 0 });
        keypad.put(8, new int[] { 2, 1 });
        keypad.put(9, new int[] { 2, 2 });
        keypad.put(0, new int[] { 3, 1 });

        int[] leftPosition = { 3, 0 };
        int[] rightPosition = { 3, 2 };

        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                result.append("L");
                leftPosition = keypad.get(number);
            } else if (number == 3 || number == 6 || number == 9) {
                result.append("R");
                rightPosition = keypad.get(number);
            } else {
                int[] target = keypad.get(number);
                int leftDistance = getDistance(leftPosition, target);
                int rightDistance = getDistance(rightPosition, target);

                if (leftDistance < rightDistance || (leftDistance == rightDistance && hand.equals("left"))) {
                    result.append("L");
                    leftPosition = target;
                } else {
                    result.append("R");
                    rightPosition = target;
                }
            }
        }

        return result.toString();
    }

    private int getDistance(int[] pos1, int[] pos2) {
        return Math.abs(pos1[0] - pos2[0]) + Math.abs(pos1[1] - pos2[1]);
    }
}