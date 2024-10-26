public class 3진법_뒤집기 {

    public static void main(String[] args) {

    }

    private static class Solution {
      // n -> 3진법 string
      // 앞뒤로 뒤집기
      // 10진법으로 표현
      public int solution(int n) {
          String str = Integer.toString(n, 3);
          String reversed = new StringBuilder(str).reverse().toString();
          return Integer.parseInt(reversed, 3);
      }
  }

}
