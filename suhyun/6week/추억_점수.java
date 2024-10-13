import java.util.HashMap;

public class 추억_점수 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {

        HashMap<String, Integer> scoreMap = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            scoreMap.put(name[i], yearning[i]);
        }


        int[] result = new int[photo.length];
        for (int i = 0; i < photo.length; i++) {
            int sum = 0;
            for (String person : photo[i]) {
                sum += scoreMap.getOrDefault(person, 0);
            }
            result[i] = sum;
        }

        return result;
    }
}
