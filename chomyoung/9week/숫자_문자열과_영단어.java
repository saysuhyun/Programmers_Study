public class 숫자_문자열과_영단어 {

    public static void main(String[] args) {

    }

    private static class Solution {
        public int solution(String s) {
            int answer = 0;

            String[] arr = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

            for (int i = 0; i < arr.length; i++) {
                while (s.contains(arr[i])) { // 만약 s가 arr[i]를 갖고 있지 않을 때까지
                    s = s.replace(arr[i], String.valueOf(i)); // s 안에 있는 i를 arr[i]로 바꿔서 새 배열에 저장.누적을 위해 새 배열을 다시 s 배열로 저장한다.
                }
            }

            answer = Integer.parseInt(s);
            return answer;
        }
    }

}