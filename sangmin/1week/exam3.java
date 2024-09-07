import java.util.*;

// 같은 숫자 문제 풀이
public class Solution {
    public int[] solution(int []arr) {
        int[] arrTemp = new int[arr.length];
        int temp = -1, su = 0;

        // 중복 제거 및 임시 배열에 저장
        for(int i = 0; i < arr.length;i++){
            if(arr[i] != temp){
                arrTemp[su++] = arr[i];
                temp=arr[i];
            }
        }

        int[] answer = new int[su];

        // 새로운 배열을 answer에 저장
        for(int i=0; i<answer.length;i++){
            answer[i] = arrTemp[i];
        }

        return answer;
    }
}