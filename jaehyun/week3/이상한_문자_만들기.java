package jaehyun.week3;
public class 이상한_문자_만들기 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("Hello  World good boy "));
    }

    private static class Solution {
        public String solution(String s) {
            String words[] = s.split(" ",-1);
            StringBuilder combinedWord = new StringBuilder();
            for (String word : words){
                if (word.length()>0) {
                    StringBuilder convertedWord = new StringBuilder();
                    for (int i = 0; i < word.length(); i++) {
                        if (i % 2 == 0) {
                            convertedWord.append(Character.toUpperCase(word.charAt(i)));
                        } else {
                            convertedWord.append(Character.toLowerCase(word.charAt(i)));
                        }
                    }
                    combinedWord.append(convertedWord);
                }
                combinedWord.append(" ");

                }
            return combinedWord.substring(0, combinedWord.length()-1).toString();
        }

    }
}

