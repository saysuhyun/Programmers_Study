import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    // 요건: 소문자 > 대문자 (char 이용) - 어차피 대문자 z가 제일 크니까
    // return 소문자대문자순으로 큰것부터 정렬해서 배치
    // 간단하게는 LIst<Character>가 된 다음, stream으로 정렬하고 toString 다시

    public String solution(String s) {
        List<Character> charList = new ArrayList<>();
        for (char ch : s.toCharArray()){
            charList.add(ch);
        }
        charList = charList.stream().sorted((c1, c2) -> (int) c2 - (int) c1).collect(
            Collectors.toList());

        return charList.stream()
            .map(String::valueOf)
            .collect(Collectors.joining());
    }
}
