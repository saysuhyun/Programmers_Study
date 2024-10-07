import java.util.*;
import java.util.stream.*;

public class Paint {
    public static void  main(String[] args) {
        int n =8; 
        int m =4; 
        int[] section = { 2, 3, 6};

        int answer = 0;

        IntStream stream= Arrays.stream(section);
        ArrayList<Integer> arr = Arrays.stream(section).boxed()
                                       .collect(Collectors.toCollection(ArrayList::new));


        // 양방향 큐 사용
        Deque<Integer> deque = new ArrayDeque<>(arr);

        while (!deque.isEmpty()) {
            int temp = deque.pollFirst();  // 가장 앞의 큐 뽑아오기 

            int scope = temp + m -1;
            while(!deque.isEmpty()) {
                int peek = deque.peek();
                if(peek <= scope) {
                    deque.pollFirst();
                } else {
                    break;
                }
            }
            answer++;
        }
        System.out.println(answer);
    }
}