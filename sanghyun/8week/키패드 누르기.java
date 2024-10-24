public class KeyPad {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";

        //String[][] pads = {{"1","2","3"} , { "4" , "5", "6"} , {"7", "8" ,"9"} , { "*" , "0" ,"#"}};
        int[] left = {3, 0};
        int[] right = {3, 2};

        StringBuilder sb = new StringBuilder();

        for (int n : numbers) {
            int y = n > 6 ? 2 : (n > 3 && n <= 6) ? 1 : 0;
            int x = n % 3 == 0 ? 2 : n % 3 == 2 ? 1 : 0;

            if (n == 0) {
                x = 1;
                y = 3;
            }

            String compare = hand.equals("right") ? "R" : "L";

            if (x == 0) {
                compare = "L";
                left[0] = y;
                left[1] = x;
            } else if (x == 2) {
                compare = "R";
                right[0] = y;
                right[1] = x;
            } else {
                int leftGap = Math.abs(left[0] - y) + Math.abs(left[1] - x);
                int rightGap = Math.abs(right[0] - y) + Math.abs(right[1] - x);  // rightGap 수정

                if (leftGap == rightGap) {
                    if (hand.equals("right")) {
                        compare = "R";
                        right[0] = y;
                        right[1] = x;
                    } else {
                        compare = "L";
                        left[0] = y;
                        left[1] = x;
                    }
                } else if (leftGap < rightGap) {
                    compare = "L";
                    left[0] = y;
                    left[1] = x;
                } else {
                    compare = "R";
                    right[0] = y;
                    right[1] = x;
                }
            }

            sb.append(compare);
        }

        System.out.println(sb.toString());
    }
}