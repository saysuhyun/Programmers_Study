public class 카드_뭉치 {
    public static void main(String[] args) {

        Solution solution = new Solution();
        String result = solution.solution(
                new String[]{"i", "drink", "water"},
                new String[]{"want", "to"},
                new String[]{"i", "want", "to", "drink", "water"});
        String result2 = solution.solution(
                new String[]{"i", "water", "drink"},
                new String[]{"want", "to"},
                new String[]{"i", "want", "to", "drink", "water"});
        System.out.println(result2);

    }

    static class Solution {
        public String solution(String[] cards1, String[] cards2, String[] goal) {
            int index1 = 0;
            int index2 = 0;

            for (String word : goal) {
                if (index1 < cards1.length && cards1[index1].equals(word)) {
                    index1++;
                }
                else if (index2 < cards2.length && cards2[index2].equals(word)) {
                    index2++;
                } else {
                    return "No";
                }
            }

            return "Yes";
        }
    }
}