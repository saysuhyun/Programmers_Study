public class 내적 {

    public static void main(String[] args) {

    }

    private static class Solution {
        // a, b length 동일
        // return a와 b의 내적
        public int solution(int[] a, int[] b) {
            int answer = 0;

            for(int i=0; i<a.length; i++){
                answer += a[i] * b[i];
            }

//            List<Integer> aList = Arrays.stream(a).boxed().toList();
//            List<Integer> bList = Arrays.stream(b).boxed().toList();
//            for(int i=0; i<aList.size(); i++){
//                answer += aList.get(i) * bList.get(i);
//            }

            return answer;
        }
    }
}