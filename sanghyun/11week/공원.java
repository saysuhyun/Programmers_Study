import java.util.*;

public class Park2 {
    public static void main(String[] args) {
        int[] mats = {5,3,2};
        String[][] park = {{"A", "A", "-1", "B", "B", "B", "B", "-1"}, {"A", "A", "-1", "B", "B", "B", "B", "-1"}, {"-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1"}, {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"}, {"D", "D", "-1", "-1", "-1", "-1", "-1", "F"}, {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"}};
    
        Arrays.sort(mats);  

        for (int i = 0; i < mats.length / 2; i++) {  
            int temp = mats[i];
            mats[i] = mats[mats.length - 1 - i];
            mats[mats.length - 1 - i] = temp;
        }
        int answer = -1;
        for (int i : mats) {  
            for (int j = 0; j <= park.length - i; j++) { 
                for (int h = 0; h <= park[0].length - i; h++) {
                    boolean isPossible = true;

                   
                    if (park[j][h].equals("-1") && j + i <= park.length && h + i <= park[0].length) {
                        for (int k = 0; k < i; k++) {  
                            for (int l = 0; l < i; l++) {
                                if (!park[j + k][h + l].equals("-1")) {  
                                    isPossible = false;
                                    break;
                                }
                            }
                            if (!isPossible) break; 
                        }
                        if (isPossible) { 
                            answer = i;
                        }
                    }
                }
            }
        }
    }
}