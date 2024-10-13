package jaehyun.week6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 대충_만든_자판 {
    public static int[] solution(String[] keymap, String[] targets) {

        int[] answer = new int[targets.length];

        // 각 문자 최소 몇 번 눌러야 하는지 저장하는 맵
        Map<Character, Integer> keyPressMap = new HashMap<>();

        // keymap을 분석하여 각 문자가 최소 몇 번 눌려야 하는지 계산
        for (int i = 0; i < keymap.length; i++) {
            String key = keymap[i];
            for (int j = 0; j < key.length(); j++) {
                char ch = key.charAt(j);
                if (!keyPressMap.containsKey(ch)) {
                    keyPressMap.put(ch, j + 1); // j는 0부터 시작하므로 j+1이 실제 누른 횟수
                } else {
                    keyPressMap.put(ch, Math.min(keyPressMap.get(ch), j + 1)); //최소 횟수 저장
                }
            }
        }

        // 각 target 문자열에 대해 최소 키 입력 횟수 계산
        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            int totalKeyPresses = 0;
            boolean canType = true;

            for (int j = 0; j < target.length(); j++) {
                char ch = target.charAt(j);
                if (keyPressMap.containsKey(ch)) {
                    totalKeyPresses += keyPressMap.get(ch);
                } else {
                    canType = false;
                    break;
                }
            }

            // 작성할 수 있으면 총 입력 횟수 저장
            if (canType) {
                answer[i] = totalKeyPresses;
            } else {
                answer[i] = -1;
            }
        }

        return answer;
    }



    public static void main(String[] args) {


        String[] keymap1 = {"ABACD", "BCEFD"};
        String[] targets1 = {"ABCD", "AABB"};
        int[] result1 = solution(keymap1, targets1);
        System.out.println(Arrays.toString(result1));  // [9, 4]

        String[] keymap2 = {"AA"};
        String[] targets2 = {"B"};
        int[] result2 = solution(keymap2, targets2);
        System.out.println(Arrays.toString(result2));  // [-1]

        String[] keymap3 = {"AGZ", "BSSS"};
        String[] targets3 = {"ASA", "BGZ"};
        int[] result3 =solution(keymap3, targets3);
        System.out.println(Arrays.toString(result3));  // [4, 6]
    }
}
