

public class 로또의_최고_순위와_최저_순위 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19});
    }

    static class Solution {

        //로또 번호 6개 맞으면 1, 5개 맞으면 2
        //0 개수 세기, 맞은 개수 세기
        public int[] solution(int[] lottos, int[] win_nums) {
            int[] answerList = new int[2];
            int winCnt = 0;
            int zeroCnt = 0;
            for (int lotto : lottos) {
                if (checkWinNum(lotto,win_nums)){
                    winCnt++;
                }
                if (lotto == 0){
                    zeroCnt++;
                }
            }
            answerList[0] = winningNum(winCnt+zeroCnt);
            answerList[1] = winningNum(winCnt);

            return answerList;
        }

        public int winningNum (int num){
            if (num <=1)
                return 6;
            int winNumber = (6 - num) + 1;
            return winNumber;
        }

        public boolean checkWinNum(int num, int[] win_nums) {
            for (int winNum : win_nums) {
                if (num == winNum)
                    return true;
            }
            return false;
        }
    }
}