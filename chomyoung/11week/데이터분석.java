import java.util.ArrayList;
import java.util.Comparator;

public class 데이터분석 {

    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        // 1. 필터링: ext 조건에 맞는 데이터를 ArrayList로 변환
        ArrayList<ArrayList<Integer>> filteredData = convertToArrayList(data, ext, val_ext);

        // 2. 정렬: sort_by 필드를 기준으로 오름차순 정렬
        switch (sort_by) {
            case "code":
                filteredData.sort(Comparator.comparingInt(row -> row.get(0)));
                break;
            case "date":
                filteredData.sort(Comparator.comparingInt(row -> row.get(1)));
                break;
            case "maximum":
                filteredData.sort(Comparator.comparingInt(row -> row.get(2)));
                break;
            case "remain":
                filteredData.sort(Comparator.comparingInt(row -> row.get(3)));
                break;
        }

        // 3. ArrayList를 int[][]로 변환
        return convertToArray(filteredData);
    }

    // 조건에 맞는 데이터를 ArrayList<ArrayList<Integer>>로 변환하는 메서드
    public static ArrayList<ArrayList<Integer>> convertToArrayList(int[][] array, String ext, int val_ext) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int[] row : array) {
            if (checkIsCase(ext, val_ext, row)) {
                ArrayList<Integer> innerList = new ArrayList<>();
                for (int num : row) {
                    innerList.add(num);
                }
                list.add(innerList);
            }
        }

        return list;
    }

    // 특정 조건에 맞는지 체크하는 메서드
    private static boolean checkIsCase(String ext, int val_ext, int[] row) {
        switch (ext) {
            case "code" -> {
                return row[0] < val_ext;
            }
            case "date" -> {
                return row[1] < val_ext;
            }
            case "maximum" -> {
                return row[2] < val_ext;
            }
            case "remain" -> {
                return row[3] < val_ext;
            }
        }
        return false;
    }

    // ArrayList<ArrayList<Integer>>를 int[][]로 변환하는 메서드
    public static int[][] convertToArray(ArrayList<ArrayList<Integer>> list) {
        int[][] array = new int[list.size()][];

        for (int i = 0; i < list.size(); i++) {
            ArrayList<Integer> innerList = list.get(i);
            array[i] = new int[innerList.size()];
            for (int j = 0; j < innerList.size(); j++) {
                array[i][j] = innerList.get(j);
            }
        }

        return array;
    }
}