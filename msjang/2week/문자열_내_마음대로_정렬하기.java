import java.util.ArrayList;
import java.util.Collections;

public class 문자열_내_마음대로_정렬하기 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] solution1 = solution.solution(new String[]{"abce",  "cdx","abcd"}, 1);
        for (String s : solution1) {
            System.out.println(s);
        }
    }

    static class Solution {
        // 1. 각 String 값에서 인덱스에 해당하는 배열 하나 꺼내온다.
        // 2. 각 단어들을 정렬한다.
        // 3. 정렬후 그단어에 해당하는 문자를 가져와 입력한다.
        // 4. 단어가 같을경우 사전순으로 정렬 한다.
        public String[] solution(String[] strings, int n) {
            ArrayList<Point> points = new ArrayList<>();
            for (String item : strings){
                char c = item.charAt(n);
                points.add(new Point(item, c));
            }
            Collections.sort(points, (o1, o2) -> {
                if (o1.oneChar == o2.oneChar) {
                    //문자열 사전 순으로 정렬
                    return o1.str.compareTo(o2.str);
                } else {
                    //오름차순으로 정렬.
                    return o1.oneChar - o2.oneChar;
                }
            });
            return points.stream()
                    .map(point -> point.str)
                    .toArray(String[]::new);

        }
    }

    static class Point {
        String str;
        char oneChar;

        public Point(String str, char oneChar) {
            this.str = str;
            this.oneChar = oneChar;
        }
    }
}