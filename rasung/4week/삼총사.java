class Solution {
    static int answer = 0;

    public int solution(int[] number) {
        boolean[] visited = new boolean[number.length];

        combination(0, 0, number, visited);

        return answer;
    }

    private static void combination(int start, int cnt, int[] number, boolean[] visited) {
        if (cnt == 3) {
            int sum = 0;
            for (int index = 0; index < visited.length; index++) {
                if (visited[index]) {
                    sum += number[index];
                }
            }

            if (sum == 0) answer++;

            return;
        }

        for (int index = start; index < number.length; index++) {
            if (!visited[index]) {
                visited[index] = true;
                combination(index, cnt + 1, number, visited);
                visited[index] = false;
            }
        }
    }
}
