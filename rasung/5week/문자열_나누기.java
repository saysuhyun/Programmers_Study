class Solution {
    public int solution(String s) {
        int answer = 0;
        int sameCnt = 1;
        int anotherCnt = 0;
        char startCh = s.charAt(0);
        boolean changeCh = false;
        int sum = 0;

        for (int index = 1; index < s.length(); index++) {
            char ch = s.charAt(index);
            if (changeCh) {
                startCh = ch;
                changeCh = false;
                continue;
            }

            if (ch == startCh) {
                sameCnt++;
            } else {
                anotherCnt++;
            }

            if (sameCnt == anotherCnt) {
                changeCh = true;
                sum += (sameCnt * 2);
                sameCnt = 1;
                anotherCnt = 0;
                answer++;
            }
        }

        if (sum != s.length()) answer++;

        return answer;
    }
}
