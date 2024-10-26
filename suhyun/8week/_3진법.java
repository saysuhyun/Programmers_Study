public class _3진법 {
    public int solution(int n) {
        String jinbub = new StringBuilder(Integer.toString(n, 3)).reverse().toString();
        return Integer.parseInt(jinbub, 3);
    }
}