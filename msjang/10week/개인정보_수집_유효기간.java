import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 개인정보_수집_유효기간 {

    public static void main(String[] args) {

        Solution solution = new Solution();
        solution.solution("2022.05.19", new String[]{"A 6", "B 12", "C 3"}, new String[]{"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"});
    }

    static class Solution {
        // 약관의 종류가 있고 종류마다 유효기간이 있다.
        // 우선 localdate로 변환 하자.
        // 약관을 map에 넣어 놓자. localDate 로
        //
        public int[] solution(String today, String[] terms, String[] privacies) {
            Map<String, Long> termMap  = new HashMap<>();
            List<Integer> answer = new ArrayList<>();

            LocalDate todayDate = LocalDate.parse(today, DateTimeFormatter.ofPattern("yyyy.MM.dd"));
            for (String term : terms){
                String[] split = term.split(" ");
                termMap.put(split[0], Long.valueOf(split[1]));
            }

            for (int i = 0 ; i< privacies.length ; i++){
                String[] split = privacies[i].split(" ");
                String privacyDateStr =split[0];
                String privacyType =split[1];
                Long plusMonth = termMap.get(privacyType);

                LocalDate privacyEndDate = LocalDate
                        .parse(privacyDateStr, DateTimeFormatter.ofPattern("yyyy.MM.dd"))
                        .plusMonths(plusMonth);

                // 유효기간보다 privacyEndDate.isBefore(todayDate) 당일은 포함 하지 않는다.
                if (!privacyEndDate.isAfter(todayDate))
                    answer.add(i+1);

            }
            return answer.stream().sorted().mapToInt(Integer::intValue).toArray();
        }
    }
}