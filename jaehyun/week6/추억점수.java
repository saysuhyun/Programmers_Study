package jaehyun.week6;

import java.util.HashMap;

public class 추억점수 {
    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        // 이름, 그리움 점수 매칭 해시맵
        HashMap<String, Integer> yearningMap = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            yearningMap.put(name[i], yearning[i]);
        }

        // 사진별 추억 점수 배열
        int[] answer = new int[photo.length];

        // 각 사진에 대해 그리움 점수를 계산
        for (int i = 0; i < photo.length; i++) {
            int memoryScore = 0;
            for (String person : photo[i]) {
                if (yearningMap.containsKey(person)) {
                    memoryScore += yearningMap.get(person);
                }
            }
            answer[i] = memoryScore;
        }

        return answer;
    }

    public static void main(String[] args) {

        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        int[] result = solution(name, yearning, photo);     //[19, 15, 6]
    }
}
