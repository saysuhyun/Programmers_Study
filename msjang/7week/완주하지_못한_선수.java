import java.util.HashMap;
import java.util.Map;

public class 완주하지_못한_선수 {
    public static void main(String[] args) {
        Solution solution = new Solution();

//        String result = solution.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"});
        String result = solution.solution(new String[]{"mislav", "stanko", "mislav", "ana"},
                new String[]{"stanko", "ana", "mislav"});
        System.out.println(result);


    }

    static class Solution {
        //경기 참가선수 1~100,000
        //participant-1 == completion
        //동명 이인이 있을수 있다.
        public String solution(String[] participant, String[] completion) {
            String answer = "";
            Map<String, Integer> participantMap = new HashMap<>();
            for (String item : participant){
                if (participantMap.containsKey(item)){
                    Integer num = participantMap.get(item);
                    participantMap.put(item,num+1);
                }else {
                    participantMap.put(item,1);
                }
            }

            for (String item : completion){
                Integer num = participantMap.get(item);
                participantMap.put(item,num-1);
            }
            answer = participantMap.entrySet()
                    .stream()
                    .filter(stringIntegerEntry -> stringIntegerEntry.getValue() == 1)
                    .findFirst()
                    .map(Map.Entry::getKey)
                    .get();

            return answer;
        }
    }
}