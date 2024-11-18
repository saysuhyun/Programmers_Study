import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class 가장많이받은선물 {
    public static void main(String[] args) {
    }

    private static class Solution {
        // 선물지수: 이번 달까지 자신이 친구들에게 준 선물의 수에서 받은 선물의 수를 뺀 값 => 이래도 같다면 다음달에 선물 주고 받고 x
        // return 다음 달에 선물을 가장 많이 받을 친구가 받을 선물의 수

        // 방법 : hashMap 3개
        // 선물 준 내역 : Map - key, hashmap
        public int solution(String[] friends, String[] gifts) {
            Map<String, Map<String, Integer>> giftRecords = new HashMap<>();
            Map<String, Integer> giftScore = new HashMap<>();
            Map<String, Integer> nextMonthGifts = new HashMap<>();

            for (String friend : friends) {
                giftRecords.put(friend, new HashMap<>());
                giftScore.put(friend, 0);
                nextMonthGifts.put(friend, 0);
            }

            for (String gift : gifts) {
                String[] parts = gift.split(" ");
                String giver = parts[0];
                String receiver = parts[1];

                giftRecords.get(giver).put(receiver, giftRecords.get(giver).getOrDefault(receiver, 0) + 1);
                giftScore.put(giver, giftScore.get(giver) + 1);
                giftScore.put(receiver, giftScore.get(receiver) - 1);
            }

            for (String giver : friends) {
                for (String receiver : friends) {
                    if (!giver.equals(receiver)) {
                        int giftsFromGiver = giftRecords.get(giver).getOrDefault(receiver, 0);
                        int giftsFromReceiver = giftRecords.get(receiver).getOrDefault(giver, 0);

                        if (giftsFromGiver > giftsFromReceiver) {
                            nextMonthGifts.put(giver, nextMonthGifts.get(giver) + 1);
                        } else if (giftsFromGiver == giftsFromReceiver && giftScore.get(giver) > giftScore.get(receiver)) {
                            nextMonthGifts.put(giver, nextMonthGifts.get(giver) + 1);
                        }
                    }
                }
            }

            return Collections.max(nextMonthGifts.values());
        }
    }
}
