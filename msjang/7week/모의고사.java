import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 모의고사 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(new int[]{1,3,2,4,2});

        System.out.println(4 % 5);
    }

    static class Solution {
        public int[] solution(int[] answers) {

            int[] su1 = {1, 2, 3, 4, 5};
            int[] su2 = {2, 1, 2, 3, 2, 4, 2, 5};
            int[] su3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
            int su1Score = 0;
            int su2Score = 0;
            int su3Score = 0;


            for (int i = 0; i < answers.length; i++) {
                int idxAnswer = answers[i];
                if (su1[i % su1.length] == idxAnswer) {
                    su1Score++;
                }
                if (su2[i % su2.length] == idxAnswer) {
                    su2Score++;
                }
                if (su3[i % su3.length] == idxAnswer) {
                    su3Score++;
                }
            }
            List<Point> points = new ArrayList<>();
            points.add(new Point(1, su1Score));
            points.add(new Point(2, su2Score));
            points.add(new Point(3, su3Score));

            points.sort((o1, o2) -> o2.getScore() - o1.getScore());
            int masScore = points.get(0).getScore();
            int[] answer = points.stream()
                    .filter(point -> point.getScore() == masScore)
                    .mapToInt(Point::getNum)
                    .toArray();

            Arrays.sort(answer);

            return answer;
        }

        public class Point {
            int num;
            int score;

            Point(int num, int score) {
                this.num = num;
                this.score = score;
            }

            public int getNum() {
                return num;
            }

            public int getScore() {
                return score;
            }
        }
    }

}