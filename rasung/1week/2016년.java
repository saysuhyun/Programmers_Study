class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] dayOfWeek = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int[] lastDayOfMonth = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = 0;
        for (int index = 1; index < a; index++) {
            totalDays += lastDayOfMonth[index];
        }
        totalDays += b;

        answer = dayOfWeek[totalDays % 7];

        return answer;
    }
}
