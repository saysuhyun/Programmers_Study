import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class 데이터_분석 {
    public static void main(String[] args) {
        int[][] data = {
                {1, 20300104, 100, 80},
                {2, 20300804, 847, 37},
                {3, 20300401, 10, 8}
        };

        String ext = "date";
        int val_ext = 20300501;
        String sort_by = "remain";

        int[][] result = solution(data, ext, val_ext, sort_by);

        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        // 컬럼 이름과 인덱스를 매핑
        Map<String, Integer> columnMap = Map.of(
                "code", 0,
                "date", 1,
                "maximum", 2,
                "remain", 3
        );

        int extIndex = columnMap.get(ext);
        int sortByIndex = columnMap.get(sort_by);

        List<int[]> filteredSortedData = Arrays.stream(data)
                .filter(row -> row[extIndex] < val_ext)
                .sorted(Comparator.comparingInt(row -> row[sortByIndex]))
                .collect(Collectors.toList());

        return filteredSortedData.toArray(new int[filteredSortedData.size()][]);
    }

}
