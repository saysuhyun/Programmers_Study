import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 숫자_짝궁 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("5214144141", "56423423422"));
    }

    private static class Solution {
        // String 개별문자
        // 짝궁의 기준: 같은 값들을 추려서 그걸로 만든 가장 큰 정수
            // 추릴 때, replace로 문자열의 길이가 줄어든 만큼
            // 주의: 양쪽 모두 replace를 하는데, 가장 작은 length만큼만 추가해야한다.
            // 가장 큰 정수 만들기: 추린 것들을 내림차순으로 정렬
        // 주의: "0"으로만 => 0 : 0만 있는지 판별
        // return 짝궁 != null ? 짝궁 : -1
        public String solution(String X, String Y) {
            String longOne = X.length()>Y.length() ? X : Y;
            String shortOne = X.length()>Y.length() ? Y : X;
            List<String> shortList = Arrays.stream(shortOne.split("")).collect(Collectors.toList());
            List<String> commonList = new ArrayList<>();
            boolean hasOnlyZero = true;
            for(String each : shortList){
                int longOneLength = longOne.length();
                longOne = longOne.replace(each, "");
                int shorOneLength = shortOne.length();
                shortOne = shortOne.replace(each, "");
                int addLength = Math.min(longOneLength-longOne.length(),shorOneLength - shortOne.length());
                for(int i=0; i<addLength;i++){
                    commonList.add(each);
                    if(hasOnlyZero && !"0".equals(each)){
                        hasOnlyZero = false;
                    }
                }
            }
            if(commonList.size()==0){
                return "-1";
            }
            if(hasOnlyZero){
                return "0";
            }
            commonList = commonList.stream().map(Integer::valueOf).sorted((o1, o2) -> o2-o1).map(
                Object::toString).collect(Collectors.toList());

            StringBuilder answer = new StringBuilder();
            for(String each : commonList){
                answer.append(each);
            }
            return answer.toString();
        }
    }
}