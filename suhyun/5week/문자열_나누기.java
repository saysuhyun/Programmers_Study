public class 문자열_나누기 {
    public int solution(String s) {
        int answer = 0; // 분리된 문자열의 개수
        int countX = 0; // x의 개수
        int countOther = 0; // x가 아닌 다른 글자의 개수
        int n = s.length();
        int i = 0; // 문자열의 인덱스

        while (i < n) {
            char x = s.charAt(i); // 현재 기준이 되는 문자 x
            countX = 0; // x의 개수 초기화
            countOther = 0; // x가 아닌 다른 글자의 개수 초기화

            // x와 다른 문자의 개수를 세기
            while (i < n && (countX == 0 || countX != countOther)) {
                if (s.charAt(i) == x) {
                    countX++;
                } else {
                    countOther++;
                }
                i++; // 다음 문자로 이동
            }

            // 두 개수가 같아지면 분리
            if (countX == countOther) {
                answer++;
            } else if (countX > 0 || countOther > 0) {
                // 남은 부분이 있을 경우에도 분리
                answer++;
            }
        }

        return answer;
    }
}
