package jaehyun.week6;

public class 공원_산책 {
    public int[] solution(String[] park, String[] routes) {
        //["SOO", "OOO", "OOO"], ["E 2", "S 2", "W 1"]
        int h = park.length;
        int w = park[0].length();


        int[] currentPosition = new int[2]; // 시작위치
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (park[i].charAt(j) == 'S') {
                    currentPosition[0] = i;
                    currentPosition[1] = j;
                    break;
                }
            }
        }

        // N, S, W, E
        int[] dy = {-1, 1, 0, 0};
        int[] dx = {0, 0, -1, 1};

        for (String route : routes) {
            String[] command = route.split(" ");
            String direction = command[0];
            int distance = Integer.parseInt(command[1]);

            int dirIndex = "NSWE".indexOf(direction); // 방향을 숫자로 변환

            int newY = currentPosition[0];
            int newX = currentPosition[1];
            boolean isValid = true;


            for (int step = 1; step <= distance; step++) {
                newY += dy[dirIndex];
                newX += dx[dirIndex];

                // 벗어나는지 확인
                if (newY < 0 || newY >= h || newX < 0 || newX >= w) {
                    isValid = false;
                    break;
                }

                // 장애물 확인
                if (park[newY].charAt(newX) == 'X') {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                currentPosition[0] = newY;
                currentPosition[1] = newX;
            }
        }

        return currentPosition;
    }
}
