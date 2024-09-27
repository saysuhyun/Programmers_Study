import java.util.*;

public class NumCouple {
    public static void main(String[] args) {
        String X = "100";
        String Y = "123450";


        String answer = "";

        int[] countX = new int[10];
        int[] countY = new int[10];

        for (char c : X.toCharArray()) {
            countX[c - '0']++;
        }

        for (char c : Y.toCharArray()) {
            countY[c - '0']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            int commonCount = Math.min(countX[i], countY[i]); 
            for (int j = 0; j < commonCount; j++) {
                sb.append(i); 
            }
        }
        if (sb.length() == 0) {
            answer = "-1";
        } 
      
        else if (sb.charAt(0) == '0') {
            answer = "0";
        } 
    
        else {
           answer = sb.toString();
        }
    }
}