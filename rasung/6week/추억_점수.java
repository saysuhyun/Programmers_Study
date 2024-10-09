import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> map = new HashMap<>();
        for (int index = 0; index < name.length; index++) {
            map.put(name[index], yearning[index]);
        }

        for (int row = 0; row < photo.length; row++) {
            int sum = 0;
            for (int col = 0; col < photo[row].length; col++) {
                String photoName = photo[row][col];
                if (map.get(photoName) != null) {
                    sum += map.get(photoName);
                }
            }
            answer[row] = sum;
        }

        return answer;
    }
}
