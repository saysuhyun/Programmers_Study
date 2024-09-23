import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int row = 0; row < b; row++) {
            for (int col = 0; col < a; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
