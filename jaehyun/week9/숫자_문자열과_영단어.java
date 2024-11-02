public class 숫자_문자열과_영단어 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("one4seveneight"));

    }

    static class Solution {
        public int solution(String s) {
            String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
            for (int i = 0; i < words.length; i++) {
                s=s.replace(words[i], String.valueOf(i));

            }
            return Integer.parseInt(s);


        }
    }
}
