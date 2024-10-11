public class 바탕화면정리 {

    private static class Solution {
        // 바탕화면의 상태 => 주어진 String은 가로의 상태
        // 파일들을 한번에 삭제하기위한 최소한 이동거리 {"시작-세로", "시작-가로", "끝-세로", "끝-가로"}
        // 최소한의 거리 구하기
        // 드래그할 사각형의 왼쪽, 위쪽, 오른쪽, 아래쪽
        // 왼쪽 세로 중 제일 맨 왼쪽이 맨 아래이거나, 맨 위거나, 중간일때

        // 방법 => String[][]로 만들기??
        public int[] solution(String[] wallpaper) {
            int[] answer = {};
            // 맨위 발견
            // for문 돌면서 발견 => 가장 첫번째로 발견되는

            // 맨왼, 맨오 발견
            // for문 돌면서 MIN값에 재할당

            // 맨 아래 발견 => 가장 마지막으로 발견되는
            int northIndex = -1;
            int westIndex = -1;
            int southIndex = -1;
            int eastIndex = -1;


            for(int i=0; i<wallpaper.length; i++){
                char[] chars = wallpaper[i].toCharArray();
                for(int j=0; j < chars.length; j++){
                    if (northIndex == -1 && chars[j] == '#') {
                        northIndex = i;
                    }

                    if((westIndex > j && chars[j] == '#') || (westIndex == -1 && chars[j] == '#')){
                        westIndex = j;
                    }

                    if(eastIndex < j && chars[j] == '#'){
                        eastIndex = j;
                    }

                    if(southIndex < i && chars[j] == '#'){
                        southIndex = i;
                    }
                }

            }

            return new int[]{northIndex, westIndex, southIndex+1, eastIndex+1};
        }
    }
}