import java.util.*;

public class Present {
    public static void main(String[] args) {
        String[] friends = {"muzi", "ryan", "frodo", "neo"};
        String[] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};

       
        int[][] giftCount = new int[friends.length][friends.length];
        long[] giftIndex = new long[friends.length];

        for(int i = 0 ;i< friends.length;  i++ ){
            for(int j = 0; j<friends.length; j++){
                String gift = friends[i] + " " + friends[j];
                for(String temp : gifts){
                    if(temp.equals(gift)){
                        giftCount[i][j] += 1;
                    }
                }

            }
        }

        for(int i=0;i< friends.length;i++){
            for(String temp : gifts) {
                String giver = temp.split(" ")[0];
                String receiver = temp.split(" ")[1];

                if (giver.equals(friends[i])) {
                    giftIndex[i] += 1;
                }

                if(receiver.equals(friends[i])){
                    giftIndex[i] -= 1;
                }
            }
        }

        int maxGift = 0;
    
        for(int i=0;i< friends.length;i++){
            int giftCnt = 0;
            for(int j =0;j< friends.length;j++){
               
                if(i==j){
                    continue;
                }
             
                if(giftCount[i][j] == giftCount[j][i]){
                    if(giftIndex[i] > giftIndex[j]){
                        giftCnt += 1;
                    }
                    
                }else{
            
                    if(giftCount[i][j] > giftCount[j][i]){
                        giftCnt += 1;
                    }
                }
                

            }
            
            if(giftCnt>maxGift) {
                maxGift = giftCnt;
            }
        }
    }
}