import java.util.Arrays;
public class 공원 {

    public static void main(String[] args) {

    }

    private static class Solution {
        public int solution(int[] mats, String[][] park) {
            Arrays.sort(mats);
            for (int idx = mats.length-1; idx >= 0; idx--) {
                int m = mats[idx];
                // 돗자리의 크기가 𝑚 × 𝑚이므로, 공원에서 돗자리를 깔 수 있는 시작 지점 (i,j) 찾기
                for (int i = 0; i <= park.length-m; i++) { // 시작지점이니 length - m
                    for (int j = 0; j <= park[i].length-m; j++) {
                        // 시작지점부터 오른쪽 모서리 끝까지 -1 이어야 return
                        if (isAvailable(i, j, m, park)) return m;
                    }
                }
            }
            return -1;
        }
        private boolean isAvailable(int x, int y, int m, String[][] park) {
            for (int i = x; i < x+m; i++) { // x+m 시작지점으로 인해 - m 했던 것 원상 복구
                for (int j = y; j < y+m; j++) {
                    if (!park[i][j].equals("-1")) return false;
                }
            }
            return true;
        }
    }
}