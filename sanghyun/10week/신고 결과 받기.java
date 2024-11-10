import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
         ArrayList<String> strArr = new ArrayList<>(Arrays.asList(id_list));
        HashMap<String, Integer> hmap = new HashMap<>();
        for(String id : id_list) {

            hmap.put(id, 0);
        }

        Set<String> set = new HashSet<>();

        for(String rep: report) {
            if(set.contains(rep)) {
                continue;
            }
            set.add(rep);
            String id = rep.split(" ")[0];
            String target = rep.split(" ")[1];
            Integer temp = hmap.get(target);
            hmap.put(target, temp+1); // 신고 당한 횟수
        }

        int[] answer = new int[id_list.length];

        HashMap<String, Integer> answerMap = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        List<String> sList = new ArrayList<>();
        hmap.forEach((key, value) -> {
            if(value >= k) {
                sList.add(key);
            }
        });

        set.forEach((key) -> {
            String id = key.split(" ")[0];
            String target = key.split(" ")[1];
            int idx = strArr.indexOf(id);
            int targetIdx = sList.indexOf(target);

            if(targetIdx > -1) {
                answer[idx] = answer[idx] + 1;
            }
          
        });
        
        return answer;
    }
}