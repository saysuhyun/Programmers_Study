public class 크기가_작은_부분문자열 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution("3141592", "271");
        System.out.println(result);


    }

    static class Solution {
        public int solution(String t, String p) {
            int length = p.length();

            int answer = 0;
            for (int i = 0; i < t.length() - length+1; i++) {
                String substring = t.substring(i, i + length);
                long pNum = Long.valueOf(p);
                long subNum = Long.valueOf(substring);

                if (pNum >= subNum) {
                    answer++;
                }


            }

            return answer;
        }
    }
}