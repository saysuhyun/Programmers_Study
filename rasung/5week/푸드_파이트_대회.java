class Solution {
    public String solution(int[] food) {
        StringBuilder participant1 = new StringBuilder();
        StringBuilder participant2 = new StringBuilder();
        for (int index = 0; index < food.length; index++) {
            if (food[index] == 1) {
                continue;
            }

            int useFoodCnt = food[index] / 2;
            if (food[index] == 2 || food[index] == 3) {
                useFoodCnt = 1;
            }

            for (int i = 0; i < useFoodCnt; i++) {
                participant1.append(index);
                participant2.insert(0, index);
            }
        }

        return participant1 + "0" + participant2;
    }
}
