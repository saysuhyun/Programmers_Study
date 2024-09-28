import java.util.*;
import java.util.stream.*;

public class SmallNumber {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        if (arr.length == 0) return new int[]{-1};
        if (arr.length == 1) return new int[]{-1};

        int small = Arrays.stream(arr).min().getAsInt(); //가장 작은수
        List<Integer> newArr = Arrays.stream(arr) 
                                     .filter(v -> v != small) // 가장 작은수 제거
                                     .boxed()   // intstrema에서 객체 컬렉션 생성을 위해 원시형 int 에서 Intger 형으로 
                                     .collect(Collectors.toList()); 
        if (newArr.isEmpty()) {
            return new int[]{-1};
        }
        return newArr.stream().mapToInt(i -> i).toArray();
    }
}