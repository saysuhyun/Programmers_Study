public class Fee {
    public static void main(String[] args) {
        int price = 3; int money = 20; int count = 4;


        int n = 1;
        long total = 0;
        while(count > 0) {
            total += price * n;
            n++;
            count--;
        }

        long answer = money - total > 0 ? 0 : Math.abs(money - total);
      
    }
}