import java.util.*;

public class Solution {
    // 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져있는데, 연속 숫자 제거
    // return 배열 원소들의 순서 유지해야한다.
    // 결과를 저장할 리스트: LinkedList
    // 연속된 중복 숫자를 건너뛰고, 리스트에는 중복되지 않은 숫자들만 남게
        // - arr[i]가 list의 마지막 원소(list.getLast())와 다를 경우에만 list에 추가
    public int[] solution(int []arr) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(arr[0]);
        for(int i=1; i<arr.length;i++){
            // 만약 마지막이 아니라면
            if(arr[i]!=list.getLast()){
                list.add(arr[i]);
            }
        }
        Integer[] listing = list.toArray(new Integer[list.size()]);
        return Arrays.stream(listing).mapToInt(Integer::intValue).toArray();
    }
}