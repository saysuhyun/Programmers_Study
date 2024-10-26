import java.util.*;
import java.util.stream.*;


public class Crane {
    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0}, {0,0,1,0,3} , {0,2,5,0,1} , {4,2,4,4,2} , {3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};

        // int[] idx = {0,0};

        Deque<Integer> deque = new ArrayDeque<>();
        int xY = board.length;
        int result = 0;
        for(int i = 0; i < moves.length; i++) {
            int noxIdx = moves[i] -1;

            int tempDepth = 0;
            while(tempDepth < xY) {
                int isDoll = board[tempDepth][noxIdx];
                if(isDoll > 0) {
                    board[tempDepth][noxIdx] = 0;
                    Integer last = deque.peekLast();
                
                    if(last == null) {
                        deque.offerLast(isDoll);
                    }
                    else if(last.equals(isDoll)) {
                        deque.pollLast();
                        result = result + 2;
                    } else {
                        deque.offerLast(isDoll);
                    }
                    break;
                }
                tempDepth++;
            }
        }
        System.out.println(result);
    }
}