import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        Map<String, Integer> giveCount = new HashMap<>();
        Map<String, Integer> receiveCount = new HashMap<>();
        Map<String, Map<String, Integer>> exchangeMap = new HashMap<>();
        Map<String, Integer> giftIndex = new HashMap<>();
        Map<String, Integer> nextMonthGifts = new HashMap<>();

        // 초기화
        for (String friend : friends) {
            giveCount.put(friend, 0);
            receiveCount.put(friend, 0);
            exchangeMap.put(friend, new HashMap<>());
            nextMonthGifts.put(friend, 0);
        }

        // 선물 기록 저장
        for (String gift : gifts) {
            String[] parts = gift.split(" ");
            String giver = parts[0];
            String receiver = parts[1];

            giveCount.put(giver, giveCount.get(giver) + 1);
            receiveCount.put(receiver, receiveCount.get(receiver) + 1);

            exchangeMap.get(giver).put(receiver, exchangeMap.get(giver).getOrDefault(receiver, 0) + 1);
        }

        // 선물 지수 계산
        for (String friend : friends) {
            giftIndex.put(friend, giveCount.get(friend) - receiveCount.get(friend));
        }

        // 다음 달 선물 예측
        for (String friend : friends) {
            for (String other : friends) {
                if (friend.equals(other))
                    continue;

                int given = exchangeMap.get(friend).getOrDefault(other, 0);
                int received = exchangeMap.get(other).getOrDefault(friend, 0);

                if (given > received) {
                    nextMonthGifts.put(other, nextMonthGifts.get(other) + 1);
                } else if (given < received) {
                    nextMonthGifts.put(friend, nextMonthGifts.get(friend) + 1);
                } else {
                    // 선물 횟수가 같으면 선물 지수 비교
                    if (giftIndex.get(friend) > giftIndex.get(other)) {
                        nextMonthGifts.put(other, nextMonthGifts.get(other) + 1);
                    } else if (giftIndex.get(friend) < giftIndex.get(other)) {
                        nextMonthGifts.put(friend, nextMonthGifts.get(friend) + 1);
                    }
                }
            }
        }

        // 최대값 찾기
        int maxGifts = 0;
        for (int count : nextMonthGifts.values()) {
            maxGifts = Math.max(maxGifts, count);
        }

        return maxGifts;
    }
}