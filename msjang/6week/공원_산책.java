public class 공원_산책 {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] result = solution.solution(new String[]{"SOO","OOO","OOO"}, new String[]{"E 2","S 2","W 1"});
        int[] result = solution.solution(new String[]{"SXO", "XOO", "OOO"}, new String[]{"E 2", "S 2", "W 1"});
//        int[] result = solution.solution(new String[]{"OSO", "OOO", "OXO", "OOO"}, new String[]{"E 2", "S 3", "W 1"});
        for (int i : result) {
            System.out.println(i);
        }
    }

    static class Solution {
        public int[] solution(String[] park, String[] routes) {
            int[] answer = {};
            int[] startPoint = startPoint(park);
            String[] splitOne = routes[0].split(" ");
            int[] curPoint = movePoint(park, startPoint, splitOne[0], Integer.parseInt(splitOne[1]));
            for (int i = 1; i < routes.length; i++) {
                String[] split = routes[i].split(" ");
                curPoint = movePoint(park, curPoint, split[0], Integer.parseInt(split[1]));


            }
            return curPoint;
        }

        public int[] startPoint(String[] park) {
            for (int i = 0; i < park.length; i++) {
                int start = park[i].indexOf('S');
                if (start != -1) {
                    return new int[]{i, start};
                }
            }
            return null;
        }

        public int[] movePoint(String[] park, int[] curPoint, String direct, int cnt) {
            int[] movePoint = new int[2];
            switch (direct) {
                case "W":
                    movePoint[1] = curPoint[1] - cnt;
                    movePoint[0] = curPoint[0];
                    break;
                case "N":
                    movePoint[1] = curPoint[1];
                    movePoint[0] = curPoint[0] - cnt;
                    break;
                case "E":
                    movePoint[1] = curPoint[1] + cnt;
                    movePoint[0] = curPoint[0];
                    break;
                case "S":
                    movePoint[1] = curPoint[1];
                    movePoint[0] = curPoint[0] + cnt;
                    break;
            }
            int parkY = park.length;
            int parkX = park[0].length();

            if (!((movePoint[0] < parkY && movePoint[0] >= 0) &&
                    (movePoint[1] < parkX && movePoint[1] >= 0)))
                return curPoint;
            //위아래 이동
            int big = movePoint[0];
            int small = curPoint[0];
            if (curPoint[0] > movePoint[0]){
                big = curPoint[0];
                small = movePoint[0];
            }

            for (int i = small; i <= big ; i++){
                if (park[i].charAt(movePoint[1])=='X')
                    return curPoint;
            }
            if (curPoint[1] > movePoint[1]){
                big = curPoint[1];
                small = movePoint[1];
            }else {
                small = curPoint[1];
                big = movePoint[1];
            }

            //왼, 오른쪽 이동
            for (int i = small ; i <= big ; i++){
                if (park[movePoint[0]].charAt(i)=='X')
                    return curPoint;
            }

            return movePoint;
        }
    }
}