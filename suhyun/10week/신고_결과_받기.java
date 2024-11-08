import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class 신고_결과_받기 {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Set<String>> reportMap = new HashMap<>();
        Map<String, Integer> reportCount = new HashMap<>();

        for (String id : id_list) {
            reportMap.put(id, new HashSet<>());
            reportCount.put(id, 0);
        }

        for (String rep : report) {
            String[] split = rep.split(" ");
            String reporter = split[0];
            String reported = split[1];

            if (!reportMap.get(reporter).contains(reported)) {
                reportMap.get(reporter).add(reported);
                reportCount.put(reported, reportCount.get(reported) + 1);
            }
        }

        Set<String> bannedUsers = new HashSet<>();
        for (String id : id_list) {
            if (reportCount.get(id) >= k) {
                bannedUsers.add(id);
            }
        }

        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            String user = id_list[i];
            Set<String> reportedUsers = reportMap.get(user);

            int mailCount = 0;
            for (String reported : reportedUsers) {
                if (bannedUsers.contains(reported)) {
                    mailCount++;
                }
            }
            answer[i] = mailCount;
        }

        return answer;
    }
}
