public class 하샤드_수 {
    public static void main(String[] args) {
        //Solution solution = new Solution();
        System.out.println(solution(10)); // true
        System.out.println(solution(12)); // true
        System.out.println(solution(11)); // false
        System.out.println(solution(13)); // false
    }

    public static boolean solution(int x) {
        int sumOfDigits = 0;
        int temp = x;
        while (temp>0){
            sumOfDigits += temp%10;
            temp = temp/10;
        }
        return x%sumOfDigits==0;
    }
}
