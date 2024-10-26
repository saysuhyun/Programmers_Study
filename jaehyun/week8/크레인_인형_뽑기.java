import java.util.Stack;

public class 크레인_인형_뽑기 {
    public static void main(String[] args) {

    }

    static class Solution {
        public int solution(int[][] board, int[] moves) {
            int n = board.length;
            Stack<Integer> basket = new Stack<>(); // 바구니
            int removedCount = 0; // 제거된 인형의 개수


            for (int move : moves) {
                int col = move - 1;


                for (int row = 0; row < n; row++) {
                    if (board[row][col] != 0) {
                        int pickedDoll = board[row][col];
                        board[row][col] = 0;

                        if (!basket.isEmpty() && basket.peek() == pickedDoll) {
                            basket.pop();
                            removedCount += 2;
                        } else {
                            basket.push(pickedDoll);
                        }
                        break;
                    }
                }
            }

            return removedCount;
        }
    }
}
