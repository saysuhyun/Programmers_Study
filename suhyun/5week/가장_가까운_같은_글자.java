import java.util.HashMap;

public class 가장_가까운_같은_글자 {
    public int[] solution(String s) {
        int n = s.length();
        int[] answer = new int[n];
        HashMap<Character, Integer> lastIndexMap = new HashMap<>(); // 각 문자의 마지막 인덱스를 저장하는 맵

        for (int i = 0; i < n; i++) {
            char currentChar = s.charAt(i);
            // 현재 문자가 이전에 등장한 적이 있는지 확인
            if (lastIndexMap.containsKey(currentChar)) {
                // 이전 인덱스를 가져와서 현재 인덱스와의 차이를 계산
                answer[i] = i - lastIndexMap.get(currentChar);
            } else {
                // 처음 등장하는 문자일 경우 -1로 설정
                answer[i] = -1;
            }
            // 현재 문자의 인덱스를 업데이트
            lastIndexMap.put(currentChar, i);
        }

        return answer;
    }
}
