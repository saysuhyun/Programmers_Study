public class 콜라문제 {
    public static void main(String[] args) {
        System.out.println(solution(2,1,20));
    }

    public static int solution(int a, int b, int n) {
        int answer = 0; // 받은 콜라의 수
        while (n >= a) { // 빈 병의 수가 a 이상
            int colas = (n / a) * b; // 받을 수 있는 콜라의 수
            answer += colas;
            n = (n % a) + colas; // 남은 빈 병 + 새로 받은 빈 병
        }
        return answer;
    }
}
