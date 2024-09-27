public class GcdLcm {
    public static void main(String[] args) {

        int n = 9;
        int m = 9 
        int [] answer = new int[2];
        int gcd = Gcd(n,m);
        int lcm = Lcm(n,m);

        answer[0] = gcd;
        answer[1] = lcm;

      
    }

    // 최대 공약수 구하기
    public static int Gcd(int a, int b) {
        int max = Math.max(a,b); 
        int min = Math.min(a,b);

        int temp = 0;
        while(min != 0) {
            temp = max % min; // 큰 수에서 작은수 나머지  ( 둘이 같을 때만 0이 나온다)
            max = min; // 한번 나눠봤으므로 큰수를 작은수로 치환
            min = temp; // 작은수는 다음 사이클에 나눠야 함으로 나눠진 나머지로 환산

            // 1사이클
            // 12 % 6  -> 6
            // max -> 12 -> 6
            // min -> 6

            // 2사이클
            // 6 % 6 -> 0
            // max -> 6
            // min -> 0
            // min이 0이므로 break;
            // max -> 최대 공약수 6
        }
        return max;
    }


    // 최소 공배수
    // 구할 값들 끼리 곱한후 최대 공약수로 나눈값
    // 9 , 6의 최소 공배수 -> 9, 6의 최대 공약수는 3
    // 54 / 3 -> 18
    // 최소 공배수는 18
    public static int Lcm(int a, int b) {
        int max = Math.max(a,b); 
        int min = Math.min(a,b);

        return (max * min) / Gcd(max, min);
    }
}