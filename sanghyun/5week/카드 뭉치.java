import java.util.*;

public class Card {
    public static void main(String[] args) {
        String[] cards1 = {"i", "water", "drink"};
        String[] cards2 = { "want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        //String[] goal = {"aass"};

        Deque<String> card1Dq = new ArrayDeque<>();
        Deque<String> card2Dq = new ArrayDeque<>();
        Deque<String> goalDq = new ArrayDeque<>();


        for (String card : cards1) {
            card1Dq.add(card);
        }

        for (String card : cards2) {
            card2Dq.add(card);
        }

        for (String word : goal) {
            goalDq.add(word);
        }

        boolean result = true;
        while(goalDq.size() > 0) {
            String temp = goalDq.pollFirst(); 
            String cardTemp1 = card1Dq.peek();
            String cardTemp2 = card2Dq.peek();

            System.out.println(temp);

            if ((cardTemp1 == null || !temp.equals(cardTemp1)) && (cardTemp2 == null || !temp.equals(cardTemp2))) {
                result = false;
                break;
            }

            if (cardTemp1 != null && temp.equals(cardTemp1)) {
                card1Dq.pollFirst(); 
            } else if (cardTemp2 != null && temp.equals(cardTemp2)) {
                card2Dq.pollFirst(); 
            }
        }

        System.out.println(result);
    }
}