import java.util.*;

public class SeatCount {
    public static void main(String[] args) {
        int n = 123;
        int answer = 0;

        String s = Integer.toString(n);
        String[] list = s.split("");
   
        for(String str: list) {
            int temp = Integer.parseInt(str);
            answer = answer + temp;
        }

        System.out.println(answer);
    }
}