import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    // 목표: 정수 배열에서 가장 작은 수 제거
    // return arr.length !=0 ? {}: {-1};
    // {-1}이 나오려면 arr.length == 1;
    // 주의: 정렬하라고 하진 않았다.
    // 가장 작은 수 제거
        // for문 => 이게 더 빠르나, 어차피 arrayList는 사용해야한다.
        // 인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] => 그냥 정렬 ?
    public int[] solution(int[] arr) {
        return arr.length != 1 ? deductMin(arr): new int[]{-1};
    }

    public int[] deductMin(int[] arr){
        int MIN = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < MIN) {
                MIN = arr[i];
                index = i;
            }
        }
        List<Integer> list = Arrays.stream(arr).boxed().collect(
            Collectors.toList());
        list.remove(index);
        return list.stream()
            .mapToInt(i -> i)
            .toArray();
    }
}