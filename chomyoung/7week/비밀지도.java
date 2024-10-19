import java.util.Arrays;

public class 비밀지도 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(5, new int[]{9, 20, 28, 18, 11},
            new int[]{30, 1, 21, 17, 28}));
    }

    private static class Solution {
        // 암호 해독해서 위치 확인
        // 전체 지도: 두장의 지도 합치기
        // 하나라도 #이면 # 처리
        // 0: "", 1: #

        // 방법
        // 1. 정수 -> 이진수
        // 2. 이진수를 '0', '1' 값의 배열로 바꾼다.
        // String binaryString = Integer.toBinaryString(number);
        // 3. 출력할 값을 새로운 배열에


        // 주의
        // 이진수 배열이 앞에 0이 없다.
        // 그렇기 때문에 부족한 index 위치 조정이 필요
        // startIndex ( n 길이 - 이진수 배열의 길이)
        // 만약, startIndex가 j보다 크다면, 앞에 계속 "0"이 나와야한다는 의미. 그렇지않으면 j - startIndex 인덱스 참조하면 된다.
        public String[] solution(int n, int[] arr1, int[] arr2) {
            String[] answer = new String[n];

            for(int i=0; i<n; i++){
                String[] binaryString1 = Integer.toBinaryString(arr1[i]).split("");
                String[] binaryString2 = Integer.toBinaryString(arr2[i]).split("");;
                StringBuilder stringBuilder = new StringBuilder();
                int startIndex1 = n - binaryString1.length;
                int startIndex2 = n - binaryString2.length;
                for(int j=0; j<n; j++) {
                    String each1 = startIndex1>j ? "0": binaryString1[j - startIndex1];
                    String each2 = startIndex2>j ? "0": binaryString2[j - startIndex2];
                    if("1".equals(each1) || "1".equals(each2)){
                        stringBuilder.append("#");
                    }else{
                        stringBuilder.append(" ");
                    }
                }
                answer[i] = stringBuilder.toString();
            }

            return answer;
        }
    }
}