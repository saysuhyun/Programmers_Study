import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        HashMap<String, Integer> indexMapByFriend = new HashMap<>();
        int index = 0;
        for (String friend : friends) {
            indexMapByFriend.put(friend, index++);
        }

        int[] giftPoint = new int[gifts.length];
        int[][] giftTable = new int[friends.length][friends.length];
        for(String gift : gifts){
            giftPoint[indexMapByFriend.get(gift.split(" ")[0])]++;
            giftPoint[indexMapByFriend.get(gift.split(" ")[1])]--;
            giftTable[indexMapByFriend.get(gift.split(" ")[0])][indexMapByFriend.get(gift.split(" ")[1])]++;
        }

        for (int row = 0; row < friends.length; row++) {
            int count = 0;

            for (int col = 0; col < friends.length; col++) {
                if (row == col) continue;

                if (giftTable[row][col] > giftTable[col][row] || (giftTable[row][col] == giftTable[col][row] && giftPoint[row] > giftPoint[col])) {
                    count++;
                }

                if (answer < count) {
                    answer = count;
                }
            }
        }

        return answer;
    }
}
