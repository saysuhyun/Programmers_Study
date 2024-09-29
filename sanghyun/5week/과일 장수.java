import java.util.*;
import java.util.stream.*;

public class Fruit {
    public static void main(String[] args) {
        int k = 3; 
        int m = 4;  
        int[] score = { 1, 2, 3, 1, 2, 3, 1 };

        IntStream stream = Arrays.stream(score);
         // 배열을 스트림으로 ArrayList에 추가
        ArrayList<Integer> arr = Arrays.stream(score)
                                       .boxed()
                                       .collect(Collectors.toCollection(ArrayList::new));


    
        arr.sort(Collections.reverseOrder());

        // 양방향 큐 사용
        Deque<Integer> deque = new ArrayDeque<>(arr);

        int total = 0;
        while (deque.size() >= m) {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < m; i++) {
                int temp = deque.pollFirst();  // 가장 앞의 큐 뽑아오기 
                min = Math.min(temp, min);     
            }
            total += min * m; 
        }


        // arraylist 사용하니까 시간초과남  ->  get(0) , remove(0) 의 시간 복잡도 때문

        
        // IntStream stream = Arrays.stream(score);
        // ArrayList<Integer> arr = new ArrayList<>();
        // stream.forEach(arr::add);

    
        // arr.sort(Collections.reverseOrder());

        // int total = 0;
        // while(arr.size() >= m ) {
        //     Integer min = 0;
        //     for(int i = 0; i  < m; i++) {
        //         Integer temp = arr.get(0);
        //         min = min == 0 ?  temp :  Math.min(temp, min);
        //         arr.remove(0);
        //     }
    
        //     total = total + min * m;
        // }


    }
}