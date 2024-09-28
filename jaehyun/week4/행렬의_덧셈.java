public class 행렬의_덧셈 {
    public static void main(String[] args) {
        int[][] arr1= {{1, 2}, {2, 3}};
        int[][] arr2 = {{3, 4}, {5, 6}};
        int[][] result = solution(arr1, arr2);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int rows = arr1.length;
        int cols = arr1[0].length;
        int[][] answer = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}
