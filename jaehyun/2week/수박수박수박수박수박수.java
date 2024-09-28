class Solution {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        //String 대신 StringBuilder를 사용하여 문자열을 변경할 때마다
        // 새로운 객체가 생성되지 않도록 하여 성능을 최적화
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                answer.append("수");
            }
            else answer.append("박");
        }
        return answer.toString();
    }
}