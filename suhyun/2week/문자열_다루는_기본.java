public class 문자열_다루는_기본 {
    public boolean solution(String s) {

        boolean answer = false;
        boolean numFlg = true;

        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                numFlg = false;
            }
        }

        if ((s.length() == 4 || s.length() == 6) && numFlg) {
            answer = true;
        }

        return answer;
    }

    // 예외 처리로 푸는 방법이 있군
    public boolean solution2(String s) {
        if (s.length() == 4 || s.length() == 6) {
            try {
                int x = Integer.parseInt(s);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        } else
            return false;
    }

    // matchs로 정규표현식 일치하는지 아닌지 파악
    public boolean solution3(String s) {
        if (s.length() == 4 || s.length() == 6)
            return s.matches("(^[0-9]*$)");
        return false;
    }

    // split으로 숫자로 잘랐을 때 잘리면 조건 탈락 전부 숫자면 길이 0
    public boolean solution4(String s) {
        return (s.length() != 4 && s.length() != 6) || (s.split("[0-9]").length > 0) ? false : true;
    }

}
