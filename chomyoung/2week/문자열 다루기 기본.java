class Solution {
    // return s.length == 4 || s.length == 6 || 숫자로만
    // 숫자로만 이루어졌는지 확인하는 여러 방법
    // 1. Double.parseDouble() 메소드 try-catch
    // 2. str.matches("[+-]?\\d*(\\.\\d+)?");
    // 3. str.chars().allMatch(Character::isDigit);
    // 주의: 0으로 시작한다면?
    public boolean solution(String s) {
        return (s.length() == 4 || s.length() == 6) && s.chars().allMatch(Character::isDigit);
    }

    // 개선점
    // 1. try-catch int x = Integer.parseInt(s);
    // 2. return s.matches("(^[0-9]*$)");
}