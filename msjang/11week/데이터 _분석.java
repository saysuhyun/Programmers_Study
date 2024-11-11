import java.util.*;

class 데이터_분석 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(new int[][]{{1, 20300104, 100, 80},
                {2, 20300804, 847, 37},
                {3, 20300401, 10, 8}}, "date", 20300501, "remain");
    }

    static class Solution {

        // data 에서 ext 값이 val_ext 보다 작은데이터만 뽑은후, sort_by에 해당하는 값으로 오름차순 정렬
        public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
            Map<String, Integer> dataExtMap = new HashMap<>();
            dataExtMap.put("code", 0);
            dataExtMap.put("date", 1);
            dataExtMap.put("maximum", 2);
            dataExtMap.put("remain", 3);
            List<int[]> answer = new ArrayList<>();

            int valueIdx = dataExtMap.get(ext);
            int sortIdx = dataExtMap.get(sort_by);

            for (int i = 0; i < data.length; i++) {
                if (data[i][valueIdx] < val_ext) {
                    answer.add(data[i]);
                }
            }

            answer.sort(Comparator.comparingInt(o -> o[sortIdx]));
            int[][] sortedArray = answer.toArray(new int[answer.size()][]);
            return sortedArray;
        }

    }
}