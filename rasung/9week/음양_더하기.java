class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int index = 0; index < absolutes.length; index++) {
            if (signs[index]) answer += absolutes[index];
            else answer -= absolutes[index];
        }

        return answer;
    }
}
