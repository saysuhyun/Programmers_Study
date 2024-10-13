import java.util.*;
import java.util.stream.*;


// 대충만든 자판
public class Type {
    public static void main(String[] args) {
        String[] keymap = {"ABACD" , "BCEFD"};
        String[] targets = {"ABCD" , "DG", "AABB"};
        // ["BC"], ["AC", "BC"]
        int[] answer = new int[targets.length];
       
        for(int i = 0; i < targets.length; i++) {
            int total = 0;
            char[] targetList = targets[i].toCharArray();
            for(char c : targetList) {
                int idx = -1;
                for(String key : keymap) {
                    int tempIdx = key.indexOf(c);
                    if(tempIdx == 0) {
                        idx = 0;
                        break;
                    }
                    if(tempIdx > -1) {
                        if(idx == -1) {
                            idx = tempIdx;
                        } else {
                            idx = Math.min(tempIdx, idx);
                        }
                    }
                }
                if(idx == -1) {
                    System.out.println("no data");
                    total = -1;
                    break;
                } else {
                    total = total + idx + 1;
                }
            }
            answer[i] = total;
        }
    }
}