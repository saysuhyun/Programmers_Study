public class Naver {
    public static void main(String[] args) {
        String[][] board = {{"blue", "red", "orange", "red"}, {"red", "red", "blue", "orange"}, {"blue", "orange", "red", "red"}, {"orange", "orange", "red", "blue"}};
        int h = 1; 
        int w = 1;

        String now = board[h][w];

        int height = board.length;
        int width = board[0].length;

        int answer = 0;
        //u
        if(h-1 > -1 ) {
            if(board[h-1][w].equals(now)) {
                answer++;
            }
        }

        //d
        if(h+1 < height) {
            if(board[h+1][w].equals(now)) {
                answer++;
            }
        }

        //l
        if(w-1 > -1) {
             if(board[h][w-1].equals(now)) {
                answer++;
            }
        }

        //r
        if(w+1 < width) {
             if(board[h][w+1].equals(now)) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}