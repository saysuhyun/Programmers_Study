public class 최소직사각형 {

    public static void main(String[] args) {

    }

    private static class Solution {
        // 직사각형을 최소로
        // 가장 긴 녀석들을 가지고 먼저 세팅
        // 이후에 for문을 돌면서
        // 다른방향으로 지갑을 돌린 경우에도 되는지
        // 주의: 가로나 세로 중 하나의 길이만 최대에서 점점 줄어들 수 있는 것!
        // 방법 1. 최댓값들을 구한다.
        // 방법 2. 가로와 세로 중 가장 긴 녀석이 누구인지 구한다.
        // 방법 3. 둘 중 작은 값을 가지고 for문을 돌면서

        // 가로와 세로 중 가장 긴 녀석을 고르고
        // 가장 긴 녀석의 파트너 ~ 둘 중 작은 값 사이에서 값을 구한다.
        public int solution(int[][] sizes) {
            int xMax = 0;
            int yMax = 0;
            for(int i=0; i<sizes.length; i++){
                if(sizes[i][0] > xMax){
                    xMax = sizes[i][0];
                }
                if(sizes[i][1] > yMax){
                    yMax = sizes[i][1];
                }
            }
            boolean isXBiggerThanY = xMax >= yMax;
            if(isXBiggerThanY){
                yMax = 0;
                for(int i=0; i<sizes.length; i++){
                    int min = Math.min(sizes[i][0], sizes[i][1]);
                    if(yMax < min){
                        yMax = min;
                    }
                }
            }else{
                xMax = 0;
                for(int i=0; i<sizes.length; i++){
                    int min = Math.min(sizes[i][0], sizes[i][1]);
                    if(xMax < min){
                        xMax = min;
                    }
                }
            }

            return xMax * yMax;
        }
    }
}