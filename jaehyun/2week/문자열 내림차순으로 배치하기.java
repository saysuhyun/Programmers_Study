import java.util.Arrays;

class Solution {
    public String solution(String s) {
        // 문자열을 문자 배열로 변환
        char[] chars = s.toCharArray();
        // 배열을 정렬 (오름차순)
        Arrays.sort(chars);
        // 배열을 내림차순으로 정렬하기 위해 String 문자열 거쳐서
        // StringBuilder에 넣어 역순으로 뒤집기
        StringBuilder sb= new StringBuilder(new String(chars));
        sb.reverse();
        return sb.toString();
    }
}