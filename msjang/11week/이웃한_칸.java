public class 이웃한_칸 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[][] board = {
                {"blue", "red", "orange", "red"},
                {"red", "red", "blue", "orange"},
                {"blue", "orange", "red", "red"},
                {"orange", "orange", "red", "blue"}
        };
        solution.solution(board, 1, 1);
    }

    static class Solution {
        // 색깔이 담긴 board
        // 해당 위치에 위, 아래, 왼쪽, 오른칸 중 같은 색깔로 칠해진 칸 개수 구하기
        public int solution(String[][] board, int h, int w) {
            int answer = 0;
            int[] x = {-1,0,1,0};
            int[] y = {0,1,0,-1};

            for (int i = 0 ; i < 4 ; i++){
                int height = y[i]+h;
                int width = x[i]+w;

                if ((height>= 0 && height < board.length)
                        && (width >= 0 && width< board[h].length)){

                    if (board[height][width].equals(board[h][w])){
                        answer++;
                    }

                }

            }

            return answer;
        }
    }
}