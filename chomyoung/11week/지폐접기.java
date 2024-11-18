public class 지폐접기 {
    public static void main(String[] args) {

    }
    // if(result[0] <= 가로 && result[1] <= 세로 || result[0] <= 세로 && result[1] <= 가로

    private static class Solution {
        public int solution(int[] wallet, int[] bill) {
            int answer = 0;
            while (true) {
                if ((wallet[0] >= bill[0] && wallet[1] >= bill[1]) || (wallet[0] >= bill[1] && wallet[1] >= bill[0])) {
                    return answer;
                } else{
                    if(bill[0] >= bill[1]){
                        bill[0] = bill[0] / 2;
                    } else{
                        bill[1] = bill[1] / 2;
                    }
                    answer++;
                }
            }
        }
    }
}