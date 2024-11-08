public class 최소직사각형 {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;

        for (int[] size : sizes) {
            int w = Math.max(size[0], size[1]);  // 가로는 큰 값
            int h = Math.min(size[0], size[1]);  // 세로는 작은 값

            maxWidth = Math.max(maxWidth, w);
            maxHeight = Math.max(maxHeight, h);
        }
        return maxWidth * maxHeight;
    }

    public static void main(String[] args) {
        최소직사각형 solution = new 최소직사각형();

        int[][] sizes1 = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(solution.solution(sizes1));  // 4000

    }
}
