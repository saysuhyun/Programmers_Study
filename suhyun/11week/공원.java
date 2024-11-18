class Solution {
    public int solution(int[] mats, String[][] park) {
        int n = park.length;
        int m = park[0].length;

        java.util.Arrays.sort(mats);
        for (int i = mats.length - 1; i >= 0; i--) {
            int size = mats[i];
            if (canPlaceMat(size, park, n, m)) {
                return size;
            }
        }
        return -1;
    }

    private boolean canPlaceMat(int size, String[][] park, int n, int m) {
        for (int i = 0; i <= n - size; i++) {
            for (int j = 0; j <= m - size; j++) {
                if (canPlaceAtPosition(size, park, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean canPlaceAtPosition(int size, String[][] park, int row, int col) {
        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (!park[i][j].equals("-1")) {
                    return false;
                }
            }
        }
        return true;
    }
}