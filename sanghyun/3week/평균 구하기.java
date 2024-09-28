import java.util.*;
import java.util.stream.*;

public class Average {
    public static void main(String[] args ) {
        int[] arr = { 1, 2,3 , 4};

        double answer = 0;

        double temp = 
        Arrays.stream(arr).sum();

        answer = temp / arr.length;

        System.out.println(answer);
    }
}