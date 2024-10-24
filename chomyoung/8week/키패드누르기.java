public class 키패드누르기 {

    public static void main(String[] args) {

    }

    private static class Solution {

        private int leftLoc = 10;  // '*' 위치를 10으로 설정
        private int rightLoc = 12; // '#' 위치를 12로 설정

        public String solution(int[] numbers, String hand) {
            StringBuilder result = new StringBuilder();

            // numbers 배열을 하나씩 처리
            for (int num : numbers) {
                if (num % 3 == 1) {
                    // 1, 4, 7은 무조건 왼손
                    result.append(updatePosition(num, true));
                } else if (num != 0 && num % 3 == 0) {
                    // 3, 6, 9는 무조건 오른손
                    result.append(updatePosition(num, false));
                } else {
                    // 2, 5, 8, 0은 거리 계산 필요
                    int leftDistance = getDistance(leftLoc, num);
                    int rightDistance = getDistance(rightLoc, num);

                    if (leftDistance < rightDistance) {
                        result.append(updatePosition(num, true));
                    } else if (leftDistance > rightDistance) {
                        result.append(updatePosition(num, false));
                    } else {
                        // 거리가 같을 경우 hand 값에 따라 결정
                        result.append(hand.equals("left") ? updatePosition(num, true) : updatePosition(num, false));
                    }
                }
            }
            return result.toString();
        }

        // 번호와 손의 위치를 업데이트하는 메서드
        private String updatePosition(int num, boolean isLeft) {
            if (isLeft) {
                leftLoc = (num == 0) ? 11 : num;
                return "L";
            } else {
                rightLoc = (num == 0) ? 11 : num;
                return "R";
            }
        }

        // 두 위치 사이의 거리를 계산하는 메서드
        private int getDistance(int from, int to) {
            from = (from == 0) ? 11 : from;
            to = (to == 0) ? 11 : to;
            return Math.abs(from - to) / 3 + Math.abs(from - to) % 3;
        }
    }

}