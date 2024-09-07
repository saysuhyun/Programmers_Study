import java.time.DayOfWeek;
import java.time.LocalDate;

public class Date {
    public static void main(String[] args) {
        int a = 2;
        int b = 29;

    
        String[] days = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

       
        // 1 -> 일요일
        DayOfWeek week = LocalDate.of(2016, a, b).getDayOfWeek();
        int idx = week.getValue(); 

        // 0 ~ 6 idx 찾으면되는데  idx-1 로 하면 프로그래머스에서는 오답으로 나타남
        String answer = days[(idx % 7)]; 

        System.out.println(answer); 
    }
}
