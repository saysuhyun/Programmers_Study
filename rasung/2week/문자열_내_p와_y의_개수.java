class Solution {
    boolean solution(String s) {
        boolean answer = false;
        String[] lowerCase = s.toLowerCase().split("");
        int pCnt = 0;
        int yCnt = 0;

        for (String alphabet : lowerCase) {
            if (alphabet.equals("p")) pCnt++;
            else if (alphabet.equals("y")) yCnt++;
        }

        if (pCnt == yCnt) answer = true;

        return answer;
    }
}
