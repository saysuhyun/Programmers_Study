public class StringHandling {
    public static void main(String[] args) {
        String s = "1234";

        if(s.length() == 4 || s.length() == 6) {
            try {
                int n = Integer.parseInt(s);
                System.out.println("true");
            } catch (Exception e) {
                System.out.println("false");
            }
        } else {
            System.out.println("false");
        }
    }
}
