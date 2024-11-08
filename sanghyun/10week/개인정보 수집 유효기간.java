import java.util.*;
import java.time.*;

public class Privacy {
    public static void main(String[] args) {

        String today = "2020.01.01";
    
        String[] terms = {"Z 3", "D 5"};
        String[] privacies = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};


        HashMap<String, Integer> hmap = new HashMap<>();
        Integer year = Integer.parseInt(today.split("\\.")[0]);
        // System.out.println(year);
        Integer month = Integer.parseInt(today.split("\\.")[1]);
        Integer day = Integer.parseInt(today.split("\\.")[2]);

        LocalDate now  = LocalDate.of(year, month, day); // 오늘
        

        for(int i = 0; i < terms.length; i++) {
            String tempP = terms[i].split(" ")[0];
            String tempM = terms[i].split(" ")[1];
            hmap.put(tempP , Integer.parseInt(tempM) * 28);
        }

        List<Integer> arr = new ArrayList<Integer>();
        
        for(int i = 0; i < privacies.length; i++) {
            String tempDate = privacies[i].split(" ")[0];
            String tempP = privacies[i].split(" ")[1];
            Integer privacyDays = hmap.get(tempP); // 보관 가능 일자

            Integer tempYear = Integer.parseInt(tempDate.split("\\.")[0]);
            Integer tempMonth = Integer.parseInt(tempDate.split("\\.")[1]);
            Integer tempDay = Integer.parseInt(tempDate.split("\\.")[2]);


        

            Integer yearGap = (year - tempYear) * 12 * 28;
            Integer monthGap = (month - tempMonth) * 28;
            Integer dayGap = (day - tempDay);

            if(!(privacyDays > (yearGap + monthGap + dayGap))) {
                arr.add(i+1);
            }
        }

        System.out.println(arr);

        int[] answer = arr.stream().mapToInt(i -> i).toArray();
    } 
    
}