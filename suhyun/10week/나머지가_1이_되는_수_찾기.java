public class 나머지가_1이_되는_수_찾기 {
    public int solution(int n) {
        for (int x = 2; x < n; x++) {
            if (n % x == 1) {
                return x;
            }
        }
        return -1;
    }
}
