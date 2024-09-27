public class 행렬의덧셈 {

    public static void main(String[] args) {

    }

    private static class Solution {
        // 행열 크기 모두 같음
        // 포인트: 행열 크기는 변동
        // for문: i와 j의 역할
        // i: arr 배열 내 인덱스
        // j: arr 배열 내 배열의 인덱스
        // answer 초기화 => 행의 길이, 열의 길이
        public int[][] solution(int[][] arr1, int[][] arr2) {
            int columnLength = arr1.length;
            int rowLength = arr1[0].length;
            int[][] answer = new int[columnLength][rowLength];
            for(int i=0; i<columnLength; i++){
                int[] arr1X = arr1[i];
                int[] arr2X = arr2[i];
                for(int j=0; j<rowLength; j++){
                    answer[i][j] = arr1X[j]+arr2X[j];
                }
            }
            return answer;
        }
    }
}