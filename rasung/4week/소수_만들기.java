class Solution {
    static int answer = 0;

    public int solution(int[] nums) {
        boolean[] visited = new boolean[nums.length];

        combination(0, 0, nums, visited);

        return answer;
    }

    private static void combination(int start, int cnt, int[] nums, boolean[] visited) {
        if (cnt == 3) {
            int sum = 0;
            for (int index = 0; index < visited.length; index++) {
                if (visited[index]) {
                    sum += nums[index];
                }
            }

            if (findPrimeNumber(sum)) answer++;

            return;
        }

        for (int index = start; index < nums.length; index++) {
            if (!visited[index]) {
                visited[index] = true;
                combination(index, cnt + 1, nums, visited);
                visited[index] = false;
            }
        }
    }

    private static boolean findPrimeNumber(int number) {
        boolean flag = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }

        return flag;
    }
}
