public class DivideLeft {
    public static void main(String[] args){
        int n = 12;
        int answer = 2;
        while(true) {
            int temp = n % answer;
        
            if(temp == 1) {
                break;
            }
            if(temp == n) {
                break;
            }
            answer++;
        }
    
    }
}