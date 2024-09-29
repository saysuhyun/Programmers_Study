public class Split {
    public static void main(String[] args) {
        String s = "aaabbaccccabba";
        char[] c = s.toCharArray();

        int temp = 0;
        int temp2  = 0;
        int total = 0;
        char now = 'a';
        StringBuilder sb = new StringBuilder();
        for (char cs : c) {
            // 처음엔 비교할 문자를 초기화
            if (temp == 0) {
                now = cs;
                temp++;
                sb.append(cs);
            } 
            // 그 외에 현재 문자와 동일한 경우
            else if (now == cs) {
                temp++;  // 현재 문자 개수 증가
                sb.append(cs);
            } 
            // 다른 문자인 경우
            else {
                temp2++;  // 다른 문자 개수 증가
                sb.append(cs);
            }

            // 현재 문자와 다른 문자의 개수가 같으면 문자열을 나눔
            if (temp == temp2) {
                total++;  // 나눈 횟수 증가
                temp = 0;
                temp2 = 0;
                sb.setLength(0); 
            }
        }

        // 마지막에 남아 있는 문자열도 처리
        if (sb.length() > 0) {
            total++;
        }
        System.out.println(total);
    }
}