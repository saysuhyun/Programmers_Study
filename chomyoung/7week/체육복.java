import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 체육복 {

    public static void main(String[] args) {


    }

    private static class Solution {
        // 앞번호 혹은 뒷번호에게만 빌려줄 수 있다.
        // 체격 순 => 1,2,3,4,5,...,n 크기순
        // 무엇을 기준으로? => reserve
        // return 최대한 많은 수의 학생이 들을 수 있도록
        // 주의: 여벌옷이 있는 사람이 도난당했을 수도 있다.
        // 먼저 여벌옷 있는 사람이 도난당한 경우를 생각해서 해치우자
        // 맨 처음은 앞. 그다음은
        public int solution(int n, int[] lost, int[] reserve) {
            // 학생 배열을 만듭니다.
            int[] students = new int[n];
            // 기본적으로 모든 학생은 체육복을 1벌씩 가지고 있다고 가정
            Arrays.fill(students, 1);

            // 여벌 체육복이 있는 학생은 +1
            for (int r : reserve) {
                students[r - 1]++;
            }

            // 도난당한 학생은 -1
            for (int l : lost) {
                students[l - 1]--;
            }

            for (int i = 0; i < n; i++) {
                if (students[i] == 0) {
                    // 앞번호 학생이 여벌 체육복이 있는 경우
                    if (i > 0 && students[i - 1] == 2) {
                        students[i]++;
                        students[i - 1]--;
                    }
                    // 뒷번호 학생이 여벌 체육복이 있는 경우
                    else if (i < n - 1 && students[i + 1] == 2) {
                        students[i]++;
                        students[i + 1]--;
                    }
                }
            }

            // 체육복을 가지고 있는 학생 수를 셉니다.
            int answer = 0;
            for (int student : students) {
                if (student > 0) {
                    answer++;
                }
            }

            return answer;
        }
    }
}