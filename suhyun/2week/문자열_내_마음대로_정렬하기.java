import java.util.Arrays;
import java.util.Comparator;

public class 문자열_내_마음대로_정렬하기 {
    public String[] solution(String[] strings, int n) {
        // 일단 문자열을 정렬시킴
        Arrays.sort(strings);
        // subString으로 정렬할 거를 세팅한 다음 세팅 시킴
        Arrays.sort(strings, Comparator.comparing((s) -> s.substring(n, n + 1)));
        return strings;
    }
}
