public class Star {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;


        StringBuilder answerSb = new StringBuilder();
        for(int i = 0; i < b; i++) {
            StringBuilder sb = new StringBuilder();
            for(int ii = 0; ii < a; ii++) { 
                sb.append("*");
            }
            answerSb.append(sb.toString() + "\n");
        }

        System.out.println(answerSb.toString());
    }
}