import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int compareNumber = 0;
        if (ext.equals("date")) {
            compareNumber = 1;
        } else if (ext.equals("maximum")) {
            compareNumber = 2;
        } else if (ext.equals("remain")) {
            compareNumber = 3;
        }
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            if (data[i][compareNumber] < val_ext) {
                list.add(data[i]);
            }
        }

        int[][] answer = new int[list.size()][4];
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < 4; j++) {
                answer[i][j] = list.get(i)[j];
            }
        }

        int sortNumber;
        if (sort_by.equals("date")) {
            sortNumber = 1;
        } else if (sort_by.equals("maximum")) {
            sortNumber = 2;
        } else if (sort_by.equals("remain")) {
            sortNumber = 3;
        } else {
            sortNumber = 0;
        }

        Arrays.sort(answer, Comparator.comparingInt((int[] o) -> o[sortNumber]));

        return answer;
    }
}
