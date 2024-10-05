public class 크기가_작은_부분문자열 {
    class Solution {
        public int solution(String t, String p) {
            int answer = 0;
            int pLength = p.length();
            long pValue = Long.parseLong(p); // p를 숫자로 변환

            // t의 부분 문자열을 순회
            for (int i = 0; i <= t.length() - pLength; i++) {
                // t의 부분 문자열 추출
                String substring = t.substring(i, i + pLength);
                long substringValue = Long.parseLong(substring); // 부분 문자열을 숫자로 변환

                // 부분 문자열이 p보다 작거나 같은지 확인
                if (substringValue <= pValue) {
                    answer++;
                }
            }

            return answer;
        }

    }

}
