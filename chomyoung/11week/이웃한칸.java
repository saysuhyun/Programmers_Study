public class 이웃한칸 {

    private static class Solution {
        // 1. board[h][w]의 색깔 구하기
        // 2. board[h][w] 이웃한 칸들의 색깔 구하고, ++
        // 이때 -1 혹은 +1을 했을 때 indexOutofEx 발생하지않도록...!
        public int solution(String[][] board, int h, int w) {
            int answer = 0;
            String targetColor = board[h][w];
            if(h > 0 && checkEqualColor(targetColor, board[h-1][w])){
                answer += 1;
            }
            if(w > 0 && checkEqualColor(targetColor, board[h][w-1])){
                answer += 1;
            }
            if((h < board[0].length - 1) && checkEqualColor(targetColor, board[h+1][w])){
                answer += 1;
            }
            if((w < board.length - 1) && checkEqualColor(targetColor, board[h][w+1])){
                answer += 1;
            }
            return answer;
        }

        private boolean checkEqualColor(String targetColor, String comparedColor){
            return targetColor.equals(comparedColor);
        }
    }
}