import java.util.*;

public class 신고_결과_받기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(new String[]{"muzi", "frodo", "apeach", "neo"},
                new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"},
                2);
    }

    static class Solution {

        // 각 유저는 한번에 한 명 유저 신고.
        // 신고 횟수 제한 없음.
        // 한 유저를 여러번 신고가능 하지만 신고 횟수 1회 처리.
        // k번 이상 신고 당한 유저 게시판 정지.
        // result 는 자신이 신고한 id 중 정지를 당한 아이디 입력해야 한다.

        //정리
        // key 값에 각각에 이름을 넣어 놓고
        // value 에는 신고한 list, 신고 당한 num
        public int[] solution(String[] id_list, String[] report, int k) {
            int[] answer = new int[id_list.length];
            Map<String, Point> userMap = new HashMap<>();

            for (int i = 0; i < id_list.length; i++) {
                userMap.put(id_list[i], new Point(i));
            }

            //신고자 , 피신고자 접수
            for (String twoUser : report) {
                String[] split = twoUser.split(" ");
                //신고자
                Point reportUserPoint = userMap.get(split[0]);

                //이미 신고한 이력이 있는 사람이면 무시한다.
                if (reportUserPoint.reportUsers.contains(split[1]))
                    continue;

                //피신고자
                reportUserPoint.reportUsers.add(split[1]);

                Point reportedUserPoint = userMap.get(split[1]);
                reportedUserPoint.reportedNum = reportedUserPoint.reportedNum + 1;

            }

            userMap.forEach((key, value) -> {
                int totalNum = 0;
                for (String user : value.reportUsers) {

                    Point userPoint = userMap.get(user);
                    if (userPoint.reportedNum >= k) {
                        totalNum++;
                    }
                }
                answer[value.seq] = totalNum;

            });


            return answer;
        }

        class Point {
            List<String> reportUsers = new ArrayList<>();
            int reportedNum;
            int seq;

            Point(int seq) {
                this.seq = seq;
            }

        }
    }
}