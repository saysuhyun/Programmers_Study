public class MiddleCharacter {
    public static void main(String[] args) {
        String s = "abcde";

        char[] charArray = s.toCharArray();
       
        int len = s.length();
        int middle = len / 2; 
        String result;

         // 짝수
        if (len % 2 == 0) {
            result = String.valueOf(charArray[middle - 1]) + charArray[middle];
        } else {
        // 홀수
            result = String.valueOf(charArray[middle]);
        }

        System.out.println(result);
    }
}
