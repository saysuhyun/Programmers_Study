public class DividNum {
    public static void main(String[] args) {
        int left = 24;  int right = 27;


        int answer = 0;
        for(int i = left; i <= right; i++) {

            int tempCount = 0;
            for(int l = 1; l <= Math.sqrt(i); l++) {
                System.out.println( i + " : "+ l + " : " + i % l);
                if(i % l == 0) {
                    tempCount++;
                    if (l != i / l) {
                        tempCount++;  
                    }
                }
            }
        
            if (tempCount % 2 == 0) {
                answer += i; 
            } else {
                answer -= i;  
            }

        }
    }
} 