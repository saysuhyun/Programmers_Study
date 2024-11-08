import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 개인정보수집유효기간 {

    public static void main(String[] args) {

    }

    private static class Solution {
        // 1~n개, 각 약관마다 유효기간
        // 구해야할 것: 오늘 날짜로 파기해야할 개인정보 번호들 구하기
        // terms: "대상_개월수"
        // privacies: "등록한날짜_대상"

        // 방법
        // 0. terms를 hashmap으로 담기
        // 1. today -> LocalDate
        // 2. privacies for문을 돌면서
            // 날짜 -> LocalDate
            // 대상 -> hashMap의 key값을 가지고
            // 개월 수 비교
        // 3. return
        public int[] solution(String today, String[] terms, String[] privacies) {

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
            LocalDate todayDate = LocalDate.parse(today, formatter);
            Map<String, Integer> hashMap = new HashMap<>();
            List<Integer> numList = new ArrayList<>();

            for(String term : terms){
                String[] termStr = term.split(" ");
                hashMap.put(termStr[0], Integer.valueOf(termStr[1]));
            }

            for (int i=0; i<privacies.length; i++){
                String[] privacyStr = privacies[i].split(" ");
                int termMonth = hashMap.get(privacyStr[1]);
                LocalDate registeredDate = LocalDate.parse(privacyStr[0], formatter);
                if(!todayDate.isBefore(registeredDate.plusMonths(termMonth))){
                    numList.add(i+1);
                }
            }

            return numList.stream().mapToInt(i -> i).toArray();
        }
    }
}