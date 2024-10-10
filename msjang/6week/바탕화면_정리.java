public class 바탕화면_정리 {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] result = solution.solution(new String[]{".#...", "..#..", "...#."});
//        int[] result = solution.solution(new String[]{".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."});
//        int[] result = solution.solution(new String[]{"..........", ".....#....", "......##..", "...##.....", "....#....."});
        int[] result = solution.solution(new String[]{"..", "#."});
        for (int i : result) {
            System.out.println(i);
        }
    }

    static class Solution {
        public int[] solution(String[] wallpaper) {
            int minY = findMinY(wallpaper);
            int minX = findMinX(wallpaper);
            int maxY = findMaxY(wallpaper);
            int maxX = findMaxX(wallpaper);
            int[] answer = {minY, minX, maxY, maxX};
            return answer;
        }

        public int findMinY(String[] wallpaper) {
            for (int y = 0; y < wallpaper.length; y++) {
                int c = wallpaper[y].indexOf('#');
                if (c != -1) {
                    return y;
                }
            }
            return 0;
        }

        public int findMinX(String[] wallpaper) {
            int minX = 51;
            for (int y = 0; y < wallpaper.length; y++) {
                for (int x = 0 ; x < wallpaper[y].length(); x++ ){
                    char c = wallpaper[y].charAt(x);
                    if (c == '#' && x < minX)
                        minX = x;
                }
            }
            return minX;
        }

        public int findMaxY(String[] wallpaper) {
            for (int y = wallpaper.length - 1; y >= 0; y--) {
                int c = wallpaper[y].indexOf('#');
                if (c != -1) {
                    return y + 1;
                }
            }
            return 0;
        }

        public int findMaxX(String[] wallpaper) {
            int maxX = 0;
            for (int y = 0; y < wallpaper.length; y++) {
                for (int x = 0 ; x < wallpaper[y].length(); x++ ){
                    char c = wallpaper[y].charAt(x);
                    if (c == '#' && x > maxX)
                        maxX = x;
                }
            }
            return maxX+1;
        }


    }
}