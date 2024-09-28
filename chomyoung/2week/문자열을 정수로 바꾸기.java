class Solution {
    // 문자열 -> 숫자 : Integer.parseInt()
    // 먼저 앞부분을 substring 해서 숫자인지 판단
    // 숫자가 아니라면 + 인지 - 인지에 따라
    public int solution(String s) {
        String front = s.substring(0, 1);
        if(front.matches("[1-9]")){
            return Integer.parseInt(s);
        } else{
            return Integer.parseInt(s.substring(1)) * ("+".equals(front) ? 1 : -1);
        }
    }
}