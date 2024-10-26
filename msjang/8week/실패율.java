import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 실패율 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3});
    }

    static class Solution {
        //N : 전체 스테이지의 개수
        //stages 길이 : 1~20,000 개별 숫자 범위 : 1~  N+1 의 자연수
        //stages 인덱스의 값은 사용자 도달한 stage 단계
        //N+1
        //각스테이지에 실패율을 오름차순으로 구한다.
        public int[] solution(int N, int[] stages) {
            int[] answer = {};
            List<StagePoint> stagePointList = new ArrayList<>();

            //각스테이지 실패율 구하기.
            for (int i = 1; i <= N; i++) {
                int failNum = 0;
                int stageTryNum = 0;
                for (int k = 0; k < stages.length; k++) {

                    if (stages[k] >= i) {
                        stageTryNum++;
                    }
                    if (stages[k] == i) {
                        failNum++;
                    }
                }

                //스테이지에 도달한 유저가 없는 경우
                if (stageTryNum == 0) {
                    stagePointList.add(new StagePoint(i,0));
                    continue;
                }

                double failRate = (double)  failNum / stageTryNum;
                stagePointList.add(new StagePoint(i,failRate));

            }

            Collections.sort(stagePointList, (o1, o2) -> {
                if (o1.failRate == o2.failRate) {
                    return o1.stage - o2.stage;
                }
                return Double.compare(o2.failRate, o1.failRate);
            });

            answer = stagePointList.stream()
                    .map(stagePoint -> stagePoint.stage)
                    .mapToInt(Integer::intValue).toArray();
            return answer;
        }
        class StagePoint {
            int stage;
            double failRate;

            public StagePoint(int stage, double failRate){
                this.stage = stage;
                this.failRate = failRate;
            }


        }
    }


}