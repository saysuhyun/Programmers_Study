public class 공원_산책 {
    public int[] solution(String[] park, String[] routes) {
        int h = park.length, w = park[0].length();
        int[] position = new int[2];

        // 시작 위치 찾기
        for (int i = 0; i < h; i++) {
            if (park[i].contains("S")) {
                position[0] = i;
                position[1] = park[i].indexOf("S");
                break;
            }
        }

        // 각 방향에 따른 이동 변화를 미리 정의
        int[][] moves = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        String[] directions = {"N", "S", "W", "E"};

        // 명령을 처리
        for (String route : routes) {
            String[] parts = route.split(" ");
            String dir = parts[0];
            int dist = Integer.parseInt(parts[1]);

            int[] move = moves[java.util.Arrays.asList(directions).indexOf(dir)];
            int newRow = position[0], newCol = position[1];
            boolean isValid = true;

            // 이동이 가능한지 체크
            for (int i = 1; i <= dist; i++) {
                newRow += move[0];
                newCol += move[1];
                if (newRow < 0 || newRow >= h || newCol < 0 || newCol >= w || park[newRow].charAt(newCol) == 'X') {
                    isValid = false;
                    break;
                }
            }

            // 이동 가능한 경우 위치 업데이트
            if (isValid) {
                position[0] = newRow;
                position[1] = newCol;
            }
        }

        return position;
    }
}
