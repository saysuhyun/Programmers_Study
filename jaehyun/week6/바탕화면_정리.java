package jaehyun.week6;

import java.util.Arrays;

public class 바탕화면_정리 {
    public static int[] solution(String[] wallpaper) {
        //wallpaper = [".#...", "..#..", "...#."]
        int lux = Integer.MAX_VALUE;
        int luy = Integer.MAX_VALUE;
        int rdx = Integer.MIN_VALUE;
        int rdy = Integer.MIN_VALUE;

        // 모든 파일이 있는 좌표를 찾음
        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    lux = Math.min(lux, i); // 가장 위쪽
                    luy = Math.min(luy, j); // 가장 왼쪽
                    rdx = Math.max(rdx, i); // 가장 아래쪽
                    rdy = Math.max(rdy, j); // 가장 오른쪽
                }
            }
        }

        // 드래그 끝점은 직사각형을 포함하기 위해 +1
        return new int[] {lux, luy, rdx + 1, rdy + 1};
    }
    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(new String[]{".#...", "..#..", "...#."}))); // [0, 1, 3, 4]
        System.out.println(Arrays.toString(solution(new String[]{"..........", ".....#....", "......##..", "...##.....", "....#....."}))); // [1, 3, 5, 8]
    }
}
