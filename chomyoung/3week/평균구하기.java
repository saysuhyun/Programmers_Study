class Solution {
    // 정수 arr의 avg
    // avg : sum / length ?
    // avg 데이터타입 double
    public double solution(int[] arr) {
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        return (double) sum / arr.length;
    }
}