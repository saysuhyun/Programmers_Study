import java.util.Scanner;

public class 직사각형_별_찍기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //가로 길이
        int m = sc.nextInt();   //세로 길이

        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();


    }
}
