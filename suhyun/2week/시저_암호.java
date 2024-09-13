public class 시저_암호 {
    public static void main(String[] args) {
        solution("AB", 1);
    }

    public static String solution(String s, int n) {

        StringBuilder sb = new StringBuilder();

        char[] charList = s.toCharArray();
        for (int i = 0; i < charList.length; i++) {

            // 소문자
            if (charList[i] >= 97 && charList[i] <= 122) {
                charList[i] += n;
                if (charList[i] > 122) {
                    sb.append((char) (charList[i] - 122 + 97 - 1));
                } else {
                    sb.append(charList[i]);
                }
            } else if (charList[i] >= 65 && charList[i] <= 90) {
                charList[i] += n;
                if (charList[i] > 90) {
                    sb.append((char) (charList[i] - 90 + 65 - 1));
                } else {
                    sb.append(charList[i]);
                }
            } else {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
