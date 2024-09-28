class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        // 65 ~ 90 대문자 아스키코드 범위
        // 97 ~ 122 소문자 아스키코드 범위
        for (int i = 0; i < s.length(); i++) {
            int asciiNumber = s.charAt(i);
            // 공백은 아스키 번호 = 32
            if (asciiNumber == 32) {
                answer.append((char)asciiNumber);
                continue;
            }

            if (65 <= asciiNumber && asciiNumber <= 90) {
                if (asciiNumber + n > 90) {
                    int initNumber = asciiNumber + n - 26;
                    answer.append((char)initNumber);
                } else {
                    answer.append((char)(asciiNumber + n));
                }
            } else {
                if (asciiNumber + n > 122) {
                    int initNumber = asciiNumber + n - 26;
                    answer.append((char)initNumber);
                } else {
                    answer.append((char)(asciiNumber + n));
                }
            }
        }

        return answer.toString();
    }
}
