import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int person1Index = 0;
        int person1AnswerCnt = 0;
        for (int number : answers) {
            if (number == person1[person1Index]) {
                person1AnswerCnt++;
            }
            if (person1Index == person1.length - 1) {
                person1Index = 0;
                continue;
            }
            person1Index++;
        }

        int person2Index = 0;
        int person2AnswerCnt = 0;
        for (int number : answers) {
            if (number == person2[person2Index]) {
                person2AnswerCnt++;
            }
            if (person2Index == person2.length - 1) {
                person2Index = 0;
                continue;
            }
            person2Index++;
        }

        int person3Index = 0;
        int person3AnswerCnt = 0;
        for (int number : answers) {
            if (number == person3[person3Index]) {
                person3AnswerCnt++;
            }
            if (person3Index == person3.length - 1) {
                person3Index = 0;
                continue;
            }
            person3Index++;
        }

        int max = Math.max(person1AnswerCnt, person2AnswerCnt);
        max = Math.max(max, person3AnswerCnt);

        List<Integer> list = new LinkedList<>();
        if (max == person1AnswerCnt) list.add(1);
        if (max == person2AnswerCnt) list.add(2);
        if (max == person3AnswerCnt) list.add(3);

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }
}
