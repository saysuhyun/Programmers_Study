import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class 개인정보_수집_유효기간 {
    public static void main(String[] args) {
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        System.out.println(solution(today, terms, privacies));  // [1, 3]
    }

    public static List<Integer> solution(String today, String[] terms, String[] privacies) {
        List<Integer> result = new ArrayList<>();
        HashMap<String, Integer> termMap = new HashMap<>();

        int todayDate = convertDateToDays(today);

        for (String term : terms) {
            String[] termInfo = term.split(" ");
            String termType = termInfo[0];
            int termPeriod = Integer.parseInt(termInfo[1]);
            termMap.put(termType, termPeriod);
        }

        for (int i = 0; i < privacies.length; i++) {
            String[] privacyInfo = privacies[i].split(" ");
            String date = privacyInfo[0];
            String termType = privacyInfo[1];

            int collectedDate = convertDateToDays(date);
            int termMonths = termMap.get(termType);
            int expirationDate = collectedDate + (termMonths * 28);
            if (expirationDate <= todayDate) {
                result.add(i + 1);
            }
        }

        return result;
    }

    // YYYY.MM.DD 형식의 날짜를 총 일수로 변환
    public static int convertDateToDays(String date) {
        String[] dateParts = date.split("\\."); //["2022", "05", "19"]
        int year = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int day = Integer.parseInt(dateParts[2]);

        return (year * 12 * 28) + ((month-1) * 28) + day;
    }
}
