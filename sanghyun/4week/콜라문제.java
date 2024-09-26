public class Coke {
    public static void main(String[] args) {
        int a = 3;
        int b = 1;
        int n = 20;

        int answer = 0;
        while( n >= a ) {
            answer += (n / a)*b; // 20 / 2 -> 10 * 1; ( 배수 )
            n = (n / a)*b + (n % a); // 남은 병  -> 바꾼 병 + 못바꾸고 남은병
    
        }
       System.out.println(answer);
    }
}