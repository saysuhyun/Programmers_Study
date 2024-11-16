class Solution {
    public int solution(String[][] board, int h, int w) {
        int count = 0;
        int n = board.length;

        int[] dh = { 0, 1, 0, -1 };
        int[] dw = { 1, 0, -1, 0 };

        String targetColor = board[h][w];

        for (int i = 0; i < 4; i++) {
            int h_check = h + dh[i];
            int w_check = w + dw[i];

            if (h_check >= 0 && h_check < n && w_check >= 0 && w_check < n) {
                if (board[h_check][w_check].equals(targetColor)) {
                    count++;
                }
            }
        }

        return count;
    }
}