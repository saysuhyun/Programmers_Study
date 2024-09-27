import java.util.*;

public class Xn {
    public static void main(String[] args) {
        int x = -4;
        int n = 2;


        List<Long> list = new ArrayList<>();

        long temp = x;
        for(int i = 0; i < n; i++) {
            temp = (long)x + (long)x * i; // long으로 캐스팅 안하면 int 범위 넘어가는 수의 경우 에러남
            list.add(temp);
        }

        System.out.println(list);

        long[] answer = list.stream().mapToLong((i -> i)).toArray();
    }
}