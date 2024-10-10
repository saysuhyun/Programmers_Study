class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        answer[1] = 51;
        boolean topCheck = false;
        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    // 가장 위쪽
                    if (!topCheck && answer[0] == 0) {
                        answer[0] = i;
                        topCheck = true;
                    }
                    // 가장 왼쪽
                    answer[1] = Math.min(answer[1], j);
                    // 가장 아래
                    answer[2] = Math.max(answer[2], i + 1);
                    // 가장 오른쪽
                    answer[3] = Math.max(answer[3], j + 1);
                }
            }
        }

        return answer;
    }
}
