public class 둘만의_암호 {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        boolean[] skipArray = new boolean[26]; // 알파벳 a-z를 위한 boolean 배열

        // skip에 있는 알파벳을 true로 설정
        for (char c : skip.toCharArray()) {
            skipArray[c - 'a'] = true;
        }

        for (char c : s.toCharArray()) {
            char newChar = c;
            int count = 0;

            // index만큼 뒤로 이동
            while (count < index) {
                newChar++;
                if (newChar > 'z') {
                    newChar = 'a'; // z를 넘어가면 a로 돌아감
                }
                // skip에 포함되지 않은 경우에만 count 증가
                if (!skipArray[newChar - 'a']) {
                    count++;
                }
            }
            answer.append(newChar); // 결과에 추가
        }

        return answer.toString();
    }
}
