public class 삼총사 {

    public static void main(String[] args) {

    }

    private static class Solution {
        // 각자 정수 번호
        // sum == 0 => 삼총사
        // return 삼총사를 만들 수 있는 방법
        // 3명을 더한다 => x, y, z for문
        public int solution(int[] number) {
            int answer = 0;
            int length = number.length;

            for(int x=0;x<length-2;x++){
                for(int y=x+1; y<length-1; y++){
                    for(int z=y+1; z<length; z++){
                        if(number[x]+number[y]+number[z]==0){
                            answer++;
                        }
                    }
                }
            }

            return answer;
        }
    }
}