public class 푸드_파이트_대회 {

    public static void main(String[] args) {

    }

    private static class Solution {
        // 1:1, 준비된 음식들 일렬, 서로 다른 방향으로
        // a,b,c,d 물 d,c,b,a => 칼로리 오름차순
        // 칼로리 오름차순 갯수 배열 : food

        // 홀수로 시켰다면 1개는 무조건 버린다. /2
        // 인덱스 0은 물

        public String solution(int[] food) {
            StringBuilder stringBuilder = new StringBuilder();
            for(int i=1; i<food.length; i++){
                int addCnt = food[i] / 2;
                String repeatNum = String.valueOf(i).repeat(addCnt);
                stringBuilder.append(repeatNum);
            }
            String left = stringBuilder.toString();
            String right = stringBuilder.reverse().toString();
            return left + "0"+right;
        }
    }
}