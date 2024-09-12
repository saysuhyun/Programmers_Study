class Solution {

    // 길이: 홀수, 짝수
    // 홀수면 길이 / 2 만큼 "수박"을 붙이고 "수"를 붙인다.
    // 짝수면 길이 / 2 만큼 "수박"을 붙인다.

    public String solution(int n) {
        int repeatCnt = n / 2;
        return n % 2 == 1 ? "수박".repeat(repeatCnt)+"수" : "수박".repeat(repeatCnt);
    }
}