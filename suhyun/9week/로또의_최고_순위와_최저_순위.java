import java.util.HashSet;

public class 로또의_최고_순위와_최저_순위 {
    public int[] solution(int[] lottos, int[] win_nums) {
        HashSet<Integer> winSet = new HashSet<>();
        for (int num : win_nums) {
            winSet.add(num);
        }

        int matched = 0;
        int zeros = 0;

        for (int num : lottos) {
            if (num == 0) {
                zeros++;
            } else if (winSet.contains(num)) {
                matched++;
            }
        }

        int maxMatch = matched + zeros;
        int minMatch = matched;

        return new int[]{getRank(maxMatch), getRank(minMatch)};
    }

    private int getRank(int matchCount) {
        switch (matchCount) {
            case 6:
                return 1;
            case 5:
                return 2;
            case 4:
                return 3;
            case 3:
                return 4;
            case 2:
                return 5;
            default:
                return 6;
        }
    }
}
