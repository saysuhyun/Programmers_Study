import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        long n = 12345;
        String s = Long.toString(n); 
        char[] cList = s.toCharArray();
        int[] answer = new int[cList.length]; 

    
        for (int i = 0; i < cList.length; i++) {
            answer[i] = Character.getNumericValue(cList[cList.length - 1 - i]);
        }

        System.out.println(answer);

 
   
    }
}