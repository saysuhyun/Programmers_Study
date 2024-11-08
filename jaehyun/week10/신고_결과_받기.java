import java.util.*;

public class 신고_결과_받기 {
    public static void main(String[] args) {
        신고_결과_받기 solution = new 신고_결과_받기();

        String[] id_list1 = {"muzi", "frodo", "apeach", "neo"};
        String[] report1 = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k1 = 2;
        System.out.println(Arrays.toString(solution.solution(id_list1, report1, k1))); // [2, 1, 1, 0]


    }

    public int[] solution(String[] id_list, String[] report, int k) {
        // 중복 신고 제거
        Set<String> uniqueReports = new HashSet<>(Arrays.asList(report));

        // 신고당한 횟수 Map
        Map<String, Integer> reportCount = new HashMap<>();

        // 신고한 사람 목록 Map
        Map<String, List<String>> userReports = new HashMap<>();

        for (String id : id_list) {
            userReports.put(id, new ArrayList<>());
            reportCount.put(id, 0);
        }

        for (String rep : uniqueReports) {
            String[] parts = rep.split(" ");
            String reporter = parts[0]; // 신고한 사람
            String reported = parts[1]; // 신고당한 사람

            userReports.get(reporter).add(reported);
            reportCount.put(reported, reportCount.get(reported) + 1); // 신고당한 횟수 증가
        }

        Set<String> bannedUsers = new HashSet<>();
        for (String id : id_list) {
            if (reportCount.get(id) >= k) {
                bannedUsers.add(id);
            }
        }

        // 결과 메일 수 계산
        int[] result = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            String id = id_list[i];
            int mailCount = 0;
            for (String reported : userReports.get(id)) {
                if (bannedUsers.contains(reported)) {
                    mailCount++;
                }
            }
            result[i] = mailCount;
        }

        return result;
    }
}
