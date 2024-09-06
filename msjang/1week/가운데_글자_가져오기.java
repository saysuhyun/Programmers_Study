public class 가운데_글자_가져오기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String solution1 = solution.solution("abcddddd");
        System.out.println(solution1);
    }

    static class Solution {
        public String solution(String s) {
            int strSize = s.length();
            int halfSize = strSize / 2;

            if (s.length() % 2 == 0) {
                return s.substring(halfSize -1, strSize - halfSize +1);
            }else {
                return s.substring(halfSize, s.length() - halfSize);
            }
        }
    }
}