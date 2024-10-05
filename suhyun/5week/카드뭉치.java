public class 카드뭉치 {
    class Solution {
        public String solution(String[] cards1, String[] cards2, String[] goal) {
            int i = 0; // cards1의 인덱스
            int j = 0; // cards2의 인덱스

            for (String word : goal) {
                // cards1에서 단어를 찾는 경우
                if (i < cards1.length && cards1[i].equals(word)) {
                    i++;
                }
                // cards2에서 단어를 찾는 경우
                else if (j < cards2.length && cards2[j].equals(word)) {
                    j++;
                }
                // 두 카드 뭉치 모두에서 단어를 찾지 못한 경우
                else {
                    return "No";
                }
            }

            return "Yes";
        }
    }
}
