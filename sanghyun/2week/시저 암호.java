public class Ceaser {
    public static void main(String[] args) {
        String s = "a B z";
        int n = 4;
        String answer ="";

        
        for (int i = 0; i < s.length(); i++) {
            // string 에서 char 추출
            char c = s.charAt(i);
            if (c == ' ') {
                answer = answer + c;
                continue;
            }

            // 소문자인경우
            if(Character.isLowerCase(c)) {
                // 아스키코드 값으로 변환하여 계산이 가능하다
                answer += (char) ((c - 'a' + n) % 26 + 'a');
            }
            //대문자인경우
            if(Character.isUpperCase(c)) {
                answer += (char) ((c - 'A' + n) % 26 + 'A');
            }
            
            
        }
    }
}
