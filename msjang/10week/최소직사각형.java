public class 최소직사각형 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] array = {
                {60, 50},
                {30, 70},
                {60, 30},
                {80, 40}
        };
        solution.solution(array);
    }

    static class Solution {
        // 최소 직사각형
        // 명함의 가로 , 세로 길이들을 받아서 모두 담을수 있는 사이즈의 명함을 만들어야한다.
        // 가로인 길이를 세로 길이로 전환 가능
        // 1. 명함중 큰수인것을 가로길이로 놓자.
        public int solution(int[][] sizes) {
            int maxWidth = 0;
            int maxHeight = 0;

            for (int[] size : sizes) {
                if (size[0] < size[1]) {
                    if (maxWidth < size[1]) {
                        maxWidth = size[1];
                    }
                    if (maxHeight < size[0]) {
                        maxHeight = size[0];
                    }
                } else {
                    if (maxWidth < size[0]) {
                        maxWidth = size[0];
                    }
                    if (maxHeight < size[1]) {
                        maxHeight = size[1];
                    }
                }
            }
            int answer  = maxHeight * maxWidth;
            return answer;
        }

    }
}