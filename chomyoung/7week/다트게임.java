import java.util.Arrays;

public class 다트게임 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("1D2S#10S"));
    }

    private static class Solution {
        // 다트 3차례 -> 합계
        // 0~10점
        // 영역에 따라, 제곱 => Math.pow()
        // 옵션: * => 해당 점수와 바로 전에 얻은 점수를 각 2배, # => -점수
        // 주의
        // 1. *는 첫번째도 될 수 있다. *는 중첩 가능. #도 중첩 되면 -
        // 2. 10
        // 영역마다 0~10갖고 있다.
        // 점수|보너스|[옵션]

        // 방법
        // 1. 3자리를 무조건 만들도록...?
        // 2. 그냥 차례대로 => 이건 좀 힘들듯...
        // 3. 두개씩 잘라서 + 그 뒤에를 판독

        // 데이터 보관
        // 배열에 담아두었다가
        public int solution(String dartResult) {
            int[] scoreArr = new int[3];
            int index = 0;
            StringBuilder stringBuilder = new StringBuilder(dartResult);
            while (index < 3){
                String s = stringBuilder.substring(0, 2);
                if("10".equals(s)){
                    if(stringBuilder.length() == 3){
                        stringBuilder.append(0);
                    }
                    char[] front = stringBuilder.substring(0,4).toCharArray();
                    scoreArr[index] = getPowValue(10, front[2]);
                    if('*' == front[3] || '#' == front[3]){
                        scoreArr[index] = '*' == front[3] ? getPlusValue(scoreArr[index]) : getMinusValue(scoreArr[index]);
                        if(index != 0){
                            scoreArr[index - 1] = '*' == front[3] ? getPlusValue(scoreArr[index - 1]) : scoreArr[index - 1];
                        }
                        stringBuilder.delete(0, 4);
                    } else{
                        stringBuilder.delete(0, 3);
                    }
                } else{
                    if(stringBuilder.length() == 2){
                        stringBuilder.append(0);
                    }
                    char[] front = stringBuilder.substring(0,3).toCharArray();
                    scoreArr[index] = getPowValue(front[0] - '0', front[1]);
                    if('*' == front[2] || '#' == front[2]){
                        scoreArr[index] = '*' == front[2] ? getPlusValue(scoreArr[index]) : getMinusValue(scoreArr[index]);
                        if(index != 0){
                            scoreArr[index - 1] = '*' == front[2] ? getPlusValue(scoreArr[index - 1]) : scoreArr[index - 1];
                        }
                        stringBuilder.delete(0, 3);
                    } else{
                        stringBuilder.delete(0, 2);
                    }
                }

                index++;
            }
            System.out.println(Arrays.toString(scoreArr));
            return Arrays.stream(scoreArr).sum();
        }

        public int getPowValue(int num, char alphabet){
            return switch (alphabet) {
                case 'S' -> (int) Math.pow(num, 1);
                case 'D' -> (int) Math.pow(num, 2);
                case 'T' -> (int) Math.pow(num, 3);
                default -> 0;
            };
        }

        public int getBonusValue(char num, char alphabet){
            return switch (alphabet) {
                case 'S' -> (int) Math.pow(num - '0', 1);
                case 'D' -> (int) Math.pow(num - '0', 2);
                case 'T' -> (int) Math.pow(num - '0', 3);
                default -> 0;
            };
        }

        public int getPlusValue(int value){
            return value * 2;
        }

        public int getMinusValue(int value){
            return value * -1;
        }
    }
}