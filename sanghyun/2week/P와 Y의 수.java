import java.util.*;
import java.util.stream.*;

public class SameChar {
    public static void main(String[] args) {
        String temp = "pPoooyY";
        char[] charArray = temp.toCharArray();
        int p = 0;
        int y = 0;
        for(int i = 0; i < charArray.length; i++) {
            char tempChar = Character.toLowerCase( charArray[i]);
            if(tempChar == 'p' ) {
                p++;
            }
            if(tempChar == 'y') {
                y++;
            }
        }

        System.out.println(p == y);
    }
}
