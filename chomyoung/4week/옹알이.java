import java.util.Arrays;

public class 옹알이 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new String[]{"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa", "ayayewooyema"}));
    }

    private static class Solution {
        // 케이스
        // 1. 단일
        // for문 돌면서
        // babbling.contains
        // 2. 조합
        // startsWith + 자르면서...? 계속해서 contains이거나 값이 ""
        // 아니면 basedWordArr값들을 가지고 전부 하나씩 replace했을 때 ""가 되는 값들만
        // 주의: 연속해서 같은 발음은 불가
        // return 갯수
        public int solution(String[] babbling) {
            int answer = 0;
//            String[] basedWordArr = new String[]{"aya", "ye", "woo", "ma"};
            for(String word : babbling){
                if(word.contains("ayaaya") || word.contains("yeye") || word.contains("woowoo") || word.contains("mama")){
                    continue;
                }
//                while(word.length()>0) {
//                    if (word.startsWith("aya")) {
//                        word = word.replaceFirst("aya", "");
//                    }
//                    else if (word.startsWith("ye")) {
//                        word = word.replaceFirst("ye", "");
//                    }
//                    else if (word.startsWith("woo")) {
//                        word = word.replaceFirst("woo", "");
//                    }
//                    else if (word.startsWith("ma")) {
//                        word = word.replaceFirst("ma", "");
//                    } else {
//                        break;
//                    }
//                    if("".equals(word)){
//                        answer++;
//                    }
//                }

                word = word.replaceAll("aya", "");
                word = word.replaceAll("ye", "");
                word=word.replaceAll("woo", "");
                word=word.replaceAll("ma", "");
                if("".equals(word)){
                    answer++;
                }
            }
            return answer;
        }
    }
}