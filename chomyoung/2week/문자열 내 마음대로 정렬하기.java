import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Solution {

    // 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬
    // 추가 요건: 같은 문자열이라면 사전순으로 앞선 문자열이 앞쪽에 위치

    // n번째 글자 추출: each[n-1]
    // 사전순으로 앞뒤 비교
    // 방법: stream, sort

    // 흐름: 사전순으로 먼저 정렬하고나서 sort해도 될듯
    // 비교: if (char1 < char2)

    public String[] solution(String[] strings, int n) {
        List<String> strList = Arrays.asList(strings);
        strList = strList.stream().sorted()
            .collect(Collectors.toList());
        strList = strList.stream().sorted(Comparator.comparingInt(s -> s.charAt(n)))
            .collect(Collectors.toList());
        String[] answer = strList.toArray(new String[0]);
        return answer;
    }
}