public class 문자열_나누기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution("abaaaabb");
        System.out.println(result);
    }

    static class Solution {
        public int solution(String s) {
            int answer = 0;
            int num = 1;
            for (int i = 0; i < s.length(); i++) {
                s.charAt(i);
                if (i == s.length() - 1) {
                    answer++;
                }

                for (int k = i + 1; k < s.length(); k++) {

                    if (s.charAt(i) != s.charAt(k)) {
                        num--;
                    } else {
                        num++;
                    }

                    if (num == 0) {
                        answer++;
                        num = 1;
                        i = k;
                        break;
                    }

                    if (k == s.length()-1){
                        return answer+1;
                    }
                }
            }
            return answer;
        }

    }


}