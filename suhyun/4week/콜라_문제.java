public class 콜라_문제 {
    public int solution(int a, int b, int n) {
        int answer = 0;

        // 현재 가지고 있는 빈 병 수
        int emptyBottles = n;

        while (emptyBottles >= a) {
            // 교환할 수 있는 콜라의 병 수
            int cola = (emptyBottles / a) * b;
            answer += cola;

            // 교환 후 남은 빈 병 수
            emptyBottles = (emptyBottles % a) + cola;
        }

        return answer;
    }
}
