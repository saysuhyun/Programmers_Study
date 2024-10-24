public class 키패드_누르기 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right");
    }
    static class Solution {

        // 왼쪽 *, 오른쪽 # 시작
        // 이동범위 상하좌우 거리 1칸
        // 둘다 영 이면
        // 1. 먼저 왼쪽인지, 오른쪽 번호 인지, 가운데 번호인지 판단.
        public String solution(int[] numbers, String hand) {

            StringBuilder sb = new StringBuilder();
            int leftHand = 10;
            int rightHand = 12;

            for (int number : numbers){
                if (number == 1 || number == 4 || number == 7){
                    leftHand = number;
                    sb.append("L");
                    continue;
                }else if (number == 3 || number == 6 || number == 9){
                    rightHand = number;
                    sb.append("R");
                    continue;
                }

                if (number == 0) number = 11;

                //키패드는 3열로 되어 있다.
                int leftDiff = (Math.abs(number - leftHand) / 3) + (Math.abs(number - leftHand) % 3);
                int rightDiff =(Math.abs(number - rightHand) / 3) + (Math.abs(number - rightHand) % 3);

                if (leftDiff == rightDiff){
                    if (hand.equals("right")){
                        rightHand = number;
                        sb.append("R");
                    }else {
                        leftHand = number;
                        sb.append("L");
                    }
                }else {
                    if (rightDiff < leftDiff){
                        rightHand = number;
                        sb.append("R");
                    }else {
                        leftHand = number;
                        sb.append("L");
                    }
                }
            }

            return sb.toString();
        }
    }
}