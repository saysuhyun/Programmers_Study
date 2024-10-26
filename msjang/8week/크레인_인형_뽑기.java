import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 크레인_인형_뽑기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(new int[][]{{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}}, new int[]{1,5,3,5,1,2,1,4});

    }

    static class Solution {
        //  1X1 칸으로 이루어진 NxN 정사각형
        // 가장 위에 있는 인형을 집는다.
        // 집어올린 인형은 바구니에 쌓는다.
        // 인형이 없는곳에서 작업시 아무일도 일어나지 않는다.
        // 바구니 똑같은 인형 만나면 없어진다. stack 이용해야 된다.
        // 바구니는 모든 이형 들어갈수 있을 만큼 충분히 크다
        public int solution(int[][] board, int[] moves) {
            List<Stack<Integer>> boardStackList = new ArrayList<>();
            Stack<Integer> bucketStack = new Stack<>();
            int answer = 0;
            for (int[] item :board){
                boardStackList.add(new Stack<>());
            }

            for (int i = board.length -1 ; i >= 0 ; i--){
                for (int k = board[i].length-1 ; k >= 0 ; k--){

                    if (board[i][k] ==0)
                        continue;

                    boardStackList.get(k).push(board[i][k]);
                }
            }

            for (int move : moves){
                int idx = move-1;
                Stack<Integer> stack = boardStackList.get(idx);
                if(!stack.isEmpty()){
                    Integer pop = stack.pop();
                    if (!bucketStack.isEmpty()
                            && bucketStack.peek() == pop){
                        answer++;
                        bucketStack.pop();
                        continue;
                    }
                    bucketStack.push(pop);
                }
            }
            return answer*2;
        }
    }
}