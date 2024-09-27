class Solution {
    // num % 2 == 0 => num = num / 2
    // num % 2 == 1 => num = num * 3 + 1;
    // return count
    // 만약 처음부터 num이 1이면 return 0
    // count > 500 => return -1;
    // 주의사항: int 범위 벗어나는 경우가 있어서 int 대신 long 사용

    public int solution(long num) {
        if(num==1){
            return 0;
        }

        for(int i=1; i<=500; i++){
            if(num % 2 == 0){
                num = num / 2;
            }else{
                num = num * 3 + 1;
            }
            if(num == 1){
                return i;
            }
        }
        return -1;
    }

}