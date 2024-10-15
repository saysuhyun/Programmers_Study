import java.util.HashMap;
import java.util.Stack;

public class 다트_게임 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution("10T#1T*2D*");
        System.out.println(result);
    }

    static class Solution {

        // 1. 게임 기회 3번
        // 2. 0 ~ 10 점 획득
        // S : 1제곱, D : 2제곱, T: 3제곱 점수마다 하나씩 존재
        // 스타상 : 해당점수, 바로전 점수 * 2 그리고 1번째 시 해당점수만 *2 , 중첩가능 그럴겨웅 * 4 , 존재 할수도 안할수도 있어.
        // 아차상:  해당점수 *- , 존재 할수도 안할수도 있어.
        public int solution(String dartResult) {
            HashMap<Character, Integer> scoreStand = new HashMap<>();
            scoreStand.put('S',1);
            scoreStand.put('D',2);
            scoreStand.put('T',3);
            scoreStand.put('*',2);
            scoreStand.put('#',-1);

            Stack<Double> scoreStack = new Stack();

            for (int i = 0; i < dartResult.length(); i++) {
                int score = 0;
                if (isNumber(dartResult.charAt(i))
                        && isNumber(dartResult.charAt(i+1))){
                    score = 10;
                    i += 2;
                }else {
                    score = dartResult.charAt(i)-'0';
                    i++;
                }

                char scorePowStr = dartResult.charAt(i);
                Integer scorePowInt = scoreStand.get(scorePowStr);
                double pow = Math.pow(score, scorePowInt);
                scoreStack.push(pow);

                if (i + 1 < dartResult.length()
                        && !isNumber(dartResult.charAt(i + 1))) {
                    char award = dartResult.charAt(i + 1);
                    if (award == '*'){
                        Integer awardScore = scoreStand.get(award);
                        if (scoreStack.size() < 2){
                            Double popDouble = scoreStack.pop() * awardScore;
                            scoreStack.push(popDouble);
                        }else {
                            Double pop1Double = scoreStack.pop() * awardScore;
                            Double pop2Double = scoreStack.pop() * awardScore;
                            scoreStack.push(pop2Double);
                            scoreStack.push(pop1Double);

                        }
                    }else {
                        Integer awardScore = scoreStand.get(award);
                        Double popDouble = scoreStack.pop() * awardScore;
                        scoreStack.push(popDouble);
                    }
                    i++;
                }

            }
            int sum = scoreStack.stream().mapToInt(Double::intValue).sum();
            return sum;
        }
        public boolean isNumber(char c){
            if (c >= '0' && c  <= '9'){
                return true;
            }
            return false;
        }
    }
}