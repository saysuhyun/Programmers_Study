public class Three {
    public static void main(String[] args) {
        int[] number = {-3, -2, -1, 0, 1, 2, 3};

        int answer = 0;
        for(int i = 0 ; i < number.length; i++) {
            int now = number[i];
            for(int l = i+1; l < number.length; l++) {
                int now2 = number[l];
                for(int j = l+1; j < number.length; j++) {
                    int now3 = number[j];

                    if(now + now2 + now3 == 0) {
                        answer++;
                    }
                }
            }
        }

        System.out.println(answer);
    }
}