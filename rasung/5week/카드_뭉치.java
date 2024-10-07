class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int card1Index = 0;
        int card2Index = 0;
        int cnt = 0;

        for (String word: goal) {
            if (card1Index < cards1.length && cards1[card1Index].equals(word)) {
                card1Index++;
                cnt++;
            } else if (card2Index < cards2.length && cards2[card2Index].equals(word)) {
                card2Index++;
                cnt++;
            }
        }

        return (cnt == goal.length) ? "Yes" : "No";
    }
}
