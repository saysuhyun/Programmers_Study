import java.util.*;
import java.util.stream.Collectors;

public class Lotto {
    public static void main(String[] args) {
        int[] lottos = {1,11,14,5,6,10};
        int[] win_nums = {20, 9, 3, 45, 4, 35};

        int unknownNum = 0;
        int wins = 0;
        for(int i = 0;  i < lottos.length; i++) {
            int idx = Arrays.stream(win_nums).boxed().collect(Collectors.toList()).indexOf(lottos[i]);
             System.out.println(idx);
            if(idx > -1) {
                win_nums[idx] = -1;
                wins++;
            }
            if(lottos[i] == 0) {
                unknownNum++;
            }
        }

        int best = wins + Math.max(unknownNum, 0);
        int worst = wins + Math.min(unknownNum, 0);

    

        int[] answer = new int[2];

        answer[0] = (best == 0) ? 6:  (7 - best);
        answer[1] = (worst == 0 ? 6 : (7 - worst));

        
    }
}