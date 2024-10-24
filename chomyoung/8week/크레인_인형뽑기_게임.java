import java.util.ArrayList;
import java.util.List;

public class 크레인_인형뽑기_게임 {

    public static void main(String[] args) {

    }

    private static class Solution {

        public int solution(int[][] board, int[] moves) {
            int result = 0;
            List<Integer> basket = new ArrayList<>();  // 뽑은 인형을 담을 배열
            List<List<Integer>> newBoard = convertBoard(board);  // 보드를 열 중심으로 변환

            // moves 배열을 순회하며 인형을 뽑음
            for (int move : moves) {
                int pickedDoll = pickDoll(newBoard, move - 1);
                if (pickedDoll != 0) {
                    basket.add(pickedDoll);
                    result += removeConsecutiveDolls(basket);
                }
            }
            return result;
        }

        // 보드를 열 중심으로 변환하는 메서드
        private List<List<Integer>> convertBoard(int[][] board) {
            List<List<Integer>> newBoard = new ArrayList<>();

            for (int i = 0; i < board[0].length; i++) {
                newBoard.add(new ArrayList<>());
            }

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    if (board[i][j] != 0) {
                        newBoard.get(j).add(board[i][j]);
                    }
                }
            }

            return newBoard;
        }

        // 인형을 뽑는 메서드
        private int pickDoll(List<List<Integer>> newBoard, int column) {
            if (newBoard.get(column).isEmpty()) {
                return 0; // 해당 열이 비어있으면 0 반환
            }

            // 해당 열에서 맨 위의 인형을 뽑고 삭제
            return newBoard.get(column).remove(0);
        }

        // 연속된 인형을 제거하는 메서드
        private int removeConsecutiveDolls(List<Integer> basket) {
            int removedCount = 0;
            int size = basket.size();

            if (size >= 2 && basket.get(size - 1).equals(basket.get(size - 2))) {
                basket.remove(size - 1);  // 마지막 두 개 인형 제거
                basket.remove(size - 2);
                removedCount = 2;
            }

            return removedCount;
        }
    }

}