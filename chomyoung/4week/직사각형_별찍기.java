import java.util.Scanner;

public class 직사각형_별찍기 {
    private static class Solution {
        // 사각형 만들기
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            for(int i = 1; i<=b; i++){
                for (int j=1; j<=a; j++){
                    System.out.print("*");
                    if(j==a){
                        System.out.println("");
                    }
                }
            }
        }
    }
}