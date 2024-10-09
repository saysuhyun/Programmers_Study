public class Park {     
    public static void main(String[] args) {
        String[] park = {"SOO", "OXX", "OOO"};
        String[] routes = { "E 2", "S 2", "W 1" };

        // 2D 배열로 변환
        char[][] arr = new char[park.length][park[0].length()];
        for (int i = 0; i < park.length; i++) {
            arr[i] = park[i].toCharArray();
        }

        int[] position = findStart(arr);
        int x = position[0];
        int y = position[1];


        for (String route : routes) {
            String direction = route.split(" ")[0];
            int distance = Integer.parseInt(route.split(" ")[1]);

            if (canMove(arr, direction, distance, x, y)) {
                switch (direction) {
                    case "E": x += distance; break;
                    case "W": x -= distance; break;
                    case "S": y += distance; break;
                    case "N": y -= distance; break;
                }
            }
        }

        int[] answer = { y , x };
    }

    private static int[] findStart(char[][] park) {
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[0].length; j++) {
                if (park[i][j] == 'S') {
                   return new int[]{j, i};  // (x, y) 순서
                }
            }
        }
        return new int[]{0, 0};
    }


    private static boolean canMove(char[][] park, String direction, int distance, int x, int y) {
        int moveX = 0; 
        int moveY = 0;
        switch (direction) {
            case "E": moveX = 1; break;
            case "W": moveX = -1; break;
            case "S": moveY = 1; break;
            case "N": moveY = -1; break;
        }

        for (int i = 1; i <= distance; i++) {
            int newX = x + moveX * i;
            int newY = y + moveY * i;
            if (newX < 0 || newY < 0 || newX >= park[0].length || newY >= park.length || park[newY][newX] == 'X') {
                return false;
            }
        }
        return true;
    }
}