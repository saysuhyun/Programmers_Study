class Solution {
    // 목표: n이 양의 정수의 제곱인지 아닌지 판단
    // return: 121 -> 144, 3 -> -1
    // 제곱인지 아닌지 판단: Math.sqrt(n) * Math.sqrt(n) == n
    public long solution(long n) {
        long x = (long) Math.sqrt(n);
        if(x * x == n){
            return (x+1) * (x+1);
        }else{
            return -1;
        }
    }
}