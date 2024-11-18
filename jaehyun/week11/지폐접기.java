import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class 지폐접기 {

    public static void main(String[] args) {

        int[] wallet = {30, 15};
        int[] bill = {26, 17};

        System.out.println(solution(wallet, bill));

    }

    public static int solution(int[] wallet, int[] bill) {
        int answer = 0;

        int walletMin = Math.min(wallet[0], wallet[1]);
        int walletMax = Math.max(wallet[0], wallet[1]);
        int billMin = Math.min(bill[0], bill[1]);
        int billMax = Math.max(bill[0], bill[1]);

        while (billMin > walletMin || billMax > walletMax) {
            if (billMax > walletMax) {
                billMax /= 2;
            } else {
                billMin /= 2;
            }
            answer++;
        }

        return answer;
    }
}
