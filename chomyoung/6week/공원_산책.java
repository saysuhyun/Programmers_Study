import java.util.Arrays;

public class 공원_산책 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(
            new String[]{"SOO","OXX","OOO"}, new String[]{"E 2","S 2","W 1"}));
    }
    private static class Solution {
        // O, X
        // "방향 거리"
        // 진행 전 validation: 공원 벗어나는지, 장애물 만나는지
        // validation 처리: continue;
        // return 현재 위치 좌표

        // 로직
        // 1. 먼저 개의 위치를 구한다.
        // 2. for문 돌면서 continue;
            // (1) 공원 벗어나는지
            // (2) 장애물 만나는지

        // 방법
        // 1. 2차원 배열? 2차에는 split한 배열이
        // 2. 가는 길에 장애물 위치하면 안된다.
        // h: 세로, w: 가로
        public int[] solution(String[] park, String[] routes) {
            int hIndex = findIndex(park);
            int wIndex = park[hIndex].indexOf("S");
            int[] answer = new int[]{hIndex, wIndex};
            int wLength = park[0].length();
            int hLength = park.length;
            String[][] area = new String[hLength][wLength];
            for(int i=0; i<park.length; i++){
                area[i] = park[i].split("");
            }

            for(String route : routes){
                char[] routeCharArr = route.toCharArray();
                if('N' == routeCharArr[0] || 'S' == routeCharArr[0]){
                    int toboIndex = answer[0] + getHeightProceedDistance(routeCharArr);
                    if(toboIndex >= hLength || toboIndex < 0 ){
                        continue;
                    }
                    int minIndex = Math.min(toboIndex, answer[0]);
                    int maxIndex = Math.max(toboIndex, answer[0]);
                    if(checkHasAnyObstacle(area, minIndex, maxIndex, answer[1], true)){
                        continue;
                    }
                    answer[0] = toboIndex;
                }else{
                    int toboIndex = answer[1] + getWideProceedDistance(routeCharArr);
                    if(toboIndex >= wLength || toboIndex < 0 ){
                        continue;
                    }
                    int minIndex = Math.min(toboIndex, answer[1]);
                    int maxIndex = Math.max(toboIndex, answer[1]);
                    if(checkHasAnyObstacle(area, minIndex, maxIndex, answer[0], false)){
                        continue;
                    }
                    answer[1] = toboIndex;
                }
            }
            return answer;
        }

        public int findIndex(String[] park) {
            return Arrays.stream(park)
                .filter(s -> s.contains("S"))
                .findFirst()
                .map(s -> Arrays.asList(park).indexOf(s))
                .orElse(-1);
        }

        public int getWideProceedDistance(char[] routeCharArr){
            switch (routeCharArr[0]) {
                case 'W' -> {
                    return -(routeCharArr[2] - '0');
                }
                case 'E' -> {
                    return routeCharArr[2] - '0';
                }
            }
            return 0;
        }

        public int getHeightProceedDistance(char[] routeCharArr){
            switch (routeCharArr[0]) {
                case 'N' -> {
                    return -(routeCharArr[2] - '0');
                }
                case 'S' -> {
                    return routeCharArr[2] - '0';
                }
            }
            return 0;
        }

        public boolean checkHasAnyObstacle(String[][] area, int minIndex, int maxIndex, int remainIndex, boolean isWide){
            for(int i=minIndex; i<=maxIndex; i++){
                if(isWide){
                    if("X".equals(area[i][remainIndex])){
                        return true;
                    }
                }else{
                    if("X".equals(area[remainIndex][i])){
                        return true;
                    }
                }
            }
            return false;
        }
    }
}