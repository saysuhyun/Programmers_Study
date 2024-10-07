public class 크기가_작은_부분_문자열 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("500220839878", "7"));
    }

    private static class Solution {
        // p의 길이만큼 뽑은 숫자들 < p
        // substring 혹은 charAt - '0'
        public int solution(String t, String p) {
            int answer = 0;
            int pLength = p.length();
            long pInt = Long.parseLong(p); // NumberFormatException 주의
            for(int i=0; i<t.length()-pLength+1; i++){
                long num = getNum(t, i, pLength);
                if(num <= pInt){
                    answer++;
                }
            }
            return answer;
        }

        public long getNum(String t, int i, int pLength) {
            long num = 0;
            //            for(int j=0;j<pLength; j++){
            //                num += (t.charAt(i+j) - '0') * Math.pow(10, pLength-1-j);
            //            }
            num = Long.parseLong(t.substring(i, i+pLength));
            return num;
        }
    }
}