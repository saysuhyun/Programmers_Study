import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {

        List<int[]> filteredData = Arrays.stream(data)
                .filter(item -> {
                    switch (ext) {
                        case "code":
                            return item[0] < val_ext;
                        case "date":
                            return item[1] < val_ext;
                        case "maximum":
                            return item[2] < val_ext;
                        case "remain":
                            return item[3] < val_ext;
                        default:
                            return false;
                    }
                })
                .collect(Collectors.toList());

        filteredData.sort((a, b) -> {
            switch (sort_by) {
                case "code":
                    return Integer.compare(a[0], b[0]);
                case "date":
                    return Integer.compare(a[1], b[1]);
                case "maximum":
                    return Integer.compare(a[2], b[2]);
                case "remain":
                    return Integer.compare(a[3], b[3]);
                default:
                    return 0;
            }
        });

        return filteredData.toArray(new int[filteredData.size()][]);
    }
}