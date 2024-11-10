public class 없는_숫자_더하기 {
    public int solution(int[] numbers) {
        int totalSum = 45;
        int numbersSum = 0;

        for (int num : numbers) {
            numbersSum += num;
        }

        return totalSum - numbersSum;
    }

    public static void main(String[] args) {
        없는_숫자_더하기 solution = new 없는_숫자_더하기();

        int[] numbers1 = {1, 2, 3, 4, 6, 7, 8, 0};
        System.out.println(solution.solution(numbers1));  //14
    }
}