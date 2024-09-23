import java.util.*;

public class Hasad  {
    public static void main(String[] args) {
        int x = 11;

        String toString = Integer.toString(x);
        String[] splited = toString.split("");


    
        int sum = 0;

        for(String split: splited) {
            sum = sum + Integer.parseInt(split);
        }

        boolean answer = x % sum == 0  ? true : false;
    }
} 