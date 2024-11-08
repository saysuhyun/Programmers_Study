import java.util.*;
import java.util.stream.*;

public class NoNum {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,6,7,8,0};

        int[] temp = {1,2,3,4,5,6,7,8,9,0};

        for(int i = 0; i < numbers.length; i++){
            int idx = Arrays.stream(temp).boxed().collect(Collectors.toList()).indexOf(numbers[i]);
            if(idx > -1) {
                temp[idx] = 0;
            }
        }

        int answer = 0;
        for(int ii: temp) {
        
            answer += ii;
        }

    } 
}