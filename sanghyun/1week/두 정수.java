import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Combine {
    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("args must be 2");
            return;
        }
        
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        long n = Math.abs((long)a - (long)b) + 1;
        long answer = n * (a + b) / 2;
        System.out.println(answer);
    }
}
