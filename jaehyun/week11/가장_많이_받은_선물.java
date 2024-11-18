import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class 가장_많이_받은_선물 {
    public static void main(String[] args) {
        String[] friends1 = {"muzi", "ryan", "frodo", "neo"};
        String[] gifts1 = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
        System.out.println(solution(friends1, gifts1));
    }

    public static int solution(String[] friends, String[] gifts) {
        Map<String, Integer> sent = new HashMap<>();
        Map<String, Integer> received = new HashMap<>();

        for (String friend : friends) {
            sent.put(friend, 0);
            received.put(friend, 0);
        }
        for (String gift : gifts) {
            String[] parts = gift.split(" ");
            String giver = parts[0];
            String receiver = parts[1];

            sent.put(giver, sent.get(giver) + 1);
            received.put(receiver, received.get(receiver) + 1);
        }

        Map<String, Integer> giftIndex = new HashMap<>();
        for (String friend : friends) {
            giftIndex.put(friend, sent.get(friend) - received.get(friend));
        }

        Map<String, Integer> nextMonthGifts = new HashMap<>();
        for (String friend : friends) {
            nextMonthGifts.put(friend, 0);
        }

        for (int i = 0; i < friends.length; i++) {
            for (int j = i + 1; j < friends.length; j++) {
                String a = friends[i];
                String b = friends[j];

                int sentToB = sent.getOrDefault(a, 0);
                int receivedFromB = received.getOrDefault(a, 0);
                int sentToA = sent.getOrDefault(b, 0);
                int receivedFromA = received.getOrDefault(b, 0);

                if (sentToB > receivedFromB) {
                    nextMonthGifts.put(a, nextMonthGifts.get(a) + 1);
                } else if (sentToA > receivedFromA) {
                    nextMonthGifts.put(b, nextMonthGifts.get(b) + 1);
                } else {
                   // 선물 지수 비교
                    int giftIndexA = giftIndex.get(a);
                    int giftIndexB = giftIndex.get(b);

                    if (giftIndexA > giftIndexB) {
                        nextMonthGifts.put(a, nextMonthGifts.get(a) + 1);
                    } else if (giftIndexB > giftIndexA) {
                        nextMonthGifts.put(b, nextMonthGifts.get(b) + 1);
                    }
                }
            }
        }

        int maxGifts = Collections.max(nextMonthGifts.values());
        return maxGifts;
    }
}