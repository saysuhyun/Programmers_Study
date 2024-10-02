public class 문자열나누기 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("banana"));
    }

    private static class Solution {
        // 문자열을 여러 문자열로 분해
        // x는 첫번째 문자열
        // x cnt , x 가 아닌 cnt 세기
        // 두개가 같으면 지금까지 읽은 문자열 분리
        // 끝나면 분리

        // 처음부터 char로 분리하고 같아졌을 때 answer++만
        // 주의: 마지막에 갯수들이 같아지는 경우와 아닌 경우 처리
        // 주의: 분리할때마다 x는 초기화
        public int solution(String s) {
            int answer = 0;
            char x = s.charAt(0);
            int xCnt = 0;
            int notXCnt = 0;
            for(char c : s.toCharArray()){
                if(xCnt == 0 && notXCnt == 0){
                    x = c;
                }
                if(c==x){
                    xCnt++;
                }else{
                    notXCnt++;
                }
                if(xCnt == notXCnt){
                    answer++;
                    xCnt = 0;
                    notXCnt = 0;
                }
            }
            // 마지막 처리
            if(xCnt != notXCnt){
                answer++;
            }

            return answer;
        }
    }
}