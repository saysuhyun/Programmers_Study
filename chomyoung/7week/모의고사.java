import java.util.ArrayList;
import java.util.List;

public class 모의고사 {
    // 완전 탐색
    public static void main(String[] args) {

    }

    private static class Solution {
        // answers: 정답
        // 1번 수포자: 차례대로
        // 2번 수포: 2번-N번(2를 제외한)
        // 3번 수포: 3, 1, 2, 4, 5
        // return 가장 많이 맞춘 사람 - 오름차순
        public int[] solution(int[] answers) {
            List<Integer> answer = new ArrayList<>();
            int cnt1 = 0;
            int cnt2 = 0;
            int cnt3 = 0;
            for(int i = 0; i<answers.length; i++){
                int eachAnswer = answers[i];
                if(getFirstValue(i) == eachAnswer){
                    cnt1++;
                }
                if(getSecondValue(i)==eachAnswer){
                    cnt2++;
                }
                if(getThirdValue(i)==eachAnswer){
                    cnt3++;
                }
            }
            if(cnt1 > cnt2){
                if(cnt1 > cnt3){
                    return new int[]{1};
                }else if(cnt1 == cnt3){
                    return new int[]{1,3};
                }else{
                    return new int[]{3};
                }
            }else if(cnt1 == cnt2){
                if(cnt1 > cnt3){
                    return new int[]{1, 2};
                }else if(cnt1 == cnt3){
                    return new int[]{1, 2, 3};
                }else{
                    return new int[]{3};
                }
            }else{
                if(cnt2 < cnt3){
                    return new int[]{3};
                }else if(cnt2 == cnt3){
                    return new int[]{2, 3};
                }else{
                    return new int[]{2};
                }
            }
        }

        public int getFirstValue(int index){
            return (index + 1) % 5 == 0 ? 5 : (index + 1) % 5;
        }

        public int getSecondValue(int index){
            int[] numArr = {1,3,4,5};
            return index % 2 == 0 ? 2 : numArr[index / 2 % 4];
        }

        public int getThirdValue(int index){
            int[] numArr = {3,1,2,4,5};
            return numArr[index / 2 % 5];
        }
    }
}