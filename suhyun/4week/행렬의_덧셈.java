public class 행렬의_덧셈 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        // 행렬의 크기 확인
        int rows = arr1.length;
        int cols = arr1[0].length;

        // 결과 행렬 초기화
        int[][] answer = new int[rows][cols];

        // 행렬 덧셈 수행
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }
}
