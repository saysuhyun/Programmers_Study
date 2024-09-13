import java.time.DayOfWeek;
import java.time.LocalDate;

class Solution {
    // 대상: 2016년의 a월 b일은 무슨요일
    // SUN,MON,TUE,WED,THU,FRI,SAT
    // 추가 요건: 2016년은 윤년이므로 2월 29일
    // 사용해야할 클래스: LocalDate, DayOfWeek

    public String solution(int a, int b) {
        String[] dayArr = { "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN" };
        DayOfWeek week = LocalDate.of(2016, a, b).getDayOfWeek();
        int idx = week.getValue() - 1; // 월요일부터 일요일까지 1~7의 숫자로 표현

        return dayArr[idx];
    }

    // 개선점
    // 1. switch문
    // 2. LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0,3);

}