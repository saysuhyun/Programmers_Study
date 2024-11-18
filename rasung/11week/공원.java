import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        int rowSize = park.length;
        int colSize = park[0].length;
        Integer[] tmp = Arrays.stream(mats).boxed().toArray(Integer[]::new);
        Arrays.sort(tmp, Collections.reverseOrder());

        loop :
        for (int index = 0; index < mats.length; index++) {
            int mat = tmp[index];
            for (int row = 0; row < rowSize; row++) {
                for (int col = 0; col < colSize; col++) {
                    if (park[row][col].equals("-1")) {
                        boolean flag = findSeat(row, col, rowSize, colSize, mat, park);
                        if (flag) {
                            answer = mat;
                            break loop;
                        }
                    }
                }
            }
        }

        return answer;
    }

    private static boolean findSeat(int row, int col, int maxRowSize, int maxColSize, int mat, String[][] park) {
        boolean flag = false;

        loop :
        for (int i = row; i < row + mat; i++) {
            for (int j = col; j < col + mat; j++) {
                if (i >= maxRowSize || j >= maxColSize) {
                    flag = false;
                    break loop;
                }

                if (park[i][j].equals("-1")) {
                    flag = true;
                } else {
                    flag = false;
                    break loop;
                }
            }
        }

        return flag;
    }
}
