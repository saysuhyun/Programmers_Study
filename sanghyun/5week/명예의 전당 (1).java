import java.util.*;

public class Hof {
    public static void main(String[] args) {
        int k = 3;
        int[] score = { 10, 100, 20, 150, 1, 100, 200};

        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> hof = new ArrayList<>();
        for(int s : score) {
            if(hof.size() < k) {
                hof.add(s);
                
            } else {
                if( hof.get(0) < s) {
                    hof.set(0, s);
                }
            }
            // 리스트 정렬
            Collections.sort(hof);
            System.out.println("Current minimum in HoF: " + hof.get(0));
            arr.add(hof.get(0));
        }
        int[] answer = arr.stream().mapToInt(i -> i).toArray();
    }
}