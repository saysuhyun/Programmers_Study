public class 시저_암호 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution("a B z", 1);
        System.out.println(result);
    }

    static class Solution {
        public String solution(String s, int n) {
            char[] charArray = s.toCharArray();
            for (int i = 0 ; i < charArray.length ; i++){
                if (charArray[i] == ' '){
                    continue;
                }
                if (Character.isLowerCase(charArray[i])){
                    charArray[i] = (char) ((charArray[i] -'a'+n)%26 + 'a');
                }else {
                    charArray[i] = (char) ((charArray[i] -'A'+n)%26 + 'A');
                }
            }
            return String.valueOf(charArray);
        }
    }

}