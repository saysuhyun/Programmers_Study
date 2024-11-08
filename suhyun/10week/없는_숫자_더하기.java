public class 없는_숫자_더하기 {
    public int solution(int[] numbers) {
        int sum = 45;
        for (int num : numbers) {
            sum -= num;
        }
        return sum;
    }
}
