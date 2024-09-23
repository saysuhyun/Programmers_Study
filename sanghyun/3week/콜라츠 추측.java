public class Collatz {
    public static void main(String[] args) {
        int num = 16;

        int temp = num;
        int count = 0;
        while(temp != 1) {
    
            if(count == 500) {
                count = -1;
                break;
            }
            if(temp % 2 == 0) {
                temp = temp /2;
            }
            else if(temp % 2  == 1) {
                temp = temp *3 +1;
            }
            else if(temp == 1) {
                break;
            }
            count= count+1;
        }

    }
}