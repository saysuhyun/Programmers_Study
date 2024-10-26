import java.util.*;

public class 크레인_인형뽑기_게임 {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> basket = new Stack<>();
        int removedDollsCount = 0;

        for (int move : moves) {
            int column = move - 1;

            for (int row = 0; row < board.length; row++) {
                if (board[row][column] != 0) {
                    int doll = board[row][column];
                    board[row][column] = 0;

                    if (!basket.isEmpty() && basket.peek() == doll) {
                        basket.pop();
                        removedDollsCount += 2;
                    } else {
                        basket.push(doll);
                    }
                    break;
                }
            }
        }

        return removedDollsCount;
    }
}