public class 음양_더하기 {
    public int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;
        for (int i = 0; i < absolutes.length; i++) {
            sum += signs[i] ? absolutes[i] : -absolutes[i];
        }
        return sum;
    }
}
