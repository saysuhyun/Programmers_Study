// 2016년 문제 풀이
class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int m = 1;
        int d = 0;
        // 날짜 계산
        while (m < a) {
            if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
                d += 31;
            } else if (m == 2) {
                d += 29;
            } else {
                d += 30;
            }
            m++;
        }
        // 일수 계산
        d += b;
        // 요일 계산
        d = d % 7;
        switch (d) {
            case 1:
                answer = "FRI";
                break;
            case 2:
                answer = "SAT";
                break;
            case 3:
                answer = "SUN";
                break;
            case 4:
                answer = "MON";
                break;
            case 5:
                answer = "TUE";
                break;
            case 6:
                answer = "WED";
                break;
            case 0:
                answer = "THU";
                break;
        }
        return answer;
    }
}