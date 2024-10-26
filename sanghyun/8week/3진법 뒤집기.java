public class Tri {
    public static void main(String[] args) {
        int n = 45;

        StringBuilder sb = new StringBuilder();

        while(n > 0) {
            int tri = n % 3;
            n = n / 3;
           
            sb.append(tri);
        }

        char[] cArr = sb.toString().toCharArray();

        int answer = 0;
        for(int i = 0; i < cArr.length; i++) {
            // 삼진수 역산 -> 111 -> 3의 2승 * 1 + 3의 1승 * 1 + 3의 0승 * 1
            int pow  = cArr.length- i - 1;
            double temp = Math.pow(3, pow) * (cArr[i] - '0') ;
            answer = answer + (int) temp;
        
        }

         System.out.println(answer);
    }   
}