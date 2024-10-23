import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        List<Integer> lostList = new ArrayList<>();
        List<Integer> reserveList = new ArrayList<>();
        
        for (int l : lost) {
            boolean duplicate = false;
            for (int i = 0; i < reserve.length; i++) {
                if (l == reserve[i]) {
                    reserve[i] = -1;  
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) lostList.add(l);  
        }
        
        for (int r : reserve) {
            if (r != -1) reserveList.add(r); 
        }

   
        int answer = n - lostList.size();
        for (int l : lostList) {
            for (int i = 0; i < reserveList.size(); i++) {
                int temp = Math.abs(l - reserveList.get(i));
                
                if (temp == 1) {  
                    reserveList.remove(i);
                    answer++;
                    break;
                }
            }
        }
        
        return answer;

    }
}