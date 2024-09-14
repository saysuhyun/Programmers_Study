public class Sum {
    public static void main(String[] args) {
        int n = 12;
        int sum = 0;

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) {
                    sum += n / i; 
                }
            }
        }

        System.out.println(sum);
    }
}
