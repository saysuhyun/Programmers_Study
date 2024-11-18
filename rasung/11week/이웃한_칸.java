class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        String color = board[h][w];

        for (int i = 0; i < 4; i++) {
            int x = w + dx[i];
            int y = h + dy[i];
            if (0 <= x && x < board[0].length && y >= 0 && y < board.length) {
                if (board[y][x].equals(color)) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
