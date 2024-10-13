class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int maxRowLength = park.length;
        int maxColLength = park[0].length();

        String[][] map = new String[maxRowLength][maxColLength];
        int currentRow = 0;
        int currentCol = 0;

        for (int row = 0; row < maxRowLength; row++) {
            for (int col = 0; col < maxColLength; col++) {
                map[row][col] = park[row].charAt(col) + "";

                if (park[row].charAt(col) == 'S') {
                    currentRow = row;
                    currentCol = col;
                    map[row][col] = "O";
                }
            }
        }

        for (int i = 0; i < routes.length; i++) {
            String[] route = routes[i].split(" ");
            String direction = route[0];
            int movingCnt = Integer.parseInt(route[1]);
            boolean canMove = true;
            // 공원을 넘어가는지 체크
            // 장애물이 있는지 체크

            if (direction.equals("E")) {
                if (currentCol + movingCnt < maxColLength) {
                    for (int col = 1; col <= movingCnt; col++) {
                        if (map[currentRow][currentCol + col].equals("X")) {
                            canMove = false;
                            break;
                        }
                    }

                    if (canMove) currentCol += movingCnt;
                }
            } else if (direction.equals("S")) {
                if (currentRow + movingCnt < maxRowLength) {
                    for (int row = 1; row <= movingCnt; row++) {
                        if (map[currentRow + row][currentCol].equals("X")) {
                            canMove = false;
                            break;
                        }
                    }

                    if (canMove) currentRow += movingCnt;
                }
            } else if (direction.equals("W")) {
                if (currentCol - movingCnt >= 0) {
                    for (int col = 1; col <= movingCnt; col++) {
                        if (map[currentRow][currentCol - col].equals("X")) {
                            canMove = false;
                            break;
                        }
                    }

                    if (canMove) currentCol -= movingCnt;
                }
            } else if (direction.equals("N")) {
                if (currentRow - movingCnt >= 0) {
                    for (int row = 1; row <= movingCnt; row++) {
                        if (map[currentRow - row][currentCol].equals("X")) {
                            canMove = false;
                            break;
                        }
                    }

                    if (canMove) currentRow -= movingCnt;
                }
            }
        }

        answer[0] = currentRow;
        answer[1] = currentCol;

        return answer;
    }
}
