class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int[] winCnt = new int[2];

        for (int userNumber: lottos) {
            for (int winNumber: win_nums) {
                if (userNumber == winNumber) {
                    winCnt[0]++;
                    winCnt[1]++;
                    break;
                } else if (userNumber == 0) {
                    winCnt[0]++;
                    break;
                }
            }
        }

        for (int index = 0; index < winCnt.length; index++) {
            switch (winCnt[index]) {
                case 6: answer[index] = 1;
                    break;
                case 5: answer[index] = 2;
                    break;
                case 4: answer[index] = 3;
                    break;
                case 3: answer[index] = 4;
                    break;
                case 2: answer[index] = 5;
                    break;
                default: answer[index] = 6;
                    break;
            }
        }

        return answer;
    }
}
