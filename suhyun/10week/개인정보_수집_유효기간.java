import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 개인정보_수집_유효기간 {

    public int[] solution(String today, String[] terms, String[] privacies) {
        Map<String, Integer> termMap = new HashMap<>();
        List<Integer> expiredList = new ArrayList<>();

        int todayDate = convertDateToDays(today);

        for (String term : terms) {
            String[] parts = term.split(" ");
            termMap.put(parts[0], Integer.parseInt(parts[1]));
        }

        for (int i = 0; i < privacies.length; i++) {
            String[] parts = privacies[i].split(" ");
            int collectedDate = convertDateToDays(parts[0]);
            int termMonths = termMap.get(parts[1]);

            int expirationDate = collectedDate + (termMonths * 28) - 1;

            if (todayDate > expirationDate) {
                expiredList.add(i + 1);
            }
        }

        return expiredList.stream().mapToInt(Integer::intValue).toArray();
    }

    private int convertDateToDays(String date) {
        String[] parts = date.split("\\.");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        return (year * 12 * 28) + (month * 28) + day;
    }
}
