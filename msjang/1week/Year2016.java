
public class Year2016 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String solution1 = solution.solution(1, 1);
        System.out.println(solution1);
    }

}

class Solution {
    public String solution(int a, int b) {
        //날짜가 0부터 시작하지 않는다. 1월 1일 금요일 부터 시작 해서 인덱스 1이 금요일
        String[] dayList = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        //월별 일수
        int[] monthDayList = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        //월에 일수를 더해 준다. 7로 나눈 나머지가 요일이 된다.
        for (int i = 0; i < a - 1; i++) {
            b += monthDayList[i];
        }

        String answer = dayList[b % 7];
        return answer;
    }
}