import java.util.Arrays;

public class 공원 {
    public static void main(String[] args) {
        int[] mats = {5, 3, 2};
        String[][] park = {
                {"A", "A", "-1", "B", "B", "B", "B", "-1"},
                {"A", "A", "-1", "B", "B", "B", "B", "-1"},
                {"-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1"},
                {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"},
                {"D", "D", "-1", "-1", "-1", "-1", "-1", "F"},
                {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"}
        };

        System.out.println(solution(mats, park));
    }

    public static int solution(int[] mats, String[][] park) {
        Arrays.sort(mats);
        for (int i = mats.length - 1; i >= 0; i--) {
            int size = mats[i];
            if (canPlaceMat(size, park)) {
                return size;
            }
        }
        return -1;
    }

    private static boolean canPlaceMat(int size, String[][] park) {
        int rows = park.length;
        int cols = park[0].length;

        for (int i = 0; i <= rows - size; i++) {
            for (int j = 0; j <= cols - size; j++) {
                if (isAreaFree(i, j, size, park)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isAreaFree(int startRow, int startCol, int size, String[][] park) {
        for (int i = startRow; i < startRow + size; i++) {
            for (int j = startCol; j < startCol + size; j++) {
                if (!park[i][j].equals("-1")) {
                    return false;
                }
            }
        }
        return true;
    }
}