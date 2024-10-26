import java.util.*;

public class 실패율 {
    public int[] solution(int N, int[] stages) {

        int[] stageReached = new int[N + 2];
        int[] stageNotCleared = new int[N + 2];

        for (int stage : stages) {
            stageNotCleared[stage]++;
            for (int i = 1; i <= stage; i++) {
                stageReached[i]++;
            }
        }

        List<Stage> failureRates = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if (stageReached[i] == 0) {
                failureRates.add(new Stage(i, 0));
            } else {
                double failureRate = (double) stageNotCleared[i] / stageReached[i];
                failureRates.add(new Stage(i, failureRate));
            }
        }

        Collections.sort(failureRates, (a, b) -> {
            if (b.failureRate == a.failureRate) {
                return Integer.compare(a.stageNumber, b.stageNumber);
            } else {
                return Double.compare(b.failureRate, a.failureRate);
            }
        });

        int[] result = new int[N];
        for (int i = 0; i < N; i++) {
            result[i] = failureRates.get(i).stageNumber;
        }

        return result;
    }

    static class Stage {
        int stageNumber;
        double failureRate;

        Stage(int stageNumber, double failureRate) {
            this.stageNumber = stageNumber;
            this.failureRate = failureRate;
        }
    }

}