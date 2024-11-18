import java.util.Arrays;

public class 공원 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[][] array = {
                {"A", "A", "-1", "B", "B", "B", "B", "-1"},
                {"A", "A", "-1", "B", "B", "B", "B", "-1"},
                {"-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1"},
                {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"},
                {"D", "D", "-1", "-1", "-1", "-1", "-1", "F"},
                {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"}
        };

        solution.solution(new int[]{5,3,2}, array);
    }

    static class Solution {
        public int solution(int[] mats, String[][] park) {
            int rows = park.length;
            int cols = park[0].length;

            Arrays.sort(mats);

            for (int m = mats.length - 1; m >= 0; m--) {
                int size = mats[m];
                if (isPlaceMat(size, park, rows, cols)) {
                    return size;
                }
            }

            return -1;
        }

        private boolean isPlaceMat(int size, String[][] park, int rows, int cols) {
            for (int i = 0; i <= rows - size; i++) {
                for (int j = 0; j <= cols - size; j++) {
                    if (isAreaEmpty(i, j, size, park)) {
                        return true;
                    }
                }
            }
            return false;
        }

        private boolean isAreaEmpty(int startX, int startY, int size, String[][] park) {
            for (int x = startX; x < startX + size; x++) {
                for (int y = startY; y < startY + size; y++) {
                    if (!park[x][y].equals("-1")) {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}